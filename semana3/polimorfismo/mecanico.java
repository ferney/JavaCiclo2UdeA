
package polimorfismo;

import java.util.*;

public class mecanico {
    private List<String> misPedales;

    public mecanico() {
        misPedales= new ArrayList<>();
    }

    public List<String> getMisPedales() {
        return misPedales;
    }

    
    public void setMisPedales(List<String> misPedales) {
        this.misPedales = misPedales;
    }
public void ponerPedales(bicicleta unaCicla){
String pedalesAPoner= this.misPedales.get(0);

unaCicla.setPedales(pedalesAPoner);
this.misPedales.remove(0);
    System.out.println("pongo pedales de la marca "+pedalesAPoner+ 
            " a una "+unaCicla.getClass().getSimpleName());

}
    
    
    
}
