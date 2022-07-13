
package driver;
import java.sql.*;
public class Driver {

    public static void main(String[] args) throws SQLException {
        Connection con=null;//establecemos conexion
        Statement stm=null;//ejecutar querys --> PrepareStatement
        ResultSet rs=null;//obtener resultados o traerlos de la base de datos con select
        try {
            //1. Obtener una conexion a la base de datos
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo","root", "");
            //2. Crear una declaración
            stm=con.createStatement();
            //3. declarar y ejecutar una consulta
            String sql="select* from departamento";
            rs=stm.executeQuery(sql);
            //4. procesar el conjunto de datos o recorrer el array de datos o objetos
            System.out.println("id\tnombre\tdepartamento");
            while (rs.next()) {
                System.out.println(rs.getInt("id")
                        +"\t"+ rs.getString("nombre")+"\t"+rs.getString("localizacion"));
                
            }
            //5. cerrar la conexión
            rs.close();stm.close();con.close();
        } catch (SQLException e) {
            //5. cerrar la conexión
            rs.close();stm.close();con.close();
            System.out.println("error: "+e);
        }finally{
            //5. cerrar la conexión
            rs.close();stm.close();con.close();
            
        }
    }
    
}
