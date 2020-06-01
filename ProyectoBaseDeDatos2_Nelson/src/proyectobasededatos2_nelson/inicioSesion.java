/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos2_nelson;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class inicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form inicioSesion
     */
    public inicioSesion() {
        initComponents();
        Conectar();
    }
    String usuario;
    Menu menu = new Menu();
    crearCheque crearCheque = new crearCheque();
    crearCuenta crearCuenta = new crearCuenta();
    crearUsuario crearUsuario = new crearUsuario();
    imprimirCheque imprimirCheque = new imprimirCheque();
    inicioSesion inicioSesion = new inicioSesion();
    private Connection conexion;
    public Connection getConexion(){
        return conexion;
    }

    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
    

        public void Conectar(){
        try{
        String usuario ="NUEVA_VERAPAZ";
        String contraseña = "nuevaverapaz";
        Class.forName("oracle.jdbc.OracleDriver");
        String cadenaConexion = "jdbc:oracle:thin:@localhost:1521:XE";
        setConexion(DriverManager.getConnection
                (cadenaConexion,usuario,contraseña));
        if( getConexion()!=null)
        {
        System.out.println("Se ha establecido la conexion con el esquema NUEVA_VERAPAZ");
        }
        else{System.out.println("error de conexion");}
        }
        catch(Exception e)
        {e.printStackTrace();}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCodigo = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 212, -1));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 212, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESE SU CODIGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO A NUEVA VERAPAZ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 260, 50));

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FONDO1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = jCodigo.getText();
        String password = jPassword.getText();
        
        menu.setVisible(true);
        inicioSesion.setVisible(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
