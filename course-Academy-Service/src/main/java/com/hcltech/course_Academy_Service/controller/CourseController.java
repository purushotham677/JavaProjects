package com.hcltech.course_Academy_Service.controller;

import com.hcltech.course_Academy_Service.dto.CourseDto;
import com.hcltech.course_Academy_Service.model.Course;
import com.hcltech.course_Academy_Service.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseacademy/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @GetMapping
    public List<Course> getAll(){
        return  courseService.getAll();
    }
    @PostMapping
    public Course create(@RequestBody Course course){
        return courseService.create(course);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return courseService.deleteById(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer  id){
        return courseService.getById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id,@RequestBody Course course){
        Course res= courseService.updateById(course);
        if (res ==null){
            ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok(res);
    }

}