/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import com.dao.PetOnStoreDTO;
import com.dao.PetProductDTO;
import com.dao.ProductDTO;

/**
 *
 * @author DUC PHU
 */
public class AddedImportItem extends javax.swing.JPanel {

    /**
     * Creates new form AddedInvoiceItem
     */
    ProductDTO product; 
    CreateImportUI addUI;
    public int quantity = 1;
//    int maxQuantity = 1;
    PetProductDTO petPro;
    public String instance = "";
    public String proID = "";
    public String proName = "";
    public String categoryID = "";
    Long soldPrice = 0L;
    Long importPrice = 0L;
    Long totalAmount = 0L;
    Validator valid = new Validator();
    public AddedImportItem(ProductDTO product, CreateImportUI addUI) {
        this.product = product;
        this.addUI = addUI;
        this.proID = product.getId();
        this.proName = product.getName();
        this.soldPrice = product.getSoldPrice();
        this.importPrice = product.getImportPrice();
        if(product instanceof PetProductDTO)
        {
            this.petPro = (PetProductDTO) product;
//            maxQuantity = petPro.getInStock();
            instance = "isproduct";
            categoryID = petPro.getCategoryID();
        }
        
        initComponents();
        svgDeleteBtn.setSVGImage("com/image/trash.svg", 30, 29);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        svgDeleteBtn = new com.gui.SvgImage();
        lbID = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbSoldPrice = new javax.swing.JLabel();
        lbTotalPrice = new javax.swing.JLabel();
        QuantitySpinner = new javax.swing.JSpinner();

        svgDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgDeleteBtnMouseClicked(evt);
            }
        });

        lbID.setText("SP999");

        lbName.setText("Mèo anh lông ngắn chân dài tới lách");

        lbSoldPrice.setText("10.000.000.000");

        lbTotalPrice.setText("10.000.000.000");

        QuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantitySpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lbSoldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lbTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(svgDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(svgDeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(lbName)
                .addComponent(lbSoldPrice)
                .addComponent(lbTotalPrice)
                .addComponent(QuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbID.setText(product.getId());
        QuantitySpinner.setValue(1);
        lbName.setText(product.getName());
        lbSoldPrice.setText(valid.formatMoney(product.getImportPrice()));
        quantity = (int) QuantitySpinner.getValue();
        totalAmount = product.getImportPrice() * quantity;
        lbTotalPrice.setText(""+valid.formatMoney(totalAmount));
    }// </editor-fold>//GEN-END:initComponents

    private void QuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantitySpinnerStateChanged
        // TODO add your handling code here:
        quantity = (int) QuantitySpinner.getValue();
        
        totalAmount = product.getImportPrice() * quantity;
        lbTotalPrice.setText(""+valid.formatMoney(totalAmount));
        addUI.editImportTotal();
        
        
    }//GEN-LAST:event_QuantitySpinnerStateChanged

    private void svgDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgDeleteBtnMouseClicked
        // TODO add your handling code here:
        addUI.removeImportItem(product);
        
    }//GEN-LAST:event_svgDeleteBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbSoldPrice;
    private javax.swing.JLabel lbTotalPrice;
    private com.gui.SvgImage svgDeleteBtn;
    // End of variables declaration//GEN-END:variables
}