
package vistas;

import com.placeholder.PlaceHolder;
import controlador.CoordInvitado;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.VO.InvitadoVO;

public class  IGListaInvitado  extends javax.swing.JPanel {

    private CoordInvitado coordInvitado;
    private int count = 0;
    private int idInvitado;
    
    public void setCoordInvitado(CoordInvitado coordInvitado) {
        this.coordInvitado = coordInvitado;
    }
    public  IGListaInvitado () {
        initComponents();
        personalizarTable();
        llamadado();

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
    
    private void listarTabla(){
        ArrayList<InvitadoVO> invitados = coordInvitado.listaInvitado();
        
        Object[][] fila = new Object[invitados.size()][5];
        for (int i = 0; i <invitados.size(); i++) {
            fila[i][0] = invitados.get(i).getId();
            fila[i][1] = invitados.get(i).getNombre() + " " + invitados.get(i).getApellido();
            fila[i][2] = invitados.get(i).getSexo();
            fila[i][3] = invitados.get(i).getEmail();
            fila[i][4] = invitados.get(i).getTelefono();
        }
        
        Object[] titulo = {"ID", "Nombre y apellido", "Genero", "Email", "Teléfono"};
        
        DefaultTableModel model = new DefaultTableModel(fila, titulo){
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        tbUsuario.setModel(model);
    }
    
     private void modificar(){
         if (idInvitado > 0) {
             IGModInvitado modal = new IGModInvitado(); 
             modal.setVisible(true);
             modal.setInvitado(coordInvitado.verificarInfoInvitado(idInvitado));
         }else{
             JOptionPane.showMessageDialog(null,"Debe de seleccionar un evento para editarlo","Advertencia",JOptionPane.WARNING_MESSAGE);
         }
     }
     
     private void eliminar(){
         if(idInvitado > 0){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminarlo?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                System.out.println(respuesta);
                coordInvitado.eiminarInvitado(idInvitado);
                listarTabla();
                idInvitado = -1;
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un usuario para eliminarlo","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
     }

        private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           listarTabla();
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

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 224));

        jPanel4.setBackground(new java.awt.Color(3, 158, 163));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lista de invitados  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(386, 386, 386))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar.setBackground(new java.awt.Color(244, 67, 54));
        btnEliminar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                "ID", "Nombre", "Apellido", "Tipo", "Usuario"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
       idInvitado = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0);
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       listarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
