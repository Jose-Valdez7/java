package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if (numero != null && tipo != null && ((tipo.equalsIgnoreCase("Movil") && 10 == numero.length())
				|| (tipo.equalsIgnoreCase("Convencional") && 7 == numero.length()))) {
			estado = "C";
		} else {
			estado = "E";
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
