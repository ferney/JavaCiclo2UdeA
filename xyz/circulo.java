
package xyz;

public class circulo extends figura{
private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
    return Math.PI*this.radio*this.radio;
    }

    @Override
    public double getPerimetro() {
    return Math.PI*this.radio*2;
    }

    
}
