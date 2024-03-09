package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto("celular",550.50);
		System.out.println("producto 1: "+producto1.getNombre());
		System.out.println("precio 1: "+producto1.getPrecio());
		producto1.setPrecio(-25);
		System.out.println("Nuevo precio 1: "+producto1.getPrecio());
		
		producto1.calcularPrecioPromo(50);
		System.out.println("producto 1: "+producto1.getNombre());
		System.out.println("Precio Final: "+producto1.getPrecio());
	}

}
