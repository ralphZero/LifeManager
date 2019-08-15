package finalmis.View;

import finalmis.Model.Category;
import finalmis.Model.Connexion;
import finalmis.Model.Income;
import finalmis.Model.Member;
import finalmis.Model.Settings;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class pnl_income extends javax.swing.JPanel {

    ArrayList<Category> cat;
    ArrayList<Member> arraylist;
    DefaultTableModel model;
    public pnl_income() {
        initComponents();
        bindComboboxDatas();
        bindTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAddIncome = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_cat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_family = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tb_amount = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddIncome = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_income = new javax.swing.JTable();
        cb_choose = new javax.swing.JComboBox<>();

        jDialogAddIncome.setAlwaysOnTop(true);
        jDialogAddIncome.setMinimumSize(new java.awt.Dimension(550, 280));
        jDialogAddIncome.setModal(true);
        jDialogAddIncome.setUndecorated(true);
        jDialogAddIncome.getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 280));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 280));

        jLabel5.setText("Amount:");
        jLabel5.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel6.setText("Category:");
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 30));

        cb_cat.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel7.setText("Family member:");
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 30));

        cb_family.setPreferredSize(new java.awt.Dimension(0, 30));

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

        tb_amount.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_family, 0, 381, Short.MAX_VALUE)
                            .addComponent(cb_cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_amount)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tb_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jDialogAddIncome.getContentPane().add(jPanel1, "card2");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jScrollPane1.setBorder(null);

        container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Income");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(879, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnAddIncome.setBackground(new java.awt.Color(255, 255, 255));
        btnAddIncome.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnAddIncome.setText("Add Income");
        btnAddIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIncomeActionPerformed(evt);
            }
        });

        tbl_income.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Amount", "Date", "Category"
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
        jScrollPane2.setViewportView(tbl_income);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(btnAddIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddIncome)
                    .addComponent(cb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(container);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIncomeActionPerformed
        // TODO add your handling code here:
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - jDialogAddIncome.getWidth()) / 2;
        final int y = (screenSize.height - jDialogAddIncome.getHeight()) / 2;
        jDialogAddIncome.setLocation(x, y);
        jDialogAddIncome.setPreferredSize(new Dimension(550, 280));
        jDialogAddIncome.setVisible(true);
    }//GEN-LAST:event_btnAddIncomeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Income income = new Income();
        income.setAmount(Double.parseDouble(tb_amount.getValue().toString()));
        income.setCatId(cat.get(cb_cat.getSelectedIndex()).getId());
        income.setMemberID(arraylist.get(cb_family.getSelectedIndex()).getId());
        try {
            income.addIncome();
            jDialogAddIncome.setVisible(false);
            jDialogAddIncome.dispose();
            model.setRowCount(0);
            bindTableData();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        jDialogAddIncome.setVisible(false);
        jDialogAddIncome.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cb_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_chooseActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        int index = cb_choose.getSelectedIndex();
        Income income = new Income();
        switch(index){
            case 0:
                model = (DefaultTableModel) tbl_income.getModel();
                ArrayList<Income> arrayList = income.bindComboMonth();
                Object[] row = new Object[4];
                for(int i=0 ; i < arrayList.size(); i++){
                    row[0] = arrayList.get(i).getMemberName();
                    row[1] = arrayList.get(i).getAmount();
                    row[2] = arrayList.get(i).getEntryDate();
                    row[3] = arrayList.get(i).getCatName();
                    model.addRow(row);
                }
                break;
            case 1:
                model = (DefaultTableModel) tbl_income.getModel();
                ArrayList<Income> arrayLis2 = income.bindComboSemestrial();
                Object[] row2 = new Object[4];
                for(int i=0 ; i < arrayLis2.size(); i++){
                    row2[0] = arrayLis2.get(i).getMemberName();
                    row2[1] = arrayLis2.get(i).getAmount();
                    row2[2] = arrayLis2.get(i).getEntryDate();
                    row2[3] = arrayLis2.get(i).getCatName();
                    model.addRow(row2);
                }
                break;
            case 2:
                model = (DefaultTableModel) tbl_income.getModel();
                ArrayList<Income> arrayLis1 = income.bindComboYear();
                Object[] row1 = new Object[4];
                for(int i=0 ; i < arrayLis1.size(); i++){
                    row1[0] = arrayLis1.get(i).getMemberName();
                    row1[1] = arrayLis1.get(i).getAmount();
                    row1[2] = arrayLis1.get(i).getEntryDate();
                    row1[3] = arrayLis1.get(i).getCatName();
                    model.addRow(row1);
                }
                break;
        }
    }//GEN-LAST:event_cb_chooseActionPerformed

    private void bindTableData() {
       model = (DefaultTableModel) tbl_income.getModel();
       Income income = new Income();
       ArrayList<Income> arrayList = income.fetchIncome();
       Object[] row = new Object[4];
       for(int i=0 ; i < arrayList.size(); i++){
         row[0] = arrayList.get(i).getMemberName();
           row[1] = arrayList.get(i).getAmount();
           row[2] = arrayList.get(i).getEntryDate();
           row[3] = arrayList.get(i).getCatName();
           model.addRow(row);
       }
    }
        
    private void bindComboboxDatas() {
        Category c = new Category();
        cat = c.fetchCategory();
        for (int i = 0; i < cat.size(); i++) {
            cb_cat.addItem(cat.get(i).getName());
        }
        
        Member m = new Member();
        arraylist = m.fetchMembers();
        for(int i=0;i < arraylist.size();i++){
        cb_family.addItem(arraylist.get(i).getLastname()+" "+arraylist.get(i).getFirstname());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddIncome;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_choose;
    private javax.swing.JComboBox<String> cb_family;
    private javax.swing.JPanel container;
    private javax.swing.JDialog jDialogAddIncome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner tb_amount;
    private javax.swing.JTable tbl_income;
    // End of variables declaration//GEN-END:variables


}
