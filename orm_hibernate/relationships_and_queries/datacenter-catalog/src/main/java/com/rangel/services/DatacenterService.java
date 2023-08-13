package com.rangel.services;

import java.util.List;

import com.rangel.entities.Datacenter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class DatacenterService implements IService<Datacenter, Long> {

    EntityManager em = emf.createEntityManager();

    @Override
    public void save(Datacenter datacenter) {
        em.getTransaction().begin();
        em.persist(datacenter);
        em.getTransaction().commit();
    }

    @Override
    public void update(Datacenter datacenter) {
        em.getTransaction().begin();
        em.merge(datacenter);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Datacenter datacenterToBeDeleted = em.find(Datacenter.class, id);

        em.getTransaction().begin();
        em.remove(datacenterToBeDeleted);
        em.getTransaction().commit();
    }

    @Override
    public List<Datacenter> list() {
        List<Datacenter> datacenters;
        TypedQuery<Datacenter> query = em.createQuery("SELECT d FROM Datacenter d", Datacenter.class);
        datacenters = query.getResultList();
        return datacenters;
    }

    @Override
    public Datacenter findById(Long id) {
        return em.find(Datacenter.class, id);
    }

}
