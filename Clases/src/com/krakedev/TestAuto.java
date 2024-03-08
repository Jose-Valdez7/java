package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.setMarca("Honda");
		auto1.setAnio(2020);
		auto1.setPrecio(15943.98);
		
		auto2.setMarca("Chevrolet");
		auto2.setAnio(2024);
		auto2.setPrecio(25700.00);
		
		System.out.println("AUTO 1");
		System.out.println("marca: "+auto1.getMarca());
		System.out.println("anio: "+auto1.getAnio());
		System.out.println("precio: "+auto1.getPrecio());
		System.out.println("*******");
		System.out.println("AUTO 2");
		System.out.println("marca: "+auto2.getMarca());
		System.out.println("anio: "+auto2.getAnio());
		System.out.println("precio: "+auto2.getPrecio());
		

	}

}
