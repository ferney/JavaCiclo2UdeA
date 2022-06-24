
package objetos;

import javax.swing.JOptionPane;


public class x {
    public static void main(String[] args) {
        int a=0,b=0;
        String c="",d="";
        
       
        c=JOptionPane.showInputDialog("ingrese la marca del vehículo");
        d=JOptionPane.showInputDialog("ingrese el modelo del vehiculo");
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese cilindraje"));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de llantas"));
        
       // vehiculo v1= new vehiculo("mazda", "ct45-a", 2300, 4);
        //vehiculo v2= new vehiculo(c, d, b, a);
        //los set son para asignar valores en objetos
        vehiculo v3 = new vehiculo();        
        v3.setMarca(c);
        v3.setModelo(d);
        v3.setCilindraje(a);
        v3.setLlantas(b);
        int x=v3.multipicarDatos();
    //get en objetos son para obtener los datos
        System.out.println(v3);
        //System.out.println(v3.toString());
        //System.out.println("#####");
        //System.out.println(v2.toString());
    }
}
