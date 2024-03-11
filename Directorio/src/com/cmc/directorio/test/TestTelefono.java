package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","0994123123",10);
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Numero: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());
		System.out.println("Whastapp: "+telf.getTieneWhastapp());
	}

}
