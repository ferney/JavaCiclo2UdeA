
package com.mycompany.poo;

public class Estudiante extends Persona{
    private String carrera;
    private int semestre;

    public Estudiante(String carrera, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
   

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + ", semestre=" + semestre + 
                ", nombre=" + nombre +", edad=" + edad +'}';
    }

         
      
    
}
