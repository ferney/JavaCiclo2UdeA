/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class main {
    public static void main(String[] args) {
       Circulo miCirculo= new Circulo(23.8, "circulo");
       
        System.out.println(miCirculo.calcularArea());
        System.out.println(miCirculo.calcularPerimetro());
        
        Rectangulo miRectangulo= new Rectangulo(12.5, "rectangulo");
        System.out.println(miRectangulo.calcularArea());
        System.out.println(miRectangulo.calcularPerimetro());
    }
}
