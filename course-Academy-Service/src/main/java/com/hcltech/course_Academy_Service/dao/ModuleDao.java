package com.hcltech.course_Academy_Service.dao;


import com.hcltech.course_Academy_Service.model.Module1;
import com.hcltech.course_Academy_Service.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ModuleDao {
@Autowired
private ModuleRepository moduleRepository;
    public List<Module1> getAll(){
    return moduleRepository.findAll();
    }


    public Module1 getById(Integer id){
        return  moduleRepository.findById(id).orElse(null);
    }


    public Module1 create(Module1 module1){
        return moduleRepository.save(module1);
    }
    public Module1 update(Module1 module1){
        Optional<Module1> existmodule= moduleRepository.findById(module1.getId());
        if (existmodule.isPresent()){
            Module1 existmodule1=existmodule.get();
            existmodule1.setModuleTitle(module1.getModuleTitle());
            existmodule1.setDescription(module1.getDescription());
                return moduleRepository.save(existmodule1);
        }else {
            return null;
        }

    }
    public void delete(Integer id){
        moduleRepository.deleteById(id);
    }


    public void deleteById(Integer id) {
        moduleRepository.deleteById(id);
    }


}
