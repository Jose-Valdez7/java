package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.setNombre("Diclofenaco");
		productoA.setDescripcion("pastillas para el dolor");
		productoA.setPrecio(0.60);
		productoA.setStockActual(200);
		
		productoB.setNombre("Condones");
		productoB.setDescripcion("proteccion sexual masculina");
		productoB.setPrecio(4.00);
		productoB.setStockActual(150);
		
		productoC.setNombre("Suero Oral");
		productoC.setDescripcion("para la deshidratacion");
		productoC.setPrecio(3.27);
		productoC.setStockActual(43);
		
		
		System.out.println("PRODUCTO A");
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: $"+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		System.out.println("*******");
		System.out.println("PRODUCTO B");
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: $"+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		System.out.println("*******");
		System.out.println("PRODUCTO C");
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: $"+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		
	}

}
