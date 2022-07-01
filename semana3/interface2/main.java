
package interface2;

public class main {
    public static void main(String[] args) {
        carro c= new carro("Chevrolet");
        compu co =new compu("m1");
        tv miTV= new tv("LG");
        ///////////////
        System.out.println("El modelo del carro es "+c.toString());
        c.apagar();
        c.encender();
        System.out.println("El modelo del pc es "+co.toString());
        co.apagar();
        co.encender();
        System.out.println("El modelo del tv es "+miTV.toString());
        miTV.apagar();
        miTV.encender();
    }
}
