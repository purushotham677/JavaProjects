package com.hcltech.course_Academy_Service.dao;

import com.hcltech.course_Academy_Service.model.PurchasedCourse;
import com.hcltech.course_Academy_Service.model.Student;
import com.hcltech.course_Academy_Service.repository.PurchasedRepository;
import com.hcltech.course_Academy_Service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class PurchasedCourseDao {

        @Autowired
        private PurchasedRepository purchasedRepository;

        public List<PurchasedCourse> all(){
            return purchasedRepository.findAll();
        }
        public Optional<PurchasedCourse> getById(Integer id){
            return  purchasedRepository.findById(id);
        }
        public PurchasedCourse create(PurchasedCourse purchasedCourse){
            return purchasedRepository.save(purchasedCourse);
        }
        public PurchasedCourse update(PurchasedCourse purchasedCourse){
            Optional<PurchasedCourse> existpurchasedCourse= purchasedRepository.findById(purchasedCourse.getId());
            if (existpurchasedCourse.isPresent()){
                PurchasedCourse existPurchased1=existpurchasedCourse.get();
                existPurchased1.setAmountStatus(purchasedCourse.getAmountStatus());
                existPurchased1.setTransaactionId(purchasedCourse.getTransaactionId());
                existPurchased1.setPaymentmethod(purchasedCourse.getPaymentmethod());
                return purchasedRepository.save(existPurchased1);
            }else {
                return null;
            }

        }
        public void deleteById(Integer id){
            purchasedRepository.deleteById(id);
        }



}






