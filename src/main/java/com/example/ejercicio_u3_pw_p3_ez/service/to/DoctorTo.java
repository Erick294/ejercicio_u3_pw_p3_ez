package com.example.ejercicio_u3_pw_p3_ez.service.to;

import java.io.Serializable;
import java.time.LocalDate;

public class DoctorTo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String cedula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Integer numConsultorio;
    private String genero;

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Integer getNumConsultorio() {
        return numConsultorio;
    }
    public void setNumConsultorio(Integer numConsultorio) {
        this.numConsultorio = numConsultorio;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
