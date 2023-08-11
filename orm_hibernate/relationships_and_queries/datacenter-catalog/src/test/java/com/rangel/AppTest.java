package com.rangel;

import org.junit.jupiter.api.BeforeAll;

import com.rangel.entities.Application;

public class AppTest {

    @BeforeAll
    public static void populateDB() {
        Application app1 = new Application();
        app1.setName("FutuereH");
        app1.setDescription("Java");

        Application app2 = new Application();
        app2.setName("Agro Techfields");
        app2.setDescription("Python");

        Application app3 = new Application();
        app3.setName("Trybe Course");
        app3.setDescription("Javascript");
    }
}
