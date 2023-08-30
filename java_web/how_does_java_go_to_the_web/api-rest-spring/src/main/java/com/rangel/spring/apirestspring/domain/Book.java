package com.rangel.spring.apirestspring.domain;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Book {
    
    private UUID id;

    private String name;

    private String author;

    public Book() {
        this.id = UUID.randomUUID();
    }

    public Book(String name, String author) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.author = author;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
