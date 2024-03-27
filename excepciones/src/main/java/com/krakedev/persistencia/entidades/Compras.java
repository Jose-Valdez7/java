package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Compras {
	private int id_compra;
	private Clientes cedulaCliente;
	private Date fechaCompra;
	private BigDecimal monto;
	
	public Compras() {}

	public Compras(int id_compra, Clientes cedulaCliente, Date fechaCompra, BigDecimal monto) {
		super();
		this.id_compra = id_compra;
		this.cedulaCliente = cedulaCliente;
		this.fechaCompra = fechaCompra;
		this.monto = monto;
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public Clientes getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(Clientes cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Compras [id_compra=" + id_compra + ", cedulaCliente=" + cedulaCliente + ", fechaCompra=" + fechaCompra
				+ ", monto=" + monto + "]";
	}
	
	
}
