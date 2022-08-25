/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.model;

import java.io.Serializable;

/**
 *
 * @author andy
 */
public class Student implements Serializable{
    //this is to make automatic ID
    private static int nextID=1;

    private int id;

    private String fname;

    private String lname;
    
    private String gender;

    private int age;

    private double midTermGrade;

    private double finalGrade;


    public Student(String lname,String fname,String gender,int age, double midTermGrade, double finalGrade)
    {
        id=nextID;
        this.lname=lname;
        this.fname=fname;
        this.gender=gender;
        this.age=age;
        this.midTermGrade=midTermGrade;
        this.finalGrade=finalGrade;
        nextID++;
    }


    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public void setMidTermGrade(double midTermGrade) {
        this.midTermGrade = midTermGrade;
    }
    
     public double getMidTermGrade() {
        return midTermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    public double getResult()
    {
        return (midTermGrade*2+finalGrade*3)/5;
    }
}
