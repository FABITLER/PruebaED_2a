/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * CREA UNA OBJETO PERSONA CON DATOS POR DEFECTO QUE ES
     *  VACIO Y  LA FECHA 1990/1/1
     */

    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Crea una persona utilizando un nif y dando valores por defecto
     * @param nif
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * CREA UN OBJETO PERSONA CON TODOS LOS DATOS QUE SE LE INGRESE
     * @param nif
     * @param nombre
     * @param genero
     * @param dia
     * @param mes
     * @param ano
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * DEVUELVE EN STRING LOS DATOS DE LA PERSONA
     * @return
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * COMPRUEBA SI UNA PERSONA TIENE EL MISMO DNI Y ASI SABER SI ES LA MISMA PERSONA
     * @param a
     * @return TRUE SI SI ES, FALSE SI NO
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * DEVUELVE TRUE SI ES EL MISMO OBJECTO CON EL MISMO ID Y FALSE SI NO LO ES
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * DEVUELVE UN  NUMERO SEGUN SI EL DNI ES MAYOR QUE EL SE COMPARA
     * O UN NUMERO MENOR SI EL DNI ES MENOR QUE EL SE COMPARA
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
