/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gui;

import com.dao.AccountDTO;
import static java.awt.Color.black;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author huynh
 */
public class HomeGUI extends javax.swing.JFrame {
    //Global variable
    ArrayList<JLabel> labelList = new ArrayList<>();
    
    /**
     * Creates new form HomeGUI
     */
    
    public HomeGUI(AccountDTO acc) {
        initComponents();
        lAccInfo.setText(acc.getUsername());
        roleDivision(acc);
        colorChangeTitle();
        svgLogo.setSVGImage("com/image/logohinh.svg", 80, 80);
        svgLogout.setSVGImage("com/image/logout.svg", 30, 30);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNavigator = new javax.swing.JPanel();
        lproduct = new javax.swing.JLabel();
        linvoice = new javax.swing.JLabel();
        lCustomer = new javax.swing.JLabel();
        limport = new javax.swing.JLabel();
        lAccount = new javax.swing.JLabel();
        lEmployee = new javax.swing.JLabel();
        lSupplier = new javax.swing.JLabel();
        lAnalysis = new javax.swing.JLabel();
        lAccInfo = new javax.swing.JLabel();
        svgLogo = new com.gui.SvgImage();
        svgLogout = new com.gui.SvgImage();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pNavigator.setBackground(new java.awt.Color(255, 153, 0));
        pNavigator.setPreferredSize(new java.awt.Dimension(1280, 100));

        lproduct.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lproduct.setText("Sản phẩm");
        lproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lproductMouseClicked(evt);
            }
        });

        linvoice.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        linvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linvoice.setText("Hóa đơn");
        linvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linvoiceMouseClicked(evt);
            }
        });

        lCustomer.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCustomer.setText("Khách hàng");
        lCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCustomerMouseClicked(evt);
            }
        });

        limport.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        limport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limport.setText("Nhập hàng");
        limport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limportMouseClicked(evt);
            }
        });

        lAccount.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAccount.setText("Tài khoản");
        lAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lAccountMouseClicked(evt);
            }
        });

        lEmployee.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEmployee.setText("Nhân viên");
        lEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEmployeeMouseClicked(evt);
            }
        });

        lSupplier.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lSupplier.setText("Nhà cung cấp");
        lSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSupplierMouseClicked(evt);
            }
        });

        lAnalysis.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lAnalysis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAnalysis.setText("Thống kê");
        lAnalysis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lAnalysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lAnalysisMouseClicked(evt);
            }
        });

        lAccInfo.setBackground(new java.awt.Color(255, 255, 255));
        lAccInfo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        lAccInfo.setForeground(new java.awt.Color(240, 81, 35));
        lAccInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pNavigatorLayout = new javax.swing.GroupLayout(pNavigator);
        pNavigator.setLayout(pNavigatorLayout);
        pNavigatorLayout.setHorizontalGroup(
            pNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNavigatorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(svgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAccInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pNavigatorLayout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(svgLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pNavigatorLayout.setVerticalGroup(
            pNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNavigatorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pNavigatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(svgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pNavigatorLayout.createSequentialGroup()
                        .addComponent(svgLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lAccInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 620));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pNavigator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lproductMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        ProductUI product = new ProductUI();
        mainPanel.add(product);
    }//GEN-LAST:event_lproductMouseClicked

    private void linvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linvoiceMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        InvoiceGUI invoicePanel = new InvoiceGUI();
        mainPanel.setLayout(new GridLayout(1,1));
        mainPanel.add(invoicePanel);
    }//GEN-LAST:event_linvoiceMouseClicked

    private void lCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCustomerMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();

    }//GEN-LAST:event_lCustomerMouseClicked

    private void limportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limportMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();

    }//GEN-LAST:event_limportMouseClicked

    private void lAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAccountMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();

    }//GEN-LAST:event_lAccountMouseClicked

    private void lEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEmployeeMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
        EmployeeGUI employeePanel = new EmployeeGUI();
        mainPanel.setLayout(new GridLayout(1,1));
        mainPanel.add(employeePanel);

    }//GEN-LAST:event_lEmployeeMouseClicked

    private void lSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSupplierMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();


    }//GEN-LAST:event_lSupplierMouseClicked

    private void lAnalysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAnalysisMouseClicked
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();

    }//GEN-LAST:event_lAnalysisMouseClicked

    private void svgLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginGUI frame = new LoginGUI();
        frame.setVisible(true);
    }//GEN-LAST:event_svgLogoutMouseClicked

    private void colorChangeTitle(){
        //Thêm vào mảng label để làm colorChange cho title 
        labelList.add(lproduct);
        labelList.add(lAccount);
        labelList.add(lAnalysis);
        labelList.add(lCustomer);
        labelList.add(limport);
        labelList.add(lSupplier);
        labelList.add(lEmployee);
        labelList.add(linvoice);
        for(JLabel label : labelList){
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    for(JLabel label : labelList){
                        label.setForeground(black);
                        label.setFont(label.getFont().deriveFont(-1));
                    }
                    label.setForeground(red);
                    label.setFont(label.getFont().deriveFont(Font.BOLD));
                }
            });
        }
    }
    
    private void roleDivision(AccountDTO acc){
        if(acc.getRole().equalsIgnoreCase("nhân viên")){
            lAccount.setEnabled(false);
            lAnalysis.setEnabled(false);
            lSupplier.setEnabled(false);
            lEmployee.setEnabled(false);
        }
    }
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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lAccInfo;
    private javax.swing.JLabel lAccount;
    private javax.swing.JLabel lAnalysis;
    private javax.swing.JLabel lCustomer;
    private javax.swing.JLabel lEmployee;
    private javax.swing.JLabel lSupplier;
    private javax.swing.JLabel limport;
    private javax.swing.JLabel linvoice;
    private javax.swing.JLabel lproduct;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pNavigator;
    private com.gui.SvgImage svgLogo;
    private com.gui.SvgImage svgLogout;
    // End of variables declaration//GEN-END:variables
}
