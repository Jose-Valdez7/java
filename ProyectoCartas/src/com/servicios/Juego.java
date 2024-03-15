package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Jugadores;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	ArrayList<ArrayList<Carta>> cartasJugadores;
	ArrayList<Carta> naipeBarajado;
	
	public Juego (ArrayList<String> idsJugadores) {
		naipe=new Naipe();
		naipeBarajado=naipe.barajar();
		cartasJugadores=new ArrayList<ArrayList<Carta>>();
		
		for(int i=0;i<idsJugadores.size();i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}
	
	public void entregarCartas(int cartasPorJugador) {
        int contador = 0;
        while (contador < cartasPorJugador) {
            for (int i = 0; i < cartasJugadores.size(); i++) {
                cartasJugadores.get(i).add(naipeBarajado.remove(0));
            }
            contador++;
        }
    }
	
	public int devolverTotal(int idJugador) {
        int total = 0;
        ArrayList<Carta> cartasJugador = cartasJugadores.get(idJugador);
        for (Carta carta : cartasJugador) {
            total += carta.getNumero().getValor();
        }
        return total;
    }

	 public String determinarGanador(Jugadores jugadores) {
	        int idGanador = 0 ;
	        int sumaGanador = devolverTotal(idGanador);

	        for (int i = 1; i < cartasJugadores.size(); i++) {
	            int sumaActual = devolverTotal(i);
	            if (sumaActual >= sumaGanador) {
	                idGanador = i;
	                sumaGanador = sumaActual;
	            }
	        }
	        return jugadores.getJugadores().get(idGanador);
	 }
	 
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	
}
