

package com.mycompany.paroimpar;

import javax.swing.JOptionPane;
public class Paroimpar {

    public static void main(String[] args) {
        
        int [] array ={1,2,3,4,5,6,7,8,9,10};
        
        int s=Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));
        System.out.println(s);
        
        /*for (int i = 0; i <=s; i++) {
            array[i]=i;
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("######");
        for(int z:array){
            System.out.print(z+",");
        }
//int a=57,b=57;
        //int resto=a%2;
        
        /*if(a>b){
            System.out.println("es par");
        }else if(a<b){
            System.out.println("es impar");
        }else{
        System.out.println("son iguales");
        }
        
        String msj=(a>b)?"a es mayor":(a<b)?"b es mayor":(a<b)?"b es mayor":"son iguales";
        System.out.println(msj);
        */
        //System.out.println((resto==0)?"es par":"es impar");
       
       /*double peso=15,distancia=200,costo;
       costo=9000*(peso/5)*(distancia/60);
        System.out.println(costo);
       
       double obreros=5, horas=10, dias;
       dias=25*(12/obreros)*(8/horas);
	       System.out.println(dias);
       
       int d=1;
       String dia;
       
       if(d==1){
       dia="lunes";
       }else if (d==2){
       dia="lunes";
       }else if (d==3){
       dia="lunes";
       }else if (d==4){
       dia="lunes";
       }else if (d==5){
       dia="lunes";
       }else{
       dia="fin de semena";
       }

       
       
       
       
        switch (d) {
            case 1:dia ="lunes";break;
            case 2:dia ="lunes";break;
            case 3:dia ="lunes";break;
            case 4:dia ="lunes";break;
            case 5:dia ="lunes";break;
            default:
                dia="es fin de semana";
        }
        System.out.println(dia);
        
        dia = switch (d) {
            case 1 -> "lunes";
            case 2 -> "lunes";
            case 3 -> "lunes";
            case 4 -> "lunes";
            case 5 -> "lunes";
            default -> "es fin de semana";
        };*/
      // int i=100,c=1;
       
       /* while (c<=i/*true) {
            System.out.println(c);
            c++;// c=c+1 == c+=1
        }
       
        System.out.println("############");
        do {            
            System.out.println(c);
            c++;// c=c+1 == c+=1
        } while (c<=i);
       
            
        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }*/
       
       
    }
}
