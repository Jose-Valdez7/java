package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefono() {
		return telefonos;
	}

	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefonos = telefono;
	}

	public void imprimir() {
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion: ");
		System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
		System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
	}

	public void imprimir1() {
		if (direccion != null) {
			System.out.println("***" + nombre + " " + apellido + "***");
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("***" + nombre + " " + apellido + "***");
			System.out.println("No tiene asociada una direccion");
		}
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		Telefono elementoTelefono;
		System.out.println("Telefonos con Estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if ("C".equals(elementoTelefono.getEstado())) {
				System.out.println("Numero: " + elementoTelefono.getNumero() + ", Tipo: " + elementoTelefono.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos=new ArrayList<Telefono>();
		Telefono elementoTelefono=null;
		for(int i=0;i<telefonos.size();i++) {
			elementoTelefono=telefonos.get(i);
			if("E".equals(elementoTelefono.getEstado())) {
				telefonosIncorrectos.add(elementoTelefono);
			}
		}
		return telefonosIncorrectos;
	}
	
	
}
