/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;


import java.sql.*;
import javax.swing.JOptionPane;
public class conexionUsuario {
    public String db="taller";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public  String user="root";
    public  String pwd="";
    //public conexionUsuario(){}
    public Connection conectar(){
    Connection dbConn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConn=DriverManager.getConnection(this.url,this.user,this.pwd);
            JOptionPane.showMessageDialog(null, "conectado");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
        return dbConn;
    }
    
}
