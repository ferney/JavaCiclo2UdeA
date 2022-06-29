
package POO2;

public class BicicletaMontania extends bici{
   private int cambio;
    
   public BicicletaMontania() {
        super();        
        this.cambio = 6;    
        
    }
    public BicicletaMontania(int cambio, String marca, String color, double velocidad) {
        super(marca, color, velocidad);
        if (cambio>0 && cambio <=12) {
            this.cambio = cambio;
        } else {
            this.cambio = 6;
        }
        
    }

    
    
    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

   @Override
    public String getMarca() {
        return marca;
    }

   @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

   @Override
    public String getColor() {
        return color;
    }

   @Override
    public void setColor(String color) {
        this.color = color;
    }

   @Override
    public double getVelocidad() {
        return velocidad;
    }

   @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
   public void subirCambio(){
       if (this.cambio<12) {
           cambio++;
       }
   }
   public void bajarCambios(){
   if (this.cambio>1) {
           cambio--;
       }
   }
   
   @Override
   public void pedalear(double aceleracion){
   double aceleracionConCambios=aceleracion*(this.cambio/6);
   super.pedalear(aceleracionConCambios);
   }
   public void hacerAlgo(){
   this.frenar();
   }
}
