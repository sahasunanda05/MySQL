package com.jap;

public class Student {
    private String name;
    private int rollNo;
    private String grades;
    private int totalMarks;

    public Student(String name, int rollNo, String grades, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.grades = grades;
        this.totalMarks = totalMarks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", grades='" + grades + '\'' +
                ", classes=" + totalMarks +
                '}';
    }
}
