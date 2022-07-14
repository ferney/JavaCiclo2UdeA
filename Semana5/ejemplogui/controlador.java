
package ejemplogui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener{
private final empleado emp;
private final crud crud;
private final ui gui;

    public controlador(empleado emp, crud crud, ui gui) {
        this.emp = emp;
        this.crud = crud;
        this.gui = gui;
        this.gui.jButton1.addActionListener(this);
        this.gui.jButton2.addActionListener(this);
        this.gui.jButton3.addActionListener(this);
        this.gui.jButton4.addActionListener(this);
        this.gui.jButton5.addActionListener(this);
    }
    public void iniciar(){
    gui.setTitle("calculadora");
    gui.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==gui.jButton2) {            
            emp.setNombre(gui.jTextField1.getText());
            emp.setApellido(gui.jTextField2.getText());
            emp.setSexo(gui.jTextField3.getText());
            emp.setSalario(Double.parseDouble(gui.jTextField4.getText()));
            emp.setTotal(Double.parseDouble(gui.jTextField5.getText()));            
            if (crud.registrar(emp)) {
                JOptionPane.showMessageDialog(null, "registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no guardado");
                limpiar();
            }
        }
        
        
        if (e.getSource()==gui.jButton3) {
            emp.setId(Integer.parseInt(gui.jTextField7.getText()));
            emp.setNombre(gui.jTextField1.getText());
            emp.setApellido(gui.jTextField2.getText());
            emp.setSexo(gui.jTextField3.getText());
            emp.setSalario(Double.parseDouble(gui.jTextField4.getText()));
            emp.setTotal(Double.parseDouble(gui.jTextField5.getText()));            
            if (crud.actualizar(emp)) {
                JOptionPane.showMessageDialog(null, "registro actualizado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no actualizado");
                limpiar();
            }
        }
        
         if (e.getSource()==gui.jButton4) {
            emp.setId(Integer.parseInt(gui.jTextField7.getText()));   
            
            if (crud.eliminar(emp)) {
                JOptionPane.showMessageDialog(null, "registro eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "registro no eliminado");
                limpiar();
            }
        }
         
         
          if (e.getSource()==gui.jButton1) {
              emp.setId(Integer.parseInt(gui.jTextField6.getText()));         
            
            if (crud.buscar(emp)) {
                gui.jTextField7.setText(String.valueOf(emp.getId()));
                gui.jTextField1.setText(emp.getNombre());
                gui.jTextField2.setText(emp.getApellido());
                gui.jTextField3.setText(emp.getSexo());
                gui.jTextField4.setText(String.valueOf(emp.getSalario()));
                gui.jTextField5.setText(String.valueOf(emp.getTotal()));
                JOptionPane.showMessageDialog(null, "registro encontrado");
                
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
