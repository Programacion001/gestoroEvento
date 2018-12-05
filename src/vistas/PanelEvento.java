
package vistas;

import controlador.CoordEvento;
import controlador.CoordInvitacion;
import java.awt.BorderLayout;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Logica.LogicaEvento;
import modelo.Logica.LogicaInvitacion;
import modelo.VO.EventoVO;
import modelo.VO.UsuarioVO;



public class PanelEvento extends javax.swing.JFrame {


    
    private int idEvento; 
    private UsuarioVO usuarioActivo;
    private CoordEvento coordEvento;
    private LogicaEvento logicaEvento;
    private EventoVO evento;
    
    private CoordInvitacion coordInvitacion;
    private LogicaInvitacion logicaInvitacion;
    
    private int count = 0;
    
    public PanelEvento() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        coordEvento = new CoordEvento();
        logicaEvento = new LogicaEvento();
        coordInvitacion = new CoordInvitacion();
        logicaInvitacion = new LogicaInvitacion();
        coordEvento.setLogicaEvento(logicaEvento);
        logicaEvento.setCoordinador(coordEvento);
        
        llamadado();
    }
    
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public UsuarioVO getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(UsuarioVO usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
    
    private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           irRegistraInvitado();
                           iniciar();
                           
                        } catch (Exception e) {

                        }
                    }else{
                        break;
                    }
                  count++;
                }
            }
        };
       hilo.start();
    }
    
    public void inalizarEntrada() throws SQLException{
       coordEvento.modificarEstatusEvento(22, "Finalizado"); /// arraglar 
       IGLIstaEventoActuales eventoActuales = new IGLIstaEventoActuales();
       eventoActuales.setVisible(true);
       eventoActuales.setUsuarioActivo(usuarioActivo);
       this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbNomEvento = new javax.swing.JLabel();
        btnEventoFinalizado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEventoActual = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNameUser = new javax.swing.JLabel();
        lbCerrarSesion = new javax.swing.JLabel();
        lbListaInvitado = new javax.swing.JLabel();
        lbRegistrarInvitado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(226, 224, 224));

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Evento:");

        lbNomEvento.setBackground(new java.awt.Color(0, 0, 0));
        lbNomEvento.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        lbNomEvento.setForeground(new java.awt.Color(187, 182, 182));
        lbNomEvento.setText("Conferencia de Huawei ");

        btnEventoFinalizado.setBackground(new java.awt.Color(79, 175, 80));
        btnEventoFinalizado.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btnEventoFinalizado.setForeground(new java.awt.Color(255, 255, 255));
        btnEventoFinalizado.setText("Terminar registro del evento  ");
        btnEventoFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventoFinalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNomEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(btnEventoFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addComponent(lbNomEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEventoFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(158, 158, 158));

        btnEventoActual.setBackground(new java.awt.Color(120, 144, 156));
        btnEventoActual.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btnEventoActual.setForeground(new java.awt.Color(255, 255, 255));
        btnEventoActual.setText("Evento actual");
        btnEventoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventoActualActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        txtNameUser.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        txtNameUser.setText("Juan Matos Marte");

        lbCerrarSesion.setBackground(new java.awt.Color(66, 66, 66));
        lbCerrarSesion.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbCerrarSesion.setText("Cerrar sesión ");
        lbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseClicked(evt);
            }
        });

        lbListaInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbListaInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setText("Listado de invitados ");
        lbListaInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaInvitadoMouseClicked(evt);
            }
        });

        lbRegistrarInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbRegistrarInvitado.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbRegistrarInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbRegistrarInvitado.setText("Registrar Invitados ");
        lbRegistrarInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegistrarInvitadoMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRegistrarInvitado)
                            .addComponent(lbListaInvitado)
                            .addComponent(lbCerrarSesion)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameUser)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRegistrarInvitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbListaInvitado)
                .addGap(281, 281, 281)
                .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbRegistrarInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegistrarInvitadoMouseClicked
        irRegistraInvitado();        
    }//GEN-LAST:event_lbRegistrarInvitadoMouseClicked

    private void lbListaInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaInvitadoMouseClicked
        irListaInvitado();
        
    }//GEN-LAST:event_lbListaInvitadoMouseClicked

    private void btnEventoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventoActualActionPerformed
        irEventoActuales();
    }//GEN-LAST:event_btnEventoActualActionPerformed

    private void lbCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseClicked
        cerrarSesion();
    }//GEN-LAST:event_lbCerrarSesionMouseClicked

    private void btnEventoFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventoFinalizadoActionPerformed
        try {
            inalizarEntrada();
        } catch (SQLException ex) {
            Logger.getLogger(PanelEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEventoFinalizadoActionPerformed

    
    private void iniciar(){
        
        evento = coordEvento.validarInfoEvento(idEvento);
        lbNomEvento.setText(evento.getNombre());
        txtNameUser.setText(usuarioActivo.getNombre() + " " + usuarioActivo.getApellido());
    }
    
    private void cerrarSesion(){
       System.exit(0);
    }
    
    private void irEventoActuales(){
       IGLIstaEventoActuales eventoActuales = new IGLIstaEventoActuales();
       eventoActuales.setVisible(true);
       eventoActuales.setUsuarioActivo(usuarioActivo);
       this.setVisible(false);
   }

   
    private void irListaInvitado(){
        IGPorteroListaInvitado listaInvitado = new  IGPorteroListaInvitado();
        
        coordInvitacion.setLogicaInv(logicaInvitacion);
        listaInvitado.setCoordInvitacion(coordInvitacion);
        listaInvitado.setEvento(evento);
        
        listaInvitado.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(listaInvitado, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
   
    
    private void irRegistraInvitado(){
        IGPorteroRegistrarInvitado registrarInvitado = new  IGPorteroRegistrarInvitado();
        
        registrarInvitado.setCoordInvitacion(coordInvitacion);
        coordInvitacion.setLogicaInv(logicaInvitacion);
       
        
        registrarInvitado.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(registrarInvitado, BorderLayout.CENTER);
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
            java.util.logging.Logger.getLogger(PanelEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEventoActual;
    private javax.swing.JButton btnEventoFinalizado;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCerrarSesion;
    private javax.swing.JLabel lbListaInvitado;
    private javax.swing.JLabel lbNomEvento;
    private javax.swing.JLabel lbRegistrarInvitado;
    public static javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel txtNameUser;
    // End of variables declaration//GEN-END:variables
}
