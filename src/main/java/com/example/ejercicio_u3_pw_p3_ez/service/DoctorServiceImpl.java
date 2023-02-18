package com.example.ejercicio_u3_pw_p3_ez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_ez.repository.IDoctorRepository;
import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Doctor;
import com.example.ejercicio_u3_pw_p3_ez.service.to.DoctorTo;

@Service
public class DoctorServiceImpl implements IServiceDoctor{

    @Autowired
    private IDoctorRepository doctorRepository;

    @Override
    public void insertarDoctor(Doctor doc) {
        // TODO Auto-generated method stub
        this.doctorRepository.insertarDoctor(doc); 
    }
    
}
