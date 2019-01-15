package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name=Department.TABLE_NAME)
public class Department {
    public static final String TABLE_NAME = "DEPARTMENT";
    private static final String ID_COLUMN = "ID";
    @Id
    @GeneratedValue(generator = "uuid")                 // hibernate
    @GenericGenerator(name = "uuid", strategy = "uuid2")  //hibernate
    @Column(name = Department.ID_COLUMN)
    private String departmentId;
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private List<Student> student;
    @OneToMany
    private List<Subject> subject;
    @OneToMany(mappedBy = "primaryDepartment")
    private List<Professor> professor;

    public Department() {
    }

    public Department(String departmentId, String departmentName, List<Student> student, List<Subject> subject) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.student = student;
        this.subject = subject;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
}