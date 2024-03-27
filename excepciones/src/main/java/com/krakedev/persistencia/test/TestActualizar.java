package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec= new EstadoCivil("S","Soltero");
		Persona personaAc=new Persona("1729034595","Julio","Jaramillo",ec);
		try {
			Date fechaNac=Convertidor.convertirFecha("2000/05/23");
			Date horaNac=Convertidor.convertirHora("09:33");
			personaAc.setFichaNacimiento(fechaNac);
			personaAc.setHoraNacimiento(horaNac);
			personaAc.setCantidadAhorrada(new BigDecimal(230.45));
			personaAc.setNumeroHijos(50);
			personaAc.setEstatura(1.66);
			AdminPersonas.actualizar(personaAc);
			System.out.println("Persona actualizada correctamente");
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
