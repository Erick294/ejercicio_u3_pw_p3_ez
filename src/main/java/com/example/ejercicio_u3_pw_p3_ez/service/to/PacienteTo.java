package com.example.ejercicio_u3_pw_p3_ez.service.to;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.hateoas.RepresentationModel;

public class PacienteTo extends RepresentationModel<PacienteTo> implements Serializable{

    private static final long serialVersionUID = 1L;

    private String cedula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String codSeguro;
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
    public String getCodSeguro() {
        return codSeguro;
    }
    public void setCodSeguro(String codSeguro) {
        this.codSeguro = codSeguro;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }  
    
}
