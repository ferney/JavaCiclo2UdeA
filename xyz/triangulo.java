/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class triangulo extends figura{
private double base,altura, lado1,lado2;

    public triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

   
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
    return (this.base*this.altura)/2;
    }

    @Override
    public double getPerimetro() {
   return 2*this.lado1 + this.base;
    }
    
}
