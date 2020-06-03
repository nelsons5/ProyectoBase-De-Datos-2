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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nelson
 */
public class crearCheque extends javax.swing.JFrame {

    
    public crearCheque() {
        initComponents();
    }
    
    static Connection conn=null;

    static Statement s=null;

    static ResultSet rs=null;
    
    int min, max, monto;
    String estado;
    Menu menu = new Menu();
    
    public DefaultTableModel cuenta = new DefaultTableModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnCerrarSesion = new javax.swing.JButton();
        jNombreUsuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jIdCuenta = new javax.swing.JTextField();
        jBtnBuscarCuenta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jBanco = new javax.swing.JTextField();
        jNombreCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jUsuarioGenera = new javax.swing.JTextField();
        jMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jMax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jMontoDepositar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jBeneficiario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("GENERAR CHEQUE");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 205, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID_CUENTA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUEVA VERAPAZ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 310, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/descarga.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 230, 136));

        jBtnCerrarSesion.setText("CERRAR SESIÓN");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 278, 19));

        jButton2.setText("VOLVER MENU");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, -1));
        jPanel1.add(jIdCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 200, -1));

        jBtnBuscarCuenta.setText("BUSCAR CUENTA");
        jBtnBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBuscarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 210, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BANCO:");

        jBanco.setEnabled(false);

        jNombreCuenta.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE CUENTA:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO GENERA:");

        jUsuarioGenera.setEnabled(false);

        jMonto.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MONTO:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RANGO DE CHEQUES");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MIN:");

        jMin.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MAX:");

        jMax.setEnabled(false);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATOS DE LA CUENTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(66, 66, 66)
                        .addComponent(jMin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMax, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jNombreCuenta)
                    .addComponent(jUsuarioGenera))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jUsuarioGenera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 680, 170));
        jPanel1.add(jMontoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 210, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MONTO A DEPOSITAR:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 128, 20));
        jPanel1.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 230, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 50, 20));
        jPanel1.add(jBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 480, 470, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOMBRE DEL BENEFICIARIO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 170, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATOS DEL CHEQUE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jButton3.setText("COMPROBAR MONTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void obtenerCuenta(String idCuenta){
        try {
            //Para conectarnos a nuestra base de datos
            conn=main.Enlace(conn);//INVOCANDO LA CONEXION DESDE LA CLASE main
            //Para ejecutar la consulta
            s = conn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery("select id_cuenta, PKG_FUNCIONES.GET_NOMBRE_BANCO(cod_banco) as nombre_banco,\n" +
             "nombre_cuenta, monto, rango_minimo, rango_maximo,\n" +
             "PKG_FUNCIONES.GET_NOMBRE_USUARIO(COD_USUARIO) as nombre_usuario  from CUENTA where id_cuenta='"+ idCuenta+ "'");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();           
            //Establecer como cabezeras el nombre de las columnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             cuenta.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             cuenta.addRow(fila);
            }
            
            rs.close();
            conn.close();
            
       } catch (Exception ex) {
        ex.printStackTrace();
       }
    }

    private void mostrarDatos(){
        jBanco.setText(cuenta.getValueAt(0,1).toString());
        jNombreCuenta.setText(cuenta.getValueAt(0,2).toString());
        jMonto.setText(cuenta.getValueAt(0,3).toString());
        jMin.setText(cuenta.getValueAt(0,4).toString());
        jMax.setText(cuenta.getValueAt(0,5).toString());
        jUsuarioGenera.setText(cuenta.getValueAt(0,6).toString());
    }
    
    private void estadoCheque(){
        
        min = Integer.parseInt(jMin.getText());
        max = Integer.parseInt(jMax.getText());
        monto = Integer.parseInt(jMontoDepositar.getText());
        
        
        if (monto >=min && monto <= max){
            if (monto <= 5000){
            estado="1";
            JOptionPane.showMessageDialog(null, "MONTO EN EL RANGO, CORRECTO");//MENSAJE
            }else if (monto > 5000 && monto <= 25000){
            estado="2";
            JOptionPane.showMessageDialog(null, "MAYOR A 5000 PASARA POR AUDITORIA");//MENSAJE
            } else if (monto > 25000){
            estado="3";
            JOptionPane.showMessageDialog(null, "MAYOR A 25000 PASARA POR GERENCIA");//MENSAJE
            }
        }else{
        estado="4";    
        JOptionPane.showMessageDialog(null, "SE PASO DEL RANGO, CHEQUE CANCELADO");//MENSAJE
        }      
    }
    private void actualizarMonto(){
       int NuevoMonto= Integer.parseInt(jMonto.getText().toString())-Integer.parseInt(jMontoDepositar.getText().toString());
       if(estado.equals("4")){
           System.out.println("Estado 4, No cambia monto");
       }else{
        try {

                conn=main.Enlace(conn);//INVOCANDO LA CONEXION DESDE LA CLASE main

                 String sql="{call UPDATE_MONTO_CUENTA(?,?)}";//QUERY

                 PreparedStatement pst=conn.prepareStatement(sql);//EJECUCION DE QUERY POR MEDIO DE STATEMENT

                 //ASIGNAR DE VARIABLES A LOS PARAMETROS DE QUERY

                 pst.setString(1, jIdCuenta.getText());
                 pst.setInt(2,NuevoMonto);                                 
                 
                 pst.execute();//EJECUTAR

                 pst.close();//CERRAR CONEXION

                 JOptionPane.showMessageDialog(null, "MONTO ACTUALIZADO");//MENSAJE                 

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "ERRO AL ACTUALIZAR MONTO");//MENSAJE

        } 
       }
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        estadoCheque(); 
        java.sql.Date sqldate = new java.sql.Date(jFecha.getDate().getTime());
        try {

                conn=main.Enlace(conn);//INVOCANDO LA CONEXION DESDE LA CLASE main

                 String sql="{call INSERT_CHEQUE(?,?,?,?,?)}";//QUERY

                 PreparedStatement pst=conn.prepareStatement(sql);//EJECUCION DE QUERY POR MEDIO DE STATEMENT

                 //ASIGANAR DE VARIABLES A LOS PARAMETROS DE QUERY

                 pst.setString(1, jIdCuenta.getText());
                 pst.setDate(2, sqldate);
                 pst.setString(3, jBeneficiario.getText());
                 pst.setInt(4, Integer.parseInt(jMontoDepositar.getText()));
                 pst.setString(5,estado);
                                 
                 
                 pst.execute();//EJECUTAR

                 pst.close();//CERRAR CONEXION

                 JOptionPane.showMessageDialog(null, "Guardado exitoso");//MENSAJE
                 actualizarMonto();
                 
                 dispose();
                 menu.setVisible(true);
                 
                 

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "ERRO EN DATOS DE CHEQUE");//MENSAJE

        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarCuentaActionPerformed
        obtenerCuenta(jIdCuenta.getText());
        mostrarDatos();
    }//GEN-LAST:event_jBtnBuscarCuentaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Integer.parseInt(jMontoDepositar.getText().toString())< Integer.parseInt(jMonto.getText().toString())){
            JOptionPane.showMessageDialog(null, "MONTO A DEPOSITAR MENOR A MONTO DE CUENTA, CORRECTO");
            jButton1.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "MONTO A DEPOSITAR MAYOR A MONTO DE CUENTA, INCORRECTO");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        inicioSesion i = new inicioSesion();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(crearCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearCheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBanco;
    private javax.swing.JTextField jBeneficiario;
    private javax.swing.JButton jBtnBuscarCuenta;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JTextField jIdCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMax;
    private javax.swing.JTextField jMin;
    private javax.swing.JTextField jMonto;
    private javax.swing.JTextField jMontoDepositar;
    private javax.swing.JTextField jNombreCuenta;
    private javax.swing.JLabel jNombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jUsuarioGenera;
    // End of variables declaration//GEN-END:variables
}
