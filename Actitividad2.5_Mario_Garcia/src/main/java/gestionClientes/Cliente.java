/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionClientes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Cliente {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String nacionalidad;

    public Cliente(String nombre, String apellidos, Date fecha, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fecha;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String[] datosCliente() {
        String[] datos = new String[4];
        datos[0] = nombre;
        datos[1] = apellidos;
        datos[2] = formato.format(fechaAlta);
        datos[3] = nacionalidad;

        return datos;
    }
}
