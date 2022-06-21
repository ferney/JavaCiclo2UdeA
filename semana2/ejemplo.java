
package com.mycompany.ejemploo;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;
public class ejemplo {
    public static void main(String[] args) {
        //diferencias entre numeros de base 8 y base 16
        //                             0            0x
       /* int a=0x24acf;//son numeros en base 16 -->150223;
        System.out.println(a);
        
        int d=0537;//-->351
        System.out.println(d);       
       int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));        
        System.out.println("el valor ingresado es "+numero);
        System.out.println("El "+numero+" en binario es "+ Integer.toBinaryString(numero));
        System.out.println("El "+numero+" en octal es "+ Integer.toOctalString(numero));
        System.out.println("El "+numero+" en hexadecimal es "+ Integer.toHexString(numero));        
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese una base numérica"));
        String baseNumerica=Integer.toString(numero, n);
        System.out.println(numero+" en base("+n+") es "+ baseNumerica);
        int x=0B11010101010110;
        int y=0b1101010101_01010;*/
        //stringtokenizer
       
        //String x="juan,daniela,duvan,marcela";
        //String y="jua,n|d,aniel,a|d,uva,n|m,arcela";
         String[] z="juan|daniela|duvan|marcela".split("|");
         for (int i = 0; i < z.length; i++) {
             System.out.println(z[i]);
        }
        
        /* String zz="juan,daniela,duvan,marcela";
         String tk[] =zz.split("[,]");
        for (String tk1 : tk) {
            System.out.println(tk1);
        }
        
        StringTokenizer st = new StringTokenizer(z);
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }*/
    }
}


