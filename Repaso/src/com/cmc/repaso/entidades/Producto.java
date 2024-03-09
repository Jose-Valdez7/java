package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio<0) {
			precio=precio*(-1);
		}
		this.precio = precio;
	}

	public Producto(String nombre, double precio) {
		setNombre(nombre);
		setPrecio(precio);
	}
	
	public double calcularPrecioPromo(double descuento) {
		double descuentoRealizado=(precio*descuento)/100;
		double total=precio-descuentoRealizado;
		setPrecio(total);
		return total;
	}
}
