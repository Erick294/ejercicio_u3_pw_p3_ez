package com.example.ejercicio_u3_pw_p3_ez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.CitaMedica;
import com.example.ejercicio_u3_pw_p3_ez.service.ICitaMedicaService;

@Controller
@CrossOrigin()
@RequestMapping("/citas")
public class SistemaCitasMedicasControllerRestFul {

    @Autowired
    private ICitaMedicaService citaService;   
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertarCitaMedica(@RequestBody CitaMedica cime) {
        // TODO Auto-generated method stub
        this.citaService.insertarCitaMedica(cime);      
    }

    @PutMapping(path = "/{id}")
    public void actualizarCitaMedica(@PathVariable("id") Integer id) {
        // TODO Auto-generated method stub
        this.citaService.actualizarCitaMedica(id);
        
    }
}
