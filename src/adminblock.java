/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * adminblock.java
 *
 * Created on Oct 27, 2014, 1:18:17 PM
 */

/**
 *
 * @author 2
 */
public class adminblock extends javax.swing.JFrame {

    /** Creates new form adminblock */
    public adminblock() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRATION BLOCK");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        b1.setText("LEAVE ENTRY");
        b1.setToolTipText("CLICK HERE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, 40));

        b2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        b2.setText("LEAVE HISTORY");
        b2.setToolTipText("CLICK HERE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 160, 40));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LEAVE MANAGEMENT ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        b4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        b4.setText("Back");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shivani Rajput\\Downloads\\WhatsApp Image 2021-01-17 at 12.24.46 PM.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
 new leavehistory().setVisible(true);
                        this.dispose();

    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        new Leaveentry().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
new homepage().setVisible(true);
                        this.dispose();        
    }//GEN-LAST:event_b4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminblock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
