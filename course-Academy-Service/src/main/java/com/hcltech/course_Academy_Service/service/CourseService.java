package com.hcltech.course_Academy_Service.service;

import com.hcltech.course_Academy_Service.dao.AuthorDao;
import com.hcltech.course_Academy_Service.dao.CourseDao;
import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.Course;
import com.hcltech.course_Academy_Service.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

        @Autowired
        private CourseDao courseDao;

        public List<Course> getAll(){
            return courseDao.all();
        }
        public ResponseEntity<?> getById(Integer id){
            Optional<Course> course = courseDao.getById(id);
            return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Course fetched successfully").body(getById(id)).build());
        }
        public Course create(Course course){
            return courseDao.create(course);
        }
        public Course updateById(Course course){
            Course saveCourse=courseDao.update(course);
            return saveCourse;
        }


    public ResponseEntity<?> deleteById(Integer id) {
        Optional<Course> byId=courseDao.getById(id) ;
        if (byId == null){
            throw new RuntimeException("invalid id to delete");
        }
        courseDao.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Deleted Successfully").body("deleted succcessfully").build());
    }


}


