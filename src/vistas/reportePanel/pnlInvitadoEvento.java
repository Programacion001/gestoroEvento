
package vistas.reportePanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.table.JTableHeader;

public class pnlInvitadoEvento extends javax.swing.JPanel {

    public pnlInvitadoEvento() {
        initComponents();
        personalizarTable();
        ButtonGroup cantidad = new ButtonGroup();
        cantidad.add(rbAmbos);
        cantidad.add(rbHombres);
        cantidad.add(rbMujer);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbMujer = new javax.swing.JRadioButton();
        rbAmbos = new javax.swing.JRadioButton();
        rbHombres = new javax.swing.JRadioButton();
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel1.setText("Filtrar");

        rbMujer.setBackground(new java.awt.Color(226, 224, 224));
        rbMujer.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbMujer.setText("Por mujeres");

        rbAmbos.setBackground(new java.awt.Color(226, 224, 224));
        rbAmbos.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbAmbos.setText("Por ambos");

        rbHombres.setBackground(new java.awt.Color(226, 224, 224));
        rbHombres.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbHombres.setText("Por hombres");

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rbAmbos)
                        .addGap(42, 42, 42)
                        .addComponent(rbMujer)
                        .addGap(39, 39, 39)
                        .addComponent(rbHombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAmbos)
                            .addComponent(rbMujer)
                            .addComponent(rbHombres))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbAmbos;
    private javax.swing.JRadioButton rbHombres;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
