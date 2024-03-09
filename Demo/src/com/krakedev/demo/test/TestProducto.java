package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1= new Producto(25,"Coca Cola");
		producto1.setDescipcion("bebida");
		producto1.setPeso(35.5);
		
		System.out.println("PRODUCTO");
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescipcion());
		System.out.println("Peso: "+producto1.getPeso());
	}

}
