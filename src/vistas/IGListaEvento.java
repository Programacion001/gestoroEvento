
package vistas;

import com.placeholder.PlaceHolder;
import controlador.CoordEvento;
import controlador.CoordTipoEvento;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.VO.EventoVO;

public class IGListaEvento extends javax.swing.JPanel {
   
    private CoordEvento  coordEvento;
    private CoordTipoEvento coordTipoEvento;
    private int count = 0;
    private int idEvento;

    public void setCoordTipoEvento(CoordTipoEvento coordTipoEvento) {
        this.coordTipoEvento = coordTipoEvento;
    }
    
    public void setCoordEvento(CoordEvento coordEvento) {
        this.coordEvento = coordEvento;
    }
 
    public IGListaEvento() {
        initComponents();
        personalizarTable();
        llamadado();
        deshabilitarBtn();
       
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(rbEventoFin);
        grupoRadio.add(rbTodoEvento);
        grupoRadio.add(rbEventoProximo);
        btnActualizar.setEnabled(false);
        rbTodoEvento.setSelected(true);
        
        
    }
    
    
    
    private void personalizarTable(){
        JTableHeader Theader = tbUsuario.getTableHeader();
        Color bgHeader = new Color(158,158,158);
        Theader.setBackground(bgHeader); //background
        Theader.setForeground(Color.white); // color de font 
        Theader.setFont(new Font("Open Sans", Font.PLAIN, 17)); //font style size
        tbUsuario.setFont(new Font("Open Sans", Font.PLAIN, 15));
        tbUsuario.setForeground(bgHeader);
        tbUsuario.setRowHeight(30);
       //((DefaultTableCellRenderer)Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }

    private void listarTabla( ArrayList<EventoVO> eventos){
        
        Object[][] fila = new Object[eventos.size()][5];
        for (int i = 0; i < eventos.size(); i++) {
            fila[i][0] = eventos.get(i).getId();
            fila[i][1] = eventos.get(i).getNombre();
            fila[i][2] = eventos.get(i).getTipoEvento();
            fila[i][3] = eventos.get(i).getFecha();
            fila[i][4] = eventos.get(i).getUbicacion();
        }
        
        Object[] titulo = {"ID", "Nombre", "Tipo", "Fecha", "Ubicación"};
        
        DefaultTableModel model = new DefaultTableModel(fila, titulo){
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        tbUsuario.setModel(model);
        
    }
    
    
 
       private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           listarTabla(coordEvento.validarListaEventos());
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
   
    private void habilitarBtn(){
        btnIEliminar.setEnabled(true);
        btnModificar.setEnabled(true); 
        
    } 
    private void deshabilitarBtn(){
        btnIEliminar.setEnabled(false);
        btnModificar.setEnabled(false); 
    } 
    
    
        
    private void eliminarEvento(){
        
        if(idEvento > 0){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminarlo?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                System.out.println(respuesta);
                coordEvento.eliminarEvento(idEvento);
                listarTabla(coordEvento.validarListaEventosFiltrado("Proximamente"));
                idEvento = -1;
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Debe de selecionar un evento para eliminarlo","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
       
    }
    private void modificar(){
        
        if( idEvento > 0){
            IGModEvento modal = new IGModEvento(); 
            modal.setVisible(true);
            System.out.println("desde la interfaz ");
            modal.setEvento(coordEvento.validarInfoEvento(idEvento));
        }else{
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un evento para editarlo","Advertencia",JOptionPane.WARNING_MESSAGE);    
        }
        
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rbEventoFin = new javax.swing.JRadioButton();
        rbTodoEvento = new javax.swing.JRadioButton();
        rbEventoProximo = new javax.swing.JRadioButton();
        btnIEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 224));

        jPanel4.setBackground(new java.awt.Color(3, 158, 163));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lista de eventos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(389, 389, 389)
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

        rbEventoFin.setBackground(new java.awt.Color(226, 224, 224));
        rbEventoFin.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbEventoFin.setText("Eventos finalizados  ");
        rbEventoFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEventoFinActionPerformed(evt);
            }
        });

        rbTodoEvento.setBackground(new java.awt.Color(226, 224, 224));
        rbTodoEvento.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbTodoEvento.setText("Todos los eventos");
        rbTodoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodoEventoActionPerformed(evt);
            }
        });

        rbEventoProximo.setBackground(new java.awt.Color(226, 224, 224));
        rbEventoProximo.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbEventoProximo.setText("Eventos próximos");
        rbEventoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEventoProximoActionPerformed(evt);
            }
        });

        btnIEliminar.setBackground(new java.awt.Color(244, 67, 54));
        btnIEliminar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnIEliminar.setText("Eliminar");
        btnIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(79, 175, 80));
        btnModificar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tbUsuario.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Fecha", "Ubicación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        btnActualizar.setBackground(new java.awt.Color(79, 175, 80));
        btnActualizar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar tabla ");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(rbTodoEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEventoFin)
                .addGap(135, 135, 135)
                .addComponent(rbEventoProximo)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(691, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodoEvento)
                    .addComponent(rbEventoFin)
                    .addComponent(rbEventoProximo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
         idEvento = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0);
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void rbTodoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodoEventoActionPerformed
        listarTabla(coordEvento.validarListaEventos());
        deshabilitarBtn();
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_rbTodoEventoActionPerformed

    private void rbEventoFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEventoFinActionPerformed
       listarTabla(coordEvento.validarListaEventosFiltrado("Finalizado"));
       deshabilitarBtn();
       btnActualizar.setEnabled(false);
    }//GEN-LAST:event_rbEventoFinActionPerformed

    private void rbEventoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEventoProximoActionPerformed
        listarTabla(coordEvento.validarListaEventosFiltrado("Proximamente"));
        habilitarBtn();
        btnActualizar.setEnabled(true);
    }//GEN-LAST:event_rbEventoProximoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        listarTabla(coordEvento.validarListaEventosFiltrado("Proximamente"));
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIEliminarActionPerformed
        eliminarEvento();
    }//GEN-LAST:event_btnIEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnIEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEventoFin;
    private javax.swing.JRadioButton rbEventoProximo;
    private javax.swing.JRadioButton rbTodoEvento;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
