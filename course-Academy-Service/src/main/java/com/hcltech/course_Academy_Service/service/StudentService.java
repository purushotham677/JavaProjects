package com.hcltech.course_Academy_Service.service;

import com.hcltech.course_Academy_Service.dao.PurchasedCourseDao;
import com.hcltech.course_Academy_Service.dao.StudentDao;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.PurchasedCourse;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public  ResponseEntity<?> getAll() {
        List<Student> allStudents = studentDao.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("student Created Successfully").body("").build());

    }

    public ResponseEntity<?> create(Student student) {
        student = studentDao.create(student);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Author Created Successfully").body("").build());

    }

    public ResponseEntity<?> deleteById(Integer id) {
        Optional<Student> byId = studentDao.getById(id);
        if (byId == null) {
            throw new RuntimeException("Invalid Id to Delete");
        }
        studentDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("deleted successfully").body(" ").build());
    }

    public ResponseEntity<?> getById(Integer id) {
        Optional<Student> byId=studentDao.getById(id);
        if (id == null){
            throw  new RuntimeException("Invalid to fetch");

        }
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Student Fetched Successfully").body(byId.get()).build());


    }

    public ResponseEntity<?> updateById(Integer id, Student student) {
        Optional<Student> optionalStudent = studentDao.getById(id);

        if (optionalStudent.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponseStructure.builder().status(HttpStatus.NOT_FOUND.value()).message("Student Not Found for ID: " + id).build());
        }
        Student eStudent1 = optionalStudent.get();
        if (eStudent1.getName() != null && !eStudent1.getName().isEmpty()) {
            eStudent1.setName(eStudent1.getName());
        }
        if (eStudent1.getEmail() != null && !eStudent1.getEmail().isEmpty()) {
            eStudent1.setEmail(eStudent1.getEmail());
        }
        if (eStudent1.getAccountStatus() != null && !eStudent1.getAccountStatus().isEmpty()) {
            eStudent1.setAccountStatus(eStudent1.getAccountStatus());
        }
        Student savedAuthor = studentDao.create(eStudent1);

        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseStructure.builder()
                        .status(HttpStatus.OK.value())
                        .message("Author Updated Successfully")
                        .body("")
                        .build());
    }

    }

