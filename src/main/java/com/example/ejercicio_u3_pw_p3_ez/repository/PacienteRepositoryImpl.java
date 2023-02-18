package com.example.ejercicio_u3_pw_p3_ez.repository;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Paciente insertarPaciente(Paciente paci) {
        // TODO Auto-generated method stub
        this.entityManager.persist(paci);
        return paci;
    }

    @Override
    public Paciente buscarPacienteCedula(String cedula) {
        // TODO Auto-generated method stub
        TypedQuery<Paciente> myQuery = this.entityManager.createQuery("Select p FROM Paciente p WHERE p.cedula >= :cedula", Paciente.class);
        myQuery.setParameter("cedula", cedula);
        return myQuery.getSingleResult();
    }
   
}
