package com.hcltech.course_Academy_Service.service;

import com.hcltech.course_Academy_Service.dao.PurchasedCourseDao;
import com.hcltech.course_Academy_Service.model.PurchasedCourse;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PurchasedCourseService {

    @Autowired
    private PurchasedCourseDao purchasedCourseDao;

    public ResponseEntity<?> create(PurchasedCourse purchasedCourse) {
        purchasedCourse =purchasedCourseDao.create(purchasedCourse);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Course Purshed").body(purchasedCourse).build());
    }

    public ResponseEntity<?> getAll() {
        List<PurchasedCourse> allAuthors = purchasedCourseDao.all();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("PurchaseCourse Created Successfully").body(allAuthors).build());

    }

    public ResponseEntity<?> deleteById(Integer id) {
        Optional<?> byId=purchasedCourseDao.getById(id);
        if (byId == null){
            throw  new RuntimeException("invalid id to delete");
        }
        purchasedCourseDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("deleted successfully").body("").build());

    }

    public ResponseEntity<?> getById(Integer id) {
        Optional<PurchasedCourse> byId = purchasedCourseDao.getById(id);
        if(byId==null){
            throw new RuntimeException("Invalid to fetch");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Author Fetched Successfully").body(byId.get()).build());

    }

    public ResponseEntity<?> updateById(Integer id, Student student) {
        Optional<PurchasedCourse> optionalPurchased = purchasedCourseDao.getById(id);

        if (optionalPurchased.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ResponseStructure.builder().status(HttpStatus.NOT_FOUND.value()).message("Author Not Found for ID: " + id).build());
        }
        PurchasedCourse existing = optionalPurchased.get();
        if (existing.getAmountStatus()!= null && !existing.getAmountStatus().isEmpty()) {
            existing.setAmountStatus(existing.getAmountStatus());
        }

        if (existing.getTransaactionId() != null && existing.getTransaactionId()==null) {
            existing.setTransaactionId(existing.getTransaactionId());
        }
        PurchasedCourse course = purchasedCourseDao.create(existing);

        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseStructure.builder()
                        .status(HttpStatus.OK.value())
                        .message("Author Updated Successfully")
                        .body("")
                        .build());
    }
    }

