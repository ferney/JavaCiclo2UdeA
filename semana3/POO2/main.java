
package POO2;

public class main {
    public static void main(String[] args) {
        
        BicicletaMontania miBicicleta= new BicicletaMontania(0, "biker", "black", 75);
        System.out.println(miBicicleta.getVelocidad());
        miBicicleta.pedalear(5);
        miBicicleta.pedalear(2);
        System.out.println("####");
       System.out.println(miBicicleta.getVelocidad());
       miBicicleta.frenar(6);
        System.out.println("####");
       System.out.println(miBicicleta.getVelocidad());
       System.out.println(miBicicleta.getCambio());
       miBicicleta.subirCambio();
       miBicicleta.subirCambio();
        System.out.println(miBicicleta.getCambio());
        System.out.println(miBicicleta.getCambio());
       miBicicleta.bajarCambios();
       miBicicleta.bajarCambios();
       miBicicleta.bajarCambios();
        System.out.println(miBicicleta.getCambio());
        miBicicleta.frenar("fuerte");
        System.out.println(miBicicleta.getVelocidad());
    }
}
