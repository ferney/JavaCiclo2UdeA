package ejemplogui;
import java.sql.*;
import javax.swing.*;
public class crud extends conexion{
    
    public boolean registrar(empleado emp){
        PreparedStatement ps=null;
        Connection con=Conectar();        
         try {
            
            String sql="insert into empleado (nombre,apellido,sexo,salario,total) values (?,?,?,?,?)";
            ps=con.prepareStatement(sql);           
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3, emp.getSexo());
            ps.setDouble(4, emp.getSalario());
            ps.setDouble(5, emp.getTotal());
            int rsto=ps.executeUpdate();
            if (rsto==1) {   
                JOptionPane.showMessageDialog(null, "fila correctamente insertadoa");
                 return true;
            } else {
                ps.close();  con.close();
                JOptionPane.showMessageDialog(null,"no se logro insertar la fila");
                 return false;
            }                  
        } catch (SQLException ex) {            
             System.out.println(""+ex);
        }finally{
             try {
                 ps.close(); con.close();
             } catch (SQLException e) {
                 System.out.println("error"+e);
             }
         }  
        return false;
    }
    
    public boolean actualizar(empleado emp){
        PreparedStatement ps=null;
        Connection con=Conectar();        
         try {
            String sql = "UPDATE empleado SET nombre=?,apellido=?,sexo=?,salario=?,total=? where id=?";
            ps = con.prepareStatement(sql);            
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3, emp.getSexo());
            ps.setDouble(4, emp.getSalario());
            ps.setDouble(5, emp.getTotal());
            ps.setInt(6, emp.getId());
            int rdto = ps.executeUpdate();
            if (rdto > 0) {
                JOptionPane.showMessageDialog(null,"fila actualizada!");
            return true;
            }else{
                ps.close();                con.close();
                JOptionPane.showMessageDialog(null, "fila no actualizada!");
            return false;
            }
                        
        } catch (SQLException ex) {
            
             System.out.println("error 1 "+ex);
        }finally{
             try {
                 ps.close();                 con.close();
             } catch (SQLException e) {
                 System.out.println("error 2"+e);
             }
         }    
        return false;}
    
    public boolean eliminar(empleado emp){
        PreparedStatement ps=null;
        Connection con=Conectar();        
         try {
            JOptionPane.showMessageDialog(null, "Conectado");
            String sql = "DELETE FROM empleado WHERE id=?"; 
            ps = con.prepareStatement(sql);
            ps.setInt(1, emp.getId());
             int rtdo=ps.executeUpdate();
            if (rtdo==1) {
                JOptionPane.showMessageDialog(null, "empleado correctamente eliminado");                
                 ps.close();                 con.close();
                 return true;
            } else {
                 ps.close();                 con.close();
                 JOptionPane.showMessageDialog(null, "no se logro eliminar el empleado");
                
            }           
           return false;
        } catch (SQLException ex) {            
             System.out.println("error 1 "+ex);
        }finally{
             try {
                 ps.close();                 con.close();
             } catch (SQLException e) {
                 System.out.println("error 2"+e);
             }
         }    
        return false;
    }
    
     public boolean buscar(empleado emp){
        PreparedStatement ps=null;
         ResultSet rs=null;
        Connection con=Conectar();        
         try {
            JOptionPane.showMessageDialog(null, "Conectado");
            String sql="select * from empleado where id=?";
            ps=con.prepareStatement(sql);           
            ps.setInt(1, emp.getId());           
            rs=ps.executeQuery();
           while (rs.next()) { 
           emp.setId(Integer.parseInt(rs.getString("id")));
           emp.setNombre(rs.getString("nombre"));
           emp.setApellido(rs.getString("apellido"));
           emp.setSexo(rs.getString("sexo"));
           emp.setSalario(Double.parseDouble(rs.getString("salario")));
           emp.setTotal(Double.parseDouble(rs.getString("total")));           
            }
            rs.close();            ps.close();            con.close();
            return true;
            
        } catch (SQLException ex) {
            
           
        }finally{
             try {
                 rs.close();                 ps.close();                 con.close();
             } catch (SQLException e) {
                 System.out.println("error"+e);
             }
         } return false;
 }
    
    
    
}