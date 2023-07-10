package com.rangel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.rangel.CollaboratingPerson;

public class CollaboratingPersonTest {

    @Test
    @DisplayName("10. Tests the methodo Calculate Net Salary")
    public void testeCalculateNetSalary() {
        CollaboratingPerson person = new CollaboratingPerson();
        person.setGrossSalary(3000);
        assertEquals(2_400, person.calculateNetSalary());
    }

    @Test
    @DisplayName("11. Tests the methodo Calculate Annual Gross Value Received")
    public void testeCalculateAnnualGrossValueReceived() {
        CollaboratingPerson person = new CollaboratingPerson();
        person.setGrossSalary(3000);
        assertEquals(180_000, person.calculateAnnualGrossValueReceived(5));
    }

    @Test
    @DisplayName("12. Tests the methodo Calculate Annual Net Value Received")
    public void testeCalculateAnnualNetValueReceived() {
        CollaboratingPerson person = new CollaboratingPerson();
        person.setGrossSalary(3000);
        assertEquals(144_000, person.calculateAnnualNetValueReceived(5));
    }

    @Test
    @DisplayName("13. Tests the methodo Calculate Annual Tax Value")
    public void testeCalcularValorImpostoAnual() {
        CollaboratingPerson person = new CollaboratingPerson();
        person.setGrossSalary(3000);
        assertEquals(36_000, person.calculateAnnualTaxValue(5));
    }
}
