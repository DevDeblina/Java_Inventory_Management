
package com.home;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomeJFrame extends javax.swing.JFrame {

    public HomeJFrame() throws SQLException {
        initComponents();
            this.setResizable(false);
    ImageIcon image2 = new ImageIcon("C:\\Images\\download.jpeg");//creates an image icon
     setIconImage(image2.getImage());
     loadTable();
    }
    
    public void loadAllDataIntoTable(List<HomeBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(HomeBean bean : list){
            Vector v = new Vector();
            v.add(bean.getMedicine());
            v.add(bean.getMedicine_id());
            v.add(bean.getQuantity());
            v.add(bean.getExpiry_date());
            v.add(bean.getPrice());
            
            dtm.addRow(v);
        }
    }
    public void loadTable() throws SQLException{
        HomeBal bal = new HomeBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    public void clearTextFieldData(){
        jTextFieldMedicine.setText("");
        jDateChooser1.setDate(null);
        jTextFieldMedicineID.setText("");
        jTextFieldPrice.setText("");
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldMedicine = new javax.swing.JTextField();
        jTextFieldMedicineID = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBoxQuantity = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon icon=new javax.swing.ImageIcon("C:\\Images\\medicine.jpg");
        ImageIcon icon3=new javax.swing.ImageIcon(icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        jLabel1.setIcon(icon3);
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));

        jLabel1.setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 90));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTARY MANAGEMENT APPLICATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 580, 60));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 440, 0));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 530, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 140));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1360, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1360, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1360, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1360, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1360, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1360, 170));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2), "DETIALS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Medicine:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 40));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Medicine ID:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Quantity:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 40));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Expiry Date:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, 40));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Price:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 40));

        jTextFieldPrice.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextFieldPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jTextFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPriceKeyTyped(evt);
            }
        });
        jPanel4.add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 350, 30));

        jTextFieldMedicine.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextFieldMedicine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel4.add(jTextFieldMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 350, 30));

        jTextFieldMedicineID.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jTextFieldMedicineID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel4.add(jTextFieldMedicineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 350, 30));

        jDateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 350, 40));

        jComboBoxQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4","5","6","7","8","9","10" }));
        jComboBoxQuantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jComboBoxQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQuantityActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 122, 350, 30));

        jButtonDelete.setBackground(new java.awt.Color(0, 153, 153));
        jButtonDelete.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 120, 40));

        jButtonAdd.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAdd.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("ADD");
        jButtonAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, 40));

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jButtonUpdate.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 40));

        jButtonClear.setBackground(new java.awt.Color(0, 153, 153));
        jButtonClear.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("CLEAR");
        jButtonClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 110, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 520));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine", "Med ID", "Quantity", "Expiry Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 700, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1360, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPriceKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPriceKeyTyped

    private void jComboBoxQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxQuantityActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String medicine = jTextFieldMedicine.getText();

        String inputText = jTextFieldMedicineID.getText();
        int medicine_id = 0; // Default value in case parsing fails.
            try {
                medicine_id = Integer.parseInt(inputText);
            } catch (NumberFormatException e) {
    
            }

        Object selectedItem = jComboBoxQuantity.getSelectedItem();
        int quantity = 0; // Default value in case parsing fails.
        if (selectedItem != null) {
           try {
               quantity = Integer.parseInt(selectedItem.toString());
           } catch (NumberFormatException e) {
        // Handle the case where the selected item is not a valid integer.
        // You can show an error message or take appropriate action.
           }
        }

        Date expiry_date = jDateChooser1.getDate();

        String inputText1 = jTextFieldPrice.getText();
        float price = 0.0f; // Default value in case parsing fails.
        try {
            price = Float.parseFloat(inputText1);
        } catch (NumberFormatException e) {
    
    }

        
        HomeBean homeBean = new HomeBean(medicine,medicine_id,quantity,expiry_date,price );
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homeBean);
        try {
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
        }
        else{
            int medicine_id = (int) jTable1.getValueAt(row, 1);
            HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataToTextFields(medicine_id);
            jTextFieldMedicineID.setText(Integer.toString(bean.getMedicine_id()));
            jComboBoxQuantity.setSelectedItem(bean.getQuantity());
            jTextFieldMedicine.setText(bean.getMedicine());
            jDateChooser1.setDate(bean.getExpiry_date());
            float price = bean.getPrice(); // Assuming getPrice() returns a float.
            String priceString = Float.toString(price);
            jTextFieldPrice.setText(priceString);

            
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
       
        String medicine = jTextFieldMedicine.getText();

        String medicineIDString = jTextFieldMedicineID.getText();
        int medicine_id = 0; // Default value in case parsing fails.
            try {
                medicine_id = Integer.parseInt(medicineIDString);
            } catch (NumberFormatException e) {
    
            }

        Object selectedItem = jComboBoxQuantity.getSelectedItem();
        int quantity = 0; // Default value in case parsing fails.
        if (selectedItem != null) {
           try {
               quantity = Integer.parseInt(selectedItem.toString());
           } catch (NumberFormatException e) {
        // Handle the case where the selected item is not a valid integer.
        // You can show an error message or take appropriate action.
           }
        }

        Date expiry_date = jDateChooser1.getDate();

        String priceString = jTextFieldPrice.getText();
        float price = 0.0f; // Default value in case parsing fails.
        try {
            price = Float.parseFloat(priceString);
        } catch (NumberFormatException e) {
            
        }
        System.out.println(medicine+" "+medicine_id+" "+quantity+" "+expiry_date+" "+price);
        HomeBean bean = new HomeBean(medicine,medicine_id,quantity,expiry_date,price);
        HomeBal homeBal = new HomeBal();
        homeBal.UpdateData(bean);
        try {
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
         String medicineIDString = jTextFieldMedicineID.getText();
        int medicine_id = 0; // Default value in case parsing fails.
            try {
                medicine_id = Integer.parseInt(medicineIDString);
            } catch (NumberFormatException e) {
    
            }
        HomeBal bal = new HomeBal();
        bal.deleteRecord(medicine_id);
        try {
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearTextFieldData();
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new HomeJFrame().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxQuantity;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldMedicine;
    private javax.swing.JTextField jTextFieldMedicineID;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables
}
