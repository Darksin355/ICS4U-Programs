/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author who are you
 */
import java.text.*;
public class fastFood extends javax.swing.JFrame {

    /**
     * Creates new form fastFood
     */
    public fastFood() {
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

        fastFoodTitle = new javax.swing.JLabel();
        burgersLabel = new javax.swing.JLabel();
        friesLabel = new javax.swing.JLabel();
        beverageLabel = new javax.swing.JLabel();
        burgersInput = new javax.swing.JTextField();
        friesInput = new javax.swing.JTextField();
        beveragesInput = new javax.swing.JTextField();
        beforeTaxLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        beforeTaxOutput = new javax.swing.JLabel();
        taxOutput = new javax.swing.JLabel();
        totalOutput = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fastFoodTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        fastFoodTitle.setText("Fast Food Order");

        burgersLabel.setText("Enter the number of burgers: ");

        friesLabel.setText("Enter the number of fries: ");

        beverageLabel.setText("Enter the number of soft drinks: ");

        burgersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgersInputActionPerformed(evt);
            }
        });

        beforeTaxLabel.setText("Total before taxes: ");

        taxLabel.setText("Tax: ");

        totalLabel.setText("Final total: ");

        enterButton.setText("Calculate");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fastFoodTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(burgersLabel)
                            .addComponent(friesLabel)
                            .addComponent(beverageLabel)
                            .addComponent(beforeTaxLabel)
                            .addComponent(taxLabel)
                            .addComponent(totalLabel))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(burgersInput, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(friesInput)
                            .addComponent(beveragesInput)
                            .addComponent(beforeTaxOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(fastFoodTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgersLabel)
                    .addComponent(burgersInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(friesLabel)
                    .addComponent(friesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beverageLabel)
                    .addComponent(beveragesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beforeTaxLabel)
                    .addComponent(beforeTaxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxLabel)
                    .addComponent(taxOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burgersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgersInputActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        double burgers, fries, beverages, burgerPrice, burgerPriceTotal, friesPrice, friesPriceTotal, beveragePrice, beveragePriceTotal, hst, tax, total, fullTotal;
        burgers = Double.parseDouble(burgersInput.getText());
        fries = Double.parseDouble(friesInput.getText());
        beverages = Double.parseDouble(beveragesInput.getText());
        
        hst = 0.13;
        burgerPrice = 2.49;
        friesPrice = 1.89;
        beveragePrice = 0.99;
        burgerPriceTotal = burgerPrice * burgers;
        friesPriceTotal = friesPrice * fries;
        beveragePriceTotal = beveragePrice * beverages;
        total = beveragePriceTotal + friesPriceTotal + burgerPriceTotal;
        tax = total * hst;
        fullTotal = total + tax;
        
        DecimalFormat x = new DecimalFormat("###.##");
        taxOutput.setText("$" + x.format(tax));
        beforeTaxOutput.setText("$" + x.format(total));
        totalOutput.setText("$" + x.format(fullTotal));
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(fastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beforeTaxLabel;
    private javax.swing.JLabel beforeTaxOutput;
    private javax.swing.JLabel beverageLabel;
    private javax.swing.JTextField beveragesInput;
    private javax.swing.JTextField burgersInput;
    private javax.swing.JLabel burgersLabel;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel fastFoodTitle;
    private javax.swing.JTextField friesInput;
    private javax.swing.JLabel friesLabel;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel taxOutput;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalOutput;
    // End of variables declaration//GEN-END:variables
}