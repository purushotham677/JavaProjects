package com.hcltech.course_Academy_Service.controller;

import com.hcltech.course_Academy_Service.dto.PurchasedCourseDto;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.PurchasedCourse;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.service.PurchasedCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseacademy/v1/Purchased")
public class PurchasedController {
    @Autowired
    private PurchasedCourseService purchasedCourseService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return purchasedCourseService.getAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody PurchasedCourse purchasedCourse){
        return purchasedCourseService.create(purchasedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return purchasedCourseService.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return purchasedCourseService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id,@RequestBody Student student) {
        return purchasedCourseService.updateById(id,student);
    }
}
