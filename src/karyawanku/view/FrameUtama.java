/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karyawanku.view;

import java.util.HashMap;
import javax.swing.JFrame;
import karyawanku.DB.Karyawan;

/**
 *
 * @author muhammadarya
 */
public class FrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTotalLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelHR = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHR = new javax.swing.JLabel();
        panelKeuangan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblKeuangan = new javax.swing.JLabel();
        panelPemasaran = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPemasaran = new javax.swing.JLabel();
        panelIT = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblIT = new javax.swing.JLabel();
        panelIT1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotalKaryawan = new javax.swing.JLabel();
        btnMasterData = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Utama");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(77, 161, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Divisi Human Resource");
        panelHR.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setText("Karyawan");
        panelHR.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblHR.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblHR.setText("0");
        panelHR.add(lblHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jPanel1.add(panelHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 290, 100));

        panelKeuangan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Divisi Keuangan");
        panelKeuangan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Karyawan");
        panelKeuangan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblKeuangan.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblKeuangan.setText("0");
        panelKeuangan.add(lblKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jPanel1.add(panelKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 290, 100));

        panelPemasaran.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Divisi Pemasaran");
        panelPemasaran.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Karyawan");
        panelPemasaran.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblPemasaran.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblPemasaran.setText("0");
        panelPemasaran.add(lblPemasaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jPanel1.add(panelPemasaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 290, 100));

        panelIT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Divisi IT");
        panelIT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setText("Karyawan");
        panelIT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblIT.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblIT.setText("0");
        panelIT.add(lblIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jPanel1.add(panelIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 290, 100));

        panelIT1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Total Semua Divisi");
        panelIT1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel13.setText("Karyawan");
        panelIT1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblTotalKaryawan.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTotalKaryawan.setText("0");
        panelIT1.add(lblTotalKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jPanel1.add(panelIT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 650, 100));

        btnMasterData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnMasterData.setText("Master Data Karyawan");
        btnMasterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasterData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 290, 40));

        btnRegister.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegister.setText("Register Admin");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 40));

        btnExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        JFrame fRegis = new FrameRegister();
        fRegis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fRegis.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrameLogin().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMasterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterDataActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrameDataKaryawan().setVisible(true);
    }//GEN-LAST:event_btnMasterDataActionPerformed

    private void setTotalLabel() {
        HashMap<String, Integer> data = Karyawan.getTotalDivisi();
        int totalDivisiIT = data.get("IT") != null ? data.get("IT") : 0;
        int totalDivisiHR = data.get("Human Resource") != null ? data.get("Human Resource") : 0;
        int totalDivisiPemasaran = data.get("Pemasaran") != null ? data.get("Pemasaran") : 0;
        int totalDivisiKeuangan = data.get("Keuangan") != null ? data.get("Keuangan") : 0;
        int totalKaryawan = Karyawan.getTotalKaryawan();
//        System.out.println("data: " + data);
        lblIT.setText("" + totalDivisiIT);
        lblHR.setText("" + totalDivisiHR);
        lblPemasaran.setText("" + totalDivisiPemasaran);
        lblKeuangan.setText("" + totalDivisiKeuangan);
        lblTotalKaryawan.setText("" + totalKaryawan);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMasterData;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHR;
    private javax.swing.JLabel lblIT;
    private javax.swing.JLabel lblKeuangan;
    private javax.swing.JLabel lblPemasaran;
    private javax.swing.JLabel lblTotalKaryawan;
    private javax.swing.JPanel panelHR;
    private javax.swing.JPanel panelIT;
    private javax.swing.JPanel panelIT1;
    private javax.swing.JPanel panelKeuangan;
    private javax.swing.JPanel panelPemasaran;
    // End of variables declaration//GEN-END:variables
}
