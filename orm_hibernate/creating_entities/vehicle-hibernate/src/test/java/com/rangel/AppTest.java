package com.rangel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

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

    private Vehicle findById(Long id) {
        try {
            EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("com.rangel.vehicle-hibernate");
            EntityManager em = emf.createEntityManager();

            Vehicle v = em.find(Vehicle.class, id);

            em.close();
            return v;
        } catch (Exception e) {
            return null;
        }
    }

    private boolean delete(Long id) {
        try {
            EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("com.rangel.vehicle-hibernate");
            EntityManager em = emf.createEntityManager();

            Vehicle v = em.find(Vehicle.class, id);

            em.getTransaction().begin();
            em.remove(v);
            em.getTransaction().commit();

            em.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Test
    @DisplayName("1 - Verifies whether the vehicle was added successfully.")
    public void checkInsertVehicle() {
        Vehicle v = new Vehicle();
        v.setYear(2023);
        v.setModel("Uno");
        v.setMileage("0");

        Long id = this.save(v);
        assertNotEquals(0, id);

        Vehicle insertedVehicle = this.findById(id);
        assertEquals(2022, insertedVehicle.getYear());
        assertEquals("Uno", insertedVehicle.getModel());
        assertEquals("0", insertedVehicle.getMileage());

        this.delete(insertedVehicle.getId());
    }
}
