/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.studentManagement.view;

import com.studentManagement.exceptions.InvalidAgeException;
import com.studentManagement.exceptions.InvalidClassException;
import com.studentManagement.exceptions.InvalidGradeException;
import com.studentManagement.model.Student;
import com.studentManagement.service.StudentService;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andy
 */
public class ApplicationFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form something
     */
    public ApplicationFrame() {
        initComponents();
        loadStudentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblMidTerm = new javax.swing.JLabel();
        txtMidTerm = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        lblClass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        cbxGender = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");
        setResizable(false);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FName", "LName", "Age", "Gender", "Class"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setEditingColumn(0);
        studentTable.setEditingRow(0);
        studentTable.setFocusTraversalPolicyProvider(true);
        studentTable.setFocusable(false);
        studentTable.setOpaque(false);
        studentTable.setRequestFocusEnabled(false);
        studentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);
        studentTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblId.setText("ID");

        txtID.setEditable(false);

        lblFName.setText("First Name");

        lblLName.setText("Last Name");

        lblMidTerm.setText("Mid Term");

        txtResult.setEditable(false);

        lblClass.setText("Class");

        jLabel1.setText("Result");

        lblGender.setText("Gender");

        cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Non-binary" }));

        lblAge.setText("Age");

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        lblFinal.setText("Final");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFName)
                    .addComponent(lblId)
                    .addComponent(lblLName)
                    .addComponent(lblMidTerm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMidTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(lblFinal)
                                .addGap(18, 18, 18)
                                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(jLabel1)
                            .addComponent(lblClass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAge)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClass)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMidTerm)
                    .addComponent(txtMidTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMousePressed
        try {
            // TODO add your handling code here:
            List<Student> students= StudentService.getStudentService().getStudentsFromFile();
            Student student = students.get(studentTable.getSelectedRow());
            txtLName.setText(student.getLname());
            txtFName.setText(student.getFname());
            txtAge.setText(String.valueOf(student.getAge()));
            txtClass.setText(student.getInClass());
            txtID.setText(String.valueOf(student.getId()));
            txtMidTerm.setText(String.valueOf(student.getMidTermGrade()));
            txtFinal.setText(String.valueOf(student.getFinalGrade()));
            txtResult.setText(student.getResult());
            cbxGender.setSelectedItem(student.getGender());
            
        } catch (ClassNotFoundException | IOException ex) {
            JOptionPane.showMessageDialog(null,"something is wrong");
        }
        
        
    }//GEN-LAST:event_studentTableMousePressed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        if (studentTable.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(null, "please choose a student to edit");
        }
        else
        {
            try {
                //validate
                validateAge(txtAge.getText());
                validateClass(txtClass.getText());
                validateGrade(txtMidTerm.getText());
                validateGrade(txtFinal.getText());                           
                //replace 
                List<Student> students= StudentService.getStudentService().getStudentsFromFile();
                Student oldStudent = students.get(studentTable.getSelectedRow());  
                Student newStudent = new Student();  
                newStudent.setFname(txtFName.getText());
                newStudent.setLname(txtLName.getText());
                newStudent.setAge(Integer.parseInt(txtAge.getText()));
                newStudent.setGender(cbxGender.getSelectedItem().toString());
                newStudent.setInClass(txtClass.getText());
                newStudent.setMidTermGrade(Double.parseDouble(txtMidTerm.getText()));
                newStudent.setFinalGrade(Double.parseDouble(txtFinal.getText()));
                students.set(students.lastIndexOf(oldStudent), newStudent);
                StudentService.getStudentService().writeStudentsToFile(students);
                loadStudentTable();
            } catch (ClassNotFoundException | IOException ex) {
                JOptionPane.showMessageDialog(null,"something is wrong");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null,"please check inputs of age or grades");
            } catch (InvalidAgeException | InvalidClassException | InvalidGradeException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            } 
        }  
    }//GEN-LAST:event_btnEditMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        
        //avoid deletion when input information
        if (!txtID.getText().equals("")) 
        {
            studentTable.getSelectionModel().clearSelection();
            txtLName.setText("");
            txtFName.setText("");
            txtAge.setText("");
            txtClass.setText("");
            txtID.setText("");
            txtMidTerm.setText("");
            txtFinal.setText("");
            txtResult.setText("");
            cbxGender.setSelectedItem(null);
        }       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        if (!txtID.getText().equals("")) 
        {
            studentTable.getSelectionModel().clearSelection();
            txtLName.setText("");
            txtFName.setText("");
            txtAge.setText("");
            txtClass.setText("");
            txtID.setText("");
            txtMidTerm.setText("");
            txtFinal.setText("");
            txtResult.setText("");
            cbxGender.setSelectedItem(null);
            JOptionPane.showMessageDialog(null,"can't create new student from existing ones, try again");
        }    
        else{
            try {
                validateAge(txtAge.getText());
                validateClass(txtClass.getText());
                validateGrade(txtMidTerm.getText());
                validateGrade(txtFinal.getText());
                List<Student> students= StudentService.getStudentService().getStudentsFromFile();
                Student student = new Student();  
                student.setFname(txtFName.getText());
                student.setLname(txtLName.getText());
                student.setAge(Integer.parseInt(txtAge.getText()));
                student.setGender(cbxGender.getSelectedItem().toString());
                student.setInClass(txtClass.getText());
                student.setMidTermGrade(Double.parseDouble(txtMidTerm.getText()));
                student.setFinalGrade(Double.parseDouble(txtFinal.getText()));
                students.add(student);
                StudentService.getStudentService().writeStudentsToFile(students);
                loadStudentTable();
            } catch (ClassNotFoundException | IOException ex) {
                JOptionPane.showMessageDialog(null,"something is wrong");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null,"please check inputs of age or grades");
            } catch (InvalidAgeException | InvalidClassException | InvalidGradeException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (studentTable.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(null, "please choose a student to delete");
        }
        else
        {
            int confirm=JOptionPane.showConfirmDialog(null, "Do you want to delete this item");
            if (confirm==JOptionPane.YES_OPTION) {
                try 
            {
                List<Student> students= StudentService.getStudentService().getStudentsFromFile();
                Student student = students.get(studentTable.getSelectedRow());
                students.remove(student);

                //write to file
                StudentService.getStudentService().writeStudentsToFile(students);
            } catch (ClassNotFoundException | IOException ex) {
                JOptionPane.showMessageDialog(null,"something is wrong");
            }
            loadStudentTable(); 
            }    
        }  
    }//GEN-LAST:event_btnDeleteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationFrame().setVisible(true);
            }
        });
    }
    public void NextID() throws ClassNotFoundException, IOException
    {
        List<Student> students= StudentService.getStudentService().getStudentsFromFile();
        int biggestID=0;
        for (Student student : students) {
            if (biggestID<student.getId()) {
                biggestID=student.getId();
            }
        }
        //get the last student id and +1
        Student.setNextID(biggestID);
    }
    public final void loadStudentTable() {
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(){
            //forbid edit cells
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        studentTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("First Name");
        defaultTableModel.addColumn("Last Name");
        defaultTableModel.addColumn("Age");
        defaultTableModel.addColumn("Gender");
        defaultTableModel.addColumn("Class");
        //get student from file
        try {
            List<Student> students= StudentService.getStudentService().getStudentsFromFile();
            for (Student student : students) 
            {
                defaultTableModel.addRow(new Object[]{student.getId(),student.getFname(),student.getLname(),
                                                        student.getAge(),student.getGender(),student.getInClass()});
            }
            NextID();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"something is wrong with class");;
        }
         catch (IOException e) {
             JOptionPane.showMessageDialog(null,"something is wrong with IO");
         }
    }
    
    /*ITS VALIDATING TIME*/
    public void validateAge(String Age) throws ParseException, InvalidAgeException
    {
        int age = Integer.parseInt(Age);
        if (0>=age) {
            throw new InvalidAgeException();
        }
    }
    public void validateGrade(String grade) throws ParseException, InvalidGradeException
    {
        double valGrade = Double.parseDouble(grade);
        if (0>=valGrade) {
            throw new InvalidGradeException();
        }
    }
    public void validateClass(String inClass) throws InvalidClassException
    {
        if (inClass.lastIndexOf("GCD")!=0 | inClass.length()!=7) 
        {
            throw new InvalidClassException();
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMidTerm;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMidTerm;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
