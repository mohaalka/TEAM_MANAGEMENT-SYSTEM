package team_management;

import java.awt.Color;
import java.sql.Date;
import javax.swing.JOptionPane;
import static team_management.dashboard.paymentsTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALka Media
 */
public class payment extends javax.swing.JFrame {
     Codes co=new Codes();
    public void display(){
}    String idpy="";
     String acc ="";
     String mnw ="";
     String nuure="";
     String pepperson="";
     String oper="";
     

    /**
     * Creates new form payment
     */
    public payment() {
        initComponents();
       
        co.fillCombo("SELECT pepname as  'magacaqofka' FROM people",peoplepaymentsNo,"magacaqofka");
        co.fillCombo("SELECT accName as  'account_Name' FROM accounts",paymrntsaccNo,"account_Name");
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

        jPanel2 = new javax.swing.JPanel();
        btnclose = new necesario.LabelIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAmountPayments = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jDatepayments = new com.toedter.calendar.JDateChooser();
        peoplepaymentsNo = new javax.swing.JComboBox<>();
        paymrntsaccNo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnsave = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtserpay = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setBackground(new java.awt.Color(0, 102, 102));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
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
        jPanel2.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/READY10.png"))); // NOI18N
        jLabel1.setText("   PAYMENTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 300, 90));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("peopleNo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Amount");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        txtAmountPayments.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAmountPayments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAmountPayments.setPhColor(new java.awt.Color(0, 102, 102));
        txtAmountPayments.setPlaceholder("Enter Amount");
        txtAmountPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountPaymentsActionPerformed(evt);
            }
        });
        jPanel2.add(txtAmountPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 270, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("PyDate");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 30));

        jDatepayments.setForeground(new java.awt.Color(0, 102, 102));
        jDatepayments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jDatepayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 270, 40));

        peoplepaymentsNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        peoplepaymentsNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select person" }));
        peoplepaymentsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peoplepaymentsNoActionPerformed(evt);
            }
        });
        jPanel2.add(peoplepaymentsNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 40));

        paymrntsaccNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paymrntsaccNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account" }));
        paymrntsaccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymrntsaccNoActionPerformed(evt);
            }
        });
        jPanel2.add(paymrntsaccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("AccNo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (21).png"))); // NOI18N
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        jPanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (22).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (25).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 100, 40));

        txtserpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtserpay.setPhColor(new java.awt.Color(0, 102, 102));
        txtserpay.setPlaceholder("Type here To Search");
        txtserpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserpayActionPerformed(evt);
            }
        });
        jPanel2.add(txtserpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 210, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/button (26).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 100, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/people1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 460, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
         // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btncloseMouseClicked

    private void txtAmountPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountPaymentsActionPerformed

    private void btncloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        btnclose.setBackground(clr);
    }//GEN-LAST:event_btncloseMouseEntered

    private void btncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,102,102);
        btnclose.setBackground(clr);
    }//GEN-LAST:event_btncloseMouseExited

    private void peoplepaymentsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peoplepaymentsNoActionPerformed
          // TODO add your handling code here:
        try{ 
          co.search("SELECT * FROM people WHERE pepname='"+peoplepaymentsNo.getSelectedItem()+"'");
         if(co.rs.next()){
             pepperson=co.rs.getString("people_no");
             paymrntsaccNo.setSelectedItem(nuure);
         }
          }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
        
        
    }//GEN-LAST:event_peoplepaymentsNoActionPerformed

    private void paymrntsaccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymrntsaccNoActionPerformed
        // TODO add your handling code here:
        try{ 
          co.search("SELECT * FROM accounts WHERE accName='"+paymrntsaccNo.getSelectedItem()+"'");
         if(co.rs.next()){
             acc=co.rs.getString("acc_no");
             peoplepaymentsNo.setSelectedItem(mnw);
         }
          }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
    }//GEN-LAST:event_paymrntsaccNoActionPerformed
    }
    private void txtserpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserpayActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         // TODO add your handling code here:
         String sql="SELECT py.py_no, ppp.pepname as shaqsi,acc.accName as magac, py.amount as lacag,"
                 + " py.p_date as waqti FROM payments py, accounts acc, people ppp WHERE "
                 + "py.people_no=ppp.people_no and py.acc_no=acc.acc_no and py.py_no='"+txtserpay.getText()+"'";

        co.search(sql);
        try{
            if(co.rs.next()){
                idpy=co.rs.getString("py_no");
                txtAmountPayments.setText(co.rs.getString("lacag"));
                jDatepayments.setDate(co.rs.getDate("waqti"));
                mnw=co.rs.getString("shaqsi");
                //peoplePayments_no.setSelectedItem(co.rs.getString("magac"));
                paymrntsaccNo.setSelectedItem(co.rs.getString("magac"));
                btnsave.setEnabled(false);
                txtserpay.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserpay.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

         
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
         // TODO add your handling code here:
          String oper="insert";
        Date dl=new Date(jDatepayments.getDate().getTime());
        String sql="call Payments_proc(null,'"+pepperson+"','"+acc+"','"+txtAmountPayments.getText()+"','"+dl+"','"+oper+"')";
//      co.setSQL(sql);
         display();
         co.setSQL(sql);
         paymrntsaccNo.setSelectedIndex(0);
         peoplepaymentsNo.setSelectedIndex(0);
         txtAmountPayments.setText("");
         co.viewTable("select * from payments_view",paymentsTable);
        
    }//GEN-LAST:event_btnsaveMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         // TODO add your handling code here:
         String oper="update";
        Date dl=new Date(jDatepayments.getDate().getTime());
        String sql="call Payments_proc('"+idpy+"','"+pepperson+"','"+acc+"','"+txtAmountPayments.getText()+"','"+dl+"','"+oper+"')";
//      co.setSQL(sql);
         display();
         co.setSQL(sql);
         paymrntsaccNo.setSelectedIndex(0);
         peoplepaymentsNo.setSelectedIndex(0);
         txtAmountPayments.setText("");
         co.viewTable("select * from payments_view",paymentsTable);
         
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         // TODO add your handling code here:
         String oper="delete";
        Date dl=new Date(jDatepayments.getDate().getTime());
        String sql="call Payments_proc('"+idpy+"','"+pepperson+"','"+acc+"','"+txtAmountPayments.getText()+"','"+dl+"','"+oper+"')";
//      co.setSQL(sql);
         display();
         co.setSQL(sql);
         paymrntsaccNo.setSelectedIndex(0);
         peoplepaymentsNo.setSelectedIndex(0);
         txtAmountPayments.setText("");
         co.viewTable("select * from payments_view",paymentsTable);
         
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.LabelIcon btnclose;
    private javax.swing.JLabel btnsave;
    private com.toedter.calendar.JDateChooser jDatepayments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> paymrntsaccNo;
    private javax.swing.JComboBox<String> peoplepaymentsNo;
    private app.bolivia.swing.JCTextField txtAmountPayments;
    private app.bolivia.swing.JCTextField txtserpay;
    // End of variables declaration//GEN-END:variables
}