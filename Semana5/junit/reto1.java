/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class reto1 {

    static int mayor(int a, int b, int c) {
        int x=0;
        if (a>b && a>c){
           x= a;
    }else if(b>a && b>c ){
       x= b;
    }else{
       x=c;
    }
        return x;
    
    }

    static int menor(int a, int b, int c) {
   
   int x=0;
        if (a>b && b>c){
           x= c;
        }else if(a>b && c>b ){
            x= b;
           }else{
       x=a;
    }
        return x;
    }

    static double promedio(int a, int b, int c) {
    return (a+b+c)/3;
    }
    
}
