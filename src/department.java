
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivani Rajput
 */
public class department extends javax.swing.JFrame {

    /**
     * Creates new form department
     */
    public department() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(289, 42, 175, 32);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(289, 92, 175, 32);
        jPanel1.add(t3);
        t3.setBounds(289, 142, 175, 34);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("ADD DEPARTMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(718, 70, 197, 36);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("UPDATE ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(718, 119, 197, 34);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dnumber");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(71, 47, 71, 23);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Department Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(71, 97, 140, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department Imformation");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(432, 12, 191, 23);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department Manager ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(71, 148, 183, 23);

        T1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNumber", "Department name", "Manager ID", "Manager Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(T1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(71, 280, 836, 276);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("SHOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(244, 216, 187, 31);

        jButton4.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(882, 587, 110, 37);

        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(599, 216, 182, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shivani Rajput\\Downloads\\WhatsApp Image 2021-01-17 at 12.24.46 PM.jpeg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1, 0, 1020, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 String dept,deptname;
         int dmanager;
int d,m,y;
dept =t1.getText();
deptname =t2.getText();
if(t3.getText() == ""){
    dmanager=0;
}
dmanager = Integer.parseInt(t3.getText());
{
    try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();


String query = " insert into department (dept, deptname, dnamager)"
        + " values (?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1, dept);
      preparedStmt.setString (2, deptname);
      preparedStmt.setInt (3, dmanager);
      
      // execute the preparedstatement
      preparedStmt.execute();
   JOptionPane.showMessageDialog(null,"entry added");
   //s.executeUpdate(A);
    
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
    e.printStackTrace();
  }

}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         new personal1 ().setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     String dept,deptname ,dmanager;

dept =t1.getText();
deptname =t2.getText();
dmanager = t3.getText();
{
    try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();


   String B=("delete from department where dept= "+t1.getText()+";");
   String query = " insert into department (dept, deptname, dnamager)"
        + " values (?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1, dept);
      preparedStmt.setString (2, deptname);
      preparedStmt.setString (3, dmanager);

      // execute the preparedstatement
      s.executeUpdate(B);
      preparedStmt.execute();  
   JOptionPane.showMessageDialog(null,"changes saved.");
   
   //s.executeUpdate(A);
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
  this.dispose();
  new employee().setVisible(true);
  //t13.setText(" ");
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                      try
{
     DefaultTableModel dm=(DefaultTableModel)T1.getModel();
     T1.setModel(dm);
     int a3;
     String a1,a2,a4=" ";

    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    //Statement s1=(Statement)c.createStatement();

String A=("Select d.dept,deptname,dnamager,fname,lname from department AS d , emp AS e where d.dept = e.dept && dnamager = eid");
/*ResultSet RS=s.executeQuery(A);
//ResultSet RS1=s1.executeQuery(B);
T1.setRowHeight(T1.getRowHeight() + 20);
while (RS.next())
{   
    a1 = RS.getString("dept");
    a2=RS.getString("deptname");
    a3=RS.getInt("dnamager");
       String B=("Select * from emp where eid="+a3+";");
       ResultSet RS1 =s.executeQuery(B);
       while(RS1.next()){
           a4=RS1.getString("fname") +" " + RS1.getString("lname");         
           dm.addRow(new Object[]{a1,a2,a3,a4});
       }     
 }*/
ResultSet RS = s.executeQuery(A);
T1.setRowHeight(T1.getRowHeight() + 20);
while (RS.next())
{   
    a1 = RS.getString("dept");
    a2=RS.getString("deptname");
    a3=RS.getInt("dnamager");
    a4=RS.getString("fname") +" " + RS.getString("lname");
    dm.addRow(new Object[]{a1,a2,a3,a4});
}

T1.setModel(dm);
T1.setRowHeight(50);
TableColumnModel columnModel = T1.getColumnModel();
columnModel.getColumn(0).setPreferredWidth(200);
columnModel.getColumn(1).setPreferredWidth(200);
columnModel.getColumn(2).setPreferredWidth(200);
columnModel.getColumn(3).setPreferredWidth(300);

T1.setAutoResizeMode(T1.AUTO_RESIZE_OFF);
JOptionPane.showMessageDialog(null,"detail found");

   }
       catch(Exception e)
       {
           
           JOptionPane.showMessageDialog(this,e);
       }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm=(DefaultTableModel)T1.getModel();
           while (dm.getRowCount() > 0){
        for (int i = 0; i < dm.getRowCount(); ++i){
            dm.removeRow(i);
        }
    }
           t1.setText("");
           t2.setText("");
           t3.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
