/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmis.View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ralph Placide
 */
public class Interface extends javax.swing.JFrame {

    static Boolean maximized = true;
    String username;
    int xMouse;
    int yMouse;
    CardLayout layout;
    pnl_overview overview;
    pnl_income income;
    pnl_expense expense;
    pnl_members members;
    static String[] list = {"card1","card2","card3","card4"};
    public Interface() throws SQLException {
        initComponents();
        layout = new CardLayout();
        overview = new pnl_overview();
        income = new pnl_income();
        expense = new pnl_expense();
        members = new pnl_members();
        container.setLayout(layout);
        container.add(overview,list[0]);
        container.add(income,list[1]);
        container.add(expense,list[2]);
        container.add(members,list[3]);
        
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLUE));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Topbar = new javax.swing.JPanel();
        btn_exit = new javax.swing.JLabel();
        btn_max = new javax.swing.JLabel();
        btn_min = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_member = new javax.swing.JLabel();
        btn_expense = new javax.swing.JLabel();
        btn_income = new javax.swing.JLabel();
        btn_overview = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LifeManager");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Topbar.setBackground(new java.awt.Color(255, 255, 255));
        Topbar.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.GRAY));
        Topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopbarMouseDragged(evt);
            }
        });
        Topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopbarMousePressed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/stop32.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });

        btn_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/plus32.png"))); // NOI18N
        btn_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maxMouseExited(evt);
            }
        });

        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/minus32.png"))); // NOI18N
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TopbarLayout = new javax.swing.GroupLayout(Topbar);
        Topbar.setLayout(TopbarLayout);
        TopbarLayout.setHorizontalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_max)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit)
                .addGap(5, 5, 5))
        );
        TopbarLayout.setVerticalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopbarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(btn_max)
                    .addComponent(btn_min))
                .addGap(6, 6, 6))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.GRAY));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/default_user.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Administrator");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Hi.");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_logout.setForeground(new java.awt.Color(102, 153, 255));
        btn_logout.setText("LogOut?");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("You are logged in.");

        btn_member.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btn_member.setText("Members");
        btn_member.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_memberMouseClicked(evt);
            }
        });

        btn_expense.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btn_expense.setText("Expenses");
        btn_expense.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_expense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_expense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_expenseMouseClicked(evt);
            }
        });

        btn_income.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btn_income.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_income.setText("Incomes");
        btn_income.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_income.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_income.setMaximumSize(new java.awt.Dimension(75, 22));
        btn_income.setMinimumSize(new java.awt.Dimension(75, 22));
        btn_income.setPreferredSize(new java.awt.Dimension(75, 22));
        btn_income.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_incomeMouseClicked(evt);
            }
        });

        btn_overview.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btn_overview.setText("Overview");
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_overview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_overview.setMaximumSize(new java.awt.Dimension(75, 22));
        btn_overview.setMinimumSize(new java.awt.Dimension(75, 22));
        btn_overview.setPreferredSize(new java.awt.Dimension(75, 22));
        btn_overview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_overviewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_logout))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_overview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_expense)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_member))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_logout)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_member)
                    .addComponent(btn_expense)
                    .addComponent(btn_income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_overview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.GRAY));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        JOptionPane Op = new JOptionPane();
        int option = Op.showConfirmDialog(null,"Do you want to quit?","Quit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch(option){
            case 0:
                Index aIndex = new Index();
                aIndex.setVisible(true);
                this.setVisible(false);
                break;
            case 1:
                Op.setVisible(false);
                break;
        }
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        // TODO add your handling code here:
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/stop32_hover.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        // TODO add your handling code here:
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/stop32.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JOptionPane Op = new JOptionPane();
        int option = Op.showConfirmDialog(null,"Do you want to quit?","Quit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch(option){
            case 0:
                System.exit(0);
                break;
            case 1:
                Op.setVisible(false);
                break;
        }
    }//GEN-LAST:event_formWindowClosing

    private void btn_maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseClicked
        // TODO add your handling code here:
        if(maximized == false){
            this.setExtendedState(MAXIMIZED_BOTH);
            GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            this.setMaximizedBounds(environment.getMaximumWindowBounds());
            maximized = true;
        }else{
            this.setExtendedState(NORMAL);
            maximized = false;
        }
    }//GEN-LAST:event_btn_maxMouseClicked

    private void btn_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseEntered
        // TODO add your handling code here:
        btn_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/plus32_hover.png")));
    }//GEN-LAST:event_btn_maxMouseEntered

    private void btn_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseExited
        // TODO add your handling code here:
        btn_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/plus32.png")));
    }//GEN-LAST:event_btn_maxMouseExited

    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btn_minMouseClicked

    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        // TODO add your handling code here:
        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/minus32_hover.png")));
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        // TODO add your handling code here:
        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalmis/res/minus32.png")));
    }//GEN-LAST:event_btn_minMouseExited

    private void TopbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopbarMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TopbarMousePressed

    private void TopbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopbarMouseDragged
        // TODO add your handling code here:
        if(maximized == false){
            int x = evt.getXOnScreen();
            int y =evt.getYOnScreen();
            this.setLocation(x-xMouse,y-yMouse);
        }
    }//GEN-LAST:event_TopbarMouseDragged

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        JOptionPane Op = new JOptionPane();
        int option = Op.showConfirmDialog(null,"Do you want to Logout?","Logout",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch(option){
            case 0:
                Index aIndex = new Index();
                aIndex.setVisible(true);
                this.setVisible(false);
                break;
            case 1:
                Op.setVisible(false);
                break;
        }
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_overviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_overviewMouseClicked
        // TODO add your handling code here:
        layout.show(container, list[0]);
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLUE));
        btn_income.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_expense.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_member.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
    }//GEN-LAST:event_btn_overviewMouseClicked

    private void btn_incomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_incomeMouseClicked
        // TODO add your handling code here:
        layout.show(container, list[1]);
        btn_income.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.RED));
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_expense.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_member.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
    }//GEN-LAST:event_btn_incomeMouseClicked

    private void btn_expenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_expenseMouseClicked
        // TODO add your handling code here:
        layout.show(container, list[2]);
        btn_expense.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.ORANGE));
        btn_income.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_member.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
    }//GEN-LAST:event_btn_expenseMouseClicked

    private void btn_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_memberMouseClicked
        // TODO add your handling code here:
        layout.show(container, list[3]);
        btn_member.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GREEN));
        btn_income.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_overview.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
        btn_expense.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.LIGHT_GRAY));
    }//GEN-LAST:event_btn_memberMouseClicked

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
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Topbar;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_expense;
    private javax.swing.JLabel btn_income;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_max;
    private javax.swing.JLabel btn_member;
    private javax.swing.JLabel btn_min;
    private javax.swing.JLabel btn_overview;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
