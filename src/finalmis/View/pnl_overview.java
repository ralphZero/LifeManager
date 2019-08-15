/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalmis.View;

import finalmis.Model.ChartGenerator;
import finalmis.Model.Income;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pnl_overview extends javax.swing.JPanel {

    private static final Insets insets = new Insets(10, 10, 10, 10);
    
    GridBagLayout layout;
    GridBagConstraints c;
    JPanel pnl_income_1;
    JPanel pnl_income_2;
    JPanel pnl_income_3;
    JPanel pnl_expense_1;
    JPanel pnl_expense_2;
    JPanel pnl_member_1;
    public pnl_overview() throws SQLException {
        initComponents();
        pnl_container.setPreferredSize(new Dimension(900, 950));
        initPanelGrid();
        populateChart();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_container = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnl_container.setPreferredSize(new java.awt.Dimension(866, 510));

        javax.swing.GroupLayout pnl_containerLayout = new javax.swing.GroupLayout(pnl_container);
        pnl_container.setLayout(pnl_containerLayout);
        pnl_containerLayout.setHorizontalGroup(
            pnl_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
        );
        pnl_containerLayout.setVerticalGroup(
            pnl_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnl_container);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents
    
    public void initPanelGrid(){
        layout = new GridBagLayout();
        c = new GridBagConstraints();
        pnl_income_1 = new JPanel();
        pnl_income_1.setBackground(Color.WHITE);
        pnl_income_1.setPreferredSize(new Dimension(200, 200));
        pnl_income_2 = new JPanel();
        pnl_income_2.setBackground(Color.WHITE);
        pnl_income_2.setPreferredSize(new Dimension(200, 200));
        pnl_income_3 = new JPanel();
        pnl_income_3.setBackground(Color.WHITE);
        pnl_income_3.setPreferredSize(new Dimension(200, 200));
        pnl_expense_1 = new JPanel();
        pnl_expense_1.setBackground(Color.WHITE);
        pnl_expense_1.setPreferredSize(new Dimension(200, 200));
        pnl_expense_2 = new JPanel();
        pnl_expense_2.setBackground(Color.WHITE);
        pnl_expense_2.setPreferredSize(new Dimension(200, 200));
        pnl_member_1 = new JPanel();
        pnl_member_1.setBackground(Color.WHITE);
        pnl_member_1.setPreferredSize(new Dimension(200, 200));
        pnl_container.setLayout(layout);
        JButton button;
    // Row One - Three Buttons
    addComponent(pnl_container, pnl_income_1, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    addComponent(pnl_container, pnl_income_2, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    addComponent(pnl_container, pnl_income_3, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    // Row Two - Two Buttons
    addComponent(pnl_container, pnl_expense_1, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    addComponent(pnl_container, pnl_expense_2, 1, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
  }

  private static void addComponent(Container container, Component component, int gridx, int gridy,
      int gridwidth, int gridheight, int anchor, int fill) {
    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
        anchor, fill, insets, 0, 0);
    container.add(component, gbc);
  }
  
  private void populateChart() throws SQLException{
      ChartGenerator cg = new ChartGenerator();
      
      panel_income panel = new panel_income();
      panel_expense panel1 = new panel_expense();
      
      pnl_income_1.setLayout(new BorderLayout());
      pnl_income_1.add(panel, BorderLayout.CENTER);
      
      pnl_income_2.setLayout(new BorderLayout());
      pnl_income_2.add(panel1,BorderLayout.CENTER);
      
      
      pnl_income_3.setLayout(new BorderLayout());
      pnl_quant pn =new pnl_quant();
      pnl_income_3.add(pn, BorderLayout.CENTER);
      
      pnl_expense_1.setLayout(new BorderLayout());
      pnl_balance o = new pnl_balance();
      
      pnl_expense_1.add(o,BorderLayout.CENTER);
      JPanel l = new JPanel();
      JButton check = new JButton("Check Balance");
      check.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              Income income = new Income();
                JOptionPane.showMessageDialog(null,income.checkBalance(), "Balance",JOptionPane.QUESTION_MESSAGE);
          }
      });
      l.add(check);
      l.setBackground(Color.WHITE);
      l.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
      pnl_expense_1.add(l, BorderLayout.NORTH);
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_container;
    // End of variables declaration//GEN-END:variables

}
