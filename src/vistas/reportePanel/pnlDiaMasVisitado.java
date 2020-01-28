
package vistas.reportePanel;

import controlador.CoordReporte;
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;
import modelo.VO.DiaAsistenciaVO;

public class pnlDiaMasVisitado extends javax.swing.JPanel {

    private CoordReporte coordReporte;
    private int count = 0;
    public pnlDiaMasVisitado() {
        initComponents();
        llamadado();
        
    }

    public CoordReporte getCoordReporte() {
        return coordReporte;
    }

    public void setCoordReporte(CoordReporte coordReporte) {
        this.coordReporte = coordReporte;
    }
    
    
    private void dias() throws SQLException{
        ArrayList<DiaAsistenciaVO> dias = coordReporte.realizarReporteDiaVisitado();
        for (int i = 0; i < dias.size(); i++) {
            if (dias.get(i).getDia().compareToIgnoreCase("Lunes") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbCantLunes.setText(cant);
                lbPorLunes.setText(por + "%");
            }
             else if (dias.get(i).getDia().compareToIgnoreCase("Martes") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbCantMates.setText(cant);
                lbPorMates.setText(por + "%");
            }
            else if (dias.get(i).getDia().compareToIgnoreCase("Miercoles") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbCantMiercoles.setText(cant );
                lbPorMiercoles.setText(por + "%");
            }
            else if (dias.get(i).getDia().compareToIgnoreCase("Jueves") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.round(dias.get(i).getPorciento()));
                lbCantJueves.setText(cant);
                lbPorJueves.setText(por + "%");
            }
             else if (dias.get(i).getDia().compareToIgnoreCase("Viernes") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbCantViernes.setText(cant);
                lbPorViernes.setText(por + "%");
            }
            else if (dias.get(i).getDia().compareToIgnoreCase("Sabado") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbCantSabado.setText(cant);
                lbPorSabado.setText(por + "%");
            }
            else if (dias.get(i).getDia().compareToIgnoreCase("Domingo") == 0) {
                String cant = Integer.toString(dias.get(i).getCantidad());
                String por = Float.toString((float) Math.floor(dias.get(i).getPorciento()));
                lbDomLunes.setText(cant);
                lbPorDomingo.setText(por + "%");
            }
            System.out.println(dias.get(i).getDia());
            System.out.println(dias.get(i).getPorciento());
        }
    }
    

     private void llamadado(){
         Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (count == 0) {
                        try {
                           sleep(100);
                           dias();
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

        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbCantLunes = new javax.swing.JLabel();
        lbPorLunes = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbCantMates = new javax.swing.JLabel();
        lbPorMates = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lbCantJueves = new javax.swing.JLabel();
        lbPorJueves = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lbCantViernes = new javax.swing.JLabel();
        lbPorViernes = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lbCantMiercoles = new javax.swing.JLabel();
        lbPorMiercoles = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lbCantSabado = new javax.swing.JLabel();
        lbPorSabado = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lbDomLunes = new javax.swing.JLabel();
        lbPorDomingo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(226, 224, 224));

        jLabel12.setBackground(new java.awt.Color(120, 144, 156));
        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(120, 144, 156));
        jLabel12.setText("Cantidad de personas por eventos   ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setBackground(new java.awt.Color(89, 163, 228));
        jLabel23.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(89, 163, 228));
        jLabel23.setText("Lunes");

        jLabel24.setBackground(new java.awt.Color(89, 163, 228));
        jLabel24.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(97, 97, 97));
        jLabel24.setText("Cant. de personas:");

        jLabel25.setBackground(new java.awt.Color(89, 163, 228));
        jLabel25.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(97, 97, 97));
        jLabel25.setText("Porcentaje: ");

        lbCantLunes.setBackground(new java.awt.Color(187, 182, 182));
        lbCantLunes.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantLunes.setForeground(new java.awt.Color(187, 182, 182));
        lbCantLunes.setText(" 0");

        lbPorLunes.setBackground(new java.awt.Color(187, 182, 182));
        lbPorLunes.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorLunes.setForeground(new java.awt.Color(187, 182, 182));
        lbPorLunes.setText("0%");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lbCantLunes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lbPorLunes))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setBackground(new java.awt.Color(89, 163, 228));
        jLabel33.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(89, 163, 228));
        jLabel33.setText("Martes ");

        jLabel34.setBackground(new java.awt.Color(89, 163, 228));
        jLabel34.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(97, 97, 97));
        jLabel34.setText("Cant. de personas:");

        jLabel35.setBackground(new java.awt.Color(89, 163, 228));
        jLabel35.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(97, 97, 97));
        jLabel35.setText("Porcentaje: ");

        lbCantMates.setBackground(new java.awt.Color(187, 182, 182));
        lbCantMates.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantMates.setForeground(new java.awt.Color(187, 182, 182));
        lbCantMates.setText("0");

        lbPorMates.setBackground(new java.awt.Color(187, 182, 182));
        lbPorMates.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorMates.setForeground(new java.awt.Color(187, 182, 182));
        lbPorMates.setText("0%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorMates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantMates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(lbCantMates))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lbPorMates))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setBackground(new java.awt.Color(89, 163, 228));
        jLabel38.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(89, 163, 228));
        jLabel38.setText("Jueves ");

        jLabel39.setBackground(new java.awt.Color(89, 163, 228));
        jLabel39.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(97, 97, 97));
        jLabel39.setText("Cant. de personas:");

        jLabel40.setBackground(new java.awt.Color(89, 163, 228));
        jLabel40.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(97, 97, 97));
        jLabel40.setText("Porcentaje: ");

        lbCantJueves.setBackground(new java.awt.Color(187, 182, 182));
        lbCantJueves.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantJueves.setForeground(new java.awt.Color(187, 182, 182));
        lbCantJueves.setText("0");

        lbPorJueves.setBackground(new java.awt.Color(187, 182, 182));
        lbPorJueves.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorJueves.setForeground(new java.awt.Color(187, 182, 182));
        lbPorJueves.setText("0%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lbCantJueves))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(lbPorJueves))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setBackground(new java.awt.Color(89, 163, 228));
        jLabel48.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(89, 163, 228));
        jLabel48.setText("Viernes");

        jLabel49.setBackground(new java.awt.Color(89, 163, 228));
        jLabel49.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(97, 97, 97));
        jLabel49.setText("Cant. de personas:");

        jLabel50.setBackground(new java.awt.Color(89, 163, 228));
        jLabel50.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(97, 97, 97));
        jLabel50.setText("Porcentaje: ");

        lbCantViernes.setBackground(new java.awt.Color(187, 182, 182));
        lbCantViernes.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantViernes.setForeground(new java.awt.Color(187, 182, 182));
        lbCantViernes.setText("0");

        lbPorViernes.setBackground(new java.awt.Color(187, 182, 182));
        lbPorViernes.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorViernes.setForeground(new java.awt.Color(187, 182, 182));
        lbPorViernes.setText("0%");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(lbCantViernes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(lbPorViernes))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setBackground(new java.awt.Color(89, 163, 228));
        jLabel53.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(89, 163, 228));
        jLabel53.setText("Miércoles ");

        jLabel54.setBackground(new java.awt.Color(89, 163, 228));
        jLabel54.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(97, 97, 97));
        jLabel54.setText("Cant. de personas:");

        jLabel55.setBackground(new java.awt.Color(89, 163, 228));
        jLabel55.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(97, 97, 97));
        jLabel55.setText("Porcentaje: ");

        lbCantMiercoles.setBackground(new java.awt.Color(187, 182, 182));
        lbCantMiercoles.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantMiercoles.setForeground(new java.awt.Color(187, 182, 182));
        lbCantMiercoles.setText("0");

        lbPorMiercoles.setBackground(new java.awt.Color(187, 182, 182));
        lbPorMiercoles.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorMiercoles.setForeground(new java.awt.Color(187, 182, 182));
        lbPorMiercoles.setText("0%");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(lbCantMiercoles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(lbPorMiercoles))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel58.setBackground(new java.awt.Color(89, 163, 228));
        jLabel58.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(89, 163, 228));
        jLabel58.setText("Sábado ");

        jLabel59.setBackground(new java.awt.Color(89, 163, 228));
        jLabel59.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(97, 97, 97));
        jLabel59.setText("Cant. de personas:");

        jLabel60.setBackground(new java.awt.Color(89, 163, 228));
        jLabel60.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(97, 97, 97));
        jLabel60.setText("Porcentaje: ");

        lbCantSabado.setBackground(new java.awt.Color(187, 182, 182));
        lbCantSabado.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbCantSabado.setForeground(new java.awt.Color(187, 182, 182));
        lbCantSabado.setText("0");

        lbPorSabado.setBackground(new java.awt.Color(187, 182, 182));
        lbPorSabado.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorSabado.setForeground(new java.awt.Color(187, 182, 182));
        lbPorSabado.setText("0%");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCantSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(lbCantSabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(lbPorSabado))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel63.setBackground(new java.awt.Color(89, 163, 228));
        jLabel63.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(89, 163, 228));
        jLabel63.setText("Domingo  ");

        jLabel64.setBackground(new java.awt.Color(89, 163, 228));
        jLabel64.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(97, 97, 97));
        jLabel64.setText("Cant. de personas:");

        jLabel65.setBackground(new java.awt.Color(89, 163, 228));
        jLabel65.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(97, 97, 97));
        jLabel65.setText("Porcentaje: ");

        lbDomLunes.setBackground(new java.awt.Color(187, 182, 182));
        lbDomLunes.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbDomLunes.setForeground(new java.awt.Color(187, 182, 182));
        lbDomLunes.setText("  0");

        lbPorDomingo.setBackground(new java.awt.Color(187, 182, 182));
        lbPorDomingo.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        lbPorDomingo.setForeground(new java.awt.Color(187, 182, 182));
        lbPorDomingo.setText("   0%");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPorDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDomLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(lbDomLunes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(lbPorDomingo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(289, 289, 289))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbCantJueves;
    private javax.swing.JLabel lbCantLunes;
    private javax.swing.JLabel lbCantMates;
    private javax.swing.JLabel lbCantMiercoles;
    private javax.swing.JLabel lbCantSabado;
    private javax.swing.JLabel lbCantViernes;
    private javax.swing.JLabel lbDomLunes;
    private javax.swing.JLabel lbPorDomingo;
    private javax.swing.JLabel lbPorJueves;
    private javax.swing.JLabel lbPorLunes;
    private javax.swing.JLabel lbPorMates;
    private javax.swing.JLabel lbPorMiercoles;
    private javax.swing.JLabel lbPorSabado;
    private javax.swing.JLabel lbPorViernes;
    // End of variables declaration//GEN-END:variables
}
