package com.krakedev;

public class Auto {
	private String marca;
	private int anio;
	private double precio;
	
	public Auto(String marca,int anio,double precio) {
		this.anio=anio;
		this.marca=marca;
		this.precio=precio;
	}//constructores con diferentes variables
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
