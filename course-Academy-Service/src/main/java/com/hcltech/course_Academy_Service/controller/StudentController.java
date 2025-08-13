package com.hcltech.course_Academy_Service.controller;

import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.service.AuthorService;
import com.hcltech.course_Academy_Service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseacademy/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return  studentService.getAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Student student){
        return studentService.create(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return studentService.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return studentService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id,@RequestBody Student student) {
        return studentService.updateById(id,student);
    }
}
