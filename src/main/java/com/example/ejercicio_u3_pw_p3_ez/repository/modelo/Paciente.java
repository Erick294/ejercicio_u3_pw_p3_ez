package com.example.ejercicio_u3_pw_p3_ez.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    @SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
    @Column(name = "paci_id")
    private Integer id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "paci_codigo_seguro")
    private String codSeguro;

    @Column(name = "paci_estatura")
    private BigDecimal estatura;

    @Column(name = "paci_genero")
    private BigDecimal peso;

    @Column(name = "doct_genero")
    private String genero;

    @OneToMany(mappedBy = "paciente", fetch = FetchType.EAGER)
    private List<CitaMedica> citasPaci;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public BigDecimal getEstatura() {
        return estatura;
    }

    public void setEstatura(BigDecimal estatura) {
        this.estatura = estatura;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<CitaMedica> getCitasPaci() {
        return citasPaci;
    }

    public void setCitasPAci(List<CitaMedica> citas) {
        this.citasPaci = citas;
    }

    
}
