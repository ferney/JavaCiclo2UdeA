/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculo3;

import java.util.ArrayList;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class notas { 

    //creamos un arraylist
    ArrayList<studiante> es= new ArrayList();
  //mensajes de salida, uno para el encabezado y el otro para sacar los datos
 String msj="Alumno\tNota1\n",msj1="";
  
  //declaramos variables para almacenar los datos
  double promedio,suma;
   
  
  // metodo de registro de datos
   void registrar(String nom, double n) {
       //se adiciona al arraylist el nombre y la nota del nuevo estudiente
       es.add(new studiante(nom, n));
    }

   //metodo de muestra de solo los aprobados
   //se crea otro arraylist solo para guardar los aprobados
  String darlistaaprobados() {
       ArrayList<studiante> Aprob = new ArrayList();
       for (int i = 0; i < es.size(); i++) {
           if (es.get(i).getNota()>=3.0) {
               Aprob.add(es.get(i));
           }
      }
     //se recorre el arraylist y se guardan en la variable msj para mostrar
      for (int i = 0; i < Aprob.size(); i++) {
          msj1+=Aprob.get(i);
      }
      return msj+msj1;
    }
  
   //metodo de muestra de solo los desaprobados
   //se crea otro arraylist solo para guardar los desaprobados
    String darlistadesaprobados() {
        ArrayList<studiante> Desaprob = new ArrayList();
       for (int i = 0; i < es.size(); i++) {
           if (es.get(i).getNota()<3.0) {
               Desaprob.add(es.get(i));
           }
      }
     //se recorre el arraylist y se guardan en la variable msj para mostrar
      for (int i = 0; i < Desaprob.size(); i++) {
          msj1+=Desaprob.get(i);
      }
      return msj+msj1;
       
    }


  
  //se recorre el arraylist, se suman las notas y se saca el promedio
    double darnotapromediocurso() {
        suma=0;
        for (int i = 0; i < es.size(); i++) {
            suma+=es.get(i).getNota();
        }
        return promedio=suma/es.size();
         }

    
    
    //se devuelve el estudiante que se requiere
    studiante darnotaestudiante(int cod) {
        return es.get(cod-1);
    }
 
    
    //se davuelven todos los estudiantes del arraylist
    String darlistadonotas() {
        for (int i = 0; i < es.size(); i++) {
           msj1+= es.get(i);
            
        }
     return msj+msj1;
    }

    
   
    
    void limpiar() {
       msj1="";
    }

    

  
}     
