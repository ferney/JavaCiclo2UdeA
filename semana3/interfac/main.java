
package interfac;

public class main {
    public static void main(String[] args) {
        gato g= new gato();
        String nombre=g.mostrarNombre();
        System.out.println(nombre);
        g.mostrarEdad();
        g.tipoDeAnimal();
        g.comida();
    }
}
