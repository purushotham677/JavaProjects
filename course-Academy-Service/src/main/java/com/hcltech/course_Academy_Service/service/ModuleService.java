package com.hcltech.course_Academy_Service.service;

import com.hcltech.course_Academy_Service.dao.CourseDao;
import com.hcltech.course_Academy_Service.dao.ModuleDao;
import com.hcltech.course_Academy_Service.dto.ModuleDto;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.Course;
import com.hcltech.course_Academy_Service.model.Module1;
import com.hcltech.course_Academy_Service.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModuleService {
    @Autowired
    private  ModuleDao moduleDao;

    public ResponseEntity<?>getAll(){
        List<Module1> module1s = moduleDao.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("All fetdched successfully").body(module1s).build());
    }


    public ResponseEntity<?> create(Module1 module1) {
        module1 = moduleDao.create(module1);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("module1 Created Successfully").body(module1).build());

    }

    public ResponseEntity<?> deleteById(Integer id) {
        if (id == null) {
            throw new RuntimeException("invalid id to delete");
        }
        moduleDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("deleted successfully").body(" ").build());

    }

    public ResponseEntity<?> getById(Integer id) {
        Module1 res = moduleDao.getById(id);
        if (res == null) {
            throw new RuntimeException("invalid fetch");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Module1 Fetched Successfully").body(res).build());


    }


    public ResponseEntity<?> updateById(Integer id, Module1 module1) {
        Module1 optionalModule1 = moduleDao.getById(id);

        if(optionalModule1==null){
            throw new RuntimeException("Invalid Id to Update");
        }
        if (module1.getModuleTitle() != null && !module1.getModuleTitle().isEmpty()) {
            optionalModule1.setModuleTitle(module1.getModuleTitle());
        }
        if (module1.getDescription() != null && !module1.getDescription().isEmpty()) {
            optionalModule1.setDescription(module1.getDescription());
        }

        Module1 module = moduleDao.create(optionalModule1);
        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseStructure.builder()
                        .status(HttpStatus.OK.value())
                        .message("Author Updated Successfully")
                        .body(module)
                        .build());

    }
}
