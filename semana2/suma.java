
package com.mycompany.ejemploo;

//import xyz.uno;


import  java.util.Arrays;
public class suma {
    public static void main(String[] args) {  
      
      
        //System.out.println(calculo.multiplicacion());
        //e=uno.resta(a,b);
        //System.out.println(e);
        int[] ventas={23000,45000,1800,2000};
        System.out.println(ventas.length);
        int acum=0;
        for (int i = 0; i < ventas.length; i++) {
            acum+=ventas[i];
           
        }
        System.out.println(acum/ventas.length);
        
        /*int[] z=calculo.ventas(ventas);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
        /*System.out.println("la suma de las ventas es "+total);
        System.out.println("el otro toltal es "+calculoVenta);*/
    }
    

    
}


