package com.rangel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerTest {

    @Test
    @DisplayName("Tests whether the application can return the customer name.")
    public void testName() {
        Customer customer = new Customer();
        customer.setName("Paul");
        assertEquals("Paul", customer.getName());
    }

    @Test
    @DisplayName("Tests whether the application can return a valid customer CPF.")
    public void testSetValidCPF() {
        Customer customer = new Customer();
        customer.setCpf("02758787083");
        assertEquals("02758787083", customer.getCpf());
    }

    @Test
    @DisplayName("Tests whether the application can return an invalid customer CPF.")
    public void testSetInvalidCPF() {
        Customer customer = new Customer();
        customer.setCpf("02758787089");
        assertNull(customer.getCpf());
    }
}
