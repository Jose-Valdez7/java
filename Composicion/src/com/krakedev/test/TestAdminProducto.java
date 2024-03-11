package com.krakedev.test;

import com.krakedev.composicion.AdminProductos;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProductos admin=new AdminProductos();
		Producto productoA=new Producto("Doritos",0.55);
		Producto productoB=new Producto("Papitas",0.50);
		Producto mc;
		
		mc=admin.buscarMasCaro(productoA, productoB);
		
		if(mc==null) {System.out.println("Son iguales");}
		else {
		System.out.println("El mas caro es: "+mc.getNombre());}
	}

}
