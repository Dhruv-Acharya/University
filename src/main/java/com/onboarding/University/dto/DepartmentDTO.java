package com.onboarding.University.dto;

public class DepartmentDTO {

    private String departmentId;
    private String departmentName;

    public DepartmentDTO() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public DepartmentDTO(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
