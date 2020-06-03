/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos2_nelson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

        

/**
 *
 * @author Nelson
 */
public class crearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form crearUsuario
     */
    public crearUsuario() {
        initComponents();
       // jNombreUsuario.setText(inicioSesion.cod_usuario);
    }
    //String comboBox = jComboBox.getSelectedItem().toString();
    static Connection conn=null;

    static Statement s=null;

    static ResultSet rs=null;
    Menu menu = new Menu();
    
  



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnCerrarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jNombreUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCui = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCorreo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCodUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("GUARDAR USUARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 205, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVA VERAPAZ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 310, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/descarga.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 136));

        jBtnCerrarSesion.setText("CERRAR SESIÓN");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));
        jPanel1.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 220, -1));

        jNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 278, 19));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, -1));
        jPanel1.add(jCui, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));
        jPanel1.add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 220, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORREO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 220, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "GENERADOR", "AUDITORIA", "GERENCIA" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIPO DE USUARIO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 20));

        jButton2.setText("VOLVER MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, -1));
        jPanel1.add(jCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 140, 220, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CÓDIGO USUARIO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 110, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASSWORD:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 70, -1));

        jPassword.setText("jPasswordField1");
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String comboBox = jComboBox1.getSelectedItem().toString();
      String tipo_usuario="";
      switch (comboBox){
          case "ADMIN":
              tipo_usuario= "1";
          break;
          case "GENERADOR":
              tipo_usuario= "2";
          break;
          case "AUDITORIA":
              tipo_usuario= "3";
          break;
          case "GERENCIA":
              tipo_usuario= "4";
          break;
              
      }
                try {

                conn=main.Enlace(conn);//INVOCANDO LA CONEXION DESDE LA CLASE main

                 String sql="{call INSERT_USUARIO(?,?,?,?,?,?,?,?)}";//QUERY

                 PreparedStatement pst=conn.prepareStatement(sql);//EJECUCION DE QUERY POR MEDIO DE STATEMENT

                 //ASIGANAR DE VARIABLES A LOS PARAMETROS DE QUERY

                 pst.setString(1, jCodUsuario.getText());
                 pst.setString(2, jNombre.getText());
                 pst.setString(3, jApellido.getText());
                 pst.setString(4, jCui.getText());
                 pst.setInt(5, Integer.parseInt(jTelefono.getText()));
                 pst.setString(6, jCorreo.getText());
                 pst.setString(7, tipo_usuario);
                 pst.setString(8, jPassword.getText());
                 
                 
                 pst.execute();//EJECUTAR

                 pst.close();//CERRAR CONEXION


                 JOptionPane.showMessageDialog(null, "Guardado exitoso");//MENSAJE
                 dispose();
                 menu.setVisible(true);

        }catch (Exception e){

            JOptionPane.showMessageDialog(null,"Error al guardar datos: " + e.getCause());//OBTENER ERROR

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        inicioSesion inicioSesion = new inicioSesion();
        inicioSesion.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu.setVisible(true);
        dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed



   
    
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
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCodUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JTextField jCui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombre;
    private javax.swing.JLabel jNombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
}
