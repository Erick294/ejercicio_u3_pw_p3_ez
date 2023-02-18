package com.example.ejercicio_u3_pw_p3_ez.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Paciente;
import com.example.ejercicio_u3_pw_p3_ez.service.IPacienteService;
import com.example.ejercicio_u3_pw_p3_ez.service.to.PacienteTo;

@Controller
@CrossOrigin()
@RequestMapping("/pacientes")
public class PacienteControllerRestFul {

    @Autowired
    private IPacienteService pacienteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PacienteTo insertarPaciente(@RequestBody Paciente paci) {
        // TODO Auto-generated method stub
        PacienteTo paciTo = this.buscarPacienteCedula(paci.getCedula());
        Link myLink = linkTo(methodOn(this.getClass()).buscarPacienteCedula(paci.getCedula())).withSelfRel();
        paciTo.add(myLink);

        return this.pacienteService.insertarPaciente(paci);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public PacienteTo buscarPacienteCedula(String cedula) {
        // TODO Auto-generated method stub
        return this.pacienteService.buscarPacienteCedula(cedula);
    }
    
}
