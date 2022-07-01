
package interfac;

public class gato implements Animal,seresVivos,alimento{

    @Override
    public void tipoDeAnimal() {
        System.out.println("soy un felino");
    }

    @Override
    public String mostrarNombre() {
        return "michi";
    }

    @Override
    public void mostrarEdad() {
        System.out.println("tengo 3 años");
    }

    @Override
    public void comida() {
        System.out.println("como pepitas");
    }
    
}
