package com.example.ejercicio_u3_pw_p3_ez.service;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
    
    public void insertarCitaMedica(CitaMedica cime);
    public void actualizarCitaMedica(Integer id);
}
