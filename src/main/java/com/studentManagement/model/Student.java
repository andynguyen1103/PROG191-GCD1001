/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.model;

import java.io.Serializable;
import javax.naming.spi.DirStateFactory;

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
    
    private String inClass;

    private int age;

    private double midTermGrade;

    private double finalGrade;
    
    
    public  Student(){
        id=nextID;
        nextID++;
    }

    public Student(String lname,String fname,String gender,int age, String inClass, double midTermGrade, double finalGrade)
    {
        id=nextID;
        this.lname=lname;
        this.fname=fname;
        this.gender=gender;
        this.age=age;
        this.inClass=inClass;
        this.midTermGrade=midTermGrade;
        this.finalGrade=finalGrade;
        nextID++;
    }

    public static void setNextID(int nextID) {
        Student.nextID = nextID;
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

    public String getInClass() {
        return inClass;
    }

    public void setInClass(String inClass) {
        this.inClass = inClass;
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
    
    public String getResult()
    {
        double arv = (midTermGrade*2+finalGrade*3)/5;
        return arv<6.5?"Fail":arv<8?"Pass":arv<10?"Merit":"Distinct";
    }
}
