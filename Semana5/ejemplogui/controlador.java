
package ejemplogui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener{


    public controlador(empleado emp, crud crud, ui gui) {
        
    }
    public void iniciar(){
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==gui.jButton2) {            
                        
            if (crud.registrar(emp)) {
                JOptionPane.showMessageDialog(null, "registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no guardado");
                limpiar();
            }
        }
        
        
        if (e.getSource()==gui.jButton3) {
                        
            if (crud.actualizar(emp)) {
                JOptionPane.showMessageDialog(null, "registro actualizado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no actualizado");
                limpiar();
            }
        }
        
         if (e.getSource()==gui.jButton4) {
               
            
            if (crud.eliminar(emp)) {
                JOptionPane.showMessageDialog(null, "registro eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no eliminado");
                limpiar();
            }
        }
         
         
          if (e.getSource()==gui.jButton1) {
                     
            
            if (crud.buscar(emp)) {
               
                
            } else {
                JOptionPane.showMessageDialog(null, "registro no encontrado");
                
            }
            }
          
          
          
          if (e.getSource()==gui.jButton5) {
           limpiar();
            
            
            
        }
    }
    
  public void limpiar(){
    gui.jTextField1.setText("");
    gui.jTextField2.setText("");
    gui.jTextField3.setText("");
    gui.jTextField4.setText("");
    gui.jTextField5.setText("");
    gui.jTextField6.setText("");
    gui.jTextField7.setText("");
    
    }
    
}
