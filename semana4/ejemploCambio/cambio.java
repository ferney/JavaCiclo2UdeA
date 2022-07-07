
package ejemploCambio;

public class cambio {
    private double soles, euros, dolares,pesos;

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

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }
    //dolras a otros
    double calcularDolaresAPesos() {
       return getDolares()*4350;
    }

    double calcularDolaresAEuros() {
   return getDolares()*1.1;
    }

    double calcularDolaresASoles() {
        return getDolares()*3.39;
    }
//calcular euros
    double calcularEurosAPesos() {
    return getEuros()*4437;
    }

    double calcularEurosADolares() {
   return getEuros()*1.02;
    }

    double calcularEurosASoles() {
   return getEuros()*3.97;
    }
    
}
