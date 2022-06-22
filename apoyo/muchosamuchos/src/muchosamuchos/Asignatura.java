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
public class Asignatura {
    private int idasig;
    private String nombre;
    public ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Asignatura(int idasig, String nombre){
        this.idasig = idasig;
        this.nombre = nombre;
    }
    
    public void asignarEstudiante(Estudiante newestudiante){
        Estudiante estu;
        boolean encontrado = false;

        for(int i = 0; i< (estudiantes.size()) && (!encontrado); i++){
            estu = estudiantes.get(i);
            if(estu.getDni() == newestudiante.getDni()){
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.print("El Estudiante "+newestudiante.getNombre()+ " existe en la DB");
        }else{
            estudiantes.add(newestudiante);
        }
        
    }

    public int getIdasig() {
        return idasig;
    }

    public String getNombre() {
        return nombre;
    }

}
