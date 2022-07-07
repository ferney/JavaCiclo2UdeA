
package ejemploCambio;

public class cambio1 {
    private double soles, euros, dolares;

    public cambio1(double soles, double euros, double dolares) {
        this.soles = soles;
        this.euros = euros;
        this.dolares = dolares;
        
    }

    
    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double calculoMontoPesos(){
    return (getDolares()*4350)+(getEuros()*4450)+(getSoles()*1117);
    }
    
}
