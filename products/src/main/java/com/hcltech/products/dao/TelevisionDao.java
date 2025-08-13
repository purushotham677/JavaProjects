package com.hcltech.Products.dao;

import com.hcltech.Products.entity.Television;
import com.hcltech.Products.repository.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class TelevisionDao {
    @Autowired
    private TelevisionRepository televisionRepository;
    public List<Television> getAll(){
        return televisionRepository.findAll();
    }
    public Television getById(Integer id){
        return televisionRepository.getById(id);
    }
    public Television create(Television television){
        return  televisionRepository.save(television);
    }
}


