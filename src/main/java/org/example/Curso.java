/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    /**
     * CREA UN OBJETO CURSO CON EL NOMBRE DADO
     * @param nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * DEVUELVE DE MANERA ORDENADA EL NOMBRE DEL CURSO CON LA LISTA DE SUS ALUMNOS
     * @return deuelve una String
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * AÑADE AL ALUMNO CON OBJETO PERSONA AL CURSO
     * @param p DE PERSONA
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
