package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0993315943",40);
        Contacto c1 = new Contacto("Enrique", "Valdez", telf1, 200.54);
        
        System.out.println("Información del contacto:");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Apellido: " + c1.getApellido());
        System.out.println("Teléfono: " + c1.getTelefono().getOperadora() + " " + c1.getTelefono().getNumero());
        System.out.println("Whatsapp: " + c1.getTelefono().getTieneWhastapp());
        
        AdminContactos admin= new AdminContactos();
        admin.activarUsuario(c1);
        System.out.println("*********************");
        System.out.println("NUEVA Información del contacto:");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Apellido: " + c1.getApellido());
        System.out.println("Teléfono: " + c1.getTelefono().getOperadora() + " " + c1.getTelefono().getNumero());
        System.out.println("Whatsapp: " + c1.getTelefono().getTieneWhastapp());
	}

}
