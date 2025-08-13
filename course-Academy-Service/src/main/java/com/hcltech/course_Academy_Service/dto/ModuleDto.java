package com.hcltech.course_Academy_Service.dto;

public class ModuleDto {

    public class ModuleDTO {

        private Integer id;
        private String moduleTitle;
        private String description;
        public ModuleDTO() {
        }

        public ModuleDTO(Integer id, String moduleTitle, String description) {
            this.id = id;
            this.moduleTitle = moduleTitle;
            this.description = description;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getModuleTitle() {
            return moduleTitle;
        }

        public void setModuleTitle(String moduleTitle) {
            this.moduleTitle = moduleTitle;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return String.format("ModuleDTO[id=%s, moduleTitle=%s, description=%s]", id, moduleTitle, description);
        }
    }

}
