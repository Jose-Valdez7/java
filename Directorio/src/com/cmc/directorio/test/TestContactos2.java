package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0912345673",4);
        Contacto c1 = new Contacto("Andrea", "Almeida", telf1, 100.22);
        Telefono telf2 = new Telefono("claro", "0967843521",2);
        Contacto c2 = new Contacto("Pilar", "Andrango", telf2, 90.85);
        
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
