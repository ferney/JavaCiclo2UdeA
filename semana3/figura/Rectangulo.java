/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class Rectangulo extends Figura{
    private double lado;

    public Rectangulo(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro() {
        return 4*lado;
     }

   
}
