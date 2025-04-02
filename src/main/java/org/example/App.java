package org.example;

import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Materia am1 = new Materia("am1");
        Materia aga = new Materia("aga");
        Materia am2 = new Materia("am2");
        Materia f1 = new Materia("f1");
        Materia f2 = new Materia("f2");
        f2.addCorrelativa(f1);
        am2.addCorrelativa(am1);
        am2.addCorrelativa(aga);
        Alumno juan = new Alumno();
        juan.addAprobada(am1);
        juan.addAprobada(aga);
        juan.addAprobada(f1);

        Inscripcion ins1 = new Inscripcion(juan);
        ins1.addMateria(am2);
        ins1.addMateria(f2);

        System.out.println(f2.getCorrelativas().stream().map(Materia::getNombre).collect(Collectors.toList()));
        System.out.println(ins1.aprobada());
    }
}
