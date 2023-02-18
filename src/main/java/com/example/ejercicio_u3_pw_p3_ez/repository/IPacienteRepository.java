package com.example.ejercicio_u3_pw_p3_ez.repository;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Paciente;

public interface IPacienteRepository {
    
    public Paciente insertarPaciente(Paciente paci);
    public Paciente buscarPacienteCedula(String cedula);

}
