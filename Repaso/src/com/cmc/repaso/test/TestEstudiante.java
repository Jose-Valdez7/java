package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Jose");
		estudiante1.calificar(9);
		System.out.println("Resultado 1: "+estudiante1.getNombre()+"--"+estudiante1.getResultado());
		
		Estudiante estudiante2=new Estudiante("Eduardo");
		estudiante2.calificar(7);
		System.out.println("Resultado 2: "+estudiante2.getNombre()+"--"+estudiante2.getResultado());
		
	}

}
