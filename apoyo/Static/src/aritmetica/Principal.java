/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

/**
 *
 * @author kevinf
 */
public class Principal {
    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 18;
        int suma, resta;
        
        Operaciones oper = new Operaciones();
        suma = oper.suma(num1, num2);
        System.out.println("suma: "+suma);
        resta = Operaciones.resta(num1,num2); 
        System.out.println("resta: "+resta);
    }
}
