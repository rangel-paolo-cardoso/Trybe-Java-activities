package com.rangel.services;

import java.util.ArrayList;
import java.util.List;

import com.rangel.entities.Server;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ServerService implements IService<Server, Long> {

    EntityManager em = emf.createEntityManager();

    @Override
    public void save(Server server) {
        em.getTransaction().begin();
        em.persist(server);
        em.getTransaction().commit();
    }

    @Override
    public void update(Server server) {
        em.getTransaction().begin();
        em.merge(server);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Server serverToBeRemoved = em.find(Server.class, id);

        em.getTransaction().begin();
        em.remove(serverToBeRemoved);
        em.getTransaction().commit();
    }

    @Override
    public List<Server> list() {
        List<Server> servers = new ArrayList<>();
        TypedQuery<Server> query = em.createQuery("SELECT s FROM Server s", Server.class);
        servers = query.getResultList();
        return servers;
    }

    @Override
    public Server findById(Long id) {
        return em.find(Server.class, id);
    }

}
