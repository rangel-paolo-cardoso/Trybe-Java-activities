package com.rangel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rangel.entities.Vehicle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppTest {

    private Long save(Vehicle v) {
        try {
            EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("com.rangel.vehicle-hibernate");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();

            em.close();
            return v.getId();
        } catch (Exception e) {
            return 0L;
        }
    }
}
