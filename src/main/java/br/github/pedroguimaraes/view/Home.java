/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.github.pedroguimaraes.view;

import br.github.pedroguimaraes.controller.DriverController;
import br.github.pedroguimaraes.controller.ExamController;
import br.github.pedroguimaraes.controller.SchedulingController;
import br.github.pedroguimaraes.controller.VehicleController;
import br.github.pedroguimaraes.model.Scheduling;
import br.github.pedroguimaraes.helper.HomeClock;
import br.github.pedroguimaraes.model.Driver;
import br.github.pedroguimaraes.model.Exam;
import br.github.pedroguimaraes.model.Patient;
import br.github.pedroguimaraes.model.Vehicle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class Home extends javax.swing.JFrame {

    Home home = this;
    SchedulingController schedulingController = new SchedulingController();
    ExamController examController = new ExamController();
    DriverController driverController = new DriverController();
    VehicleController vehicleController = new VehicleController();

    List<Scheduling> schedules = new ArrayList<Scheduling>();
    List<Exam> exams = new ArrayList<Exam>();
    List<Driver> drivers = new ArrayList<Driver>();

    public Home() {
        initComponents();
        final HomeClock homeClock = new HomeClock();
        this.initSchedulingTable();

        new Thread() {
            public void run() {

                while (true) {
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
        lblName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblScheduling = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
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

        lblHour.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblName.setText("Olá, fulano");

        tblScheduling.setModel(new javax.swing.table.DefaultTableModel(
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
        tblScheduling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSchedulingMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblScheduling);

        btnDetails.setText("Ver detalhes");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover agendamento");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHour)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblName))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHour)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnRemove))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public void setName(String name) {
        this.lblName.setText("Olá, " + name);
    }

    public void initSchedulingTable() {
        this.btnDetails.setVisible(false);
        this.btnRemove.setVisible(false);

        DefaultTableModel model = (DefaultTableModel) this.tblScheduling.getModel();

        this.schedules = this.schedulingController.getSchedules();

        model.setNumRows(0);
        for (Scheduling scheduling : this.schedules) {
            model.addRow(new String[]{
                scheduling.getExam().getName(),
                scheduling.getDriver().getPerson().getName(),
                scheduling.getVehicle().getType(),
                scheduling.getAddress() + ", " + scheduling.getNumber() + ", " + scheduling.getNeighborhood() + " - " + scheduling.getState(),
                new SimpleDateFormat("dd/MM/yyyy").format(scheduling.getScheduleTime())
            });
        }

        this.tblScheduling.setModel(model);
    }
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
        br.github.pedroguimaraes.view.Scheduling schedulingScreen = new br.github.pedroguimaraes.view.Scheduling();
        schedulingScreen.setHomeScreen(this);
        schedulingScreen.setVisible(true);
    }//GEN-LAST:event_menuSchedulingActionPerformed

    private void menuExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExamActionPerformed
        new AddExam().setVisible(true);
    }//GEN-LAST:event_menuExamActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        Scheduling scheduling = this.schedules.get(this.tblScheduling.getSelectedRow());

        if (scheduling != null) {
            PatientDetails patientDetailsScreen = new PatientDetails();
            patientDetailsScreen.setSchedulingData(scheduling);
            patientDetailsScreen.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a linha e clique em 'Ver detalhes'.");
        }

    }//GEN-LAST:event_btnDetailsActionPerformed

    private void tblSchedulingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSchedulingMouseClicked
        this.btnDetails.setVisible(true);
        this.btnRemove.setVisible(true);
    }//GEN-LAST:event_tblSchedulingMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.schedulingController.removeSchedule(this.schedules.get(this.tblScheduling.getSelectedRow()));
        this.initSchedulingTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

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
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnRemove;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblName;
    private javax.swing.JMenuItem menuDriver;
    private javax.swing.JMenuItem menuExam;
    private javax.swing.JMenuItem menuPatient;
    private javax.swing.JMenuItem menuScheduling;
    private javax.swing.JMenuItem menuUser;
    private javax.swing.JMenuItem menuVehicle;
    private javax.swing.JTable tblScheduling;
    // End of variables declaration//GEN-END:variables
}
