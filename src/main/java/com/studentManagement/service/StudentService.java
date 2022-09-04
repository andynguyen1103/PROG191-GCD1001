/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentManagement.service;

import com.aspose.cells.Cell;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.studentManagement.exceptions.StudentListEmptyException;
import com.studentManagement.model.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author andy
 */
public class StudentService {
    private static StudentService studentService;
    String studentData ="StudentData.txt";
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
        Student[] arr={new Student("Nguyen", "Duc","Female", 19, "GCD1001" , 8, 8),
                            new Student("Huynh", "Huy","Female", 19, "GCD1001", 9, 8),
                            new Student("Vo", "Tu","Male",20, "GCD1001" , 10, 8),
                            new Student("Dinh", "Thai","Male", 21,"GCD1001" , 7, 8)
                            };
        List<Student> students= new ArrayList<>();
        for (Student student:arr) {
            students.add(student);
        }
        writeStudentsToFile(students);
        
    }
    //Read students data from file
    public List<Student> getStudentsFromFile() throws  ClassNotFoundException, FileNotFoundException, IOException{
        checkFile(studentData);
         //Read Student array from file.
        FileInputStream fis = new FileInputStream(studentData);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> students = (List<Student>) ois.readObject();
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
    
    public void exportToXls() throws StudentListEmptyException, Exception
    {
        // Initialize a new Workbook
        Workbook book = new Workbook();

        // Obtaining the reference of the worksheet
        Worksheet sheet = book.getWorksheets().get(0);
        
        // Set Custom header
        sheet.getCells().get(0, 0).putValue("ID");
        sheet.getCells().get(0, 1).putValue("First Name");       
        sheet.getCells().get(0, 2).putValue("Last Name");
        sheet.getCells().get(0, 3).putValue("Age");
        sheet.getCells().get(0, 4).putValue("Gender");
        sheet.getCells().get(0, 5).putValue("Class");
        sheet.getCells().get(0, 6).putValue("Mid Term");
        sheet.getCells().get(0, 7).putValue("Final");
        sheet.getCells().get(0, 8).putValue("Result");
        
        //set column width
        sheet.getCells().setColumnWidth(1, 20);
        sheet.getCells().setColumnWidth(2, 20);
        
        //initialize student list
        List<Student> students = getStudentsFromFile();
        
        // Check if List is empty
        if (students.isEmpty()) {
            throw new StudentListEmptyException();
        }
        else
        {
            sheet.getCells().importCustomObjects((Collection)students,
                new String[] {"Id","Fname","Lname","Gender","Age","InClass","MidTermGrade","FinalGrade","Result"}, // propertyNames
                false, // isPropertyNameShown
                1, // firstRow
                0, // firstColumn
                students.size(), // Number of objects to be exported
                true, // insertRows
                null, // dateFormatString
                false); // convertStringToNumber

            // Save the Excel file
            book.save("Output.xlsx");
        }     
    
    }
            

}
