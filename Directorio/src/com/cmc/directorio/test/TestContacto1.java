package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "093456789",24);
        Contacto c1 = new Contacto("Juan", "Perez", telf1, 130.5);
        Telefono telf2 = new Telefono("claro", "0987364127",20);
        telf2.setTieneWhastapp(true);
        Contacto c2 = new Contacto("Jose", "Alcivar", telf2, 180.5);
        
        AdminContactos admin= new AdminContactos();
        Contacto res = admin.buscarMasPesado(c1, c2);
        
        System.out.println("Información del contacto:");
        System.out.println("Nombre: " + res.getNombre());
        System.out.println("Apellido: " + res.getApellido());
        System.out.println("Teléfono: " + res.getTelefono().getOperadora() + " " + res.getTelefono().getNumero());

        admin.activarUsuario(res);
        System.out.println("Activo: " + res.isActivo());
    }

	}

