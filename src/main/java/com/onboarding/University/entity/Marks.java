package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Marks.TABLE_NAME)
public class Marks implements Serializable {

    public static final String TABLE_NAME = "Marks";
    public static final String ID_COLUMN = "ID";

    @Id
    private String marksId;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
//    @EmbeddedId
//    private MarksIdentity marksIdentity;

    private int semester;
    private int marks;

    public Marks() {
    }

    public Marks(String marksId, Student student, Subject subject, int semester, int marks) {
        this.marksId = marksId;
        this.student = student;
        this.subject = subject;
        this.semester = semester;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getMarksId() {
        return marksId;
    }

    public void setMarksId(String marksId) {
        this.marksId = marksId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}