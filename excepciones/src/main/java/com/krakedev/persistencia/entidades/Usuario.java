package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;

public class Usuario {
	private String cedula;
	private String nombre;
	private String apellido;
	private String tipoCuenta;
	private double limiteCredito;
	
	public Usuario() {}
	public Usuario(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Usuario(String cedula, String nombre, String apellido, String tipoCuenta, double limiteCredito) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoCuenta = tipoCuenta;
		this.limiteCredito = limiteCredito;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoCuenta="
				+ tipoCuenta + ", limiteCredito=" + limiteCredito + "]";
	}
	
	
}
