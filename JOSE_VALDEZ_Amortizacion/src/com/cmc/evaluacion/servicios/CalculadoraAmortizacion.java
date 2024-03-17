package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {

	public double calcularCuota(Prestamo prestamo) {
		double cuota;
		double interesMensual = prestamo.getInteres() / 12;
		double interesPeriodo = interesMensual / 100;
		cuota = (prestamo.getMonto() * interesPeriodo) / (1 - (Math.pow((1 + interesPeriodo), -prestamo.getPlazo())));
		return cuota;
	}

	public void generarTabla(Prestamo prestamo) {
		double cuotaP = calcularCuota(prestamo);
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		
	        for (int i = 1; i <= prestamo.getPlazo(); i++) {
	        	Cuota cuota = new Cuota(i); 
	            cuota.setCuota(cuotaP);
	        	cuotas.add(cuota);
	        }
	        Cuota primeraCuota = cuotas.get(0);
	        primeraCuota.setInicio(prestamo.getMonto());
	    
		for (int i = 0; i < cuotas.size(); i++) {
			Cuota cuotaActual = cuotas.get(i);
			Cuota siguienteCuota = (i<cuotas.size()-1)?cuotas.get(i+1):null;
			
			calcularValoresCuota(prestamo.getInteres(), cuotaActual, siguienteCuota);
		}
		Cuota ultimaCuota = cuotas.get(cuotas.size() - 1);
        if (ultimaCuota.getSaldo() > 0) {
            ultimaCuota.setCuota(ultimaCuota.getCuota() + ultimaCuota.getSaldo());
            ultimaCuota.setSaldo(0);
        }
		
	}

	public void calcularValoresCuota(double interesPrestamo, Cuota cuotaActual, Cuota siguienteCuota) {

		double interesCuota = cuotaActual.getInicio() * (interesPrestamo/12 / 100);

		double abonoCapital = cuotaActual.getCuota() - interesCuota;

		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(interesCuota);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);

		if (siguienteCuota != null) {
			siguienteCuota.setInicio(saldo);
		}
	}

	public void mostrarTabla(Prestamo prestamo) {
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		System.out.printf("%-6s | %-4s | %-4s | %-4s | %-2s | %-4s\n", 
			    "Numero", "Cuota", "Inicio", "Interés", "Abono", "Saldo");
		for (Cuota cuota : cuotas) {
			String numeroFormat = String.format("%4d", cuota.getNumero());
			System.out.printf("%s | %6.2f | %6.2f | %6.2f | %6.2f | %6.2f\n",
					numeroFormat,
					cuota.getCuota(),
					cuota.getInicio(), cuota.getInteres(),cuota.getAbonoCapital() ,cuota.getSaldo());
		}
	}
}
