package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
Persona p = new Persona();

/*
Probamos que la edad sea correcta
 */
    @Test
    public void calcularEdad() {
        assertEquals(34, p.getEdad());
    }


    @Test
    public void sonIguales() {
      Persona p1 = p;
        boolean resultado = false;
      if (p==p1){
           resultado = true;
      }
        assertEquals(true, resultado);
    }

}