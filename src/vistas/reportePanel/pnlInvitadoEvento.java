
package vistas.reportePanel;

import controlador.CoordReporte;
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.VO.PersonaEventoVO;

public class pnlInvitadoEvento extends javax.swing.JPanel {

    
    private CoordReporte coordReporte;
    private int count = 0; 
    private int cantidaFiltrar ;
    public pnlInvitadoEvento() {
        initComponents();
        personalizarTable();
        llamadado();
        
        
    }

    public CoordReporte getCoordReporte() {
        return coordReporte;
    }

    public void setCoordReporte(CoordReporte coordReporte) {
        this.coordReporte = coordReporte;
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
    
         
//    private void listarTabla() throws SQLException{
//       ArrayList<PersonaEventoVO> personasEventos = coordReporte.numPersona();
//        System.out.println(personasEventos.get(1).getNombre());
//        Object[][] fila = new Object[personasEventos.size()][6];
//        for (int i = 0; i < personasEventos.size(); i++) {
//            fila[i][0] = personasEventos.get(i).getId();
//            fila[i][1] = personasEventos.get(i).getNombre();
//            fila[i][2] = personasEventos.get(i).getTipoEvento();
//            fila[i][3] = personasEventos.get(i).getFecha().toString();
//            fila[i][4] = personasEventos.get(i).getHombres();
//            fila[i][5] = personasEventos.get(i).getMujeres();
//        }
//        Object[] titulo = {"ID", "Nombre", "Tipo", "Fecha", "Cantidad M", "Cantidad F"};
//        
//        DefaultTableModel model = new DefaultTableModel(fila, titulo){
//             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
//        };
//        
//        tbUsuario.setModel(model);
//
//    }
    
        private void listarTabla() throws SQLException{
       ArrayList<PersonaEventoVO> personasEventos = coordReporte.realizarReporteEventoSexo(1);
        Object[][] fila = new Object[personasEventos.size()][7];
        for (int i = 0; i < personasEventos.size(); i++) {
            fila[i][0] = personasEventos.get(i).getId();
            fila[i][1] = personasEventos.get(i).getNombre();
            fila[i][2] = personasEventos.get(i).getTipoEvento();
            fila[i][3] = personasEventos.get(i).getFecha().toString();
            fila[i][4] = personasEventos.get(i).getHombres();
            fila[i][5] = personasEventos.get(i).getMujeres();
        }
       ;
       
            
        
        Object[] titulo = {"ID", "Nombre", "Tipo", "Fecha", "Cantidad M", "cantidad F"};
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 224));

        tbUsuario.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo", "Fecha", "Cantidad M", "Cantida   F"
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

        jLabel12.setBackground(new java.awt.Color(120, 144, 156));
        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(120, 144, 156));
        jLabel12.setText("Cantidad de personas por eventos   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel12)
                .addGap(0, 290, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
          
    }//GEN-LAST:event_tbUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
