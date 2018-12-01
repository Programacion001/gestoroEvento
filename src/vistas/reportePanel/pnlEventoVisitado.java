
package vistas.reportePanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;

public class pnlEventoVisitado extends javax.swing.JPanel {

    public pnlEventoVisitado() {
        initComponents();
        personalizarTable();
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
                "ID", "Nombre", "Tipo", "Fecha", "Cantidad"
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

        jLabel12.setBackground(new java.awt.Color(120, 144, 156));
        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(120, 144, 156));
        jLabel12.setText("Cantidad de personas por eventos   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel12)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        //        System.out.println(tbUsuario.getSelectedRow());
        //        System.out.println(tbUsuario.getValueAt(0, 2) );
        int[] count = tbUsuario.getSelectedRows();
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }

        System.out.println();
    }//GEN-LAST:event_tbUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
