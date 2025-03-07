/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serializardeserializaralumno;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Alumno implements Serializable {

    private int edad;
    private String nia;
    private String nombre;

    public Alumno(int edad, String nia, String nombre) {
        this.edad = edad;
        this.nia = nia;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
        final Alumno other = (Alumno) obj;
        return true;
    }

    @Override
    public String toString() {
        return nombre + ", " + nia + ", " + edad + " años";
    }

}
