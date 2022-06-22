/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author kevinf
 */
public class Pizza {
    private String nombre;
    private double costoProduccion;
    private double precioVenta;
    private int cantidadProducida;
    
    //constructor vacio
    public Pizza(){
        
    } 

    //constructor sobrecargado
    public Pizza(String nombre, double costoProduccion, double precioVenta) {
        this.nombre = nombre;
        this.costoProduccion = costoProduccion;
        this.precioVenta = precioVenta;
        cantidadProducida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadProducida() {
        return cantidadProducida;
    }

    public void setCantidadProducida(int cantidadProducida) {
        this.cantidadProducida = cantidadProducida;
    }
    
    public void modificarPrecio(double nuevoPrecio){
        precioVenta = nuevoPrecio;
    }
    
    public double calcularGananciaUnitaria(){
        return precioVenta - costoProduccion;
    }
}
