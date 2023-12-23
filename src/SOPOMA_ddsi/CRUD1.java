
package SOPOMA_ddsi;

import java.sql.Connection;

public class CRUD1 extends javax.swing.JFrame {
    
    Conexion con = Conexion.getInstance(); 
    Connection conexion;
    
    
    public CRUD1() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("SOPOMA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver_btn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tablas_btn = new javax.swing.JButton();
        usuario_btn = new javax.swing.JButton();
        resenas_btn = new javax.swing.JButton();
        proyectos_btn = new javax.swing.JButton();
        equipos_btn = new javax.swing.JButton();
        volver_btn2 = new javax.swing.JButton();

        volver_btn1.setBackground(new java.awt.Color(153, 153, 153));
        volver_btn1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        volver_btn1.setText("Volver");
        volver_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_btn1ActionPerformed(evt);
            }
        });

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
        usuario_btn.setText("MI USUARIO");
        usuario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_btnActionPerformed(evt);
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

        volver_btn2.setBackground(new java.awt.Color(153, 153, 153));
        volver_btn2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        volver_btn2.setText("Cerrar Sesión");
        volver_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resenas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proyectos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_btn2)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(tablas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proyectos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resenas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(volver_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablas_btnActionPerformed
         TABLAS tablas = new TABLAS();
         tablas.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_tablas_btnActionPerformed

    private void usuario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_btnActionPerformed
         USUARIOS usuario = new USUARIOS();
         usuario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_usuario_btnActionPerformed

    private void resenas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resenas_btnActionPerformed
         RESENAS resenas = new RESENAS();
         resenas.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_resenas_btnActionPerformed

    private void proyectos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectos_btnActionPerformed
         PROYECTOS proyectos = new PROYECTOS();
         proyectos.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_proyectos_btnActionPerformed

    private void equipos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipos_btnActionPerformed
         EQUIPOS equipos = new EQUIPOS();
         equipos.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_equipos_btnActionPerformed

    private void volver_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_btn1ActionPerformed
        CRUD1 crud = new CRUD1();
        crud.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volver_btn1ActionPerformed

    private void volver_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_btn2ActionPerformed
        INICIO_SESION sesion = new INICIO_SESION();
        sesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volver_btn2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton equipos_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton proyectos_btn;
    private javax.swing.JButton resenas_btn;
    private javax.swing.JButton tablas_btn;
    private javax.swing.JButton usuario_btn;
    private javax.swing.JButton volver_btn1;
    private javax.swing.JButton volver_btn2;
    // End of variables declaration//GEN-END:variables
}
