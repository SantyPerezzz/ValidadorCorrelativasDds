package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class InscripcionTest {

	@BeforeAll
	public void inicializarMaterias() {
		Materia am1 = new Materia("am1");
		Materia aga = new Materia("aga");
		Materia am2 = new Materia("am2");
		am2.addCorrelativa(am1);
		am2.addCorrelativa(aga);
		Materia f1 = new Materia("f1");
		Materia f2 = new Materia("f2");
		f2.addCorrelativa(f1);
		Materia ayed = new Materia("algoritmos");
		Materia md = new Materia("discreta");
		Materia pdp = new Materia("paradigmas");
		pdp.addCorrelativa(ayed);
		pdp.addCorrelativa(md);
	}

	@Test
	public void inscripcionAprobadaTest() {

	}

	@Test
	public void inscripcionRechazadaTest() {

	}
}
