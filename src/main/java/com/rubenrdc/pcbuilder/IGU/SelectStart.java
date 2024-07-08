package com.rubenrdc.pcbuilder.IGU;

import com.rubenrdc.pcbuilder.FrameAdmin;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class SelectStart extends javax.swing.JFrame {

    FrameAdmin frameAdmin = new FrameAdmin(this);

    public SelectStart() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIntel = new javax.swing.JButton();
        btnAmd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empezar Emsamble");

        btnIntel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIntel.setIcon(new ImageIcon("src/main/java/com/rubenrdc/pcbuilder/IGU/miselaneos/IconIntel250.png"));
        btnIntel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntel.setFocusable(false);
        btnIntel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIntel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIntel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntelMouseClicked(evt);
            }
        });

        btnAmd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAmd.setIcon(new ImageIcon("src/main/java/com/rubenrdc/pcbuilder/IGU/miselaneos/IconAmd250.png"));
        btnAmd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmd.setFocusable(false);
        btnAmd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAmd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAmdMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona la familia de procesadores:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIntel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAmd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIntel)
                    .addComponent(btnAmd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntelMouseClicked
        frameAdmin.OpenNewFrame(FrameAdmin.TYPE_MAIN, PCBuilderIGU.TYPE_INTEL);
    }//GEN-LAST:event_btnIntelMouseClicked

    private void btnAmdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmdMouseClicked
        frameAdmin.OpenNewFrame(FrameAdmin.TYPE_MAIN, PCBuilderIGU.TYPE_AMD);
    }//GEN-LAST:event_btnAmdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmd;
    private javax.swing.JButton btnIntel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
