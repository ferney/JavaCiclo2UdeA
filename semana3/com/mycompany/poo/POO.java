
package com.mycompany.poo;
public class POO {

    public static void main(String[] args) {
       Persona p= new Persona("carlos", 45);
        System.out.println(p.toString());
             
       
     Estudiante e= new Estudiante("sistemas", 8, "ferney", 20);
     
        System.out.println(e.toString());
      Profesor profe= new Profesor("ciclo 2", "formador", "william", 35);
        System.out.println(profe.toString());
    }
}
