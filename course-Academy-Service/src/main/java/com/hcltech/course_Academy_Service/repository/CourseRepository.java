package com.hcltech.course_Academy_Service.repository;

import com.hcltech.course_Academy_Service.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
