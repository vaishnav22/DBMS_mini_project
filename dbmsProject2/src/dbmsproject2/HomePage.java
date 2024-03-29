/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproject2;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vaishnav
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        setTitle("Home Page");
      
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel23.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel23.setText("Create Employee");

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel11.setText("Click here to add item");

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel12.setText("Click here to update item");

        jLabel25.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel25.setText("Place Order");

        jLabel15.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("View Item");

        jButton1.setText("orders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/button (7).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1076, 593));

        jPanel1.setLayout(null);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/logout.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel28);
        jLabel28.setBounds(940, 30, 120, 40);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/place.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel27);
        jLabel27.setBounds(570, 490, 160, 40);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/right-arrow (2).png"))); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(210, 210, 70, 50);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/button (16).png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(110, 480, 140, 60);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/delivery-man (1).png"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(900, 140, 130, 140);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/right-arrow (2).png"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(800, 190, 70, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/right-arrow (2).png"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(490, 190, 70, 80);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/trucking.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(620, 180, 150, 100);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/online-shop.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(60, 140, 130, 150);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(210, 200, 0, 50);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/button (6).png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(810, 490, 150, 40);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/button (5).png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(340, 490, 140, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/warehouse.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 140, 130, 140);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ever you want. Add new items to your inventory , delete item from inventory. Your stock your way !");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 430, 920, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("alter you stocks. Our software lets you keep your stocks of your company up to data.  Alter them when ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 390, 960, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setText("We leave you to have full access to what stock you have and alter them. There is no middle person to have ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 350, 990, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Our company lets you have a sequential and systematic way of what you own and what you want to sell");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 310, 960, 40);

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel3.setText("know your stock here ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 80, 230, 44);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 52)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 30, 240, 70);

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbmsproject2/ions/7mMQFRX-gradient-wallpaper.jpg"))); // NOI18N
        jLabel2.setText("Know about your stock here .");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 600);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 20, 260, 120);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(290, 200, 0, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new addItem().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         new eView().setVisible(true);
         
        
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new Update1().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new CreateEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        new placeOrder().setVisible(true);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
