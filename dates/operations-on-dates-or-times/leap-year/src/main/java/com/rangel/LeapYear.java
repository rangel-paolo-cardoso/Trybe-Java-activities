package com.rangel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {
    
    /**
     * Identifies if a given year is a leap year.
     * @param year the parameter is of type int.
     * @return a boolean os returned.
     */
    public boolean identifyLeapYear(int year) {
        return (year % 100 == 0) || (year % 4 == 0 || year % 400 == 0);
    }

    /**
     * Identifies what is the next leap year, giving a String representing a date.
     * @param brasilianFormattedDate the parameter is a date in Brazilian format, as a String.
     * @return the next leap year as an int number.
     */
    public int identifyNextLeapYear(String brasilianFormattedDate) {
        DateTimeFormatter brazilianFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormatted = LocalDate.parse(brasilianFormattedDate, brazilianFormat);
        int year = dateFormatted.getYear();

        return year + (4 - (year % 4));
    }
}
