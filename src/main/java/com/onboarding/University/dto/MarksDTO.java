package com.onboarding.University.dto;

public class MarksDTO {
    private String marksId;
    private String studentId;
    private String subjectId;
    private int marks;

    public MarksDTO() {
    }

    public MarksDTO(String marksId, String studentId, String subjectId, int marks) {
        this.marksId = marksId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.marks = marks;
    }

    public String getMarksId() {
        return marksId;
    }

    public void setMarksId(String marksId) {
        this.marksId = marksId;
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
}
