
import java.sql.Connection;
import java.sql.DriverManager;
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
public class searchemp extends javax.swing.JFrame {

    /**
     * Creates new form searchemp
     */
    public searchemp() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(220, 90, 200, 31);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Employee ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 30, 134, 23);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("or");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(680, 90, 19, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 60, 84, 23);
        jPanel1.add(t2);
        t2.setBounds(1010, 90, 196, 32);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emplyee ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1010, 60, 85, 23);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 140, 98, 42);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1010, 140, 104, 42);

        T1.setAutoCreateRowSorter(true);
        T1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "FName", "LName", "Dob", "Gender", "Aadhar", "Phno", "Qh", "Qs", "Qg", "Qpg", "exp", "email", "Dept", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(T1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 242, 1260, 236);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setText("HOMEPAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(710, 520, 124, 37);

        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1151, 530, 100, 39);

        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(490, 520, 110, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shivani Rajput\\Downloads\\WhatsApp Image 2021-01-17 at 12.24.46 PM.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1290, 593);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              try
{
     DefaultTableModel dm=(DefaultTableModel)T1.getModel();
     T1.setModel(dm);
     int eid;
     String a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;

    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    //Statement s1=(Statement)c.createStatement();

String A=("Select * from emp where eid="+ t2.getText()+";");
//String B=("Select * from salary where  eid="+t1.getText()+";");
ResultSet RS=s.executeQuery(A);
//ResultSet RS1=s1.executeQuery(B);
T1.setRowHeight(T1.getRowHeight() + 20);
while (RS.next())
{   
    eid = RS.getInt("eid");
    a2=RS.getString("fname");
    a3=RS.getString("lname");
    a4=RS.getString("dob");
    a5=RS.getString("gen");
    a6=RS.getString("aadhar");
    a7=RS.getString("phno");
    a8=RS.getString("Qh");
    a9=RS.getString("Qs");
    a10=RS.getString("Qg");
    a11=RS.getString("Qpg");
    a12=RS.getString("exp");
    a13=RS.getString("email");
    a14=RS.getString("dept");
    a15=RS.getString("addr");  
    
    dm.addRow(new Object[]{eid,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15});
 }
T1.setModel(dm);
T1.setRowHeight(50);
TableColumnModel columnModel = T1.getColumnModel();
columnModel.getColumn(0).setPreferredWidth(300);
columnModel.getColumn(1).setPreferredWidth(300);
columnModel.getColumn(2).setPreferredWidth(300);
columnModel.getColumn(3).setPreferredWidth(300);
columnModel.getColumn(4).setPreferredWidth(300);
columnModel.getColumn(5).setPreferredWidth(300);
columnModel.getColumn(6).setPreferredWidth(300);
columnModel.getColumn(7).setPreferredWidth(700);
columnModel.getColumn(8).setPreferredWidth(700);
columnModel.getColumn(9).setPreferredWidth(700);
columnModel.getColumn(10).setPreferredWidth(700);
columnModel.getColumn(11).setPreferredWidth(700);
columnModel.getColumn(12).setPreferredWidth(700);
columnModel.getColumn(13).setPreferredWidth(700);
columnModel.getColumn(14).setPreferredWidth(700);
T1.setAutoResizeMode(T1.AUTO_RESIZE_OFF);
JOptionPane.showMessageDialog(null,"detail found");

   }
       catch(Exception e)
       {
           
           JOptionPane.showMessageDialog(this,e);
       }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         new personal1 ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new homepage ().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try
        {
            DefaultTableModel dm=(DefaultTableModel)T1.getModel();
            T1.setModel(dm);
            int eid;
            String a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;

            //code for connectivity
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
            Statement s=(Statement)c.createStatement();
            //Statement s1=(Statement)c.createStatement();

            String A="Select * from emp where fname like'%"+ t1.getText()+"%'" + ";";
            //String B=("Select * from salary where  eid="+t1.getText()+";");
            ResultSet RS=s.executeQuery(A);
            //ResultSet RS1=s1.executeQuery(B);
            T1.setRowHeight(T1.getRowHeight() + 20);
            while (RS.next())
            {
                eid = RS.getInt("eid");
                a2=RS.getString("fname");
                a3=RS.getString("lname");
                a4=RS.getString("dob");
                a5=RS.getString("gen");
                a6=RS.getString("aadhar");
                a7=RS.getString("phno");
                a8=RS.getString("Qh");
                a9=RS.getString("Qs");
                a10=RS.getString("Qg");
                a11=RS.getString("Qpg");
                a12=RS.getString("exp");
                a13=RS.getString("email");
                a14=RS.getString("dept");
                a15=RS.getString("addr");

                dm.addRow(new Object[]{eid,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15});
            }
            T1.setModel(dm);
            T1.setRowHeight(50);
            TableColumnModel columnModel = T1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(300);
            columnModel.getColumn(1).setPreferredWidth(300);
            columnModel.getColumn(2).setPreferredWidth(300);
            columnModel.getColumn(3).setPreferredWidth(300);
            columnModel.getColumn(4).setPreferredWidth(300);
            columnModel.getColumn(5).setPreferredWidth(300);
            columnModel.getColumn(6).setPreferredWidth(300);
            columnModel.getColumn(7).setPreferredWidth(700);
            columnModel.getColumn(8).setPreferredWidth(700);
            columnModel.getColumn(9).setPreferredWidth(700);
            columnModel.getColumn(10).setPreferredWidth(700);
            columnModel.getColumn(11).setPreferredWidth(700);
            columnModel.getColumn(12).setPreferredWidth(700);
            columnModel.getColumn(13).setPreferredWidth(700);
            columnModel.getColumn(14).setPreferredWidth(700);
            T1.setAutoResizeMode(T1.AUTO_RESIZE_OFF);
            JOptionPane.showMessageDialog(null,"detail found");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           DefaultTableModel dm=(DefaultTableModel)T1.getModel();
           while (dm.getRowCount() > 0){
        for (int i = 0; i < dm.getRowCount(); ++i){
            dm.removeRow(i);
        }}
           t2.setText("");
           t1.setText("");
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
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchemp().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
