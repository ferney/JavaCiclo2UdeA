
package driver;
import java.sql.*;
public class Insert {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement stm=null;
        //ResultSet rs=null;
        String password="";
        String usuario="root";
        String url="jdbc:mysql://localhost:3306/ejemplo";
        try {
            //1. obtener la conexion de la base de datos
            con=DriverManager.getConnection(url, usuario, password);
            //2. declaramos statament
            stm=con.createStatement();
            //3. declarar sql y ejecutar
            String sql="insert INTO departamento (nombre,localizacion) values('servicios','pereira')";
            stm.executeUpdate(sql);
            System.out.println("insert realizado");
            //4. cerrar todo
            stm.close();con.close();
        } catch (SQLException e) {
            System.out.println("error"+ e);
            //4. cerrar todo
             stm.close();con.close();
        }finally{
        //4. cerrar todo
            stm.close();con.close();
        }
        
        
        
          
    }
}
