
package vistas;

import java.awt.BorderLayout;
import vistas.reportePanel.pnlDiaMasVisitado;
import vistas.reportePanel.pnlEventoVisitado;
import vistas.reportePanel.pnlInvitadoEvento;




public class IGReporte extends javax.swing.JPanel {

 
    public IGReporte() {
        initComponents();
        irPersonasEventos();
      
    }
    
   
    

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbPersonasEventos = new javax.swing.JLabel();
        lbDiaAsistencia = new javax.swing.JLabel();
        lbCrearInvitacion2 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();

        setBackground(new java.awt.Color(226, 224, 224));

        jPanel4.setBackground(new java.awt.Color(3, 158, 163));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reportes ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(226, 224, 224));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(97, 97, 97));

        lbPersonasEventos.setBackground(new java.awt.Color(255, 255, 255));
        lbPersonasEventos.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lbPersonasEventos.setForeground(new java.awt.Color(255, 255, 255));
        lbPersonasEventos.setText("Invitados por eventos ");
        lbPersonasEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPersonasEventosMouseClicked(evt);
            }
        });

        lbDiaAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        lbDiaAsistencia.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lbDiaAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        lbDiaAsistencia.setText("Día de mayor asistencia ");
        lbDiaAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDiaAsistenciaMouseClicked(evt);
            }
        });

        lbCrearInvitacion2.setBackground(new java.awt.Color(255, 255, 255));
        lbCrearInvitacion2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        lbCrearInvitacion2.setForeground(new java.awt.Color(255, 255, 255));
        lbCrearInvitacion2.setText("Eventos más visitado ");
        lbCrearInvitacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearInvitacion2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbPersonasEventos)
                .addGap(116, 116, 116)
                .addComponent(lbDiaAsistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCrearInvitacion2)
                .addGap(81, 81, 81))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiaAsistencia)
                    .addComponent(lbCrearInvitacion2)
                    .addComponent(lbPersonasEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbPersonasEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPersonasEventosMouseClicked
        irPersonasEventos();
    }//GEN-LAST:event_lbPersonasEventosMouseClicked

    private void lbDiaAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDiaAsistenciaMouseClicked
        irEventoVisita();
    }//GEN-LAST:event_lbDiaAsistenciaMouseClicked

    private void lbCrearInvitacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearInvitacion2MouseClicked
        irDiaMayorAsistencia();
    }//GEN-LAST:event_lbCrearInvitacion2MouseClicked

    
    private void irDiaMayorAsistencia(){
        pnlDiaMasVisitado diaMasVisitado = new pnlDiaMasVisitado();
        diaMasVisitado.setSize(893, 498);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(diaMasVisitado, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
    private void irEventoVisita(){
        pnlInvitadoEvento invitadoEvento = new pnlInvitadoEvento();
        invitadoEvento.setSize(893, 498);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(invitadoEvento, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
    private void irPersonasEventos(){
        pnlEventoVisitado eventoVisita= new pnlEventoVisitado();
        eventoVisita.setSize(893, 498);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(eventoVisita, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCrearInvitacion2;
    private javax.swing.JLabel lbDiaAsistencia;
    private javax.swing.JLabel lbPersonasEventos;
    public static javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
