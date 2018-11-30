
package vistas;

import java.awt.BorderLayout;



public class PanelControl extends javax.swing.JFrame {


    public PanelControl() {
        initComponents();
        this.setLocationRelativeTo(null);
        irCreaUsuario();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEventoActual = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNameUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbListaUsuario = new javax.swing.JLabel();
        lbCreaUsuario = new javax.swing.JLabel();
        lbCrearEvento = new javax.swing.JLabel();
        lbListaEvento = new javax.swing.JLabel();
        lbAgregarInvitado = new javax.swing.JLabel();
        lbListaInvitado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(226, 224, 224));

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(158, 158, 158));

        btnEventoActual.setBackground(new java.awt.Color(120, 144, 156));
        btnEventoActual.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnEventoActual.setForeground(new java.awt.Color(255, 255, 255));
        btnEventoActual.setText("Evento actual");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        txtNameUser.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txtNameUser.setText("Juan Matos Marte");

        jLabel1.setBackground(new java.awt.Color(66, 66, 66));
        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel1.setText("Cerrar sesión ");

        lbListaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbListaUsuario.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbListaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbListaUsuario.setText("Lista de usuarios ");
        lbListaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaUsuarioMouseClicked(evt);
            }
        });

        lbCreaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbCreaUsuario.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbCreaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbCreaUsuario.setText("Crear usuario");
        lbCreaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreaUsuarioMouseClicked(evt);
            }
        });

        lbCrearEvento.setBackground(new java.awt.Color(255, 255, 255));
        lbCrearEvento.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbCrearEvento.setForeground(new java.awt.Color(255, 255, 255));
        lbCrearEvento.setText("Crear eventos ");
        lbCrearEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearEventoMouseClicked(evt);
            }
        });

        lbListaEvento.setBackground(new java.awt.Color(255, 255, 255));
        lbListaEvento.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbListaEvento.setForeground(new java.awt.Color(255, 255, 255));
        lbListaEvento.setText("Lista de eventos");
        lbListaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaEventoMouseClicked(evt);
            }
        });

        lbAgregarInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarInvitado.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbAgregarInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbAgregarInvitado.setText("Agregar invitados ");
        lbAgregarInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarInvitadoMouseClicked(evt);
            }
        });

        lbListaInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        lbListaInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setText("Lista de invitados ");
        lbListaInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaInvitadoMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Crear Inviación ");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reportes ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtNameUser))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCreaUsuario)
                            .addComponent(lbListaUsuario)
                            .addComponent(lbCrearEvento)
                            .addComponent(lbListaEvento)
                            .addComponent(lbAgregarInvitado)
                            .addComponent(lbListaInvitado)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(txtNameUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCreaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbListaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCrearEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbListaEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAgregarInvitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbListaInvitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCreaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreaUsuarioMouseClicked
        irCreaUsuario();
        
    }//GEN-LAST:event_lbCreaUsuarioMouseClicked

    private void lbListaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaUsuarioMouseClicked
        irListaUsuario();
    }//GEN-LAST:event_lbListaUsuarioMouseClicked

    private void lbCrearEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearEventoMouseClicked
       irCreaEvento();
    }//GEN-LAST:event_lbCrearEventoMouseClicked

    private void lbListaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaEventoMouseClicked
        irListaEvento();
    }//GEN-LAST:event_lbListaEventoMouseClicked

    private void lbAgregarInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarInvitadoMouseClicked
        irAgregarInvitado();
    }//GEN-LAST:event_lbAgregarInvitadoMouseClicked

    private void lbListaInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaInvitadoMouseClicked
       irListaInvitado(); 
    }//GEN-LAST:event_lbListaInvitadoMouseClicked

    /**
     * Para ir al panel de crear usuario; 
     */
    private void irCreaUsuario(){
        IGCrearUsuario crearUsuario = new IGCrearUsuario();
        crearUsuario.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearUsuario, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
     private void irListaInvitado(){
        IGListaInvitado crearUsuario = new  IGListaInvitado ();
        crearUsuario.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearUsuario, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
     private void irAgregarInvitado(){
        IGAgregarInvitado invitado = new IGAgregarInvitado();
        invitado.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(invitado, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
    private void irCreaEvento(){
        IGCrearEvento crearEvento = new IGCrearEvento();
        crearEvento.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearEvento, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
    private void irListaUsuario(){
        IGListaUsuario listaUsuario= new IGListaUsuario ();
        listaUsuario.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(listaUsuario, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
     private void irListaEvento(){
        IGListaEvento listaEvento = new  IGListaEvento();
        listaEvento.setSize(600, 530);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(listaEvento, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
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
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEventoActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregarInvitado;
    private javax.swing.JLabel lbCreaUsuario;
    private javax.swing.JLabel lbCrearEvento;
    private javax.swing.JLabel lbListaEvento;
    private javax.swing.JLabel lbListaInvitado;
    private javax.swing.JLabel lbListaUsuario;
    public static javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel txtNameUser;
    // End of variables declaration//GEN-END:variables
}
