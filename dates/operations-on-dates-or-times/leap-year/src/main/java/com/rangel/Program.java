package com.rangel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * Main Method - is the entry point of the application.
     * @param args an array of Strings is the only argument.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LeapYear leapYear = new LeapYear();

        printMessage("Enter a year to indenty if it's a leap year: ");
        boolean isLeapYear = leapYear.identifyLeapYear(sc.nextInt());
        System.out.println("Is leap year: " + isLeapYear);

        printMessage("Enter a date in Brazilian format: ");
        String dateString = sc.next();
        int nextLeapYear = leapYear.identifyNextLeapYear(dateString);
        System.out.println("The next leap year after " + dateString + " is " + nextLeapYear);

        sc.close();
    }

    private static void printMessage(String message) {
        System.out.print(message);
    }
}
