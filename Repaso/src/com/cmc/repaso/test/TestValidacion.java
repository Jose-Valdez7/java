package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion=new Validacion();
		boolean resultado;
		resultado=validacion.validarMonto(1);
		System.out.println("Resultado: "+resultado);
	}

}
