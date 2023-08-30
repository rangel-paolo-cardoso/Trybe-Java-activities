package com.rangel.spring.apirestspring.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rangel.spring.apirestspring.application.BookController;

@Component
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig() {
        register(BookController.class);
    }
}
