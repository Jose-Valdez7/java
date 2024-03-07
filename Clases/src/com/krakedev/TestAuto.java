package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.marca="Honda";
		auto1.anio=2020;
		auto1.precio=15943.98;
		
		auto2.marca="Chevrolet";
		auto2.anio=2024;
		auto2.precio=25700.00;
		System.out.println("AUTO 1");
		System.out.println("marca: "+auto1.marca);
		System.out.println("anio: "+auto1.anio);
		System.out.println("precio: "+auto1.precio);
		System.out.println("*******");
		System.out.println("AUTO 2");
		System.out.println("marca: "+auto2.marca);
		System.out.println("anio: "+auto2.anio);
		System.out.println("precio: "+auto2.precio);
		

	}

}
