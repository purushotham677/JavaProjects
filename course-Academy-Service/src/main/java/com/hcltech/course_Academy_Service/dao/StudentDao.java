package com.hcltech.course_Academy_Service.dao;


import com.hcltech.course_Academy_Service.model.Module1;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.repository.ModuleRepository;
import com.hcltech.course_Academy_Service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    public  List<Student> getAll(){
        return studentRepository.findAll();
    }
    public Optional<Student> getById(Integer id){
        return  studentRepository.findById(id);
    }
    public Student create(Student student){
        return studentRepository.save(student);
    }
    public Student update(Student student){
        Optional<Student> existstudent= studentRepository.findById(student.getId());
        if (existstudent.isPresent()){
            Student existstudent1=existstudent.get();
            existstudent1.setName(student.getName());
            existstudent1.setAccountStatus(student.getAccountStatus());
            existstudent1.setEmail(student.getEmail());
            return studentRepository.save(existstudent1);
        }else {
            return null;
        }

    }
    public void deleteById(Integer id){
        studentRepository.deleteById(id);
    }



}
