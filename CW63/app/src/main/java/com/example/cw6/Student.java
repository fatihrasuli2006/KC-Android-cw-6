package com.example.cw6;

public class Student {
    private String studentName;
    private int studentAge;
    private int studentGrade;
    private int studentphoto;

    public Student(String studentName, int studentAge, int studentGrade, int studentphoto) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentphoto = studentphoto;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }
}
