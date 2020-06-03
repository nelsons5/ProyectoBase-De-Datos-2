/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos2_nelson;

import java.sql.*;

public class main {

    static Connection conn=null;

    static Statement st=null;

    static ResultSet rs=null;

    /*Asignar datos de conexion*/

    static String bd="XE";//TIPO DE BASE DE DATOS


 /*Metodo de conexion a la base de datos*/

    public static void main(String[] args) {
        new inicioSesion().setVisible(true);
        new crearUsuario().setVisible(true);
    }
    
    public static Connection Enlace(Connection conn)throws SQLException    {

        try {

         Class.forName("oracle.jdbc.OracleDriver");

         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "NUEVA_VERAPAZ", "nuevaverapaz");

        }

        catch(ClassNotFoundException e )

        {

            System.out.print("Clase no encontrada");

        }

        return conn;

    }

    /*Establecer la conexion a la base de datos*/

     public static Statement sta(Statement st)throws SQLException    {

        conn=Enlace(conn);

        st=conn.createStatement();

        return st;

    }

     /*Hacer una consulta a la tabla*/

    public static ResultSet EnlEst(ResultSet rs)throws SQLException    {

       st=sta(st);

       rs=st.executeQuery("SELECT  * FROM USUARIO");

        return rs;

    }

}
    
   
    
   
