package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private List<Materia> aprobadas;

	public Alumno() {
		this.aprobadas = new ArrayList<>();
	}

	public void addAprobada(Materia mat) {
		aprobadas.add(mat);
	}
	public List<Materia> getAprobadas() {
		return aprobadas;
	}
}
