package pizza_shop;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;

public class Pizza_Shop extends javax.swing.JFrame {
    
    private final int MAX_CUSTOMER = 50;
    Pizza customers[] = new Pizza[MAX_CUSTOMER];
    private int cusNum = 0;
    
    public Pizza_Shop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MsgDialog = new javax.swing.JOptionPane();
        textMsgDialog = new javax.swing.JLabel();
        labelCusName = new javax.swing.JLabel();
        textCusName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        listCusName = new javax.swing.JComboBox<>();
        textCond = new javax.swing.JTextField();
        labelCond = new javax.swing.JLabel();
        btnAddCond = new javax.swing.JButton();
        labelCondList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCondList = new javax.swing.JTextArea();
        textTotalCond = new javax.swing.JTextField();
        labelTotalCond = new javax.swing.JLabel();
        labelUnit = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        labelPrice = new javax.swing.JLabel();

        MsgDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textMsgDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Shop Application");

        labelCusName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCusName.setText("ชื่อลูกค้า");
        labelCusName.setToolTipText("");

        textCusName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textCusName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textCusNameCaretUpdate(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegister.setText("ลงทะเบียน");
        btnRegister.setEnabled(false);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });

        listCusName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listCusName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listCusNameItemStateChanged(evt);
            }
        });

        textCond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textCond.setEnabled(false);
        textCond.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textCondCaretUpdate(evt);
            }
        });

        labelCond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCond.setText("ชื่อเครื่องปรุง");

        btnAddCond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddCond.setText("เพิ่มเครื่องปรุง");
        btnAddCond.setEnabled(false);
        btnAddCond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddCondMousePressed(evt);
            }
        });

        labelCondList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCondList.setText("รายการเครื่องปรุง");

        textCondList.setEditable(false);
        textCondList.setColumns(20);
        textCondList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textCondList.setRows(5);
        textCondList.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        textCondList.setEnabled(false);
        jScrollPane1.setViewportView(textCondList);

        textTotalCond.setEditable(false);
        textTotalCond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textTotalCond.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        textTotalCond.setEnabled(false);

        labelTotalCond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTotalCond.setText("จำนวนเครื่องปรุงพิซซ่าทั้งหมด");

        labelUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelUnit.setText("บาท");

        textPrice.setEditable(false);
        textPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textPrice.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        textPrice.setEnabled(false);

        labelPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPrice.setText("ราคารวมพิซซ่าหน้าเปล่า+เครื่องปรุง");
        labelPrice.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUnit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTotalCond)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTotalCond, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCondList)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCusName)
                                .addGap(6, 6, 6))
                            .addComponent(labelCond))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textCond)
                                    .addComponent(listCusName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddCond)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCusName)
                    .addComponent(textCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCond)
                    .addComponent(btnAddCond))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCondList)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalCond))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUnit)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void textCusNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textCusNameCaretUpdate
        if (textCusName.getText().equals("")) {
            btnRegister.setEnabled(false);
        } else {
            btnRegister.setEnabled(true);
        }
    }//GEN-LAST:event_textCusNameCaretUpdate

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        if (btnRegister.isEnabled() == false) { return; }
        
        if (isExistName()) {
                textMsgDialog.setText(textCusName.getText() + " ชื่อนี้ใช้ลงทะเบียนไปแล้ว");
                MsgDialog.showMessageDialog(null, textMsgDialog);
                textCusName.setText("");
                return;
        } 

        customers[cusNum] = new Pizza();
        customers[cusNum].setName(textCusName.getText());
        textCusName.setText("");
        
        setListCusName();
    }//GEN-LAST:event_btnRegisterMousePressed
    
    private void listCusNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listCusNameItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            resetTextField();
            setCondimentData();
            textCond.setEnabled(true);
        }
    }//GEN-LAST:event_listCusNameItemStateChanged

    private void btnAddCondMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCondMousePressed
        if (btnAddCond.isEnabled() == false) { return; }
        
        Pizza p = getSelectCustomerData();
        p.addTopping(textCond.getText());
        textCond.setText("");
        setCondimentData();
    }//GEN-LAST:event_btnAddCondMousePressed

    private void textCondCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textCondCaretUpdate
        if (textCond.getText().equals("")) {
            btnAddCond.setEnabled(false);
        } else {
            btnAddCond.setEnabled(true);
        }
    }//GEN-LAST:event_textCondCaretUpdate
    
    private boolean isExistName() {
        for (int i = 0; i < cusNum; i++) {
            if (textCusName.getText().equals(customers[i].getName())) {
                return true;
            }
        }
        return false;
    }
    
    private void setListCusName() {
        listCusName.removeAllItems();
        for (int i = 0; i <= cusNum; i++) {
          listCusName.addItem(customers[i].getName());
        }
        listCusName.setSelectedIndex(cusNum);
        cusNum++;
    }
    
    private void resetTextField() {
        textCond.setText("");
        textCondList.setText("");
        textTotalCond.setText("");
        textPrice.setText("");
    }
    
    private Pizza getSelectCustomerData() {
        String nameSelected = listCusName.getSelectedItem().toString();
        for (int i = 0; i < cusNum; i++) {
            if (nameSelected.equals(customers[i].getName())) {
                return customers[i];
            }
        }
        return new Pizza();
    }
    
    private void setCondimentData() {
        Pizza p = getSelectCustomerData();
                
        String[] toppings = p.printAllToppings();
        int n = p.getTotalToppings();
        
        textCondList.setText("");
        for (int i = 0; i < n; i++) {
            if (toppings[i] != null) {
                textCondList.append(toppings[i]+"\n");
            }
        }
        
        textTotalCond.setText(Integer.toString(n));
        textPrice.setText(Integer.toString(p.getPrice()));
    }
    
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza_Shop().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane MsgDialog;
    private javax.swing.JButton btnAddCond;
    private javax.swing.JButton btnRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCond;
    private javax.swing.JLabel labelCondList;
    private javax.swing.JLabel labelCusName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTotalCond;
    private javax.swing.JLabel labelUnit;
    private javax.swing.JComboBox<String> listCusName;
    private javax.swing.JTextField textCond;
    private javax.swing.JTextArea textCondList;
    private javax.swing.JTextField textCusName;
    private javax.swing.JLabel textMsgDialog;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textTotalCond;
    // End of variables declaration//GEN-END:variables
}
