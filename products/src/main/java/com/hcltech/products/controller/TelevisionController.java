package com.hcltech.Products.controller;

import com.hcltech.Products.entity.Television;
import com.hcltech.Products.service.TelevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public  class TelevisionController {
    @Autowired
    TelevisionService televisionService;
    @GetMapping
    public List<Television> findAll(){
        return  televisionService.findAll();
    }
    @GetMapping("{id}")
    public Television getById(Integer id){
        return  televisionService.getById(id);
    }
    @PostMapping
    public Television create( Television television){
        return  televisionService.create(television);
    }
}