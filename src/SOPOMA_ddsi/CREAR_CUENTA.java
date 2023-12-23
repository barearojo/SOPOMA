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
        email_field = new javax.swing.JTextField();
        titulo_label = new javax.swing.JLabel();
        nombre_field = new javax.swing.JTextField();
        nombre_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        jhon_china_label = new javax.swing.JLabel();
        privacidad_label = new javax.swing.JLabel();
        privacidad_field = new javax.swing.JTextField();
        username_label = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        contrasena_label = new javax.swing.JLabel();
        contrasena_field = new javax.swing.JTextField();
        apellidos_label = new javax.swing.JLabel();
        apellidos_field = new javax.swing.JTextField();
        telefono_label = new javax.swing.JLabel();
        telefono_field = new javax.swing.JTextField();
        crear_cuenta_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        volver_btn.setBackground(new java.awt.Color(0, 0, 0));
        volver_btn.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        volver_btn.setForeground(new java.awt.Color(255, 255, 255));
        volver_btn.setText("RECHAZAR ESTA GRAN OPORTUNIDAD");
        volver_btn.addMouseListener(new java.awt.event.MouseAdapter() {
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

        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });

        titulo_label.setBackground(new java.awt.Color(204, 255, 204));
        titulo_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        titulo_label.setText("INTRODUZCA SUS DATOS PERSONALES PARA GANAR CRÉDITO SOCIAL");
        titulo_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nombre_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        nombre_label.setText(" NOMBRE");

        email_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        email_label.setText("EMAIL");

        jhon_china_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOHN CHINA.png"))); // NOI18N

        privacidad_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        privacidad_label.setText("PRIVACIDAD");

        privacidad_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacidad_fieldActionPerformed(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        username_label.setText("USERNAME");

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        contrasena_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        contrasena_label.setText("CONTRASEÑA");

        contrasena_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasena_fieldActionPerformed(evt);
            }
        });

        apellidos_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        apellidos_label.setText("APELLIDOS");

        apellidos_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidos_fieldActionPerformed(evt);
            }
        });

        telefono_label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        telefono_label.setText("TELÉFONO");

        telefono_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono_fieldActionPerformed(evt);
            }
        });

        crear_cuenta_btn1.setBackground(new java.awt.Color(0, 0, 0));
        crear_cuenta_btn1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        crear_cuenta_btn1.setForeground(new java.awt.Color(255, 255, 255));
        crear_cuenta_btn1.setText("UNIRME A LA GRAN NACIÓN DE SOPOMA");
        crear_cuenta_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crear_cuenta_btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crear_cuenta_btn1MouseExited(evt);
            }
        });
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
                                    .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_label))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contrasena_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contrasena_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_label)
                                    .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidos_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidos_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(privacidad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(privacidad_label))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono_label)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(username_label)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(contrasena_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contrasena_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(apellidos_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apellidos_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(privacidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(privacidad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefono_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        INICIO_SESION sesion = new INICIO_SESION();
        sesion.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_volver_btnActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void privacidad_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privacidad_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_privacidad_fieldActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void contrasena_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasena_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasena_fieldActionPerformed

    private void apellidos_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidos_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidos_fieldActionPerformed

    private void telefono_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono_fieldActionPerformed

    private void crear_cuenta_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_cuenta_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear_cuenta_btn1ActionPerformed

    private void volver_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_btnMouseEntered
        volver_btn.setBackground(Color.red);   
    }//GEN-LAST:event_volver_btnMouseEntered

    private void volver_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver_btnMouseExited
        volver_btn.setBackground(Color.BLACK);   
    }//GEN-LAST:event_volver_btnMouseExited

    private void crear_cuenta_btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_cuenta_btn1MouseEntered
        crear_cuenta_btn1.setBackground(Color.GREEN);   
    }//GEN-LAST:event_crear_cuenta_btn1MouseEntered

    private void crear_cuenta_btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_cuenta_btn1MouseExited
        crear_cuenta_btn1.setBackground(Color.BLACK);   
    }//GEN-LAST:event_crear_cuenta_btn1MouseExited

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREAR_CUENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos_field;
    private javax.swing.JLabel apellidos_label;
    private javax.swing.JTextField contrasena_field;
    private javax.swing.JLabel contrasena_label;
    private javax.swing.JButton crear_cuenta_btn1;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jhon_china_label;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JTextField privacidad_field;
    private javax.swing.JLabel privacidad_label;
    private javax.swing.JTextField telefono_field;
    private javax.swing.JLabel telefono_label;
    private javax.swing.JLabel titulo_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    private javax.swing.JButton volver_btn;
    // End of variables declaration//GEN-END:variables
}
