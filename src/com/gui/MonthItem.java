/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import com.bus.MonthlyAnalysisBUS;
import com.bus.PetProductBUS;
import com.bus.SoldPetBUS;
import com.dao.BreedAnalysisDTO;
import com.dao.MonthlyAnalysisDTO;
import com.dao.PetProductDTO;
import com.dao.ProductDTO;
import com.dao.SoldPetDTO;
import java.util.ArrayList;

/**
 *
 * @author DUC PHU
 */
public class MonthItem extends javax.swing.JPanel {

    /**
     * Creates new form MonthItem
     */
    Validator valid = new Validator();
    public MonthItem() {
        initComponents();
    }
    
    int month = 0; 
    int year = 0; 
    int soldQuantity;
    Long revenue = 0L;
    String category = ""; 
    String flag = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMonth = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbSoldQuantity = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRevenue = new javax.swing.JLabel();
        btnSoldList = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbMonth.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMonth.setText("THÁNG 12");

        jLabel1.setText("Số lượng bán");

        lbSoldQuantity.setText("0");

        jLabel3.setText("Doanh thu");

        lbRevenue.setText("0");

        btnSoldList.setText("...");
        btnSoldList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoldListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbSoldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnSoldList, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSoldQuantity)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRevenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSoldList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSoldListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoldListActionPerformed
        // TODO add your handling code here:
        ArrayList<SoldList> soldList = new ArrayList<>();
        //tìm tất cả
        System.out.println("flag cua month item : "+flag);
        if(flag.equalsIgnoreCase("all"))
        {
            PetProductBUS proBus = new PetProductBUS();
            soldList.removeAll(soldList);
            SoldPetBUS soldPetBus = new SoldPetBUS();
            MonthlyAnalysisBUS monthAnalysisBus = new MonthlyAnalysisBUS();
            
            for(SoldPetDTO soldPetTemp : soldPetBus.soldList)
            {
                if(soldPetTemp.getSoldDate().getMonthValue() == month && 
                        soldPetTemp.getSoldDate().getYear() == year)
                {
                    SoldList soldItem = new SoldList();
                    soldItem.setName(soldPetTemp.getName());
                    soldItem.setQuantity(1);
                    soldList.add(soldItem);
                }
            }
            
            //làm tên
            for(MonthlyAnalysisDTO monthSoldTemp : monthAnalysisBus.analysisList)
            {
                if(monthSoldTemp.getMonth() == month && 
                        monthSoldTemp.getYear() == year)
                {
                    SoldList soldItem = new SoldList();
                    soldItem.setName(proBus.getName(monthSoldTemp.getProductID()));
                    soldItem.setQuantity(monthSoldTemp.getSoldQuantity());
                    soldList.add(soldItem);
                }
            }
            System.out.println("size : "+soldList.size());
            
        }        
        
        //tìm thú
        else if(flag.equalsIgnoreCase("pet"))
        {
            soldList.removeAll(soldList);
            SoldPetBUS soldPetBus = new SoldPetBUS();
            
            //nếu chọn giống loài là tất cả
            if(category.equalsIgnoreCase("all"))
            {
                for(SoldPetDTO soldPetTemp : soldPetBus.soldList)
                {
                    if(soldPetTemp.getSoldDate().getMonthValue() == month && 
                            soldPetTemp.getSoldDate().getYear() == year)
                    {
                        SoldList soldItem = new SoldList();
                        soldItem.setName(soldPetTemp.getName());
                        soldItem.setQuantity(1);
                        soldList.add(soldItem);
                    }
                }
            }
            
            //hoặc chọn 1 giống loài cụ thể
            else{
                for(SoldPetDTO soldPetTemp : soldPetBus.soldList)
                {
                    if(soldPetTemp.getBreedId().equalsIgnoreCase(category) &&  
                            soldPetTemp.getSoldDate().getMonthValue() == month && 
                            soldPetTemp.getSoldDate().getYear() == year)
                    {
                        SoldList soldItem = new SoldList();
                        soldItem.setName(soldPetTemp.getName());
                        soldItem.setQuantity(1);
                        soldList.add(soldItem);
                    }
                }
            }
            
            
            
            System.out.println("size : "+soldList.size());
        }
        
        
        //tìm sản phảm cho thú
        //làm tên 
        else if(flag.equalsIgnoreCase("product"))
        {
            soldList.removeAll(soldList);
            MonthlyAnalysisBUS monthAnalysisBus = new MonthlyAnalysisBUS();
            PetProductBUS proBus = new PetProductBUS();
            
            //nếu chọn 1 loại là tất cả
            if(category.equalsIgnoreCase("all"))
            {
                for(MonthlyAnalysisDTO monthSoldTemp : monthAnalysisBus.analysisList)
                {
                    if(monthSoldTemp.getMonth() == month && 
                            monthSoldTemp.getYear() == year)
                    {
                        SoldList soldItem = new SoldList();
                        soldItem.setName(proBus.getName(monthSoldTemp.getProductID()));
                        soldItem.setQuantity(monthSoldTemp.getSoldQuantity());
                        soldList.add(soldItem);
                    }
                }
            }
            
            //nếu chọn 1 loại sp cụ thể
            else{
                for(MonthlyAnalysisDTO monthSoldTemp : monthAnalysisBus.analysisList)
                {
                    if(monthSoldTemp.getTypeID().equalsIgnoreCase(category) && 
                            monthSoldTemp.getMonth() == month && 
                            monthSoldTemp.getYear() == year)
                    {
                        SoldList soldItem = new SoldList();
                        soldItem.setName(proBus.getName(monthSoldTemp.getProductID()));
                        soldItem.setQuantity(monthSoldTemp.getSoldQuantity());
                        soldList.add(soldItem);
                    }
                }
            }
            
            
            
            System.out.println("size : "+soldList.size());
        }
        SoldListUI soldListUI = new SoldListUI(soldList, flag);
        soldListUI.setVisible(true);
    }//GEN-LAST:event_btnSoldListActionPerformed

    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public void setFlag(String flagTemp)
    {
        this.flag = flagTemp;
    }
    
    public void resetInfo()
    {
        this.soldQuantity = 0;
        lbSoldQuantity.setText(""+soldQuantity);
        
        this.revenue = 0L;
        lbRevenue.setText(valid.formatMoney(this.revenue)+"đ");
    }
   
    public void setMonth(int month)
    {
        this.month = month;
        lbMonth.setText("THÁNG "+month);
    }
    
    public void setYear(int year)
    {
        this.year = year;
        
    }
    
    public void setSoldQuantity(int quantity)
    {
        this.soldQuantity += quantity;
        lbSoldQuantity.setText(""+this.soldQuantity);
    }
    
    public void setRevenue(Long revenue)
    {
        this.revenue += revenue;
        lbRevenue.setText(valid.formatMoney(this.revenue)+"đ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSoldList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbRevenue;
    private javax.swing.JLabel lbSoldQuantity;
    // End of variables declaration//GEN-END:variables
}
