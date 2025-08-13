package com.hcltech.course_Academy_Service.repository;

import com.hcltech.course_Academy_Service.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
