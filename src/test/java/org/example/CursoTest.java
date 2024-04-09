package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class CursoTest {
Curso  c = new Curso("D1");
 Persona pepe;

/*
  AQUI PROBAMOS QUE SE AÑADE CORRECTAMENTE LA PERSONA
    */
 @Test
public void anadirAlumno() {
pepe = new Persona();
   c.aniadirAlumno(pepe);
     String resultado = c.toString();
     Assert.assertTrue(resultado.contains(pepe.getNombre()));
}
}
