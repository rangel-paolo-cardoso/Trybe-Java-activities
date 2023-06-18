package com.rangel;

import java.time.LocalDateTime;

public class IncomeSimulator {

    private final double INCOME_RATE = 10 / 100.0D;

    /**
     * Simulates an income in years.
     * @param initialAmount type double, the initial income application.
     * @param targetAmount type double, the desired amount.
     * @return
     */
    public int simulateIncomeInYears(double initialAmount, double targetAmount) {
        LocalDateTime time = LocalDateTime.now();
        int numberOfYears = (int) Math.ceil(
                Math.log(targetAmount / initialAmount) / Math.log(1 + INCOME_RATE));

        LocalDateTime futureTime = time.plusYears(numberOfYears);
        return futureTime.getYear();
    }
}
