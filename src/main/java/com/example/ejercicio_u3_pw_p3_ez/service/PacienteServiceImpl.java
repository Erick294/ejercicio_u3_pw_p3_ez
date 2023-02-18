package com.example.ejercicio_u3_pw_p3_ez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_ez.repository.IPacienteRepository;
import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Paciente;
import com.example.ejercicio_u3_pw_p3_ez.service.to.PacienteTo;

@Service
public class PacienteServiceImpl implements IPacienteService{
    
    @Autowired
    private IPacienteRepository pacienteRepository;

    private PacienteTo convertir(Paciente paci){
        PacienteTo paciTo = new PacienteTo();
        paciTo.setApellido(paci.getApellido());
        paciTo.setCedula(paci.getCedula());
        paciTo.setFechaNacimiento(paci.getFechaNacimiento());
        paciTo.setGenero(paci.getGenero());
        paciTo.setNombre(paci.getNombre());
        paciTo.setCodSeguro(paci.getCodSeguro());
        return paciTo;
    }

    @Override
    public PacienteTo insertarPaciente(Paciente paci) {
        // TODO Auto-generated method stub
        this.pacienteRepository.insertarPaciente(paci);
        return this.convertir(paci);
    }

    @Override
    public PacienteTo buscarPacienteCedula(String cedula) {
        // TODO Auto-generated method stub
        Paciente paciente = this.pacienteRepository.buscarPacienteCedula(cedula);
        return this.convertir(paciente);
    }
}
