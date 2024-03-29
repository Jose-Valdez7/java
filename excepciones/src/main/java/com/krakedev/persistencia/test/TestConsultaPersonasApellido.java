package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonasApellido {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas=AdminPersonas.buscarPorApellido("a");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		

	}

}
}