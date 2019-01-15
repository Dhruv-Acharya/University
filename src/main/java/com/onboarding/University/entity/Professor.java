package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name=Professor.TABLE_NAME)
public class Professor {

    public static final String TABLE_NAME = "Professor";

    @Id
    @GeneratedValue(generator = "uuid")                 // hibernate
    @GenericGenerator(name = "uuid", strategy = "uuid2")  //hibernate
    private String professorId;
    @NotNull
    private String professorName;
    @NotNull
    @ManyToOne
    private Department primaryDepartment;
    @ManyToOne
    private Department secondaryDepartment;

    @OneToMany(
            mappedBy = "professor"
    )
    private List<Subject> subject;

    public Professor() {
    }

    public Professor(String professorId, String professorName, Department primaryDepartment, Department secondaryDepartment, List<Subject> subject) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.primaryDepartment = primaryDepartment;
        this.secondaryDepartment = secondaryDepartment;
        this.subject = subject;
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

    public Department getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(Department primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    public Department getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(Department secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
}
