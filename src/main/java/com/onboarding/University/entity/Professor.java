package com.onboarding.University.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.security.auth.Subject;

@Entity
@Table(name = Professor.TABLE_NAME)
public class Professor {

    private final String TABLE_NAME = "Professor";

    @Id
    private String professorId;
    private String professorName;
    private String primaryDepartment;
    private String secondaryDepartment;
    private Subject subject;

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
