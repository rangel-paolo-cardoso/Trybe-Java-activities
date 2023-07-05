package org.rangel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("1 - Testing the initial message printed on the console.")
    public void testMainMessage() {
        Main main = new Main();
        Assertions.assertEquals("Hello Gradle!", main.greeting());
    }
}
