package com.rangel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidateCPFTest {

    /*
     * A CPF is a Brazilian identification number, other than the ID.
     * <p>It is usually used to grant access to general services,
     * like hospital, while taking the national test to enter public universities,
     * it like a second way to identify people in Brazil.
     * </p>
     */

    @Test
    @DisplayName("Tests if the method returns true when entered a valid a CPF.")
    public void testValidValidateCPF() {
        assertTrue(ValidateCPF.validateCpf("02758787083"));
    }

    @Test
    @DisplayName("Tests if the method returns false when entered an invalid a CPF.")
    public void testInvalidValidateCPF() {
        assertFalse(ValidateCPF.validateCpf("02758787087"));
    }

    @Test
    @DisplayName("Tests if the method returns false when entered an invalid a CPF with more than 11 digits.")
    public void testInvalid11DigitCPFValidateCPF() {
        assertFalse(ValidateCPF.validateCpf("0275878708711"));
    }
}
