package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
	private Alumno alumno;
	private List<Materia> materiasInscriptas;

	public Inscripcion(Alumno al) {
		this.alumno = al;
		this.materiasInscriptas = new ArrayList<>();
	}

	public boolean aprobada() {
		boolean r = true;
		for(Materia mat: materiasInscriptas){
			if(!alumno.getAprobadas().containsAll(mat.getCorrelativas())) {
				r = false;
			}
		}
		return r;
	}

	public void addMateria(Materia mat) {
		materiasInscriptas.add(mat);
	}

}
