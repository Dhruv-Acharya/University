package com.onboarding.University.dto;

public class DepartmentDTO {


    private String departmentId;
    private String departmentName;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;

    }
}
