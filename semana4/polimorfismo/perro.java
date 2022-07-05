
package com.mycompany.polimorfismo;

public class perro extends aminal{
   String raza;

    public perro(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void mostrar(){
        System.out.println(getNombre()+", "+getTipo_alimentacion()+", "+getEdad());
    }
    
   @Override
    public void alimentarse(){
        System.out.println("me alimento de croquetas");
    } 
}
