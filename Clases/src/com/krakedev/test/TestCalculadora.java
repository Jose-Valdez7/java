package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		 Calculadora calcu;
		 int resultadoSuma;
		 int resultadoResta;
		 double resultadoMultiplicar;
		 double resultadoDividir;
		 double resultadoPromediar;
		 
		 calcu=new Calculadora();
		 resultadoSuma=calcu.sumar(5, 8);
		 resultadoResta=calcu.restar(10, 3);
		 resultadoMultiplicar=calcu.multiplicar(10, 5);
		 resultadoDividir=calcu.dividir(250, 10);
		 resultadoPromediar=calcu.promediar(45, 5, 20);
		 calcu.mostrarResultado();
		 
		 System.out.println("RESULTADO SUMA: "+resultadoSuma);
		 System.out.println("RESULTADO RESTA: "+resultadoResta);
		 System.out.println("RESULTADO MULTIPLICAR: "+resultadoMultiplicar);
		 System.out.println("RESULTADO DIVIDIR: "+resultadoDividir);
		 System.out.println("RESULTADO PROMEDIAR: "+resultadoPromediar);
	}

}
