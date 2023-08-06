package com.rangel;

import com.rangel.entities.Vehicle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2023, "My Car Model", 455.30);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.rangel.vehicle-hibernate");

        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        try { 
            transaction.begin();
            em.persist(vehicle);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
