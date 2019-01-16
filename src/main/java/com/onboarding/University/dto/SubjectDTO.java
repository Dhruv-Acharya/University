package com.onboarding.University.dto;

import com.onboarding.University.entity.Department;
import com.onboarding.University.entity.Professor;

public class SubjectDTO {
    private String subjectId;
    private String subjectName;
    private String departmentId;
    private String professorId;

    public SubjectDTO() {
    }

    public SubjectDTO(String subjectId, String subjectName, String departmentId, String professorId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.departmentId = departmentId;
        this.professorId = professorId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }
}
