
package driver;
import java.sql.*;
public class Insert2 {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        PreparedStatement stm=null;
        //ResultSet rs=null;
        String password="";
        String usuario="root";
        String url="jdbc:mysql://localhost:3306/ejemplo";
        try {
            //1. obtener la conexion de la base de datos
            con=DriverManager.getConnection(url, usuario, password);
            //2. declaramos statament
            String sql="insert INTO departamento (id,nombre,localizacion) values(?,?,?)";
            stm=con.prepareStatement(sql);
            
            stm.setInt(1, 13);
            stm.setString(2,"archivo");
            stm.setString(3,"aguachica");
            int fila=stm.executeUpdate();
            if (fila==1) {
                    System.out.println("insert realizado");
                } else {
                 System.out.println("insert no realizado");
                }
           
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
