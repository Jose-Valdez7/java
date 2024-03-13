package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (elementoNota.getMateria().getCodigo()==nuevaNota.getMateria().getCodigo()) {
				System.out.println("La materia ya tiene una nota registrada");
				return;
			}}
			
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
				notas.add(nuevaNota);
			} else {
				System.out.println("La calificación debe estar entre 0 y 10.");
			}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (codigo.equals(elementoNota.getMateria().getCodigo()) && nuevaNota >= 0
					&& nuevaNota <= 10) {
				elementoNota.setCalificacion(nuevaNota);
				break;
			} else {
				System.out.println("Codigo de materia no encontrado o Nota no valida");
				return;
			}
		}
	}

	public double calcularPromedioNotaEstudiante() {
		double promedioNota = 0;
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			promedioNota += elementoNota.getCalificacion();
		}
		promedioNota = promedioNota / notas.size();
		return promedioNota;
	}

	public boolean mostrar() {
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			System.out.println("Estudiante [Nombre= " + nombre + ", Apellido= " + apellido + ", Cedula= " + cedula
					+ ", Materia= " + elementoNota.getMateria().getNombre() + ", Nota:" + elementoNota.getCalificacion() + "]");
		}
		return false;
	}
}
