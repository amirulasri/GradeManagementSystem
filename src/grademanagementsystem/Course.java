/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademanagementsystem;

/**
 *
 * @author amiru
 */
public class Course implements GradingSystem{
    private String courseCode;
    private String name;
    private int credits;
    private int grades;

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
        this.credits = 0;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateGrade'");
    }

    @Override
    public char getGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrade'");
    }

}

