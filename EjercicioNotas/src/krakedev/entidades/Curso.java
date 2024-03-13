package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (elementoEstudiante.getCedula().equals(estudiante.getCedula())) {
				System.out.println("El estudiante ya está matriculado en el curso.");
			} else {
				return null;
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteBuscado = buscarEstudiantePorCedula(estudiante);
		if (estudianteBuscado == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double sumaPromedios = 0;
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			sumaPromedios += elementoEstudiante.calcularPromedioNotaEstudiante();
		}
		sumaPromedios = sumaPromedios / estudiantes.size();
		return sumaPromedios;
	}

	public void mostrar() {
		System.out.println("Información del curso:");
		Estudiante estudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiante=estudiantes.get(i);
			System.out.println(estudiante.mostrar());
		}
	}

}
