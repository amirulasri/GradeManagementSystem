/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademanagementsystem;

/**
 *
 * @author amiru
 */
import java.util.ArrayList;

public class Student {
    private String studentID;
    private String studentName;
    private ArrayList<Course> listEnrolledCourse = new ArrayList();

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Course> getListEnrolledCourse() {
        return listEnrolledCourse;
    }

    public void setListEnrolledCourse(ArrayList<Course> listEnrolledCourse) {
        this.listEnrolledCourse = listEnrolledCourse;
    }
}
