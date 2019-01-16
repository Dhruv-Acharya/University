package com.onboarding.University.dto;

public class MarksDTO {
    private String studentId;
    private String subjectId;
    private int marks;
    private int semester;

    public MarksDTO() {
    }

    public MarksDTO(String studentId, String subjectId, int marks, int semester) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.marks = marks;
        this.semester = semester;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
