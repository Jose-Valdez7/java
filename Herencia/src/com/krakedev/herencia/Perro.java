package com.krakedev.herencia;

public class Perro extends Animal{
	public Perro() {
		super();
		System.out.println("Ejecuta constructor Perro");
	}
	
	public void ladrar() {
		System.out.println("perro ladrando");
	}
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmiendo");
	}
}
