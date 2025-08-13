package com.hcltech.course_Academy_Service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String language;
    private String Coursename;
    private  String level;

    public Course(Integer id, String language, String coursename, String level) {
        this.id = id;
        this.language = language;
        Coursename = coursename;
        this.level = level;
    }
    public Course(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String toString(){
        return String.format("Course[id=%s,language=%s,Coursename=%s,level=%s]",id,language,Coursename,level);
    }
}
