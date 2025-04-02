package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class InscripcionTest {

	static Materia am1, aga, am2, f1, f2, ayed, md, pdp;

	@BeforeAll
	public static void inicializarMaterias() {
		am1 = new Materia("am1");
		aga = new Materia("aga");
		am2 = new Materia("am2");
		am2.addCorrelativa(am1);
		am2.addCorrelativa(aga);
		f1 = new Materia("f1");
		f2 = new Materia("f2");
		f2.addCorrelativa(f1);
		ayed = new Materia("algoritmos");
		md = new Materia("discreta");
		pdp = new Materia("paradigmas");
		pdp.addCorrelativa(ayed);
		pdp.addCorrelativa(md);
	}

	@Test
	public void inscripcionAprobadaTest() {
		/* Todas las materias inscriptas son aprobadas */

		Alumno juan = new Alumno();
		juan.addAprobada(am1);
		juan.addAprobada(aga);
		juan.addAprobada(f1);

		Inscripcion ins1 = new Inscripcion(juan);
		ins1.addMateria(am2);
		ins1.addMateria(f2);

		assert(ins1.aprobada());
	}

	@Test
	public void inscripcionRechazadaTest() {
		/* 1 materia es aprobada y 1 rechazada, la inscripcion es rechazada */
		Alumno pepe = new Alumno();
		pepe.addAprobada(am1);
		pepe.addAprobada(ayed);
		pepe.addAprobada(md);

		Inscripcion ins2 = new Inscripcion(pepe);
		ins2.addMateria(am2);
		ins2.addMateria(pdp);

		assertFalse(ins2.aprobada());
	}

	@Test
	public void inscripcionCompletaRechazadaTest() {
		/* Todas las materias son rechazadas, la inscripcion es rechazada */
		Alumno pepe = new Alumno();
		pepe.addAprobada(am1);
		pepe.addAprobada(f1);
		pepe.addAprobada(md);

		Inscripcion ins2 = new Inscripcion(pepe);
		ins2.addMateria(am2);
		ins2.addMateria(pdp);

		assertFalse(ins2.aprobada());
	}

}
