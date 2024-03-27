package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//System.ou.println solo se va a poder usar en los test
public class TestAdminPersonas {

	public static void main(String[] args) {
		EstadoCivil ec= new EstadoCivil("U","Union Libre");
		Persona p=new Persona("1729034595","Julio","Jaramillo",ec);
		try {
			Date fechaNac=Convertidor.convertirFecha("2000/05/23");
			Date horaNac=Convertidor.convertirHora("12:33");
			p.setFichaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(10);
			p.setEstatura(1.86);
			AdminPersonas.insertar(p);
			
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
		

	}

}
