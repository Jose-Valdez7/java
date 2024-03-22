package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p= new Persona("1722813334","Julian");
		System.out.println(p);//p.toString ya que el sistema internamente trata implicitamente llamar al string
		
		Cuenta c=new Cuenta("2908391223",5000.00);
		System.out.println(c);
	}

}
