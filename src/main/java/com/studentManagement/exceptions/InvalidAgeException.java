/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.exceptions;

/**
 *
 * @author andy
 */
public class InvalidAgeException extends Exception{
    
    public InvalidAgeException()
    {
        
    }

    @Override
    public String getMessage() {
        return "Invalid age input please try again"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
