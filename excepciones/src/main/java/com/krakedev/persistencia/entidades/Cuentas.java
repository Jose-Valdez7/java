package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuentas {
	private String numeroCuenta;
	private Usuario cedulaUsuario;
	private Date fechaCreacion;
	private BigDecimal saldo;
	
	public Cuentas() {}
	public Cuentas(String numeroCuenta, Usuario cedulaUsuario, Date fechaCreacion, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.cedulaUsuario = cedulaUsuario;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public Usuario getCedulaUsuario() {
		return cedulaUsuario;
	}
	public void setCedulaUsuario(Usuario cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuentas [numeroCuenta=" + numeroCuenta + ", cedulaUsuario=" + cedulaUsuario + ", fechaCreacion="
				+ fechaCreacion + ", saldo=" + saldo + "]";
	}
	
	
	
}
