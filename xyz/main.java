
package xyz;

public class main {
    public static void main(String[] args) {
        cuadrado c= new cuadrado(45);
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());
        
        circulo ci = new circulo(5.7);
        System.out.println(ci.getArea());
        System.out.println(ci.getPerimetro());
        triangulo t= new triangulo(23, 12, 15, 15);
        System.out.println(t.getArea());
        System.out.println(t.getPerimetro());
    }
}
