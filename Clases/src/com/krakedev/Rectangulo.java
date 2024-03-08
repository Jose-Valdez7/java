package com.krakedev;

public class Rectangulo {
	double base;
	double altura;
	
	public double calclularArea() {
		double area;
		area=base*altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro=(base*2)+(altura*2);
		return perimetro;
	}
}
