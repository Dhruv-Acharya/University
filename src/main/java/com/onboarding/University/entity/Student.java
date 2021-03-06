package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name=Student.TABLE_NAME)



public class Student {
    public static final String TABLE_NAME="STUDENT";
    private static final String ID_COLUMN="ID";

    @Id
    @GeneratedValue(generator ="uuid")                 // hibernate
    @GenericGenerator( name="uuid", strategy = "uuid2")  //hibernate
    @Column(name =Student.ID_COLUMN)

    private String studentId;
    private String studentName;
    private int semester;
    @ManyToOne
    private Department department;
    @OneToMany
    private List<Marks> marks;

    public Student() {
    }

    public Student(String studentId, String studentName, int semester, Department department, List<Marks> marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.semester = semester;
        this.department = department;
        this.marks = marks;
    }

    public List<Marks> getMarks() {
        return marks;
    }

    public void setMarks(List<Marks> marks) {
        this.marks = marks;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
