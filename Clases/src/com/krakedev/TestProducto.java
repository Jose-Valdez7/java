package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.nombre="Diclofenaco";
		productoA.descripcion="pastillas para el dolor";
		productoA.precio=0.60;
		productoA.stockActual=200;
		
		productoB.nombre="Condones";
		productoB.descripcion="proteccion sexual masculina";
		productoB.precio=4.00;
		productoB.stockActual=150;
		
		productoC.nombre="Suero Oral";
		productoC.descripcion="para la deshidratacion";
		productoC.precio=3.27;
		productoC.stockActual=43;
		
		
		System.out.println("PRODUCTO A");
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: $"+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		System.out.println("*******");
		System.out.println("PRODUCTO B");
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: $"+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		System.out.println("*******");
		System.out.println("PRODUCTO C");
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: $"+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		
	}

}
