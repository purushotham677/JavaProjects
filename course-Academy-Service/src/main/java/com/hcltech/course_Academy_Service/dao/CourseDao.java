package com.hcltech.course_Academy_Service.dao;

import com.hcltech.course_Academy_Service.model.Author;
import com.hcltech.course_Academy_Service.model.Course;
import com.hcltech.course_Academy_Service.repository.AuthorRepository;
import com.hcltech.course_Academy_Service.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class CourseDao {

        @Autowired
        private CourseRepository courseRepository;

        public List<Course> all(){
            return courseRepository.findAll();
        }
        public Optional<Course> getById(Integer id){
            return courseRepository.findById(id);
        }
        public Course create(Course course){
            return courseRepository.save(course);
        }
        public Course update(Course course){
            Optional<Course> existscourse=courseRepository.findById(course.getId());
            if (existscourse.isPresent()){
                Course existCourse1 =existscourse.get();
                existCourse1.setLanguage(course.getLanguage());
                existCourse1.setCoursename(course.getCoursename());
                existCourse1.setLevel(course.getLevel());

                return courseRepository.save(existCourse1);
            }else {
                return null;
            }
        }
        public void deleteById(Integer id){
            courseRepository.deleteById(id);
        }



}


