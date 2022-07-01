
package interface2;


public class tv implements onOff{
    private String modelo;

    public tv(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void encender() {
        System.out.println("televisor encendido");
    }

    @Override
    public void apagar() {
    System.out.println("televisor apagado");
    }

    @Override
    public String toString() {
        return modelo;
    }
    
}
