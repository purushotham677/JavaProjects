package com.hcltech.course_Academy_Service.dto;

public class CourseDto {

    public class CourseDTO {
        private Integer id;
        private String coursename;
        private String language;
        private String level;
        public CourseDTO() {
        }

        public CourseDTO(Integer id, String coursename, String language, String level) {
            this.id = id;
            this.coursename = coursename;
            this.language = language;
            this.level = level;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCoursename() {
            return coursename;
        }

        public void setCoursename(String coursename) {
            this.coursename = coursename;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return String.format("CourseDTO[id=%s, coursename=%s, language=%s, level=%s]", id, coursename, language, level);
        }
    }


}
