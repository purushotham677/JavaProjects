package com.hcltech.course_Academy_Service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PurchasedCourse")
public class PurchasedCourse {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String amountStatus;
    private Long transaactionId;
    private String paymentmethod;

    public PurchasedCourse(Integer id, String amountStatus, Long transaactionId, String paymentmethod) {
        this.id = id;
        this.amountStatus = amountStatus;
        this.transaactionId = transaactionId;
        this.paymentmethod = paymentmethod;
    }
    public PurchasedCourse(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }

    public Long getTransaactionId() {
        return transaactionId;
    }

    public void setTransaactionId(Long transaactionId) {
        this.transaactionId = transaactionId;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
    public String toString(){
        return String.format("PurchasedCourse[id=%s,amountStatus=%s,transaactionId=%s,paymentmethod=%s]",id,amountStatus,transaactionId,paymentmethod);
    }
}
