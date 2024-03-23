/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GradeException;

/**
 *
 * @author amiru
 */
public class CourseNotFoundException extends Exception {
    public CourseNotFoundException() {
        super("Course not found");
    }
}
