
package POO2;

import javax.swing.JOptionPane;

public class BiciTrocha {
    public static void main(String[] args) {
        double velocidad=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad"));
        String marca=JOptionPane.showInputDialog("Ingrese la marca");               
        String color=JOptionPane.showInputDialog("Ingrese el color");
        int cambio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cambio"));
        
        BicicletaMontania miTrochera= new BicicletaMontania((int) velocidad, marca, color, cambio);
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.pedalear(5);
        miTrochera.pedalear(5);
        System.out.println(miTrochera.getMarca()+"\n"+miTrochera.getColor()+"\n"
                +miTrochera.getVelocidad()+"\n"+miTrochera.getCambio());
        
    }
}
