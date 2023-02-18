package com.example.ejercicio_u3_pw_p3_ez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_ez.repository.ICitaMedicaRepository;
import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

    @Autowired
    private ICitaMedicaRepository citaMedRepository;

    @Override
    public void insertarCitaMedica(CitaMedica cime) {
        // TODO Auto-generated method stub
        this.citaMedRepository.insertarCitaMedica(cime);      
    }

    @Override
    public void actualizarCitaMedica(Integer id) {
        // TODO Auto-generated method stub
        this.citaMedRepository.actualizarCitaMedica(id);
        
    }
    
}
