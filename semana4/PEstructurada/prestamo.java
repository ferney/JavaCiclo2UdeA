
package PEstructurada;

public class prestamo {
    //atributos
    private String moneda,bien;
    private double tasa,incial,valor;
    private int meses;


    //getters y setters
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getIncial() {
        return incial;
    }

    public void setIncial(double incial) {
        this.incial = incial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    //metodos de calculo o procedimientos
    public double calculoCuotaInicial(){
    return valor*0.2;
    }
    public double calcularRiesgo(){
    return valor*calculoCuotaInicial();
    }
    public double calculoCuotaMensual(){
    return (calcularRiesgo()*1.12)/meses;
    }
}
