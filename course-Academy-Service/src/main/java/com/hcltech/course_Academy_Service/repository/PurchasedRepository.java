package com.hcltech.course_Academy_Service.repository;

import com.hcltech.course_Academy_Service.model.PurchasedCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasedRepository extends JpaRepository<PurchasedCourse,Integer> {
}
