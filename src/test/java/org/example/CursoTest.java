package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class CursoTest {
Curso  c = new Curso("D1");
 Persona pepe;

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
}
