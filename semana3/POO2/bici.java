
package POO2;

public class bici {
    String marca,color;
    double velocidad;

    public bici() {
        this.marca = "GW";
        this.color = "gris";
        this.velocidad = 0;
    }

    
    public bici(String marca, String color, double velocidad) {
        this.marca = marca;
        this.color = color;
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

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    // generar algubos metodos/operaciones
    public void pedalear(double aceleracion){
    this.velocidad=this.velocidad+aceleracion;
    }
    public void frenar(){
        if (this.velocidad>0) {
            this.velocidad--;            
        }
    }
    public void frenar(double aceleracionNegativa){
        if (this.velocidad>aceleracionNegativa) {
            this.velocidad=this.velocidad-aceleracionNegativa;
        }
    }
    public void frenar(String intencidad){
        switch (intencidad) {
            case "fuerte" -> {
                if (this.velocidad>10) {
                    this.velocidad=this.velocidad-30;
                }
            }
            case "media" -> {
                if (this.velocidad>5) {
                    this.velocidad=this.velocidad-10;
                }
            }
            default -> {
                    if (this.velocidad>0) {
                            this.velocidad--;
                            }
            }
        }
    }
            
}
