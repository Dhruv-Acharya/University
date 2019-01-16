package com.onboarding.University.dto;

import com.onboarding.University.entity.Department;
import com.onboarding.University.entity.Marks;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class StudentDTO {

    private String studentId;
    private String studentName;
    private String departmentId;
    private int semester;

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
