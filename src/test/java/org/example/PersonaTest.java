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
}