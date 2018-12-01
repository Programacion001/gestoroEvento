
package vistas;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class  IGListaInvitado  extends javax.swing.JPanel {

 
    public  IGListaInvitado () {
        initComponents();
        PlaceHolder holder;
        personalizarTable();
        listarTabla();
        holder = new PlaceHolder(txtBuscarUsuario, "Buscar invitado por nombre y apellido ");
       
      
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
        
        Object[][] fila = new Object[4][5];
        fila[0][0] = 7;
        fila[0][1] = "Ronald Castillo";
        fila[0][2] = "M";
        fila[0][3] = "ronaldcastillo789@gmail.com";
        fila[0][4] = "854-854-957";
        Object[] titulo = {"ID", "Nombre y apellido", "Genero", "Email", "Teléfono"};
        
        DefaultTableModel model = new DefaultTableModel(fila, titulo){
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        tbUsuario.setModel(model);
        

    }
    

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnIngresar2 = new javax.swing.JButton();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();

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

        btnIngresar2.setBackground(new java.awt.Color(244, 67, 54));
        btnIngresar2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setText("Eliminar");

        txtBuscarUsuario.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtBuscarUsuario.setBorder(null);
        txtBuscarUsuario.setPreferredSize(new java.awt.Dimension(0, 50));
        txtBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        System.out.println(tbUsuario.getSelectedRow());
        System.out.println(tbUsuario.getValueAt(0, 2) ); 
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        IGModInvitado modal = new IGModInvitado(); 
        modal.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtBuscarUsuario;
    // End of variables declaration//GEN-END:variables
}
