
package vistas;

import com.placeholder.PlaceHolder;
import controlador.CoordInvitacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.VO.EventoVO;
import modelo.VO.InvitadoVO;

public class IGPorteroRegistrarInvitado extends javax.swing.JPanel {

    private CoordInvitacion  coordInvitacion;
    private EventoVO evento;
    private int count = 0;
    private int idInvitado = -1;
    

    public CoordInvitacion getCoordInvitacion() {
        return coordInvitacion;
    }

    public void setCoordInvitacion(CoordInvitacion coordInvitacion) {
        this.coordInvitacion = coordInvitacion;
    }

    public EventoVO getEvento() {
        return evento;
    }

    public void setEvento(EventoVO evento) {
        this.evento = evento;
    }
    
    public IGPorteroRegistrarInvitado() throws SQLException {
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
       
    }
    
  private void listarTabla() throws SQLException{
        ArrayList<InvitadoVO> invitados =  coordInvitacion.listaInvitacionAusente(evento.getId()); ///modificar 
        String cantidad = Integer.toString(invitados.size());
         lbRest.setText(cantidad);
         Object[][] fila = new Object[invitados.size()][6];
         
        for (int i = 0; i < invitados.size(); i++) {
              System.out.println(invitados);
            fila[i][0] = invitados.get(i).getId();
            fila[i][1] = invitados.get(i).getNombre() + " " + invitados.get(i).getApellido();
            fila[i][2] = invitados.get(i).getSexo();
            fila[i][3] = invitados.get(i).getEmail();
            fila[i][4] =invitados.get(i).getTelefono();
            fila[i][5] =invitados.get(i).getStatus();
            
        }
       
        
        Object[] titulo = {"ID", "Nombre y apellido", "Genero", "Email", "Teléfonos", "Estatus"};
        
        DefaultTableModel model = new DefaultTableModel(fila, titulo){
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        tbUsuario.setModel(model);
  
    }
  
    private void registrarInvitacion() throws SQLException{
        /*
         public void modificarStatusInvitacion(EventoVO evento, InvitadoVO invitado, String status) 
        */
        if(idInvitado > 0){
            EventoVO eventoMod = new EventoVO();
            eventoMod.setId(evento.getId()); /// modificar 
            System.out.println(evento.getId());
            InvitadoVO invitadoMod = new InvitadoVO();
            invitadoMod.setId(idInvitado);
            coordInvitacion.modificarStatusInvitacion(eventoMod, invitadoMod,"Presente");
        }else{
            JOptionPane.showMessageDialog(null,"Debe de seleccionar un invitado para eliminarlo","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
    
    
    private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(50);
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

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbRest = new javax.swing.JLabel();
        btnDarEntrada = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(226, 224, 224));

        tbUsuario.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre y apellido ", "Genero", "Email", "Teléfono", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        jPanel5.setBackground(new java.awt.Color(25, 100, 126));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Registrar visitantes ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(373, 373, 373))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel1.setText("Personas restantes");

        lbRest.setBackground(new java.awt.Color(0, 0, 0));
        lbRest.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        lbRest.setText("  ");

        btnDarEntrada.setBackground(new java.awt.Color(79, 175, 80));
        btnDarEntrada.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btnDarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnDarEntrada.setText("Dar entrada");
        btnDarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarEntradaActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(79, 175, 80));
        btnActualizar.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("acttualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRest, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbRest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnDarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
            idInvitado = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0);
            System.out.println((int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0));
            
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void btnDarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarEntradaActionPerformed
        try{
            registrarInvitacion();
        } catch (SQLException ex) {
            Logger.getLogger(IGPorteroRegistrarInvitado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(IGPorteroRegistrarInvitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDarEntradaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         llamadado();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnDarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRest;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
