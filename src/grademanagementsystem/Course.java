/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademanagementsystem;

/**
 *
 * @author amiru
 */
public class Course implements GradingSystem {

    private String courseCode;
    private String name;
    private int credits;
    private int grades;
    private char gradeGPA;

    // CONTRUCTOR
    public Course(String courseCode, String name, int credits, int grades) {
        this.courseCode = courseCode;
        this.name = name;
        this.credits = credits;
        this.grades = grades;
    }

    public Course(String courseCode, String name, int credits) {
        this.courseCode = courseCode;
        this.name = name;
        this.credits = credits;
        this.grades = 0;
    }

    // SETTER
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public void setCourseCredits(int credits) {
        this.credits = credits;
    }

    public void setCourseGrade(int grades) {
        this.grades = grades;
    }

    // GETTER
    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseName() {
        return this.name;
    }

    public int getCourseCredits() {
        return this.credits;
    }

    public int getCourseGrade() {
        return this.grades;
    }

    @Override
    public double calculateGrade() {
        // CALCULATE GRADE HERE
        if (this.grades >= 90) {
            this.gradeGPA = 'A';
            return 'A';
        } else if (this.grades >= 80) {
            this.gradeGPA = 'B';
            return 'B';
        } else if (this.grades >= 70) {
            this.gradeGPA = 'C';
            return 'C';
        } else if (this.grades >= 60) {
            this.gradeGPA = 'D';
            return 'D';
        } else if (this.grades >= 50) {
            this.gradeGPA = 'E';
            return 'E';
        } else {
            this.gradeGPA = 'F';
            return 'F';
        }
    }

    @Override
    public char getGrade() {
        return this.gradeGPA;
    }

}
