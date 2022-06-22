package com.mycompany.ejemploo;

import javax.swing.JOptionPane;

public class laboratorio {
    public static void main(String[] args) {
        //programa que muestre los pares menores de 10*
        /*      
        for (int i = 0; i < 10; i++) {
            if (i%2==0)JOptionPane.showMessageDialog(null, ""+i);
                //System.out.println(i);            
        }
        //programa que muestre los primos menores de 50*
        String a="2,3,5,7";
        String x[]=a.split("[,]");
        for (String x1 : x) {
            JOptionPane.showMessageDialog(null, x1);
        }
        
        for (int i = 8; i < 50; i++) {            
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
                // f   and    v         v          v
                JOptionPane.showMessageDialog(null, ""+i);
            
        }
        
        boolean primo=true;
        for (int i = 1; i < 50; i++) {
            primo=true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0) {
                    primo=false;                    
                }}
            if (primo) {//si primo es true
                    System.out.println(i);                    
                }               
            }
        }*/
        
        /*
        int y=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numeroi"));
        if (y%2==0 && y<10) {
            System.out.println("es par");
            
        } else {
            System.out.println("es impar");
        }*/
        
        //un programa que muestre todas las convinacones tred numeros
        //segun el trinagul d epitagoras <=50
        
        int a,b,c;
        System.out.println("a=b*2+c*2");
        for (int i = 1; i <=50; i++) {
            for (int j = 1; j <=50; j++) {
                for (int k = 1; k<=50; k++) {
                    if (i*i==j*j+k*k && j<k) {
                        System.out.println(i+" "+j+" "+k+"\t"+i*i+"="+j*j+"+"+k*k);
                                            
                    }
                }
                
            }
            
            
        }
        
    }
}
