
package interface2;

public class carro implements onOff{
private String modelo;

    public carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println("auto encendido");
    }

    @Override
    public void apagar() {
    System.out.println("auto apagado");
    }

    @Override
    public String toString() {
        return modelo;
    }

  
    
}
