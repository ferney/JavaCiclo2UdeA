package ejemplogui;
import java.sql.*;
import javax.swing.*;
public class conexion {
    public String db = "empleo";
    public String url="jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "";
    public String driver= "com.mysql.cj.jdbc.Driver";

   public Connection Conectar(){
       Connection con = null;
       try{
           Class.forName(driver);
           con = DriverManager.getConnection(this.url, this.user, this.pass);
           JOptionPane.showMessageDialog(null, "Conectado");
       }catch(ClassNotFoundException | SQLException ex){
         
           JOptionPane.showMessageDialog(null,"error:"+ ex);
       }
       return con;
   }}  