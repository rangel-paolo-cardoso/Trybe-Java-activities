package com.rangel;

public class App {
    /**
     * Maint method of the application.
     * @param args an array of string to be used during the excetion of the application.
     */
    public static void main(String[] args) {
        IncomeSimulator incomeSimulator = new IncomeSimulator();
        int futureYear = incomeSimulator.simulateIncomeInYears(500, 5000);

        System.out.println("The year to withdraw the desired income is " + futureYear);
    }
}
