package com.onboarding.University.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = Marks.TABLE_NAME)


public class Marks {

    public static final String TABLE_NAME = "Marks";
    public static final String ID_COLUMN = "ID";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(name = Marks.ID_COLUMN)
    private String marksId;
    private Student student;
    private Subject subject;
    private int marks;


    public String getMarksId() {
        return marksId;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarksId(String marksId) {
        this.marksId = marksId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marksId='" + marksId + '\'' +
                ", student=" + student +
                ", subject=" + subject +
                ", marks=" + marks +
                '}';
    }
}