/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_management;

import java.awt.Color;
import javax.swing.JOptionPane;
import static team_management.dashboard.CompotitionTable;

/**
 *
 * @author ALka Media
 */
public class competitions extends javax.swing.JFrame {
    Codes co=new Codes();
    public void display(){
}    String idcom="";
     String oper="";
     //String pubid ="";
     

    /**
     * Creates new form competitions
     */
    public competitions() {
        initComponents();
        display();
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
        btnclose = new necesario.LabelIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcompetionsDescription = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcompetitionName = new app.bolivia.swing.JCTextField();
        btnsave = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsercompetition = new RSMaterialComponent.RSTextFieldTwo();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setBackground(new java.awt.Color(0, 51, 51));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FORWARD);
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncloseMouseExited(evt);
            }
        });
        jPanel1.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 30));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Competitions");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Description");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 30));

        txtcompetionsDescription.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcompetionsDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcompetionsDescription.setPhColor(new java.awt.Color(0, 102, 102));
        txtcompetionsDescription.setPlaceholder("Enter Desc");
        txtcompetionsDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompetionsDescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(txtcompetionsDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ComName");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 40));

        txtcompetitionName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcompetitionName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcompetitionName.setPhColor(new java.awt.Color(0, 102, 102));
        txtcompetitionName.setPlaceholder("Enter Name");
        txtcompetitionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompetitionNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtcompetitionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 230, 40));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (21).png"))); // NOI18N
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (22).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (25).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (26).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 100, 40));

        txtsercompetition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsercompetition.setPlaceholder("Type Here To Search");
        jPanel1.add(txtsercompetition, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/jobimage2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcompetionsDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompetionsDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompetionsDescriptionActionPerformed

    private void txtcompetitionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompetitionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompetitionNameActionPerformed

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        // TODO add your handling code here:
      
        this.hide();
        //d.show();
    }//GEN-LAST:event_btncloseMouseClicked

    private void btncloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        btnclose.setBackground(clr);
    }//GEN-LAST:event_btncloseMouseEntered

    private void btncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,51,51);
        btnclose.setBackground(clr);
    }//GEN-LAST:event_btncloseMouseExited

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        // TODO add your handling code here:
        
        String oper="insert";
        
        String sql="call Competition_proc(null,'"+txtcompetitionName.getText()+"', '"+txtcompetionsDescription.getText()+"','"+oper+"')";
      if(txtcompetitionName.getText().isEmpty() || txtcompetionsDescription.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Please fill the Spaceses");
         
      }
        co.setSQL(sql);
      display();
      txtcompetitionName.setText("");  txtcompetionsDescription.setText("");
      
      co.viewTable("select * from competitions",CompotitionTable);
    }//GEN-LAST:event_btnsaveMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         String oper="update";        
        String sql="call Competition_proc('"+idcom+"','"+txtcompetitionName.getText()+"', '"+txtcompetionsDescription.getText()+"','"+oper+"')";
      co.setSQL(sql);
      display();
      txtcompetitionName.setText("");  txtcompetionsDescription.setText("");
      co.viewTable("select * from competitions",CompotitionTable);
      btnsave.setEnabled(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
         String oper="delete";
        String sql="call Competition_proc('"+idcom+"','"+txtcompetitionName.getText()+"', '"+txtcompetionsDescription.getText()+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        txtcompetitionName.setText("");  txtcompetionsDescription.setText("");
        co.viewTable("select * from competitions",CompotitionTable);
        btnsave.setEnabled(true);
        }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         String sql="select * from competitions where com_name='"+txtsercompetition.getText()+"' or com_no='"+txtsercompetition.getText()+"'";
     co.search(sql);
     try{
         if(co.rs.next()){
             idcom=co.rs.getString("com_no");
             txtcompetitionName.setText(co.rs.getString("com_name"));
             txtcompetionsDescription.setText(co.rs.getString("description"));
             btnsave.setEnabled(false);
             txtsercompetition.setText("");
         }
         else
             JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtsercompetition.setText("");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
     }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(competitions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(competitions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(competitions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(competitions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new competitions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.LabelIcon btnclose;
    private javax.swing.JLabel btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private app.bolivia.swing.JCTextField txtcompetionsDescription;
    private app.bolivia.swing.JCTextField txtcompetitionName;
    private RSMaterialComponent.RSTextFieldTwo txtsercompetition;
    // End of variables declaration//GEN-END:variables
}
