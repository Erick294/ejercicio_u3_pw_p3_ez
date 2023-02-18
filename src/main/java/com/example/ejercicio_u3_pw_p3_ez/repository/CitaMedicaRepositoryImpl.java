package com.example.ejercicio_u3_pw_p3_ez.repository;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_u3_pw_p3_ez.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void insertarCitaMedica(CitaMedica cime) {
        // TODO Auto-generated method stub
        this.entityManager.persist(cime);
    }

    @Override
    public void actualizarCitaMedica(Integer id) {
        // TODO Auto-generated method stub
        this.entityManager.merge(this.buscar(id));     
    }

    public CitaMedica buscar(Integer id){
        TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery("Select c FROM CitaMedica c WHERE c.id >= :id", CitaMedica.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }
    
}
