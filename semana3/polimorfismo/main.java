
package polimorfismo;

import java.util.*;

public class main {
    public static void main(String[] args) {
        bicicleta bici,bici1,bici2,bici3,bici4;
        
        bici= new bicicleta();
        bici1= new bicicleta("Trek", "rojo", "sram", 0);
        bici2= new biciMontania(5, "strak", "verde","shimano", 5);
        bici3= new biciRuta(7, "xyz", "gris", "sram", 45);
        bici4= new biciMontania();
        bici4.frenar();
        //bici4.subirCambios();
        System.out.println(bici.getDescripcion());
        System.out.println(bici1.getDescripcion());
        System.out.println(bici2.getDescripcion());
        System.out.println(bici3.getDescripcion());
        System.out.println(bici4.getDescripcion());
         
         biciMontania x= new biciMontania();
         x.setColor("gris");
         x.setMarca("specializer");
         x.pedalear(5);
         x.subirCambio();
         x.subirCambio();
         x.subirCambio();
         x.bajarCambios();
         
         
         List<bicicleta> bicicletas= new ArrayList<>();
         bicicletas.add(bici);
         bicicletas.add(bici1);
         bicicletas.add(bici2);
         bicicletas.add(bici3);
         bicicletas.add(bici4);
         bicicletas.add(x);
         
         mecanico juanMecanico= new mecanico();
         juanMecanico.getMisPedales().add("Scott");
         juanMecanico.getMisPedales().add("xyz");
         juanMecanico.getMisPedales().add("zzzz");
         juanMecanico.getMisPedales().add("yyyy");
         juanMecanico.getMisPedales().add("tttt");
         juanMecanico.getMisPedales().add("ssss");
         
         for (bicicleta miCicla: bicicletas) {
            juanMecanico.ponerPedales(miCicla);
        }
    }
            
}
