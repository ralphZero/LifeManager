/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmis.View;

import finalmis.Model.Category;
import finalmis.Model.Expenses;
import finalmis.Model.Income;
import finalmis.Model.Member;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;


public class pnl_expense extends javax.swing.JPanel {

    ArrayList<Category> cat;
    ArrayList<Member> arraylist;
    DefaultTableModel model;
    public pnl_expense() {
        initComponents();
        bindComboboxDatas();
        bindTableData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogExpenses = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_cat1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb_family1 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tb_amount1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAddExpense = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_expense = new javax.swing.JTable();
        cb_choose = new javax.swing.JComboBox<>();

        DialogExpenses.setModal(true);
        DialogExpenses.getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel2.setMinimumSize(new java.awt.Dimension(550, 280));

        jLabel6.setText("Amount:");
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel7.setText("Category:");
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 30));

        cb_cat1.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel8.setText("Family member:");
        jLabel8.setPreferredSize(new java.awt.Dimension(0, 30));

        cb_family1.setPreferredSize(new java.awt.Dimension(0, 30));

        btnSave.setBackground(new java.awt.Color(0, 102, 204));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tb_amount1.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_family1, 0, 381, Short.MAX_VALUE)
                            .addComponent(cb_cat1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_amount1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tb_amount1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_family1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        DialogExpenses.getContentPane().add(jPanel2, "card2");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jScrollPane1.setBorder(null);

        container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)
        );

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Expenses");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(890, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnAddExpense.setBackground(new java.awt.Color(255, 255, 255));
        btnAddExpense.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnAddExpense.setText("Add Expenses");
        btnAddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExpenseActionPerformed(evt);
            }
        });

        tbl_expense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Amount", "Date", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_expense);

        cb_choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monthly", "Semestrialy", "Yearly" }));
        cb_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_chooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(btnAddExpense)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddExpense)
                    .addComponent(cb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(container);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Expenses e = new Expenses();
        e.setAmount(Double.parseDouble(tb_amount1.getValue().toString()));
        e.setCatid(cat.get(cb_cat1.getSelectedIndex()).getId());
        e.setMemberID(arraylist.get(cb_family1.getSelectedIndex()).getId());
        try {
            if(e.addExpense(e.getAmount(),e.getCatid(),e.getMemberID()))
            {
            System.out.println("Good");
            }
            DialogExpenses.setVisible(false);
            DialogExpenses.dispose();
            model.setRowCount(0);
            bindTableData();
        } catch (Exception exception) {
            DialogExpenses.setVisible(false);
            DialogExpenses.dispose();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void bindComboboxDatas() {
        Category c = new Category();
        cat = c.fetchSpentCategory();
        for (int i = 0; i < cat.size(); i++) {
            cb_cat1.addItem(cat.get(i).getName());
        }
        
        Member m = new Member();
        arraylist = m.fetchMembers();
        for(int i=0;i < arraylist.size();i++){
            cb_family1.addItem(arraylist.get(i).getLastname()+" "+arraylist.get(i).getFirstname());
        }
    }
    
    private void bindTableData() {
       model = (DefaultTableModel) tbl_expense.getModel();
       Expenses e = new Expenses();
       ArrayList<Expenses> arrayList = e.fetchExepense();
       Object[] row = new Object[4];
       for(int i=0 ; i < arrayList.size(); i++){
           row[0] = arrayList.get(i).getMemberName();
           row[1] = arrayList.get(i).getAmount();
           row[2] = arrayList.get(i).getEntryDate();
           row[3] = arrayList.get(i).getCatName();
           model.addRow(row);
       }
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        DialogExpenses.setVisible(false);
        DialogExpenses.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExpenseActionPerformed
        // TODO add your handling code here:
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - DialogExpenses.getWidth()) / 2;
        final int y = (screenSize.height - DialogExpenses.getHeight()) / 2;
        DialogExpenses.setLocation(x, y);
        DialogExpenses.setPreferredSize(new Dimension(550, 280));
        DialogExpenses.setVisible(true);
    }//GEN-LAST:event_btnAddExpenseActionPerformed

    private void cb_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_chooseActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        int index = cb_choose.getSelectedIndex();
        Expenses expenses = new Expenses();
        switch(index){
            case 0:
                model = (DefaultTableModel) tbl_expense.getModel();
                ArrayList<Expenses> arrayLis0 = expenses.fetchExepense();
                Object[] row = new Object[4];
                for(int i=0 ; i < arrayLis0.size(); i++){
                    row[0] = arrayLis0.get(i).getMemberName();
                    row[1] = arrayLis0.get(i).getAmount();
                    row[2] = arrayLis0.get(i).getEntryDate();
                    row[3] = arrayLis0.get(i).getCatName();
                    model.addRow(row);
                }
                break;
            case 1:
                model = (DefaultTableModel) tbl_expense.getModel();
                ArrayList<Expenses> arrayLis1 = expenses.bindComboBoxSemestrialy();
                Object[] row1 = new Object[4];
                for(int i=0 ; i < arrayLis1.size(); i++){
                    row1[0] = arrayLis1.get(i).getMemberName();
                    row1[1] = arrayLis1.get(i).getAmount();
                    row1[2] = arrayLis1.get(i).getEntryDate();
                    row1[3] = arrayLis1.get(i).getCatName();
                    model.addRow(row1);
                }
                break;
            case 2:
                model = (DefaultTableModel) tbl_expense.getModel();
                ArrayList<Expenses> arrayLis2 = expenses.bindComboBoxYearly();
                Object[] row2 = new Object[4];
                for(int i=0 ; i < arrayLis2.size(); i++){
                    row2[0] = arrayLis2.get(i).getMemberName();
                    row2[1] = arrayLis2.get(i).getAmount();
                    row2[2] = arrayLis2.get(i).getEntryDate();
                    row2[3] = arrayLis2.get(i).getCatName();
                    model.addRow(row2);
                }
                break;
        }
    }//GEN-LAST:event_cb_chooseActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogExpenses;
    private javax.swing.JButton btnAddExpense;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cb_cat1;
    private javax.swing.JComboBox<String> cb_choose;
    private javax.swing.JComboBox<String> cb_family1;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner tb_amount1;
    private javax.swing.JTable tbl_expense;
    // End of variables declaration//GEN-END:variables
}
