/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author kevinf
 */
public class Cocinero {
    private String nombre;
    private Pizza pizza_1;
    private Pizza pizza_2;
    
    //constructor

    public Cocinero( Pizza pizza_1, Pizza pizza_2) {
        this.pizza_1 = pizza_1;
        this.pizza_2 = pizza_2;
    }
    
}
