
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainStudentPage extends javax.swing.JFrame {
    
    public MainStudentPage() {
        initComponents();
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelsearch = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        studentphone = new javax.swing.JTextField();
        searchstudent = new javax.swing.JTextField();
        studentname = new javax.swing.JTextField();
        studentaddress = new javax.swing.JTextField();
        studentADMNO = new javax.swing.JTextField();
        studentDOB = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButtonexit = new javax.swing.JButton();
        jButtonsearch = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/daystarlogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 220, 79));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("  STUDENT MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 320, 34));

        jLabel3.setText("PHONE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 40, 20));

        jLabelsearch.setText("SEARCH");
        jPanel1.add(jLabelsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 20));

        jLabel5.setText("NAME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 20));

        jLabel7.setText("GENDER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 20));

        jLabel8.setText("ADDRESS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        jLabel9.setText("ADM NO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 50, 20));

        jLabel10.setText("DOB");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 30, 20));

        jLabel11.setText("MAJOR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 40, 20));
        jPanel1.add(studentphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 150, -1));
        jPanel1.add(searchstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, -1));
        jPanel1.add(studentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, -1));
        jPanel1.add(studentaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, -1));
        jPanel1.add(studentADMNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, -1));
        jPanel1.add(studentDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Applied Computer Science", "Management Information Systems", "Communication", "Accounting", "Nursing", "Acturial Science" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 150, -1));

        jButtonexit.setText("Exit");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 60, -1));

        jButtonsearch.setText("Search");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jButtonadd.setText("Add");
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, -1));

        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
       
        String name=studentname.getText();
        String admno=studentADMNO.getText();
        String dateofbirth=studentDOB.getText();
        String gender = jComboBox1.getSelectedItem().toString();
        String major = jComboBox2.getSelectedItem().toString();
        String phone=studentphone.getText();
        String address=studentaddress.getText();
        
        Student_Type type=new Student_Type(0,name,admno,gender,dateofbirth,major,phone,address);
        
        if(!name.trim().equals(""))
        {
            if(type.execTypeQuery("add", type))
        {
            JOptionPane.showMessageDialog(null,"New Type Added","Add Type",1);
        }else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Add Type",2);
        }
        }
        else{   
        }    
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        try{            
            Integer search=Integer.valueOf(searchstudent.getText());
        String name=studentname.getText();
        String admno=studentADMNO.getText();
        String dateofbirth=studentDOB.getText();
        String gender = jComboBox1.getSelectedItem().toString();
        String major = jComboBox2.getSelectedItem().toString();
        String phone=studentphone.getText();
        String address=studentaddress.getText();
        
        Student_Type type=new Student_Type(search,name,admno,gender,dateofbirth,major,phone,address);
        
        if(!name.trim().equals(""))
        {
            if(type.execTypeQuery("edit", type))
        {
            JOptionPane.showMessageDialog(null,"Type Updated","Edit Type",1);
        }else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Edit Type",2);
        }
        }
        else{
            
        }    
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid searchID Type","Invalid searchID",0);
       }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        try{
        Integer search=Integer.valueOf(searchstudent.getText());
        
        Student_Type type=new Student_Type(search,"","","","","","","");
        
        if(!searchstudent.getText().trim().equals(""))
        {
            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Type","Delete Type", JOptionPane.YES_NO_OPTION);
            
            if(yes_or_no==JOptionPane.YES_OPTION)
                
            {
                 if(type.execTypeQuery("remove", type))
        {
            JOptionPane.showMessageDialog(null,"Type Deleted","Remove Type",1);
        }else{
             JOptionPane.showMessageDialog(null,"Operation Failed","Remove Type",2);
        }
        }
            }          
        else{
            
        }
         JOptionPane.showMessageDialog(null,"Enter the Type searchID","Empty searchID",2);
    }
        catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a valid searchID Type","Invalid searchID",0);
       }
        
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        searchstudent.setText("");
        studentname.setText("");
        studentADMNO.setText("");        
        studentDOB.setText("");        
        studentaddress.setText("");
        studentphone.setText("");                        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchActionPerformed
          
           try {
                ResultSet rs=The_Connection.getData("SELECT * FROM student WHERE jLabelsearch='"+searchstudent.getText()+"'");
               if(rs.next()){
                   studentname.setText(rs.getString("name"));
                   studentADMNO.setText(rs.getString("ADMNO"));
                   studentDOB.setText(rs.getString("DOB"));
                   jComboBox1.getSelectedItem().toString();
                   jComboBox2.getSelectedItem().toString();                  
                   studentaddress.setText(rs.getString("address"));
                   studentphone.setText(rs.getString("aphone"));                                     
               }
           } catch (SQLException ex) {
                ex.printStackTrace();
                   
               Logger.getLogger(MainStudentPage.class.getName()).log(Level.SEVERE, null, ex);
           }           
    }//GEN-LAST:event_jButtonsearchActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainStudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelsearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField searchstudent;
    private javax.swing.JTextField studentADMNO;
    private javax.swing.JTextField studentDOB;
    private javax.swing.JTextField studentaddress;
    private javax.swing.JTextField studentname;
    private javax.swing.JTextField studentphone;
    // End of variables declaration//GEN-END:variables
}
