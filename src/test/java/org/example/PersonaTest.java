package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
Persona p = new Persona();

    /**
     * comprobamos que calular edad de el resultado que se espera
     */
    @Test
    public void calcularEdad() {
        assertEquals(34, p.getEdad());
    }

    /**
     * COMPROBAMOS EL METODO EQUALS SI DA EL RESULTADO ESPERADO
     */
    @Test
    public void sonIguales() {
      Persona p1 = p;
        boolean resultado = false;
      if (p1.equals(p)){
           resultado = true;
      }
        assertEquals(true, resultado);
    }

}