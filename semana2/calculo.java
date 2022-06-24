
package com.mycompany.metodos;

public class calculo {

    static int suma(int a, int b) {
        int acumulador=0;
        for (int i = 0; i < 10; i++) {
            
                acumulador+=a*b;          
            
        }       
        
    return acumulador;
    }

    static double suma(double a, double b) {
    return a+b;
    }

    static String suma(String a, String b) {
    return a+b;
    }

   
   
}
