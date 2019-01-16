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
    @EmbeddedId
    private MarksIdentity marksIdentity;

    private int semester;
    private int marks;

    public Marks() {
    }

    public Marks(MarksIdentity marksIdentity, int semester, int marks) {
        this.marksIdentity = marksIdentity;
        this.semester = semester;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public MarksIdentity getMarksIdentity() {
        return marksIdentity;
    }

    public void setMarksIdentity(MarksIdentity marksIdentity) {
        this.marksIdentity = marksIdentity;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}