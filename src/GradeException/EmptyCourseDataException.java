/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GradeException;

/**
 *
 * @author amiru
 */
public class EmptyCourseDataException extends Exception {
    public EmptyCourseDataException() {
        super("There is no course data found in the list");
    }
}
