/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.exceptions;

/**
 *
 * @author andy
 */
public class StudentListEmptyException extends Exception{

    @Override
    public String getMessage() {
        return "There is no student in the Database"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
