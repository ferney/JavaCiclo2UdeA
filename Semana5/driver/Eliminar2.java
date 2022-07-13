
package driver;
import java.sql.*;
public class Eliminar2 {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        PreparedStatement stm=null;
        String password="";
        String usuario="root";
        String url="jdbc:mysql://localhost:3306/ejemplo";
        try {
            
            con=DriverManager.getConnection(url, usuario, password);
            String sql="DELETE FROM departamento WHERE id=?";
            stm=con.prepareCall(sql);
            stm.setInt(1, 13);
            int fila=stm.executeUpdate();
            if (fila==1) {
                   System.out.println("registro eliminado"); 
                } else {
                System.out.println("registro no eliminado");
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
