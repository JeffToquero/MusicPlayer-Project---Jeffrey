/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Toquero
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    
    
    public LoginPage() {
        initComponents();
        jPanel2.setBackground(new Color(0,0,0,170));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        accName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        accPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/dots.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MUSIC FOR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 10, 380, 110);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/dots.png"))); // NOI18N
        jLabel10.setEnabled(false);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-330, 330, 580, 670);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/dots.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-380, -250, 550, 500);

        jLabel12.setBackground(new java.awt.Color(255, 153, 0));
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/dots.png"))); // NOI18N
        jLabel12.setEnabled(false);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(690, -240, 420, 390);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/dots.png"))); // NOI18N
        jLabel13.setEnabled(false);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(720, 270, 330, 600);

        jLabel7.setBackground(new java.awt.Color(128, 2, 102));
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 75)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("EVERYONE");
        jLabel7.setBorder(null);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 110, 390, 70);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 102, 102), new java.awt.Color(153, 0, 0), new java.awt.Color(255, 255, 51)));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accName.setBackground(new java.awt.Color(255, 255, 255));
        accName.setForeground(new java.awt.Color(255, 153, 0));
        accName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accName.setText("Enter Username");
        accName.setToolTipText("");
        accName.setBorder(null);
        accName.setOpaque(true);
        accName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accNameFocusLost(evt);
            }
        });
        accName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNameActionPerformed(evt);
            }
        });
        jPanel2.add(accName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 260, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/musix.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 80, 120));

        jLabel3.setFont(new java.awt.Font("NewsGoth BT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("NewsGoth BT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 77, 7));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MUSIX");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("WELCOME TO");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 20));

        accPass.setBackground(new java.awt.Color(255, 255, 255));
        accPass.setForeground(new java.awt.Color(255, 102, 0));
        accPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accPassFocusGained(evt);
            }
        });
        accPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accPassActionPerformed(evt);
            }
        });
        accPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accPassKeyPressed(evt);
            }
        });
        jPanel2.add(accPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 260, 50));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(260, 190, 440, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicproject/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNameActionPerformed

    }//GEN-LAST:event_accNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
DashBoard obj = new DashBoard();
obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          DashBoard login = new DashBoard();
      login.setVisible(true);
       }
       else{
           JOptionPane.showMessageDialog(null,"Please check if what you entered is correct");
       }
    }//GEN-LAST:event_jButton1KeyPressed
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       String user = accName.getText();
       String pass = accPass.getText();
       
       if(user.isEmpty()||user.equals("Jeffrey") ||pass.isEmpty()|| pass.equals("1234")){
           DashBoard dash = new DashBoard();
           dash.setVisible(true);
           DashBoard.accname.setText(accName.getText());
           this.dispose();
       }
       else{
           JOptionPane.showMessageDialog(null,"Please check if what you entered is correct");
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void accNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accNameFocusGained
 
        if(accName.getText().equals("Enter Username")){
           accName.setText(" ");
     
}     
    }//GEN-LAST:event_accNameFocusGained

    private void accNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accNameFocusLost
 if(accName.getText().equals("Enter Username")){
           accName.setText(" ");
}     
        
    }//GEN-LAST:event_accNameFocusLost

    private void accPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accPassFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_accPassFocusGained

    private void accPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accPassKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          DashBoard login = new DashBoard();
      login.setVisible(true);  
       DashBoard.accname.setText(accName.getText());
    
      this.dispose();
       }
      
    }//GEN-LAST:event_accPassKeyPressed

    private void accPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accPassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField accName;
    private javax.swing.JPasswordField accPass;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
