package com.krakedev.composicion;

public class AdminProductos {
	//RECIBE 2 PRODUCTOS
	//RETORNA EL DE MAYOR PRECIO
	//SI TIENEN EL MISMO PRECIO RETORNA NULL
	public Producto buscarMasCaro(Producto p1, Producto p2) {
		if (p1.getPrecio()>p2.getPrecio()) {
			return p1;
		}else if(p1.getPrecio()<p2.getPrecio()) {
			return p2;
		}else {
			return null;
		}
	}
}
