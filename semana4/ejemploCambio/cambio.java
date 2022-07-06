/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploCambio;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class cambio {
    public double soles, euros, dolares,pesos;

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
    //calcular dolares
    public double calcularDolares(){
    return getPesos()*4250;
    }
    //calcular euros
    public double calcularEuros(){
    return getPesos()*4250;
    }
    //calcular soles
    public double calcularSoles(){
    return getPesos()*4250;
    }
    //calcular pesso
    public double calcularPesos(){
    return getPesos()*4250;
    }
}
