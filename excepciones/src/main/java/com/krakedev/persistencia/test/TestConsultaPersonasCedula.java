package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonasCedula {

	public static void main(String[] args) {
		try {
			Persona personas=AdminPersonas.buscarPorCedula("1729034595");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
