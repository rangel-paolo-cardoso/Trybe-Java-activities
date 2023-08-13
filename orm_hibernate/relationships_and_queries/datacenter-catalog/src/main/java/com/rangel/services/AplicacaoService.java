package com.rangel.services;

import java.io.Serializable;
import java.util.List;

import com.rangel.entities.Application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AplicacaoService implements IService<Application, Long> {

    EntityManager em = emf.createEntityManager();

    @Override
    public void save(Application application) {
        em.getTransaction().begin();
        em.persist(application);
        em.getTransaction().commit();
    }

    @Override
    public void update(Application application) {
        em.getTransaction().begin();
        em.merge(application);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Application applicationToBeRemoved = em.find(Application.class, id);

        em.getTransaction().begin();
        em.remove(applicationToBeRemoved);
        em.getTransaction().commit();
    }

    @Override
    public List<Application> list() {
        List<Application> applications;
        TypedQuery<Application> query = em.createQuery("SELECT a FROM Application a", Application.class);
        applications = query.getResultList();
        return applications;
    }

    @Override
    public Application findById(Long id) {
        return em.find(Application.class, id);
    }

}
