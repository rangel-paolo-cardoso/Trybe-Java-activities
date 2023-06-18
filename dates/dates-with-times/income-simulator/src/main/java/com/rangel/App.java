package com.rangel;

public class App {
    public static void main(String[] args) {
        int futureYear = IncomeSimulator.simulateIncomeInYears(500, 5000);

        System.out.println("The year to withdraw the desired income is " + futureYear);
    }
}
