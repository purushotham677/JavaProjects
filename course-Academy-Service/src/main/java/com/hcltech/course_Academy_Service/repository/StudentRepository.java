package com.hcltech.course_Academy_Service.repository;

import com.hcltech.course_Academy_Service.dao.StudentDao;
import com.hcltech.course_Academy_Service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    
}
