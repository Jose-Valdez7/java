package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		 String cedula = "1729034595";
		try { 
	            AdminPersonas.eliminar(cedula);

	            System.out.println("Persona eliminada correctamente.");
	        } catch (Exception e) {
	        	System.out.println("error en el sistema: "+e.getMessage());
	        }
	    }

}
