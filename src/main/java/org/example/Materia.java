package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nombre;
	private List<Materia> correlativas;

	public Materia(String nombre){
		this.nombre = nombre;
		this.correlativas = new ArrayList<>();
	}

	public void addCorrelativa(Materia cor) {
		correlativas.add(cor);
	}

	public String getNombre() {
		return nombre;
	}

	public List<Materia> getCorrelativas() {
		return correlativas;
	}
}
