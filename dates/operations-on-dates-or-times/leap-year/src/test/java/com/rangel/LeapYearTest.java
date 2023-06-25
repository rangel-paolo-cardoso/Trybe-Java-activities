package com.rangel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    @DisplayName("1 - Verifies if the method 'identifyLeapYear' returns 'false' when it gets '2021' as a parameter")
    public void testIdentifyLeapYear2021() {
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.identifyLeapYear(2021));
    }

    @Test
    @DisplayName("2 - Verifies if the method 'identifyLeapYear' returns 'false' when it gets '2024' as a parameter")
    public void testIdentifyLeapYear2024() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.identifyLeapYear(2024));
    }

    @Test
    @DisplayName("3 - Verifies if the method 'identifyLeapYear' returns 'true' when it gets '1901' as a parameter")
    public void testIdentifyLeapYear1901() {
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.identifyLeapYear(1901));
    }

    @Test
    @DisplayName("4 - Verifies if the method 'identifyLeapYear' returns 'true' when it gets '1904' as a parameter")
    public void testIdentifyLeapYear1904() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.identifyLeapYear(1904));
    }

    @Test
    @DisplayName("5 - Verifies if the method 'identifyNextLeapYear' returns '2024' when it gets '22/12/2021' as a parameter")
    public void testIdentifyNextLeapYear2021() {
        LeapYear leapYear = new LeapYear();
        assertEquals(2024, leapYear.identifyNextLeapYear("22/12/2021"));
    }

    @Test
    @DisplayName("6 - Verifies if the method 'identifyNextLeapYear' returns '1904' when it gets '13/02/1901' as a parameter")
    public void testIdentifyNextLeapYear1901() {
        LeapYear leapYear = new LeapYear();
        assertEquals(1904, leapYear.identifyNextLeapYear("13/02/1901"));
    }
}
