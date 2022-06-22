/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchosamuchos;

/**
 *
 * @author kevinf
 */
public class Muchosamuchos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante(11,"kevin");
        Estudiante e2 = new Estudiante(10,"daniel");
        Estudiante e3 = new Estudiante(12,"maria");
        
        Asignatura a1 = new Asignatura(101,"Calculo");
        Asignatura a2 = new Asignatura(102,"Fisica");
        Asignatura a3 = new Asignatura(103,"Programacion");
        Asignatura a4 = new Asignatura(104,"Deportes");
        
        e1.matricularAsignatura(a1);
        e1.matricularAsignatura(a2);
        e2.matricularAsignatura(a3);
        e1.matricularAsignatura(a4);
        e3.matricularAsignatura(a1);
        e1.matricularAsignatura(a2);
        e3.matricularAsignatura(a3);
        e3.matricularAsignatura(a3);
        
        
    }
    
}
