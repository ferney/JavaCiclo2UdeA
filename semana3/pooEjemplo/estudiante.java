
package pooEjemplo;

public class estudiante {
    String nombre;
    int edad;

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "estudiante{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
