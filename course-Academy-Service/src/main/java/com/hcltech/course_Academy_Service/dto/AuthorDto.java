package com.hcltech.course_Academy_Service.dto;

public class AuthorDto {

    public class AuthorDTO {
        private Integer id;
        private String name;
        private String email;

        public AuthorDTO() {
        }

        public AuthorDTO(Integer id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("AuthorDTO[id=%s, name=%s, email=%s]", id, name, email);
        }
    }

}