package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.DiasSemana;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarma {

	public static void main(String[] args) {
		AdminAlarmas admin=new AdminAlarmas();
		admin.agregarAlarma(new Alarma(DiasSemana.LUNES,5,45));
		admin.agregarAlarma(new Alarma(DiasSemana.MARTES, 6, 3));
		admin.agregarAlarma(new Alarma(DiasSemana.JUEVES, 8, 15));
		admin.agregarAlarma(new Alarma(DiasSemana.VIERNES, 11, 25));
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		System.out.println(alarmasActuales);
	}
}
