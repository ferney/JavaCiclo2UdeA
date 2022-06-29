
package xyz;

public class cuadrado extends figura{
private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    @Override
    public double getArea() {
   return this.lado*this.lado;
    }

    @Override
    public double getPerimetro() {
   return this.lado*4;
    }
    
}
