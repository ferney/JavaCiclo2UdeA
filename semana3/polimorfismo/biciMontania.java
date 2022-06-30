
package polimorfismo;

public class biciMontania extends bicicleta{
   private int cambio;
    
   public biciMontania() {
        super();        
        this.cambio = 6;    
        
    }

    public biciMontania(int cambio, String marca, String color, String pedales, double velocidad) {
        super(marca, color, pedales, velocidad);
        if (cambio>0 && cambio<10) {
            this.cambio = cambio;
        } else {
            this.cambio = 6;
        }      
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
   public int getCambio(){
   return this.cambio;
   }
   
   @Override
   public void pedalear(double aceleracion){
   double aceleracionConCambios=aceleracion*(this.cambio/6);
   super.pedalear(aceleracionConCambios);
   }
   public void hacerAlgo(){
   this.frenar();
   }
   
   @Override
   public String getDescripcion(){
   return super.getDescripcion()+", y en el cambio "+ cambio;
   }
}
