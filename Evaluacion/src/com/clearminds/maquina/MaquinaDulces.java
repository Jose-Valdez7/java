package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoc1, String codigoc2, String codigoc3, String codigoc4) {
		this.celda1=new Celda(codigoc1);
		this.celda2=new Celda(codigoc2);
		this.celda3=new Celda(codigoc3);
		this.celda4=new Celda(codigoc4);

	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo Celda1: " + celda1.getCodigo());
		System.out.println("Codigo Celda2: " + celda2.getCodigo());
		System.out.println("Codigo Celda3: " + celda3.getCodigo());
		System.out.println("Codigo Celda4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1;
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2;
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3;
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String CodigoCelda, int stock) {
		Celda celdaRecuperada = buscarCelda(CodigoCelda);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		if(celda1.getProducto()!=null){
			System.out.println("******** CELDA " + celda1.getCodigo()); 
			System.out.println("Stock Actual:  " + celda1.getStock()); 
			System.out.println("Nombre Producto: "+ celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda1.getProducto().getCodigo());
			}else {
				System.out.println("******** CELDA " + celda1.getCodigo()); 
				System.out.println("Stock Actual:  " + celda1.getStock()); 
				System.out.println("La celda no tiene Producto!!!");}
		if(celda2.getProducto()!=null){
			System.out.println("******** CELDA " + celda2.getCodigo()); 
			System.out.println("Stock Actual:  " + celda2.getStock()); 
			System.out.println("Nombre Producto: "+ celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda2.getProducto().getCodigo());
			}else {
				System.out.println("******** CELDA " + celda2.getCodigo()); 
				System.out.println("Stock Actual:  " + celda2.getStock()); 
				System.out.println("La celda no tiene Producto!!!");}
		if(celda3.getProducto()!=null){
			System.out.println("******** CELDA " + celda3.getCodigo()); 
			System.out.println("Stock Actual:  " + celda3.getStock()); 
			System.out.println("Nombre Producto: "+ celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda3.getProducto().getCodigo());
			}else {
				System.out.println("******** CELDA " + celda3.getCodigo()); 
				System.out.println("Stock Actual:  " + celda3.getStock()); 
				System.out.println("La celda no tiene Producto!!!");}
		if(celda4.getProducto()!=null){
			System.out.println("******** CELDA " + celda4.getCodigo()); 
			System.out.println("Stock Actual:  " + celda4.getStock()); 
			System.out.println("Nombre Producto: "+ celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda4.getProducto().getCodigo());
			}else {
				System.out.println("******** CELDA " + celda4.getCodigo()); 
				System.out.println("Stock Actual:  " + celda4.getStock()); 
				System.out.println("La celda no tiene Producto!!!");}
		System.out.println("Saldo "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}else {
			return 0.00;
		}
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto()!=null && codigoProducto == celda1.getProducto().getCodigo()) {
			return celda1;
		} else if (celda2.getProducto()!=null && codigoProducto == celda2.getProducto().getCodigo()) {
			return celda2;
		} else if (celda3.getProducto()!=null && codigoProducto == celda3.getProducto().getCodigo()) {
			return celda3;
		} else if (celda4.getProducto()!=null && codigoProducto == celda4.getProducto().getCodigo()) {
			return celda4;
		}else {
			return null;
		}
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
}
