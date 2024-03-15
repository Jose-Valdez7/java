package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;
	
	public Jugadores() {
		jugadores = new ArrayList<String>();
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	 public void jugar() {
		 	Jugadores jugador = new Jugadores();
	        ArrayList<String> jugadores = new ArrayList<String>();
	        jugadores.add("Jose");
	        jugadores.add("Enrique");
	        jugadores.add("Eduardo");

	        Juego juego = new Juego(jugadores);
	        juego.entregarCartas(5);

	        
	        for (int i = 0; i < jugadores.size(); i++) {
	            System.out.println("Jugador " + (i + 1) + ": " + juego.getCartasJugadores().get(i).size() + " cartas");
	        }
	        String ganador = juego.determinarGanador(jugador);
	        System.out.println("El ganador es: " + ganador);
	    }
}