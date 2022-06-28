
package figura;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
       return 2*3.1416*radio;
    }

   public double calcularArea() {
    return 3.1416*(radio*radio);
    }

    

    
    
    
}
