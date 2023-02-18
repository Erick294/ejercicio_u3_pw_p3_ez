package com.example.ejercicio_u3_pw_p3_ez.repository.modelo;

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
@Table(name="doctor")
public class Doctor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctor")
    @SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
    @Column(name = "doct_id")
    private Integer id;

    @Column(name = "doct_cedula")
    private String cedula;

    @Column(name = "doct_nombre")
    private String nombre;

    @Column(name = "doct_apellido")
    private String apellido;

    @Column(name = "doct_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "doct_numero_consultorio")
    private Integer numConsultorio;

    @Column(name = "doct_codigo_senescyt")
    private String codSenescyt;

    @Column(name = "doct_genero")
    private String genero;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
    private List<CitaMedica> citas;

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

    public Integer getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(Integer numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    public String getCodSenescyt() {
        return codSenescyt;
    }

    public void setCodSenescyt(String codSenescyt) {
        this.codSenescyt = codSenescyt;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaMedica> citas) {
        this.citas = citas;
    }

    

}
