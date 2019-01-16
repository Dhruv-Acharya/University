package com.onboarding.University.dto;

import com.onboarding.University.entity.Subject;

public class ProfessorDTO {
    private String professorId;
    private String professorName;
    private String primaryDepartment;
    private String secondaryDepartment;

    public ProfessorDTO() {
    }

    public ProfessorDTO(String professorId, String professorName, String primaryDepartment, String secondaryDepartment) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.primaryDepartment = primaryDepartment;
        this.secondaryDepartment = secondaryDepartment;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(String primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    public String getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(String secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }

}
