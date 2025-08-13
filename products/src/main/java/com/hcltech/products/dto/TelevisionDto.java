package com.hcltech.Products.dto;


import jakarta.validation.constraints.Size;

public class TelevisionDto {

    private Integer id;

    @Size(max = 20,message = "this product name cannot be exceed 20 characters")
    private String name;
    private String location;
    private   String model;

    public TelevisionDto() {

    }
    public TelevisionDto(Integer id,String name,String location ,String model){
        this.id=id;
        this.name=name;
        this.location=location;
        this.model=model;
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
    public  String toString(){
        return  String.format("TelevisionDto[id=%s,name=%s,location=%s,]",id,name,location,model);
    }
}
