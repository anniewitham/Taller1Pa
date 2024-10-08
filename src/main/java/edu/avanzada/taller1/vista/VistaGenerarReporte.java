package edu.avanzada.taller1.vista;

import edu.avanzada.taller1.control.ControlGenerarReporte;

public class VistaGenerarReporte extends javax.swing.JFrame {

    private ControlGenerarReporte control;

    public VistaGenerarReporte(ControlGenerarReporte aThis) {
        initComponents();
        control = aThis;
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setTitle("Generar un Reporte");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonReporteRemiso = new javax.swing.JButton();
        botonReporteReclutados = new javax.swing.JButton();
        botonReporteAplazado = new javax.swing.JButton();
        botonReporteReservista = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 245, 183));

        botonReporteRemiso.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonReporteRemiso.setForeground(new java.awt.Color(102, 102, 102));
        botonReporteRemiso.setText("Remisos");
        botonReporteRemiso.setBorder(null);

        botonReporteReclutados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonReporteReclutados.setForeground(new java.awt.Color(102, 102, 102));
        botonReporteReclutados.setText("Reclutados");
        botonReporteReclutados.setBorder(null);
        botonReporteReclutados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteReclutadosActionPerformed(evt);
            }
        });

        botonReporteAplazado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonReporteAplazado.setForeground(new java.awt.Color(102, 102, 102));
        botonReporteAplazado.setText("Aplazados");
        botonReporteAplazado.setBorder(null);
        botonReporteAplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteAplazadoActionPerformed(evt);
            }
        });

        botonReporteReservista.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonReporteReservista.setForeground(new java.awt.Color(102, 102, 102));
        botonReporteReservista.setText("Reservistas");
        botonReporteReservista.setBorder(null);
        botonReporteReservista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteReservistaActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Eliga el tipo ");

        botonVolver.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(102, 102, 102));
        botonVolver.setText("Volver");
        botonVolver.setBorder(null);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonReporteReclutados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonReporteReservista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonReporteAplazado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonReporteRemiso, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(86, 86, 86))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(botonReporteReclutados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteReservista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteRemiso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteAplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporteAplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteAplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReporteAplazadoActionPerformed

    private void botonReporteReservistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteReservistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReporteReservistaActionPerformed

    private void botonReporteReclutadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteReclutadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReporteReclutadosActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonReporteAplazado;
    public javax.swing.JButton botonReporteReclutados;
    public javax.swing.JButton botonReporteRemiso;
    public javax.swing.JButton botonReporteReservista;
    public javax.swing.JButton botonSalir;
    public javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
