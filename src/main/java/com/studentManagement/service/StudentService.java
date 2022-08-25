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
    private static StudentService studentService;
    String studentData ="../Data/StudentData.txt";
    private StudentService()
    {
        
    }
    //singleton
    public static StudentService getStudentService(){
        if (studentService==null) {
            studentService=new StudentService();
        }
        return studentService;
    }
    
    //check if data file exist, else make one
    public void checkFile(String file) throws IOException
    {
        /** verify that file exists */
        File dataFile = new File(file);
        if (!dataFile.exists()) {
            dataFile.createNewFile();
            initFirstData();
        }
    }
    
    private void initFirstData() throws FileNotFoundException, IOException{
        Student[] arr={new Student("Nguyen", "Duc","Male", 19, 8, 8),
                            new Student("Huynh", "Huy","Male", 19, 9, 8),
                            new Student("Vo", "Tu","Male",20, 10, 8),
                            new Student("Dinh", "Thai","Male", 21, 7, 8),
                            };
        List<Student> students= new ArrayList<>();
        for (Student student:arr) {
            students.add(student);
        }
        FileOutputStream fos = new FileOutputStream(studentData);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject((List<Student>) students);
        oos.close();
        
    }
    //Read students data from file
    public List<Student> getStudentsFromFile() throws  ClassNotFoundException, FileNotFoundException, IOException{
        List<Student> students=new ArrayList<>();
        checkFile(studentData);
         //Read Student array from file.
        FileInputStream fis = new FileInputStream(studentData);
        ObjectInputStream ois = new ObjectInputStream(fis);
        students = (List<Student>) ois.readObject();
        return students;
    }
    
    //write students data from file
    public void writeStudentsToFile(List<Student> students) throws FileNotFoundException, IOException
    {
        checkFile(studentData);
         //Read Student array from file.
        FileOutputStream fos = new FileOutputStream(studentData);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
    }
            

}
