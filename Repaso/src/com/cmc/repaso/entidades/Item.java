package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("********");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Producto Actual: "+getProductosActuales());
		System.out.println("Producto Devuelto: "+getProductosDevueltos());
		System.out.println("Producto Vendido: "+getProductosVendidos());
	}
	
	public void vender(int productosVendidos) {
		productosActuales=productosActuales-productosVendidos;
		this.productosVendidos=this.productosVendidos+productosVendidos;
	}
	public void devolver(int productosVendidos) {
		productosActuales=productosActuales+productosVendidos;
		this.productosVendidos=this.productosVendidos-productosVendidos;
		productosDevueltos=productosDevueltos+productosVendidos;
	}
	
}
