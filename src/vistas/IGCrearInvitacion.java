
package vistas;

import com.placeholder.PlaceHolder;
import controlador.CoordEvento;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import controlador.CoordInvitacion;
import controlador.CoordInvitado;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.VO.EventoVO;
import modelo.VO.InvitadoVO;

public class IGCrearInvitacion extends javax.swing.JPanel {
    
    private CoordInvitacion coordinadorInvitacion; 
    private CoordInvitado coordInvitado;
    private CoordEvento coordEvento;
    private int count = 0;
    private int idInvitado = -1;
    public void setCoordinadorInvitacion(CoordInvitacion coordinadorInvitacion) {
        this.coordinadorInvitacion = coordinadorInvitacion;
    }

    public void setCoordInvitado(CoordInvitado coordInvitado) {
        this.coordInvitado = coordInvitado;
    }

    public void setCoordEvento(CoordEvento coordEvento) {
        this.coordEvento = coordEvento;
    }
    
    public IGCrearInvitacion() {
        initComponents();
        personalizarTable();
        llamadado();

    }
    
    private void personalizarTable(){
        JTableHeader Theader = tbInvitado.getTableHeader();
        Color bgHeader = new Color(158,158,158);
        Theader.setBackground(bgHeader); //background
        Theader.setForeground(Color.white); // color de font 
        Theader.setFont(new Font("Open Sans", Font.PLAIN, 17)); //font style size
        tbInvitado.setFont(new Font("Open Sans", Font.PLAIN, 15));
        tbInvitado.setForeground(bgHeader);
        tbInvitado.setRowHeight(30);
       
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
        
        tbInvitado.setModel(model);
    }
    
    
    public void listaEvento(){
         ArrayList<EventoVO> eventos = coordEvento.validarListaEventosFiltrado("Proximamente");

         for (int i = 0; i < eventos.size(); i++) {
             EventoVO n = eventos.get(i);
             cbEvento.addItem(n.getNombre());
         }
     }
    
   private void btnCrearInvitacion() throws SQLException{
       String evento = (String) cbEvento.getSelectedItem();
       int idEvento = coordEvento.busquedaEvento(evento);
       
        EventoVO eventoInvt = new EventoVO();
        eventoInvt.setId(idEvento);
        
        InvitadoVO invitadaInt = new InvitadoVO();
        invitadaInt.setId(idInvitado);
        
        coordinadorInvitacion.registrarInvitacion(eventoInvt, invitadaInt);
         System.out.println(coordEvento.busquedaEvento(evento));
         System.out.println(idInvitado);
         
    }
    
     private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           listaEvento();
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
        btnCrearInvitacion = new javax.swing.JButton();
        cbEvento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInvitado = new javax.swing.JTable();

        setBackground(new java.awt.Color(226, 224, 224));

        jPanel4.setBackground(new java.awt.Color(3, 158, 163));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Crear invitación ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(407, 407, 407))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCrearInvitacion.setBackground(new java.awt.Color(79, 175, 80));
        btnCrearInvitacion.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnCrearInvitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearInvitacion.setText("Crear Invitación");
        btnCrearInvitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearInvitacionActionPerformed(evt);
            }
        });

        cbEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Seleccionar evento"}));
        cbEvento.setAutoscrolls(true);

        tbInvitado.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tbInvitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre y apellido", "Genero", "Email", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInvitadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInvitado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(557, 557, 557)
                        .addComponent(btnCrearInvitacion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearInvitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInvitadoMouseClicked
        idInvitado = (int) tbInvitado.getValueAt(tbInvitado.getSelectedRow(), 0);
    }//GEN-LAST:event_tbInvitadoMouseClicked

    private void btnCrearInvitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInvitacionActionPerformed
        try {
            btnCrearInvitacion();
        } catch (SQLException ex) {
            Logger.getLogger(IGCrearInvitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearInvitacionActionPerformed

   public void setCoordinador(CoordInvitacion coordinadorInvitacion){
       this.coordinadorInvitacion = coordinadorInvitacion;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearInvitacion;
    private javax.swing.JComboBox<String> cbEvento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbInvitado;
    // End of variables declaration//GEN-END:variables
}
