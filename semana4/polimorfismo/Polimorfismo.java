
package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        //declarar el objeto perro
        aminal perro= new perro("xyz", "capitan", "ctd", 15);
        perro.alimentarse();
        //declarar otro perro
        aminal perro2= new perro("zzzz", "kaiser", "ctd", 10);
         perro2.alimentarse();
         
         //declaramos un gato
         aminal gato=new gato("zzzz", "kaiser", "ctd", 10);
         gato.alimentarse();
         //...
         
    }
}
