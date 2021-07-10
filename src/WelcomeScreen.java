
import javax.swing.JOptionPane;



public class WelcomeScreen extends javax.swing.JFrame {

    int balance = 10000;
    public WelcomeScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnWithdraw = new javax.swing.JButton();
        BtnDeposit = new javax.swing.JButton();
        BtnChangePin = new javax.swing.JButton();
        BtnTransfer = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        BtnLogout1 = new javax.swing.JButton();
        BtnBalance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome To The Banking ATM");

        btnWithdraw.setText("Withdraw Funds");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        BtnDeposit.setText("Deposit Funds");
        BtnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepositActionPerformed(evt);
            }
        });

        BtnChangePin.setText("Change Pin");
        BtnChangePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChangePinActionPerformed(evt);
            }
        });

        BtnTransfer.setText("Transfer Funds");
        BtnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransferActionPerformed(evt);
            }
        });

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        BtnLogout1.setText("Log out");
        BtnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogout1ActionPerformed(evt);
            }
        });

        BtnBalance.setText("Balance");
        BtnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnChangePin, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(BtnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw)
                    .addComponent(BtnTransfer))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDeposit)
                    .addComponent(BtnChangePin))
                .addGap(34, 34, 34)
                .addComponent(BtnBalance)
                .addGap(18, 18, 18)
                .addComponent(BtnLogout1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        
        if(Integer.parseInt(txtAmount.getText())>0 && Integer.parseInt(txtAmount.getText())<=balance){
            
            
            JOptionPane.showMessageDialog(rootPane,"Funds Withdrawn");
            JOptionPane.showMessageDialog(rootPane, "Take your money and press 'Ok'");
            balance=balance-Integer.parseInt(txtAmount.getText());

            
        }
                
        else if(Integer.parseInt(txtAmount.getText())> balance){
            JOptionPane.showMessageDialog(rootPane, "insufficient funds");
        
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please enter an amount");
        
        }
        
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void BtnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepositActionPerformed
        if (Integer.parseInt(txtAmount.getText())>0 ) {
        balance=+Integer.parseInt(txtAmount.getText());
        JOptionPane.showMessageDialog(rootPane,"R"+txtAmount.getText()+" Funds Deposited");
        }
        else
        {JOptionPane.showMessageDialog(rootPane, "Please enter an amount");}
    }//GEN-LAST:event_BtnDepositActionPerformed

    private void BtnChangePinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChangePinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnChangePinActionPerformed

    private void BtnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransferActionPerformed
        if (Integer.parseInt(txtAmount.getText())>0) {
           JOptionPane.showInputDialog("Enter Account Number");
           JOptionPane.showMessageDialog(rootPane,"R"+txtAmount.getText()+" Funds Transfered");}
        else {JOptionPane.showMessageDialog(rootPane, "Please enter an amount");}
    }//GEN-LAST:event_BtnTransferActionPerformed

    private void BtnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogout1ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_BtnLogout1ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
       if (BtnBalance.isSelected()) {
            BtnBalance.setText(String.valueOf(balance));
        }
        else{
       }
    }//GEN-LAST:event_txtAmountActionPerformed

    private void BtnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalanceActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_BtnBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBalance;
    private javax.swing.JButton BtnChangePin;
    private javax.swing.JButton BtnDeposit;
    private javax.swing.JButton BtnLogout1;
    private javax.swing.JButton BtnTransfer;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
