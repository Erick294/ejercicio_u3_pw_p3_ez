package com.example.ejercicio_u3_pw_p3_ez.repository;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarDoctor(Doctor doc) {
        // TODO Auto-generated method stub
        this.entityManager.persist(doc);
    }   
}
