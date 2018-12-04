
package vistas;

import controlador.CoordEvento;
import controlador.CoordTipoEvento;

import static java.lang.Thread.sleep;
import java.text.ParseException;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.VO.EventoVO;
import modelo.VO.TipoEventoVO;

public class IGCrearEvento extends javax.swing.JPanel {

    private CoordTipoEvento coordTipoEvento; 
    private CoordEvento  coordEvento;
    private int count = 0;
    
    public void setCoordEvento(CoordEvento coordEvento) {
        this.coordEvento = coordEvento;
    }
   
    
    public void setCoordTipoEvento(CoordTipoEvento coordTipoEvento) {
        this.coordTipoEvento = coordTipoEvento;
    }
    public IGCrearEvento() {
        initComponents();
        llamadado();
    
         
    }
    
    private void agregarEvento(){
        String tipoEvento = (String) cbTipoEvento.getSelectedItem();
        if(tipoEvento.compareTo("Sel. tipo de evento") == 0){
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un tipo de evento","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }else{
            int eventoTipo = coordTipoEvento.BusquedaTipoEvento(tipoEvento);
            System.out.println(eventoTipo);
            EventoVO evento = new EventoVO();
            evento.setFecha(Date.valueOf(txtFormatFecha.getText()));
            evento.setNombre(txtNombre.getText());
            evento.setHora(txtHora.getText());
            evento.setStatus("Proximamente");
            evento.setIdUsuario(1); //cambiar el id del usuario 
            evento.setTipo(eventoTipo);
            evento.setUbicacion(txtUbicacion.getText());
            coordEvento.AgregarEvento(evento);
            
            }

    }
    
    private void agregarTipoEvento(){
        coordTipoEvento.validarAgregarTipoEvento(txtTipoEvento.getText());
        txtTipoEvento.setText("");
        listaTipoEvento();
       
    }
    
    private void limpiarCampo(){
        txtNombre.setText("");
        txtHora.setText("00:00:00");
        txtFormatFecha.setText("");
        txtUbicacion.setText("");
    }
    
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
            
     
    private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(1000);
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
      
   // formato fecha 
    
    public class FormatoHora extends MaskFormatter{
        public FormatoHora() throws ParseException
        {
          super ("##:##:##");
        }
    } 
    
    
    public class FormatoFecha extends MaskFormatter{
        public FormatoFecha() throws ParseException
        {
          super ("####-##-##");
        }
    } 
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlInput1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtTipoEvento = new javax.swing.JTextField();
        btnAddEvento = new javax.swing.JButton();
        pnlInput = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        cbTipoEvento = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCrearEvento = new javax.swing.JButton();
        try{
            txtHora = new javax.swing.JFormattedTextField(new FormatoHora());
            txtFormatFecha = new javax.swing.JFormattedTextField(new FormatoFecha());

            setBackground(new java.awt.Color(226, 224, 224));

            jPanel5.setBackground(new java.awt.Color(3, 158, 163));

            jLabel19.setBackground(new java.awt.Color(255, 255, 255));
            jLabel19.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
            jLabel19.setForeground(new java.awt.Color(255, 255, 255));
            jLabel19.setText("Crear evento");

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(415, 415, 415)
                    .addComponent(jLabel19)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addContainerGap())
            );

            jLabel12.setBackground(new java.awt.Color(0, 0, 0));
            jLabel12.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
            jLabel12.setText("si el tipo de evento no esta registrado, puede añadirlo en este apartado.");

            jLabel20.setBackground(new java.awt.Color(0, 0, 0));
            jLabel20.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel20.setText("Nota:");

            pnlInput1.setBackground(new java.awt.Color(226, 224, 224));
            pnlInput1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel18.setBackground(new java.awt.Color(0, 0, 0));
            jLabel18.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel18.setText("Tipo:");

            txtTipoEvento.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
            txtTipoEvento.setBorder(null);

            btnAddEvento.setBackground(new java.awt.Color(89, 163, 228));
            btnAddEvento.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
            btnAddEvento.setForeground(new java.awt.Color(255, 255, 255));
            btnAddEvento.setText("Añadir");
            btnAddEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddEventoActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout pnlInput1Layout = new javax.swing.GroupLayout(pnlInput1);
            pnlInput1.setLayout(pnlInput1Layout);
            pnlInput1Layout.setHorizontalGroup(
                pnlInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlInput1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                    .addComponent(btnAddEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81))
            );
            pnlInput1Layout.setVerticalGroup(
                pnlInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlInput1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(16, Short.MAX_VALUE))
            );

            pnlInput.setBackground(new java.awt.Color(226, 224, 224));
            pnlInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pnlInput.setPreferredSize(new java.awt.Dimension(540, 336));

            jLabel14.setBackground(new java.awt.Color(0, 0, 0));
            jLabel14.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel14.setText("Nombre:");

            txtUbicacion.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
            txtUbicacion.setBorder(null);

            cbTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sel. tipo de evento"}));
            cbTipoEvento.setAutoscrolls(true);

            jLabel15.setBackground(new java.awt.Color(0, 0, 0));
            jLabel15.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel15.setText("Ubicación:");

            jLabel16.setBackground(new java.awt.Color(0, 0, 0));
            jLabel16.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel16.setText("Fecha:");

            jLabel17.setBackground(new java.awt.Color(0, 0, 0));
            jLabel17.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
            jLabel17.setText("Hora:");

            txtNombre.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
            txtNombre.setBorder(null);

            btnLimpiar.setBackground(new java.awt.Color(244, 67, 54));
            btnLimpiar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
            btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
            btnLimpiar.setText("Limpiar campos ");
            btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLimpiarActionPerformed(evt);
                }
            });

            btnCrearEvento.setBackground(new java.awt.Color(89, 163, 228));
            btnCrearEvento.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
            btnCrearEvento.setForeground(new java.awt.Color(255, 255, 255));
            btnCrearEvento.setText("Crear evento ");
            btnCrearEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCrearEventoActionPerformed(evt);
                }
            });

            txtHora.setValue("00:00:00");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        txtHora.setBorder(null);
        txtHora.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N

        txtFormatFecha.setBorder(null);

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(cbTipoEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtHora)
                    .addComponent(txtFormatFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(138, 138, 138))
                        .addComponent(txtUbicacion))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearEvento)
                .addGap(123, 123, 123)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cbTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormatFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(pnlInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

 
    private void btnAddEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventoActionPerformed
        //System.out.println(coordTipoEvento.BusquedaTipoEvento((String) cbTipoEvento.getSelectedItem()));
        agregarTipoEvento();
        listaTipoEvento();
       
    }//GEN-LAST:event_btnAddEventoActionPerformed

    private void btnCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEventoActionPerformed
        agregarEvento();
        limpiarCampo();
    }//GEN-LAST:event_btnCrearEventoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarCampo();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEvento;
    private javax.swing.JButton btnCrearEvento;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbTipoEvento;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JPanel pnlInput1;
    private javax.swing.JFormattedTextField txtFormatFecha;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipoEvento;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
