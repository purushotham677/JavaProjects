package com.hcltech.course_Academy_Service.dto;

public class StudentDto {

    public class StudentDTO {
        private Long id;
        private String name;
        private String accountStatus;
        private String email;

        public StudentDTO() {
        }

        public StudentDTO(Long id, String name, String accountStatus, String email) {
            this.id = id;
            this.name = name;
            this.accountStatus = accountStatus;
            this.email = email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("StudentDTO[id=%s, name=%s, accountStatus=%s, email=%s]", id, name, accountStatus, email);
        }
    }

}
