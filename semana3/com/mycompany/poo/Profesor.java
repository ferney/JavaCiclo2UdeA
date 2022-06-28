
package com.mycompany.poo;

public class Profesor extends Persona{//extenciones de la clase persona
    
    private String materia, cargo;

    public Profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);//indica de donde esta 
        this.materia = materia;
        this.cargo = cargo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

     @Override
    public String toString() {
        return "Profesor{" + "materia=" + materia + ", cargo=" + cargo +  
                ", nombre=" + nombre +", edad=" + edad +'}';
    }
    
}
