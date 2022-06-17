package com.mycompany.cadenas;
public class Cadenas {

    public static void main(String[] args) {
        //obtener los milisegundos actuales
        long x=System.currentTimeMillis();
        //instanciar un vacio o nuevo sin datos
        StringBuffer a= new StringBuffer();
        //cuantos voy a concatenar?
        int n=100000;
        char c;//solo permite guardar un solo caracter --> "a" ó "b" ....
        for (int i = 0; i < n; i++) {
            //obtengo los caracteres entre A y Z
            c=(char)('A'+i%('Z'-'A'+1));
            a.append(c);
        }
        long y=System.currentTimeMillis();
        
        long w=System.currentTimeMillis();
        String k="";
        for (int i = 0; i < n; i++) {
            k=k+"h";
        }
        long z=System.currentTimeMillis();
        System.out.println("tienpo inicial "+x+"\ntienpo final "+y);
        System.out.println("###");
        System.out.println("tienpo inicial "+w+"\ntienpo final "+z);
       /*String x= new StringBuffer().append("hola ").append("que tal?").toString();
        System.out.println(x);*/
       
    }
}
