package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
	private Alumno alum;
	private List<Materia> materias;

	public Inscripcion(Alumno al) {
		this.alum = al;
		this.materias = new ArrayList<>();
	}

	public boolean aprobada() {
		boolean r = true;
		for(Materia mat: materias){
			if(!alum.getAprobadas().containsAll(mat.getCorrelativas())) {
				r = false;
			}
		}
		return r;
	}

	public void addMateria(Materia mat) {
		materias.add(mat);
	}

}
