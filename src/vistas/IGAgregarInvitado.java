
package vistas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;

public class IGAgregarInvitado extends javax.swing.JPanel {

 
    public IGAgregarInvitado() {
        initComponents();
        //panelBorder();
        ButtonGroup genero = new ButtonGroup();
        genero.add(rbFemenino);
        genero.add(rbMasculino);
        rbMasculino.setSelected(true);
       
    }
    
    private void panelBorder(){
        Color gray = new Color(187,182,182);
        Border blackline = BorderFactory.createLineBorder(gray);
  
        jPanel3.setBorder(blackline);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        txtUsuario2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUsuario3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUsuario4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtUsuario5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        btnIngresar1 = new javax.swing.JButton();
        btnIngresar3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 224));

        jPanel5.setBackground(new java.awt.Color(3, 158, 163));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Agregar invitados ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel19)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar evento", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setAutoscrolls(true);

        jPanel3.setBackground(new java.awt.Color(226, 224, 224));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(540, 336));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel14.setText("Genero:");

        txtUsuario1.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtUsuario1.setBorder(null);

        txtUsuario2.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtUsuario2.setBorder(null);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel15.setText("Telefono:");

        txtUsuario3.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtUsuario3.setBorder(null);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel16.setText("Email:");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel17.setText("Dirección:");

        txtUsuario4.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtUsuario4.setBorder(null);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel18.setText("Nombre:");

        txtUsuario5.setFont(new java.awt.Font("Open Sans", 0, 30)); // NOI18N
        txtUsuario5.setBorder(null);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel20.setText("Dirección:");

        rbFemenino.setBackground(new java.awt.Color(226, 224, 224));
        rbFemenino.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbFemenino.setText("Femenino ");

        rbMasculino.setBackground(new java.awt.Color(226, 224, 224));
        rbMasculino.setFont(new java.awt.Font("Open Sans", 0, 17)); // NOI18N
        rbMasculino.setText("Marculino");

        btnIngresar1.setBackground(new java.awt.Color(89, 163, 228));
        btnIngresar1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setText("Agregar invitado");

        btnIngresar3.setBackground(new java.awt.Color(244, 67, 54));
        btnIngresar3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnIngresar3.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar3.setText("Limpiar campos ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(txtUsuario5, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtUsuario3)
                            .addComponent(txtUsuario4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(7, 7, 7))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbFemenino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbMasculino))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(246, Short.MAX_VALUE)
                        .addComponent(btnIngresar1)
                        .addGap(87, 87, 87)
                        .addComponent(btnIngresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)))
                .addGap(127, 127, 127))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFemenino)
                            .addComponent(rbMasculino))))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnIngresar3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario2;
    private javax.swing.JTextField txtUsuario3;
    private javax.swing.JTextField txtUsuario4;
    private javax.swing.JTextField txtUsuario5;
    // End of variables declaration//GEN-END:variables
}
