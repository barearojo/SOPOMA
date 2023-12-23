package SOPOMA_ddsi;




import SOPOMA_ddsi.*;
import java.awt.Color;
import java.sql.Connection;

public class CREAR_CUENTA extends javax.swing.JFrame {
    
    Conexion con = Conexion.getInstance(); 
    Connection conexion;
    
    
    public CREAR_CUENTA() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Menú Seminario 1 DDSI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver_btn = new javax.swing.JButton();
        username_field = new javax.swing.JTextField();
        titulo_label = new javax.swing.JLabel();
        contrasema_field = new javax.swing.JTextField();
        contrasena_label = new javax.swing.JLabel();
        email_lable = new javax.swing.JLabel();
        jhon_china_label = new javax.swing.JLabel();
        email_lable1 = new javax.swing.JLabel();
        username_field1 = new javax.swing.JTextField();
        email_lable2 = new javax.swing.JLabel();
        username_field2 = new javax.swing.JTextField();
        email_lable3 = new javax.swing.JLabel();
        username_field3 = new javax.swing.JTextField();
        email_lable4 = new javax.swing.JLabel();
        username_field4 = new javax.swing.JTextField();
        email_lable5 = new javax.swing.JLabel();
        username_field5 = new javax.swing.JTextField();
        crear_cuenta_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        volver_btn.setBackground(new java.awt.Color(0, 0, 0));
        volver_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        volver_btn.setForeground(new java.awt.Color(255, 255, 255));
        volver_btn.setText("RECHAZAR ESTA GRAN OPORTUNIDAD");
        volver_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volver_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volver_btnMouseExited(evt);
            }
        });
        volver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_btnActionPerformed(evt);
            }
        });

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        titulo_label.setBackground(new java.awt.Color(204, 255, 204));
        titulo_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        titulo_label.setText("INTRODUZCA SUS DATOS PERSONALES PARA GANAR CRÉDITO SOCIAL");
        titulo_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contrasena_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        contrasena_label.setText(" NOMBRE");

        email_lable.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable.setText("EMAIL");

        jhon_china_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOHN CHINA.png"))); // NOI18N

        email_lable1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable1.setText("PRIVACIDAD");

        username_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field1ActionPerformed(evt);
            }
        });

        email_lable2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable2.setText("USERNAME");

        username_field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field2ActionPerformed(evt);
            }
        });

        email_lable3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable3.setText("CONTRASEÑA");

        username_field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field3ActionPerformed(evt);
            }
        });

        email_lable4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable4.setText("APELLIDOS");

        username_field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field4ActionPerformed(evt);
            }
        });

        email_lable5.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_lable5.setText("TELÉFONO");

        username_field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_field5ActionPerformed(evt);
            }
        });

        crear_cuenta_btn1.setBackground(new java.awt.Color(0, 0, 0));
        crear_cuenta_btn1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        crear_cuenta_btn1.setForeground(new java.awt.Color(255, 255, 255));
        crear_cuenta_btn1.setText("UNIRME A LA GRAN NACIÓN DE SOPOMA");
        crear_cuenta_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_cuenta_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jhon_china_label)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lable))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lable3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contrasena_label)
                                    .addComponent(contrasema_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lable4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lable1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lable5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(email_lable2)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(username_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crear_cuenta_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo_label)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jhon_china_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(email_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(email_lable3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(username_field3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(contrasena_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contrasema_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(email_lable4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(username_field4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(email_lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email_lable5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username_field5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(email_lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(username_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(crear_cuenta_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volver_btnActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void username_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field1ActionPerformed

    private void username_field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field2ActionPerformed

    private void username_field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field3ActionPerformed

    private void username_field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field4ActionPerformed

    private void username_field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_field5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_field5ActionPerformed

    private void crear_cuenta_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_cuenta_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear_cuenta_btn1ActionPerformed

    private void volver_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_btnMouseEntered
        volver_btn.setBackground(Color.red);   
    }//GEN-LAST:event_volver_btnMouseEntered

    private void volver_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_btnMouseExited
        volver_btn.setBackground(Color.BLACK);   
    }//GEN-LAST:event_volver_btnMouseExited

    private void volver_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_btnMouseClicked
        volver_btn.setBackground(Color.getHSBColor(4, 100, 41));
    }//GEN-LAST:event_volver_btnMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREAR_CUENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasema_field;
    private javax.swing.JLabel contrasena_label;
    private javax.swing.JButton crear_cuenta_btn1;
    private javax.swing.JLabel email_lable;
    private javax.swing.JLabel email_lable1;
    private javax.swing.JLabel email_lable2;
    private javax.swing.JLabel email_lable3;
    private javax.swing.JLabel email_lable4;
    private javax.swing.JLabel email_lable5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jhon_china_label;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JTextField username_field1;
    private javax.swing.JTextField username_field2;
    private javax.swing.JTextField username_field3;
    private javax.swing.JTextField username_field4;
    private javax.swing.JTextField username_field5;
    private javax.swing.JButton volver_btn;
    // End of variables declaration//GEN-END:variables
}
