/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class usuario {
    private final conexionUsuario cnx=new conexionUsuario();
    private String sql="";
    int todReg;
    
    String[] titulos={"cedula","nombre","apellido","telefono" };
    Object[] registro= new Object[4];
    
    public DefaultTableModel Filtrado(String apellidos){
        DefaultTableModel modelo;
        
        modelo= new DefaultTableModel(null, titulos);
        sql="select * from usuarios where apellido like '%"+apellidos.trim()+"%'";
        try {
            Connection con=cnx.conectar();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()) {
               registro[0]=rs.getString("cedula");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("telefono");  
               modelo.addRow(registro);
            }
            rs.close();
            st.close();
            con.close();
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } 
        
    }
    
    public DefaultTableModel BuscarCedula(String cedula){
        DefaultTableModel modelo;
        
        modelo= new DefaultTableModel(null, titulos);
        sql="select * from usuarios where cedula like '%"+cedula.trim()+"%'";
        todReg=0;

        try {
            Connection cn=cnx.conectar();      
            Statement stm= cn.createStatement();
            ResultSet res= stm.executeQuery(sql);
            while (res.next()) {
               registro[0]=res.getString("cedula");
               registro[1]=res.getString("nombre");
               registro[2]=res.getString("apellido");
               registro[3]=res.getString("telefono");
                todReg+=1;
                modelo.addRow(registro);
            }
            res.close();
            stm.close();
            cn.close();
            return modelo;
        } catch (SQLException e) {
            System.out.println("error mostrar");
            JOptionPane.showMessageDialog(null, e+"error al mostrar");
            return null;
        } 
        
    }
    
  public boolean RegistrarUsuario(DatosUsuario usuario) throws SQLException{
        
        
        
        sql="insert into usuarios(cedula, nombre, apellido, telefono)"
                + "values(?,?,?,?)";
        try {
                 Connection con=cnx.conectar();
                PreparedStatement st= con.prepareStatement(sql);
               st.setString(1,usuario.getCedula());
               st.setString(2,usuario.getNombre());
               st.setString(3,usuario.getApellido());
               st.setString(4,usuario.getTelefono());
                int a= st.executeUpdate();
                return a !=0;
                
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } 
        
    }
    
    public boolean EliminarUsuario(String cedula) throws SQLException{
        sql="delete from usuarios where cedula=?";
        try {
                 Connection con=cnx.conectar();
                PreparedStatement st= con.prepareStatement(sql);
               st.setString(1,cedula);
               int a= st.executeUpdate();
                st.close();
                con.close();
                return  true;               
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } 
        
    }
    
    public boolean EditarUsuario(DatosUsuario usuario) throws SQLException{
        
        
        
        sql="update usuarios set nombre=?,apellido=?,telefono=? where cedula=?";
        try {
                Connection con=cnx.conectar();
                PreparedStatement st= con.prepareStatement(sql);
              
               st.setString(1,usuario.getNombre());
               st.setString(2,usuario.getApellido());
               st.setString(3,usuario.getTelefono());
               st.setString(4,usuario.getCedula());
                int a= st.executeUpdate();
                return a !=0;
                
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } 
        
    }

    DefaultTableModel Listarusuario() {
        DefaultTableModel modelo;        
        modelo= new DefaultTableModel(null, titulos);
        sql="select * from usuarios";
        todReg=0;
        try {
            Connection con=cnx.conectar();
           
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()) {
               registro[0]=rs.getString("cedula");
               registro[1]=rs.getString("nombre");
               registro[2]=rs.getString("apellido");
               registro[3]=rs.getString("telefono");
                todReg+=1;
                modelo.addRow(registro);
            }
            rs.close();
            st.close();
            con.close();
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } 
        
    }
}
