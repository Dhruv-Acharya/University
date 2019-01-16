package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name=Student.TABLE_NAME)
public class Subject {
    public static final String TABLE_NAME="SUBJECT";
    private static final String TABLE_ID = "ID";

    @Id
    @GeneratedValue(generator = "uuid")                 // hibernate
    @GenericGenerator(name = "uuid", strategy = "uuid2")  //hibernate
    @Column(name = Subject.TABLE_ID)
    private String subjectId;

    private String  subjectName;

    @ManyToOne
    private Department department;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    @OneToMany(
            mappedBy = "subject"
    )
    private List<Marks> marks;

    public Subject() {
    }

    public Subject(String subjectId, String subjectName, Department department, Professor professor) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.department = department;
        this.professor = professor;
//        this.marks = marks;
    }

//    public List<Marks> getMarks() {
//        return marks;
//    }
//
//    public void setMarks(List<Marks> marks) {
//        this.marks = marks;
//    }

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
