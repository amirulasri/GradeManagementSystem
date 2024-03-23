/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GradeException;

/**
 *
 * @author amiru
 */
public class IncompleteStudentActionException extends Exception {
    public IncompleteStudentActionException() {
        super("Adding, Deleting or Enrolling student is not complete");
    }
}
