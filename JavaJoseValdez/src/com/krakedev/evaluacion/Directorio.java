package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	ArrayList<Contacto> contactos;
	Date fechaModificacion;
	ArrayList<Contacto> correctos;
	ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		this.fechaModificacion = new Date();
		correctos =new ArrayList<Contacto>();
		incorrectos =new ArrayList<Contacto>();
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		Contacto nuevoContacto;
		nuevoContacto = buscarPorCedula(contacto.getCedula());
		if (nuevoContacto == null) {
			contactos.add(contacto);
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto resultadoBusqueda = null;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getCedula().equals(cedula)) {
				resultadoBusqueda = elementoContacto;
			}
		}
		return resultadoBusqueda;
	}

	public String consultarUltimaModificacion() {
	    SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    return fecha.format(this.fechaModificacion);
	} 
	
	public int contarPerdidos() {
		int sinAsignar = 0;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				sinAsignar++;
			}
		}
		return sinAsignar;
	}

	public int contarFijos() {
		int asignados = 0;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getTelefono().get(0).getTipo().equalsIgnoreCase("convencional")
					&& elementoContacto.getTelefono().get(0).getEstado().equalsIgnoreCase("C")) {
				asignados++;
			}
		}
		return asignados;
	}
	
	public void depurar() {
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion()!=null) {
				correctos.add(elementoContacto);
			}else {
				incorrectos.add(elementoContacto);
			}
		}
		contactos.clear();
	}

}
