package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0982342374",20);
		Telefono telf2=new Telefono("claro","0985671234",21);
		Telefono telf3=new Telefono("claro","0960918234",22);
		Telefono telf4=new Telefono("claro","0950999332",22);
		
		AdminTelefono at=new AdminTelefono();
		int total=at.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("TOTAL CLARO: "+total);
		}

}
