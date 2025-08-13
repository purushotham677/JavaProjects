package com.hcltech.course_Academy_Service.dto;

public class PurchasedCourseDto {
        private Integer id;
        private String amountStatus;
        private Long transactionId;
        private String paymentMethod;

        public PurchasedCourseDto() {
        }
        public PurchasedCourseDto(Integer id, String amountStatus, Long transactionId, String paymentMethod) {
            this.id = id;
            this.amountStatus = amountStatus;
            this.transactionId = transactionId;
            this.paymentMethod = paymentMethod;
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

        public Long getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Long transactionId) {
            this.transactionId = transactionId;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        @Override
        public String toString() {
            return String.format("PurchasedCourseDTO[id=%s, amountStatus=%s, transactionId=%s, paymentMethod=%s]",
                    id, amountStatus, transactionId, paymentMethod);
        }
    }



