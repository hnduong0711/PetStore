/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import com.dao.CustomerDTO;

/**
 *
 * @author DUC PHU
 */
public class CustomerChooserItem extends javax.swing.JPanel {

    /**
     * Creates new form CustomerChooserItem
     */
    CustomerDTO cus;
    AddInvoice addUI; 
    CustomerChoose cusChooseUI;
    public CustomerChooserItem(CustomerDTO cus, AddInvoice addUI, CustomerChoose cusChooseUI) {
        this.addUI = addUI;
        this.cusChooseUI = cusChooseUI;
        this.cus = cus;
        initComponents();
        svgChoose.setSVGImage("com/image/add.svg", 33, 33);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCusInfo = new javax.swing.JLabel();
        svgChoose = new com.gui.SvgImage();

        lbCusInfo.setText("Nguyễn Lmao Lmao Lmao - KH999 - 12345678910");

        svgChoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgChooseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCusInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(svgChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbCusInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(svgChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbCusInfo.setText(cus.getCusName() +" - "+cus.getCusName() + " - " +cus.getPhone());
    }// </editor-fold>//GEN-END:initComponents

    private void svgChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgChooseMouseClicked
        // TODO add your handling code here:
        addUI.setCustomerInfo(cus);
        cusChooseUI.dispose();
    }//GEN-LAST:event_svgChooseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbCusInfo;
    private com.gui.SvgImage svgChoose;
    // End of variables declaration//GEN-END:variables
}