
package GUI;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class conexion {
    String db="ejemplo";
    String url="jdbc:mysql://localhost:3306/"+db;
    String user="root";
    String pass="";
    String driver="com.mysql.jdbc.Driver";
    
    public Connection Conectar(){
    Connection con= null;
        try {
          Class.forName(driver);
          con=DriverManager.getConnection(this.url, this.user, this.pass);
          JOptionPane.showMessageDialog(null, "Conectado");
          
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error"+e);
        }
        return con;
    }}
 

