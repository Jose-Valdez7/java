package com.cmc.directorio.entidades;

public class AdminContactos {
String mayorPeso;
	public Contacto buscarMasPesado(Contacto contacto1,Contacto contacto2){
		if(contacto1.getPeso()>contacto2.getPeso()) {
		Contacto mayorPeso = contacto1;
		return mayorPeso;
		}else if(contacto1.getPeso()<contacto2.getPeso()){
		Contacto mayorPeso=contacto2;
		return mayorPeso;
		}
		return null;}
		
	public boolean compararOperadoras(Contacto contacto1,Contacto contacto2) {
		if(contacto1.getTelefono().getOperadora()==contacto2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
		}
	
	public void activarUsuario(Contacto contacto1) {
	     if (contacto1.getTelefono().getTieneWhastapp()==true) {
	           contacto1.setActivo(true);
	    }
		}
}
