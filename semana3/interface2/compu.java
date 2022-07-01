
package interface2;

public class compu implements onOff{
private String modelo;

    public compu(String modelo) {
        this.modelo = modelo;
    }

     @Override
    public void encender() {
        System.out.println("computador encendido");
    }

    @Override
    public void apagar() {
    System.out.println("computador apagado");
    }

    @Override
    public String toString() {
        return modelo;
    }
    
}
