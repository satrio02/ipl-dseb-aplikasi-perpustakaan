/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author Fikri
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namadepan = new javax.swing.JTextField();
        namabelakang = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PWlab = new javax.swing.JLabel();
        NDlab = new javax.swing.JLabel();
        NBlab = new javax.swing.JLabel();
        NTlab = new javax.swing.JLabel();
        Elab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(314, 314, 314))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Depan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 146, 100, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Belakang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("No. Telpon");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 80, 20));

        namadepan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namadepan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namadepanKeyReleased(evt);
            }
        });
        getContentPane().add(namadepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 330, 30));

        namabelakang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namabelakang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namabelakangKeyReleased(evt);
            }
        });
        getContentPane().add(namabelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 330, 30));

        notelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        notelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notelpKeyReleased(evt);
            }
        });
        getContentPane().add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 330, 30));

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 330, 30));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 302, 330, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 352, -1, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Login");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 30));

        PWlab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PWlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(PWlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 110, 30));

        NDlab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NDlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(NDlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 110, 30));

        NBlab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NBlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(NBlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 110, 30));

        NTlab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NTlab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(NTlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 110, 30));

        Elab.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Elab.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Elab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 110, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String NamaDepan=namadepan.getText().toString();
        String NamaBelakang=namabelakang.getText().toString();
        String NoTelp=notelp.getText().toString();
        String Email=email.getText().toString();
        String Password=password.getText().toString();
        if(NamaDepan.equals("")){
            JOptionPane.showMessageDialog(null, "Nama Depan Wajib Diisi");
        }
        if(NamaBelakang.equals("")){
            JOptionPane.showMessageDialog(null, "Nama Belakang Wajib Diisi");
        }
        if(NoTelp.equals("")){
            JOptionPane.showMessageDialog(null, "Nomor Telpon Wajib Diisi");
        }
        if(Email.equals("")){
            JOptionPane.showMessageDialog(null, "Email Wajib Diisi");
        }
        if(Password.equals("")){
            JOptionPane.showMessageDialog(null, "Password Wajib Diisi");
        }
        else{
            JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        namadepan.setText(null);
        namabelakang.setText(null);
        notelp.setText(null);
        email.setText(null);
        password.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        login loginPage = new login();
        loginPage.show();
        
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void namadepanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namadepanKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(namadepan.getText());
        
        if(!match.matches()){
            NDlab.setText("Format Nama Salah!");
        }
        else{
            NDlab.setText(null);
        }
    }//GEN-LAST:event_namadepanKeyReleased

    private void namabelakangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namabelakangKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(namabelakang.getText());
        
        if(!match.matches()){
            NBlab.setText("Format Nama Salah!");
        }
        else{
            NBlab.setText(null);
        }
    }//GEN-LAST:event_namabelakangKeyReleased

    private void notelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notelpKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,12}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(notelp.getText());
        
        if(!match.matches()){
            NTlab.setText("Hanya Diisi Angka!");
        }
        else{
            NTlab.setText(null);
        }
    }//GEN-LAST:event_notelpKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
        //contoh format email@gmail.com
        String PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(email.getText());
        
        if(!match.matches()){
            Elab.setText("Format Email Salah!");
        }
        else{
            Elab.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z0-9+-.]{0,12}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(password.getText());
        
        if(!match.matches()){
            PWlab.setText("Format Salah!");
        }
        else{
            PWlab.setText(null);
        }
    }//GEN-LAST:event_passwordKeyReleased

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elab;
    private javax.swing.JLabel NBlab;
    private javax.swing.JLabel NDlab;
    private javax.swing.JLabel NTlab;
    private javax.swing.JLabel PWlab;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namabelakang;
    private javax.swing.JTextField namadepan;
    private javax.swing.JTextField notelp;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
