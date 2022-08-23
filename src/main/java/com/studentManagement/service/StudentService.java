/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.service;

import com.studentManagement.model.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author andy
 */
public class StudentService {
    String studentData ="../Data/StudentData.txt";
    public StudentService()
    {
        
    }
    
    //check if data file exist, else make one
    public void checkFile(String file)
    {
        /** verify that file exists */
        File dataFile = new File(file);
        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
                
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    //Read students data from file
    public List<Student> getAllStudent(String file){
        List<Student> students=new ArrayList<>();
        checkFile(file);
        try 
        {
             //Read Student array from file.
            FileInputStream fis = new FileInputStream(file);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) 
            {
                students = (List<Student>) ois.readObject();
            }
        }
            catch (FileNotFoundException e) 
            {
                System.out.println(e.getMessage());
            }
            catch (IOException | ClassNotFoundException e) 
            {
                System.out.println(e.getMessage());
            }
        
        return students;
    }
    
    //write students data from file
    public void writeStudent(String file,List<Student> students)
    {
       
        checkFile(file);
        try 
        {
             //Read Student array from file.
            FileOutputStream fos = new FileOutputStream("students.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        }
        catch (FileNotFoundException e) 
            {
                System.out.println(e.getMessage());
            }
        catch (IOException e) 
            {
                System.out.println(e.getMessage());
            }
    }
}
