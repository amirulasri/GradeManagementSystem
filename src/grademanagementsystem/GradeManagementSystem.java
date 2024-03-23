/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grademanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author amiru
 */
public class GradeManagementSystem {
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static ArrayList<Course> courseAvailable = new ArrayList<>();
    public static void main(String[] args) {
        new GradeSystemUI().setVisible(true);
    }
    
}
