package com.example.ejercicio_u3_pw_p3_ez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Doctor;
import com.example.ejercicio_u3_pw_p3_ez.service.IServiceDoctor;

@Controller
@CrossOrigin()
@RequestMapping("/doctores")
public class DoctorControllerRestFul {
    
    @Autowired
    private IServiceDoctor doctorService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertarDoctor(@RequestBody Doctor doc) {
        // TODO Auto-generated method stub
        this.doctorService.insertarDoctor(doc); 
    } 
}
