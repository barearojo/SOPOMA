
package SOPOMA_ddsi;

import java.sql.Connection;

public class CRUD extends javax.swing.JFrame {
    
    Conexion con = Conexion.getInstance(); 
    Connection conexion;
    
    
    public CRUD() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Menú Seminario 1 DDSI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tablas_btn = new javax.swing.JButton();
        usuario_btn = new javax.swing.JButton();
        cierre_btn = new javax.swing.JButton();
        conexion_btn = new javax.swing.JButton();
        resenas_btn = new javax.swing.JButton();
        proyectos_btn = new javax.swing.JButton();
        equipos_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        tablas_btn.setBackground(new java.awt.Color(0, 0, 0));
        tablas_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        tablas_btn.setForeground(new java.awt.Color(255, 255, 255));
        tablas_btn.setText("TABLAS");
        tablas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablas_btnActionPerformed(evt);
            }
        });

        usuario_btn.setBackground(new java.awt.Color(0, 0, 0));
        usuario_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        usuario_btn.setForeground(new java.awt.Color(255, 255, 255));
        usuario_btn.setText("USUARIOS");
        usuario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_btnActionPerformed(evt);
            }
        });

        cierre_btn.setBackground(new java.awt.Color(153, 153, 153));
        cierre_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        cierre_btn.setText("Cierre");
        cierre_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cierre_btnActionPerformed(evt);
            }
        });

        conexion_btn.setBackground(new java.awt.Color(153, 153, 153));
        conexion_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        conexion_btn.setText("Conexión");
        conexion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexion_btnActionPerformed(evt);
            }
        });

        resenas_btn.setBackground(new java.awt.Color(0, 0, 0));
        resenas_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        resenas_btn.setForeground(new java.awt.Color(255, 255, 255));
        resenas_btn.setText("RESEÑAS");
        resenas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resenas_btnActionPerformed(evt);
            }
        });

        proyectos_btn.setBackground(new java.awt.Color(0, 0, 0));
        proyectos_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        proyectos_btn.setForeground(new java.awt.Color(255, 255, 255));
        proyectos_btn.setText("PROYECTOS");
        proyectos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyectos_btnActionPerformed(evt);
            }
        });

        equipos_btn.setBackground(new java.awt.Color(0, 0, 0));
        equipos_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        equipos_btn.setForeground(new java.awt.Color(255, 255, 255));
        equipos_btn.setText("EQUIPOS");
        equipos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipos_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conexion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cierre_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resenas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equipos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proyectos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resenas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proyectos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(conexion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cierre_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conexion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexion_btnActionPerformed
        conexion = con.pruebaConectar();
    }//GEN-LAST:event_conexion_btnActionPerformed

    private void cierre_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cierre_btnActionPerformed
        con.pruebaCierreConexion();
    }//GEN-LAST:event_cierre_btnActionPerformed

    private void tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablas_btnActionPerformed
         TABLAS tablas = new TABLAS();
         tablas.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_tablas_btnActionPerformed

    private void usuario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_btnActionPerformed
         USUARIOS pedido = new USUARIOS();
         pedido.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_usuario_btnActionPerformed

    private void resenas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resenas_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resenas_btnActionPerformed

    private void proyectos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectos_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proyectos_btnActionPerformed

    private void equipos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipos_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipos_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cierre_btn;
    private javax.swing.JButton conexion_btn;
    private javax.swing.JButton equipos_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton proyectos_btn;
    private javax.swing.JButton resenas_btn;
    private javax.swing.JButton tablas_btn;
    private javax.swing.JButton usuario_btn;
    // End of variables declaration//GEN-END:variables
}
