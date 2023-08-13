package com.rangel.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Datacenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private List<Server> servers;

    public Datacenter() {
        super();
        this.servers = new ArrayList<>();
    }

    /**
    * COnstructor method with arguments.
    * @param id Long, the primary-key of a Datacenter.
    * @param nome String, Datacenter name.
    * @param localidade String, the location.
    */
    public Datacenter(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addServer(Server server) {
        this.servers.add(server);
    }
}
