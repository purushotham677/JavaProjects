package com.hcltech.course_Academy_Service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "module1")
public class Module1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String moduleTitle;
    private String description;

    public Module1(Integer id, String moduleTitle, String description) {
        this.id = id;
        this.moduleTitle = moduleTitle;
        this.description = description;
    }
    public Module1(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString(){
        return String.format("Module[id=%s,moduleTitle=%s,description=%s]" ,id,moduleTitle,description);
    }
}
