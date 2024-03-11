package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0982342374",20);
		Telefono telf2=new Telefono("claro","0985671234",21);
		Telefono telf3=new Telefono("movi","0960918234",22);
		
		AdminTelefono at=new AdminTelefono();
		int total=at.contarMovi(telf1, telf2, telf3);
		System.out.println("TOTAL MOVI: "+total);
	}

}
