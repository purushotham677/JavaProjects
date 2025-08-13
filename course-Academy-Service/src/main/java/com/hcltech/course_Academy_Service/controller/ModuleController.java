package com.hcltech.course_Academy_Service.controller;

import com.hcltech.course_Academy_Service.model.Module1;
import com.hcltech.course_Academy_Service.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseacademy/v1/module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return  moduleService.getAll();
    }

    @PostMapping
    public ResponseEntity<?> create(Module1 module1){
        return moduleService.create(module1);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Integer id){
        return moduleService.deleteById(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        return moduleService.getById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Integer id, @RequestBody Module1 Module1){
        return moduleService.updateById(id,Module1);
    }
}
