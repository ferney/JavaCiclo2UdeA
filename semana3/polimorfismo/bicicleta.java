
package polimorfismo;

public class bicicleta {
    private String marca,color,pedales;
    private double velocidad;

    public bicicleta() {
        this.marca="gw";
        this.color="rojo";
        this.velocidad=0;
        this.pedales="Shimano";
    }    
    
    public bicicleta(String marca, String color, String pedales, double velocidad) {
        this.marca = marca;
        this.color = color;
        this.pedales = pedales;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public void pedalear(double aceleracion){
    this.velocidad=this.velocidad+aceleracion;
    }
    public void frenar(){
        if (this.velocidad>0) {
            this.velocidad--;
        }
    }
    
    public String getDescripcion(){
        return "marca: "+marca+", color: "+color+", velocidad: "+velocidad+", pedales: "+pedales;
    }
}
