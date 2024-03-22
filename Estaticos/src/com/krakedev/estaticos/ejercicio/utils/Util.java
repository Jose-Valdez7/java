package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int valor) {
		String nuevaHora=valor+"";
		if(valor<10) {
			nuevaHora="0"+valor;
		}
		return nuevaHora;
	}
	
	public static String formatearDia(int valor) {
		String nuevoDia=null;
		if(valor==0) {
			nuevoDia="Lunes";
		}else if(valor==1) {
			nuevoDia="Martes";
		}else if(valor==2) {
			nuevoDia="Miercoles";
		}else if(valor==3) {
			nuevoDia="Jueves";
		}else if(valor==4) {
			nuevoDia="Viernes";
		}else if(valor==5) {
			nuevoDia="Sabado";
		}else if(valor==6) {
			nuevoDia="Domingo";
		}
	
		return nuevoDia;
	}
}
