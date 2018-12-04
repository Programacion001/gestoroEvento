
package vistas;

import controlador.CoordEvento;
import controlador.CoordTipoEvento;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.Logica.LogicaEvento;
import modelo.Logica.LogicaTipoEvento;
import modelo.VO.EventoVO;
import modelo.VO.TipoEventoVO;


public class IGModEvento extends javax.swing.JFrame {

  private EventoVO evento;
  private CoordEvento coordEvento;
  private LogicaEvento logicaEvento; 
  private LogicaTipoEvento tipoEvento;
  private CoordTipoEvento coordTipoEvento;
  private int count = 0;
  
    public void setEvento(EventoVO evento) {
        this.evento = evento;
    }
    public IGModEvento() {
        initComponents();
        this.setLocationRelativeTo(null);
           coordEvento = new CoordEvento();
           logicaEvento = new LogicaEvento();
           tipoEvento = new LogicaTipoEvento();
           tipoEvento = new LogicaTipoEvento();
           coordTipoEvento = new CoordTipoEvento();
            
           llamadado();
           coordEvento.setLogicaEvento(logicaEvento);
           logicaEvento.setCoordinador(coordEvento);
          tipoEvento.setCoordTipoEvento(coordTipoEvento);
          coordTipoEvento.setLogicaTipoEvento(tipoEvento);
          tipoEvento.setCoordTipoEvento(coordTipoEvento);
           
    }

    private void iniciar(){
        lbNomEvento.setText(evento.getNombre());
        txtNombre.setText(evento.getNombre());
        txtFormatFecha.setText(evento.getFecha().toString());
        txtUbicacion.setText(evento.getUbicacion());
        txtHora.setText(evento.getHora());
        
    }
    
   private void descartarCambio(){
        this.setVisible(false);
        
    }
    private void modificarEvento(){
        System.out.println("");
        String tipoEvento = (String) cbTipoEvento.getSelectedItem();
        if(tipoEvento.compareTo("Sel. tipo de evento") == 0){
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un tipo de evento","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }else{
            
            EventoVO eventoMod = new EventoVO();
            eventoMod .setFecha(java.sql.Date.valueOf(txtFormatFecha.getText()));
            eventoMod .setNombre(txtNombre.getText());
            eventoMod .setHora(txtHora.getText());
            eventoMod .setStatus("Proximamente");
            eventoMod .setIdUsuario(1); //cambiar el id del usuario 
            eventoMod .setTipo(1); // modificar el tipo
            eventoMod .setUbicacion(txtUbicacion.getText());
            eventoMod .setId(evento.getId());
            coordEvento.modificar(eventoMod);
            
            }
    }
    private void datosEvento(){
        String tipoEvento = (String) cbTipoEvento.getSelectedItem();
        if(tipoEvento.compareTo("Sel. tipo de evento") == 0){
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un tipo de evento","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }
        
    }
    
    /// lista todos los evenot en el cbTipoEvento
     private void listaTipoEvento(){
      ArrayList<TipoEventoVO> tiposEvento = new ArrayList<TipoEventoVO>();
      tiposEvento = coordTipoEvento.validarConsultaTipoEvento();
       cbTipoEvento.removeAllItems();
        cbTipoEvento.addItem("Sel. tipo de evento");
        for (int i = 0; i < tiposEvento.size(); i++) {
            TipoEventoVO n = tiposEvento.get(i);
            cbTipoEvento.addItem(n.getTipo());
        }
        
    }
       // formato fecha 
    public class FormatoFecha extends MaskFormatter
    {

        public FormatoFecha() throws ParseException
            {
                super ("####-##-##");
            }
    
    }
    
    public class FormatoHora extends MaskFormatter{
        public FormatoHora() throws ParseException
        {
          super ("##:##:##");
        }
    } 
    
    
    public  Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
    
    
     
       private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(50);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbTipoEvento = new javax.swing.JComboBox<>();
        txtUbicacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnDescartar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        try{
            txtHora = new javax.swing.JFormattedTextField(new FormatoHora());
            txtFormatFecha = new javax.swing.JFormattedTextField(new FormatoFecha());
            jPanel1 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            lbNomEvento = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setUndecorated(true);

            jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            jPanel3.setPreferredSize(new java.awt.Dimension(540, 336));

            jLabel14.setBackground(new java.awt.Color(0, 0, 0));
            jLabel14.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel14.setText("Nombre:");

            txtNombre.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
            txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            cbTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sel. tipo de evento", "Item 2", "Item 3", "Item 4" }));
            cbTipoEvento.setAutoscrolls(true);

            txtUbicacion.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
            txtUbicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel15.setBackground(new java.awt.Color(0, 0, 0));
            jLabel15.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel15.setText("Ubicación:");

            jLabel16.setBackground(new java.awt.Color(0, 0, 0));
            jLabel16.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel16.setText("Fecha:");

            jLabel17.setBackground(new java.awt.Color(0, 0, 0));
            jLabel17.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel17.setText("Hora:");

            btnDescartar.setBackground(new java.awt.Color(244, 67, 54));
            btnDescartar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
            btnDescartar.setForeground(new java.awt.Color(255, 255, 255));
            btnDescartar.setText("Descartar cambios ");
            btnDescartar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDescartarActionPerformed(evt);
                }
            });

            btnModificar.setBackground(new java.awt.Color(76, 175, 80));
            btnModificar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
            btnModificar.setForeground(new java.awt.Color(255, 255, 255));
            btnModificar.setText("Guardar cambios ");
            btnModificar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModificarActionPerformed(evt);
                }
            });

            txtHora.setValue("00:00:00");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        txtHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtHora.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N

        txtFormatFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(cbTipoEvento, 0, 219, Short.MAX_VALUE)
                            .addComponent(txtHora)
                            .addComponent(txtFormatFecha)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnDescartar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cbTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFormatFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Editando el evento: ");

        lbNomEvento.setBackground(new java.awt.Color(255, 255, 255));
        lbNomEvento.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        lbNomEvento.setForeground(new java.awt.Color(187, 182, 182));
        lbNomEvento.setText("Conferencia Huawai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomEvento)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbNomEvento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 400, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        descartarCambio();
        
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       modificarEvento();
    }//GEN-LAST:event_btnModificarActionPerformed
    
    
 
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
            java.util.logging.Logger.getLogger(IGModEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGModEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGModEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGModEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGModEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbTipoEvento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbNomEvento;
    private javax.swing.JFormattedTextField txtFormatFecha;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
