
package driver;
import java.sql.*;
import javax.swing.JOptionPane;
public class Array {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        PreparedStatement stm=null;//statement con resulset o solo el preparestaetment
        String password="";
        String usuario="root";
        String url="jdbc:mysql://localhost:3306/ejemplo";
        
        try {
            //1. obtener la conexion de la base de datos
            con=DriverManager.getConnection(url, usuario, password);
            //2. arrays de datos 
            
            String nombre[]=new String[3];
            for (int i = 0; i < nombre.length; i++) {
                nombre[i]=JOptionPane.showInputDialog("ingrese un nombre de\nservicio empresarial");
                
            }
            String departamentos[]={"bucaramanga","aguazul","arauca"};
            //3. insetatr los datos
            for (int i = 0; i < departamentos.length; i++) {
               stm=con.prepareStatement("insert INTO departamento (nombre,localizacion) values('"
                       +nombre[i]+"','"+departamentos[i]+"')");
                int fila=stm.executeUpdate();
                if (fila==1) {
                    System.out.println("fila correctamente insertada");                    
                } else {
                    System.out.println("no se logró insertar la fila");
                }
            }
        } catch (SQLException e) {
            System.out.println("error");
             stm.close();con.close();
        }finally{
         stm.close();con.close();
        }
    }
}
