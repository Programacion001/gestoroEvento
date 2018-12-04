
package vistas;

import controlador.CoordTipoUsuario;
import controlador.CoordUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Logica.LogicaTipoUsuario;
import modelo.Logica.LogicaUsuario;
import modelo.VO.TipoUsuarioVO;
import modelo.VO.UsuarioVO;


public class IGModUsuario extends javax.swing.JFrame {
    
    private UsuarioVO usuario;
    private CoordUsuario coordUsuario;
    private LogicaUsuario logicarUsuario;
    private CoordTipoUsuario coordTipoUsuario;
    private LogicaTipoUsuario logicaTipoUsuario;
    private int count = 0;
    
    public IGModUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
          usuario = new UsuarioVO();
          coordUsuario = new CoordUsuario();
          logicarUsuario = new LogicaUsuario();
          coordTipoUsuario = new CoordTipoUsuario();
          logicaTipoUsuario = new LogicaTipoUsuario();
          llamadado();
           
          coordUsuario.setLogicaUsuario(logicarUsuario);
          logicarUsuario.setCoordUsuario(coordUsuario);
          coordTipoUsuario.setLogicaTipoUsuario(logicaTipoUsuario);
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }
    
    private void iniciar(){
        System.out.println("Hola" + usuario.getNombre() );
        lbNombre.setText(usuario.getNombre() + " " + usuario.getApellido());
        passFirst.setText(usuario.getPassword());
        passSecond.setText(usuario.getPassword());
        txtApellido.setText(usuario.getApellido());
        txtNombre.setText(usuario.getNombre());
        txtUsuario.setText(usuario.getNomUser());
    }
     private void listaTipoEvento(){
         ArrayList<TipoUsuarioVO> tiposUsuario = new ArrayList<TipoUsuarioVO>();
         tiposUsuario = coordTipoUsuario.validarConsultaTipoEvento();
          cbTipoUsuario.removeAllItems();
          cbTipoUsuario.addItem("Sel. tipo de usuario");
         for (int i = 0; i < tiposUsuario.size(); i++) {
             TipoUsuarioVO n = tiposUsuario.get(i);
              cbTipoUsuario.addItem(n.getTipo());
         }
     }
    
    private void modificarUsuario()
    {   String tipoUsuario = (String) cbTipoUsuario.getSelectedItem();
        if(tipoUsuario.compareTo("Sel. tipo de usuario") == 0){
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un tipo de evento","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }else{
            int usuarioTipo = coordTipoUsuario.BusquedaTipoUsuario(tipoUsuario);
            String passUno = new String(passFirst.getPassword());
            String passDos = new String(passSecond.getPassword());
            if (passUno.compareTo(passDos) == 0) {
                UsuarioVO usuarioMod = new UsuarioVO();
                usuarioMod.setNombre(txtNombre.getText());
                usuarioMod .setApellido(txtApellido.getText());
                usuarioMod .setIntTipoUsuario(usuarioTipo);
                usuarioMod .setNomUser(txtUsuario.getText());
                usuarioMod .setPassword(passDos);
                usuarioMod .setId(usuario.getId());
                coordUsuario.modificarUsuario(usuarioMod);
            }else{
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","Advertencia",JOptionPane.WARNING_MESSAGE); 
            }
            
        }
    }
    
    /*
     private void modificarEvento(){
       
        String tipoEvento = (String) cbTipoEvento.getSelectedItem();
        if(tipoEvento.compareTo("Sel. tipo de evento") == 0){
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un tipo de evento","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }else{
            int eventoTipo = coordTipoEvento.BusquedaTipoEvento(tipoEvento);
            EventoVO eventoMod = new EventoVO();
            eventoMod .setFecha(java.sql.Date.valueOf(txtFormatFecha.getText()));
            eventoMod .setNombre(txtNombre.getText());
            eventoMod .setHora(txtHora.getText());
            eventoMod .setStatus("Proximamente");
            eventoMod .setIdUsuario(1); //cambiar el id del usuario 
            eventoMod .setTipo(eventoTipo); // modificar el tipo
            eventoMod .setUbicacion(txtUbicacion.getText());
            eventoMod .setId(evento.getId());
            coordEvento.modificar(eventoMod);
            
            }
        }
    */
    
    private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           iniciar();
                           listaTipoEvento();
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
    
    private void descartarCambio(){
        this.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        txtUsuario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        passFirst = new javax.swing.JPasswordField();
        passSecond = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        btnDescartar = new javax.swing.JButton();
        btnGuadarCambios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(540, 336));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel14.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Sel. tipo de usuario"}));
        cbTipoUsuario.setAutoscrolls(true);

        txtUsuario.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel15.setText("Usuario:");

        txtApellido.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel16.setText("Apellido:");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel17.setText("Contraseña:");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel18.setText("Confimar contraseña:");

        btnDescartar.setBackground(new java.awt.Color(244, 67, 54));
        btnDescartar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnDescartar.setForeground(new java.awt.Color(255, 255, 255));
        btnDescartar.setText("Descartar cambios ");
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });

        btnGuadarCambios.setBackground(new java.awt.Color(76, 175, 80));
        btnGuadarCambios.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnGuadarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuadarCambios.setText("Guardar cambios ");
        btnGuadarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuadarCambiosActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(97, 97, 97));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Editando el usuario: ");

        lbNombre.setBackground(new java.awt.Color(255, 255, 255));
        lbNombre.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(187, 182, 182));
        lbNombre.setText("    ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbNombre))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txtApellido)
                    .addComponent(cbTipoUsuario, 0, 219, Short.MAX_VALUE)
                    .addComponent(passFirst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(passSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuadarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnDescartar)
                .addGap(128, 128, 128))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuadarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        descartarCambio();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnGuadarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuadarCambiosActionPerformed
        modificarUsuario();
    }//GEN-LAST:event_btnGuadarCambiosActionPerformed

 
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
            java.util.logging.Logger.getLogger(IGModUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGModUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGModUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGModUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGModUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnGuadarCambios;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPasswordField passFirst;
    private javax.swing.JPasswordField passSecond;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
