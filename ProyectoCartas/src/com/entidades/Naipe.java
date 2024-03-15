package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		numerosPosibles=new ArrayList<Numero>();
		cartas=new ArrayList<Carta>();
		numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
  
        Numero elementosCarta;
        Palos palos=new Palos();
        String CR=palos.getCorazonRojo();
        String CN=palos.getCorazonNegro();
        String DI=palos.getDiamante();
        String TR=palos.getTrebol();
        
        for(int i=0;i<numerosPosibles.size();i++) {
        	elementosCarta=numerosPosibles.get(i);
        	cartas.add(new Carta(elementosCarta,CR));
        	cartas.add(new Carta(elementosCarta,CN));
        	cartas.add(new Carta(elementosCarta,DI));
        	cartas.add(new Carta(elementosCarta,TR));
        	}
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar=new ArrayList<Carta>();
		for(int i=1;i<=100;i++) {
			int posicion = Random.obtenerPosicion();
			Carta carta=cartas.get(posicion);
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		Carta elementoCarta;
		for(int i=0;i<cartas.size();i++) {
			elementoCarta=cartas.get(i);
			if(elementoCarta.getEstado().equals("N")){
				auxiliar.add(elementoCarta);
			}
		}
		
		return auxiliar;
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	
}
