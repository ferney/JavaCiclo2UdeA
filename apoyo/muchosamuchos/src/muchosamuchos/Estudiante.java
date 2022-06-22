/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muchosamuchos;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class Estudiante {
    private int dni;
    private String nombre;
    public ArrayList<Asignatura> asignaturas = new ArrayList<>();
    
    public Estudiante(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    
       public void matricularAsignatura(Asignatura newasignatura){
        Asignatura asig;
        boolean encontrado = false;

        for(int i = 0; i< (asignaturas.size()) && (!encontrado); i++){
            asig = asignaturas.get(i);
            if(asig.getIdasig() == newasignatura.getIdasig()){
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("Ya la asignatura "+newasignatura.getNombre()+" fue matriculada por "+nombre);
        }else{
            asignaturas.add(newasignatura);
            newasignatura.asignarEstudiante(this);
            System.out.println("El estudiante "+nombre+" se matriculo con exito en "+newasignatura.getNombre());
        }
        
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
}
