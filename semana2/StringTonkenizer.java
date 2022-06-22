package com.mycompany.ejemploo;
//import java.util.StringTokenizer;
public class StringTonkenizer {
    public static void main(String[] args) {
       /* String y="dario,daniel|carla+claudia";
        StringTokenizer s= new StringTokenizer(y,"(\\+|\\,|\\|)");       
        while (s.hasMoreTokens()) { System.out.println(s.nextToken());}
        System.out.println("###");
        String l[]=y.split("(\\+|\\,|\\|)");//{[dario,daniel],[carla],[],[],[]}
        for (String l1 : l) {
            System.out.println(l1);
        }*/
     String c1="hola";//0x34ert5678
     String c2="hola";//0x45rts456
     String c3="Hola";
        System.out.println(c1+"\t"+c2);
        //c1==c2 --> esto esta mal
        //asi si es correcto
        //and -->True
        if (c1.equals(c2) && c1.equals(c3) && c2.equals(c3)) {
            System.out.println("son iguales");
            
        } else {
            System.out.println("son diferentes");
        }
        
        int a=3;
        int b=3;
        if (a==b) {
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }
        char x='c';
        char d='c';
        if (x==d) {
         System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }
    }
}
