
package polimorfismo;

public class biciRuta extends bicicleta{
    private double anchoNeumatico;

    public biciRuta() {
        this.anchoNeumatico = 28;
    }

    public biciRuta(double anchoNeumatico, String marca, String color, String pedales, double velocidad) {
        super(marca, color, pedales, velocidad);
        if (anchoNeumatico >17 && anchoNeumatico <=62) {
            this.anchoNeumatico = anchoNeumatico;
        } else {
            this.anchoNeumatico = 28;
        }
        
    }

    public double getAnchoNeumatico() {
        return anchoNeumatico;
    }

    public void setAnchoNeumatico(double anchoNeumatico) {
        this.anchoNeumatico = anchoNeumatico;
    }
    
    @Override
   public String getDescripcion(){
   return super.getDescripcion()+", y con ancho de neumatico "+ anchoNeumatico;
   }
    
}
