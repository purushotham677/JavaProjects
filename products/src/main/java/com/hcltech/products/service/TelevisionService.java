package com.hcltech.Products.service;

import com.hcltech.Products.dao.TelevisionDao;
import com.hcltech.Products.entity.Television;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TelevisionService {

    @Autowired
    private TelevisionDao televisionDao;

    public List<Television> findAll(){
        return  televisionDao.getAll();
    }
    public Television getById(Integer id){
        return  televisionDao.getById(id);
    }
    public Television create(Television television){
        return televisionDao.create(television);
    }
}
