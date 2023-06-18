package com.rangel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IncomeSimulatorTest {

    @Test
    @DisplayName("1 - Define a method that calculates an annual income")
    public void testSimulateIncome() {
        IncomeSimulator testObject = new IncomeSimulator();
        assertEquals(LocalDateTime.now().plusYears(25).getYear(), testObject.simulateIncomeInYears(500, 5000));
    }
}
