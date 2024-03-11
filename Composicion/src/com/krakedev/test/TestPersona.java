package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		
		Direccion dir=new Direccion("Av siempre viva","La que cruza","N-47");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		System.out.println(nombre);
		//d1 esta null y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		//null.algunmetodo();
		
		p1.imprimir();
		
		Persona p2=new Persona();
		p2.setNombre("Anastasia");
		Direccion d2=new Direccion("Av. Shyris","Eloy Alfaro","S/N");
		
		p2.imprimir();
		System.out.println("FIN");
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
	}

}
