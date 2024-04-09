package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class CursoTest {
Curso  c = new Curso("D1");
 Persona pepe;
 Persona pepa;

    /**
     * REVISAMOS QUE EL AÑADIR FUNCIONA CORRECTAMENTE REVISANOD QUE AL AÑADIR
     * SI SE ENCUNTRA EN LA LISTA ED SU CURSO
     */
 @Test
public void anadirAlumno() {
pepe = new Persona();
     c.aniadirAlumno(pepe);
     String resultado = c.toString();
     Assert.assertTrue(resultado.contains(pepe.getNombre()));
 }

    /**
     * revisamos ahora si se añade correctament epero con una persona con datos especificos
     */
    @Test
    public void anadirAlumno2() {
        pepa = new Persona(1223423,"Pepa", 'F',1,1,1990);
        String resultado = c.toString();
        c.aniadirAlumno(pepa);
        Assert.assertTrue(resultado.contains(pepa.getNombre()));
    }
}
