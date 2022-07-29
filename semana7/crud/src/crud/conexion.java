/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;


import java.sql.*;


/**
 *
 * @author FERNEY CHAPARRO
 */
public class conexion {
    static Connection conn=null;//declarar un objeto de conexion
    static Statement stm= null;//declarando el objeto tipo sentencia sql
    static ResultSet rs=null;//declarando un cursos/array para almacenarlos datos del select
    static String sql;//declaramos variable para sentencia sql
    static String user="root";
    static String pwd="";
    static String db="empleo";
    static String url="jdbc:mysql://localhost:3306/"+db;
    public static Connection Enlace(Connection conn){
        try {
            Class.forName("com.mysql.jdbc.Driver");//cargando el driver para conectar a al base de datos
            conn=(Connection)DriverManager.getConnection(url,user,pwd);//establecemos la conexion a traves del driver manager
             javax.swing.JOptionPane.showMessageDialog(null, "conexion bien");
             PreparedStatement pstm=conn.prepareStatement("select * from empleado where cedula=? and apellido=? and edad >?");
             pstm.setString(1, "123456");
             pstm.setString(2, "chacon");
             pstm.setString(3, "45");
             ResultSet rs=pstm.executeQuery();
             CallableStatement cStm=(CallableStatement) conn.prepareCall("{call spConsultaUsuario(?)}");
             cStm.setString(1, txtCedula.getText());
             cStm.execute();
             rs=cStm.getResultSet();
             while (rs.next()) {
                 System.out.println(rs.getInt("id") + ", " 
                                        + rs.getString("nombre")+", " 
                                        + rs.getString("localizacion")+", ");
                
            }
             
             String sql="select * from empleado";
             Statement stm= conn.createStatement();
             ResultSet resultado= stm.executeQuery(sql);
             while (resultado.next()) {
                 System.out.println("cedula: "+resultado.getString("cedula"));
                 System.out.println("nombre: "+resultado.getString("nombre"));
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
