package com.example.ejercicio_u3_pw_p3_ez.service;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Paciente;
import com.example.ejercicio_u3_pw_p3_ez.service.to.PacienteTo;

public interface IPacienteService {
    
    public PacienteTo insertarPaciente(Paciente paci);
    public PacienteTo buscarPacienteCedula(String cedula);
}
