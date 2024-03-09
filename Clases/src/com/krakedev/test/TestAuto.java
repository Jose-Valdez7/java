package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto("Honda",2020,15943.98);
		Auto auto2=new Auto("Chevrolet",2024,25700.00);
		
		
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
