/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemetodos;

import pizzeria.Pizza;

/**
 *
 * @author kevinf
 */
public class ClaseMetodos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza pz = new Pizza();
        System.out.println("Result "+pz.calcularGananciaUnitaria());
        pz.setNombre("peperoni");
        System.out.println("pizza: " + pz.getNombre());
    }
    
}
