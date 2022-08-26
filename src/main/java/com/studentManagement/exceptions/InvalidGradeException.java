/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.exceptions;

/**
 *
 * @author andy
 */
public class InvalidGradeException extends Exception{
    
    public InvalidGradeException(){
        
    }

    @Override
    public String getMessage() {
        return "invalid grade input please try again"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
