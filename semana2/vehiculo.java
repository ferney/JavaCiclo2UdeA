
package objetos;

public class vehiculo {
    //atributos
   private String marca, modelo;
   private double cilindraje;
   private int llantas;
//constructor
    public vehiculo(String marca, String modelo, double cilindraje, int llantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
       this.llantas=llantas;
    }
   

    vehiculo() {
    }
 //metodos
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    //dato de vuelta

    @Override
    public String toString() {
        return  marca + "," + modelo + ", " + cilindraje + "," + llantas ;
    }
    
     int multipicarDatos() {
        int y=(int) (getLlantas()*getCilindraje());
        return y;
    }
}
