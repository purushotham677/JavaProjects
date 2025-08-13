package com.hcltech.Products.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tv")
public class Television {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     private String name;
    private String location;
    private   String model;


    public Television(Integer id, String name, String location, String model) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.model = model;
    }
    public Television(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Television[id=%s,name=%s,location=%s,model=%s]",id,name,location,model);
    }
}
