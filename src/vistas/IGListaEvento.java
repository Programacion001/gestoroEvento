
package vistas;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class IGListaEvento extends javax.swing.JPanel {

 
    public IGListaEvento() {
        initComponents();
        PlaceHolder holder;
        personalizarTable();
        listarTabla();
        holder = new PlaceHolder(txtBuscarUsuario, " Buscar evento");
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(rbEventoFin);
        grupoRadio.add(rbTodoEvento);
        grupoRadio.add(rbEventoProximo);
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
    
    private void listarTabla(){
        
        Object[][] fila = new Object[4][5];
        fila[0][0] = 7;
        fila[0][1] = "Conferencia Huawei";
        fila[0][2] = "Tecnologia";
        fila[0][3] = "8/11/2018";
        fila[0][4] = "Las colonias";
        Object[] titulo = {"ID", "Nombre", "Tipo", "Fecha", "Ubicación"};
        
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
        txtBuscarUsuario = new javax.swing.JTextField();
        rbEventoFin = new javax.swing.JRadioButton();
        rbTodoEvento = new javax.swing.JRadioButton();
        rbEventoProximo = new javax.swing.JRadioButton();
        btnIngresar2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();

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

        txtBuscarUsuario.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtBuscarUsuario.setBorder(null);
        txtBuscarUsuario.setPreferredSize(null);
        txtBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActionPerformed(evt);
            }
        });

        rbEventoFin.setBackground(new java.awt.Color(226, 224, 224));
        rbEventoFin.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbEventoFin.setText("Eventos finalizados  ");

        rbTodoEvento.setBackground(new java.awt.Color(226, 224, 224));
        rbTodoEvento.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbTodoEvento.setText("Todos los eventos");

        rbEventoProximo.setBackground(new java.awt.Color(226, 224, 224));
        rbEventoProximo.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbEventoProximo.setText("Eventos próximos");

        btnIngresar2.setBackground(new java.awt.Color(244, 67, 54));
        btnIngresar2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIngresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar2.setText("Eliminar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(rbTodoEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbEventoFin)
                .addGap(135, 135, 135)
                .addComponent(rbEventoProximo)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodoEvento)
                    .addComponent(rbEventoFin)
                    .addComponent(rbEventoProximo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        IGModEvento modal = new IGModEvento(); 
        modal.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        System.out.println(tbUsuario.getSelectedRow());
        System.out.println(tbUsuario.getValueAt(0, 2) );
    }//GEN-LAST:event_tbUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEventoFin;
    private javax.swing.JRadioButton rbEventoProximo;
    private javax.swing.JRadioButton rbTodoEvento;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtBuscarUsuario;
    // End of variables declaration//GEN-END:variables
}
