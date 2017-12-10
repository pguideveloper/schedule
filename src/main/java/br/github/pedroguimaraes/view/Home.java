/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.github.pedroguimaraes.view;

import br.github.pedroguimaraes.helper.HomeClock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Home extends javax.swing.JFrame {

    Home home = this;
    
    public Home() {
        initComponents();
        final HomeClock homeClock = new HomeClock();
        
        new Thread() {
            public void run() {
                
                while(true) {
                    home.lblHour.setText(homeClock.getHour());
                }
            }
        }.start();
        
        this.lblDate.setText(homeClock.getDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        lblHour = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuPatient = new javax.swing.JMenuItem();
        menuDriver = new javax.swing.JMenuItem();
        menuVehicle = new javax.swing.JMenuItem();
        menuExam = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuScheduling = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schedule v1.0");
        setResizable(false);

        lblHour.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel3.setText("Olá, fulano");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Exame", "Motorista", "Carro", "Destino", "Data"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMenu1.setText("Cadastrar");

        menuUser.setText("Usuário");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuUser);

        menuPatient.setText("Paciente");
        menuPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPatientActionPerformed(evt);
            }
        });
        jMenu1.add(menuPatient);

        menuDriver.setText("Motorista");
        menuDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDriverActionPerformed(evt);
            }
        });
        jMenu1.add(menuDriver);

        menuVehicle.setText("Veículo");
        menuVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVehicleActionPerformed(evt);
            }
        });
        jMenu1.add(menuVehicle);

        menuExam.setText("Exames");
        menuExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExamActionPerformed(evt);
            }
        });
        jMenu1.add(menuExam);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agendamento");

        menuScheduling.setText("Agendar");
        menuScheduling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSchedulingActionPerformed(evt);
            }
        });
        jMenu2.add(menuScheduling);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 875, Short.MAX_VALUE)
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHour)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHour)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(109, 109, 109)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPatientActionPerformed
        new AddPatient().setVisible(true);
    }//GEN-LAST:event_menuPatientActionPerformed

    private void menuDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDriverActionPerformed
        new AddDriver().setVisible(true);
    }//GEN-LAST:event_menuDriverActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_menuUserActionPerformed

    private void menuVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVehicleActionPerformed
        new AddVehicle().setVisible(true);
    }//GEN-LAST:event_menuVehicleActionPerformed

    private void menuSchedulingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSchedulingActionPerformed
        new Scheduling().setVisible(true);
    }//GEN-LAST:event_menuSchedulingActionPerformed

    private void menuExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExamActionPerformed
        new AddExam().setVisible(true);
    }//GEN-LAST:event_menuExamActionPerformed

    public void setHomeHour(String hour) {
        this.lblHour.setText(hour);
    }

    public void setHomeDate(String date) {
        this.lblDate.setText(date);
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblHour;
    private javax.swing.JMenuItem menuDriver;
    private javax.swing.JMenuItem menuExam;
    private javax.swing.JMenuItem menuPatient;
    private javax.swing.JMenuItem menuScheduling;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JMenuItem menuVehicle;
    // End of variables declaration//GEN-END:variables
}
