package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto {

	public static void main(String[] args) {
		Telefono telf=new Telefono("claro","0985671234",18);
		Contacto c=new Contacto("Juan", "Valdez", telf, 160.25);
		
		System.out.println("Nombre: "+c.getNombre()+" Apellido: "+" Peso: "+c.getPeso()+"lbs. "+c.getApellido()+" Operadora: "+telf.getOperadora()
		+" Codigo: "+telf.getCodigo()+" Numero Telefono: "+telf.getNumero());
		
	}

}
