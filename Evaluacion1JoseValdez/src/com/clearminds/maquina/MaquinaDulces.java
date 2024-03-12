package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private ArrayList<Producto> productos;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
		productos = new ArrayList<Producto>();
	}

	public void agregarCelda(Celda codigoCelda) {
		celdas.add(codigoCelda);
	}

	public void mostrarConfiguracion() {
		Celda celdaEncontrada;
		int contador = 1;
		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
			System.out.println("Celda" + (contador + i) + ": " + celdaEncontrada.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}

		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stock) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda celdaEncontrada;
		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
			if(celdaEncontrada.getProducto()!=null) {System.out.println("Celda:" + celdaEncontrada.getCodigo() + " Stock:" + celdaEncontrada.getStock()
					+ " Producto:" + celdaEncontrada.getProducto().getNombre() + " Precio:"
					+ celdaEncontrada.getProducto().getPrecio());
			}else {
				System.out.println("Celda:" + celdaEncontrada.getCodigo() + " Stock:" + celdaEncontrada.getStock()
				+ " Sin Producto asignado");
			}
			}System.out.println("Saldo "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Producto productoEncontrado=null;
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				productoEncontrado=elementoCelda.getProducto();
			}
		}
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigoCelda) {
		double precioEncontrado=0.00;
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigoCelda.equals(elementoCelda.getCodigo())) {
				precioEncontrado=elementoCelda.getProducto().getPrecio();
			}
		}
		return precioEncontrado;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for (int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if (elementoCelda.getProducto()!=null && codigoProducto.equals(elementoCelda.getProducto().getCodigo())) {
				celdaEncontrada=elementoCelda;
			}
		}
		return celdaEncontrada;
		}
	
	public void incrementarProductos(String codigoProd, int cantidadAIncrementar) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProd);
		int stock=celdaEncontrada.getStock();
		stock=stock+cantidadAIncrementar;
		celdaEncontrada.setStock(stock);
	}
	
	public void vender(String codigoCelda) {
		Celda producto=buscarCelda(codigoCelda);
		int stock=producto.getStock();
		stock=stock-1;
		producto.setStock(stock);
		double saldo=producto.getProducto().getPrecio();
		this.saldo+=saldo;
	}
	
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda producto=buscarCelda(codigoCelda);
		int stock=producto.getStock();
		stock=stock-1;
		producto.setStock(stock);
		double saldo=producto.getProducto().getPrecio();
		this.saldo+=saldo;
		double vuelto=valorIngresado-saldo;
		return vuelto;
	}
	
	public void agregarProducto(Producto codigoProducto) {	
		productos.add(codigoProducto);
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		
		ArrayList<Producto> menores=new ArrayList<Producto>();
		Producto elementoProducto=null;
		for(int i=0;i<productos.size();i++) {
			elementoProducto=productos.get(i);
			if(elementoProducto.getPrecio()<=limite) {
				menores.add(elementoProducto);
			}
		}
		return menores;
	}
	
}
