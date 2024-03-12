package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarProducto(new Producto("KE34","Papitas",0.85));
		maquina.agregarProducto(new Producto("D455","Doritos",0.70));
		maquina.agregarProducto(new Producto("D456","gaseosas",0.75));
		maquina.agregarProducto(new Producto("D457","Chocolates",1.00));
		maquina.agregarProducto(new Producto("D458","Cachitos",0.40));
		maquina.agregarProducto(new Producto("D459","Gomitas",1.25));
		
		
		ArrayList<Producto> productosMenores=maquina.buscarMenores(1.00);
		System.out.println("Productos Menores: "+productosMenores.size());
		Producto elementoProducto=null;
		for(int i=0;i<productosMenores.size();i++) {
			elementoProducto=productosMenores.get(i);
			System.out.println("Nombre: "+productosMenores.get(i).getNombre()+" Precio:$"+productosMenores.get(i).getPrecio());
			}
		
	}

}
