package com.rangel;

import java.time.LocalDateTime;

public class IncomeSimulator {

    private static final double INCOME_RATE = 10 / 100.0D;
    
    public static int simulateIncomeInYears(double initialAmount, double targetAmount) {
        LocalDateTime time = LocalDateTime.now();
        int numberOfYears = (int) (Math.log(targetAmount / initialAmount) / Math.log(1 + INCOME_RATE));

        LocalDateTime futureTime = time.plusYears(numberOfYears);
        return futureTime.getYear();
    }
}
