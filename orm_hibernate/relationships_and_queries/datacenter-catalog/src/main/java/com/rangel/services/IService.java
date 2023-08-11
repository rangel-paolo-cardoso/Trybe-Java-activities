package com.rangel.services;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public interface IService<T, I extends Serializable> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.datacenter");

    void save(T s);

    void update(T s);

    void delete(I id);

    List<T> list();

    T findById(I id);
}
