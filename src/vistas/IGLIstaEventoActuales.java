
package vistas;

import controlador.CoordEvento;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Logica.LogicaEvento;
import modelo.VO.EventoVO;
import modelo.VO.UsuarioVO;
import vistas.table.Render;



public class IGLIstaEventoActuales extends javax.swing.JFrame {

    
    private UsuarioVO usuarioActivo;
    private CoordEvento coordEvento;
    private LogicaEvento eventoLogica;
    private int count = 0;
    private int idEvento;
    
    public IGLIstaEventoActuales() {
        initComponents();
        this.setLocationRelativeTo(null);
        personalizarTable();
        coordEvento = new CoordEvento();
        eventoLogica = new LogicaEvento();
        coordEvento.setLogicaEvento(eventoLogica);
        eventoLogica.setCoordinador(coordEvento);
        llamadado();
        
    }

    public UsuarioVO getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(UsuarioVO usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    /*
        Personalizar el header de la tabla 
    */
    
    public void personalizarTable(){
        JTableHeader Theader = tbEventoActual.getTableHeader();
        Color bgHeader = new Color(158,158,158);
        Theader.setBackground(bgHeader); //background
        Theader.setForeground(Color.white); // color de font 
        Theader.setFont(new Font("Open Sans", Font.PLAIN, 18)); //font style size
        tbEventoActual.setFont(new Font("Open Sans", Font.PLAIN, 17));
        tbEventoActual.setForeground(bgHeader);
        tbEventoActual.setRowHeight(40);
      
    }
    
    /*
        Rellenar la tabla
    */
    
      private void listarTabla( ArrayList<EventoVO> eventos){
      
        Object[][] fila = new Object[eventos.size()][5];
        for (int i = 0; i < eventos.size(); i++) {
           
            fila[i][0] = eventos.get(i).getId();
            fila[i][1] = eventos.get(i).getNombre();
            fila[i][2] = eventos.get(i).getTipoEvento();
            fila[i][3] = eventos.get(i).getUbicacion();
            fila[i][4] = eventos.get(i).getHora();
  
        }
        
        Object[] titulo = {"ID", "Nombre del evento", "Tipo", "Ubicacion", "Hora"};
        
        DefaultTableModel model = new DefaultTableModel(fila, titulo){
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        tbEventoActual.setModel(model);
        
      }

    
    private void inicir(){
        System.out.println(usuarioActivo.getTipoUsuario());
        System.out.println(usuarioActivo.getId());
        if(usuarioActivo.getTipoUsuario().compareTo("portero") == 0){
           btnIrPanelControl.setVisible(false);
        }
    }
    
    private void cerrarAplicacion(){
         System.exit(0);
    }
            
  
    private void darApertura(){
         if(idEvento > 0){
             PanelEvento panelEvento = new PanelEvento();
             panelEvento.setUsuarioActivo(usuarioActivo);
             panelEvento.setIdEvento(idEvento);
             panelEvento.setVisible(true);
             this.setVisible(false);
         }else{
             JOptionPane.showMessageDialog(null,"Debe de seleccionar un evento para gestionarlo","Advertencia",JOptionPane.WARNING_MESSAGE);   
         }
    }
    
    private void ingresarPanelControl(){
       PanelControl panelControl = new PanelControl();
       panelControl.setusuarioActivo(usuarioActivo);
       panelControl.setVisible(true);
       this.setVisible(false);
    }
    
    private void mostrarLista(){
         listarTabla(coordEvento.listaEventosActuales());
    }
    
    private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           inicir();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIrPanelControl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEventoActual = new javax.swing.JTable();
        btnMostrarLista = new javax.swing.JButton();
        lbCerrarSesion = new javax.swing.JLabel();
        btnDarEntrada1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(226, 224, 224));

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(120, 144, 156));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 144, 156));
        jLabel1.setText("Lista de eventos para el día de hoy  ");

        btnIrPanelControl.setBackground(new java.awt.Color(0, 150, 136));
        btnIrPanelControl.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIrPanelControl.setForeground(new java.awt.Color(255, 255, 255));
        btnIrPanelControl.setText("Panel de control");
        btnIrPanelControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPanelControlActionPerformed(evt);
            }
        });

        tbEventoActual.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tbEventoActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del evento", "Tipo", "Salón", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbEventoActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEventoActualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEventoActual);

        btnMostrarLista.setBackground(new java.awt.Color(25, 100, 126));
        btnMostrarLista.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnMostrarLista.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarLista.setText("Mostrar lista ");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });

        lbCerrarSesion.setBackground(new java.awt.Color(66, 66, 66));
        lbCerrarSesion.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbCerrarSesion.setText("Cerrar sesión ");
        lbCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarSesionMouseClicked(evt);
            }
        });

        btnDarEntrada1.setBackground(new java.awt.Color(76, 175, 80));
        btnDarEntrada1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnDarEntrada1.setForeground(new java.awt.Color(255, 255, 255));
        btnDarEntrada1.setText("Dar entrada");
        btnDarEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarEntrada1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(btnIrPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCerrarSesion)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDarEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 189, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lbCerrarSesion)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDarEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnIrPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbEventoActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEventoActualMouseClicked
       idEvento = (int) tbEventoActual.getValueAt(tbEventoActual.getSelectedRow(), 0);
        System.out.println(idEvento);
    }//GEN-LAST:event_tbEventoActualMouseClicked

    private void btnIrPanelControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPanelControlActionPerformed
        ingresarPanelControl();
    }//GEN-LAST:event_btnIrPanelControlActionPerformed

    private void lbCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarSesionMouseClicked
       cerrarAplicacion();
    }//GEN-LAST:event_lbCerrarSesionMouseClicked

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
       mostrarLista();
    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void btnDarEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarEntrada1ActionPerformed
        darApertura();
    }//GEN-LAST:event_btnDarEntrada1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(IGLIstaEventoActuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGLIstaEventoActuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGLIstaEventoActuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGLIstaEventoActuales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGLIstaEventoActuales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarEntrada1;
    private javax.swing.JButton btnIrPanelControl;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCerrarSesion;
    private javax.swing.JTable tbEventoActual;
    // End of variables declaration//GEN-END:variables
}
