package com.hcltech.course_Academy_Service.controller;

import com.hcltech.course_Academy_Service.dto.AuthorDto;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseacademy/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return authorService.getAll();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Author author){
        return authorService.create(author);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return authorService.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return authorService.getById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id,@RequestBody Author author) {
        return authorService.updateById(id,author);
    }
}
