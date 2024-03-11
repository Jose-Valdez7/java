package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()== "movi") {
			telefono.setTieneWhastapp(true);
		}}
int total=0;	
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		if(telf1.getOperadora()=="movi") {
			total++;
		}
		if(telf2.getOperadora()=="movi") {
			total++;
		}
		if(telf3.getOperadora()=="movi") {
			total++;
		}
		return total;
	}
int totalclaro=0;
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		if(telf1.getOperadora()=="claro") {
			totalclaro++;
		}
		if(telf2.getOperadora()=="claro") {
			totalclaro++;
		}
		if(telf3.getOperadora()=="claro") {
			totalclaro++;
		}
		if(telf4.getOperadora()=="claro") {
			totalclaro++;
		}
		return totalclaro;
	}
}
