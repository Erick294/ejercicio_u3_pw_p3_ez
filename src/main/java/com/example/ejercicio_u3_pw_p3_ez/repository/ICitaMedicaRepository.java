package com.example.ejercicio_u3_pw_p3_ez.repository;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
    
    public void insertarCitaMedica(CitaMedica cime);
    public void actualizarCitaMedica(Integer id);
}
