/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class fecha {
    private int dia, mes, anio;
    
    public fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }   
    
    
    
    public int getDia() {
        return dia;
    }    

    public int getMes() {
        return mes;
    }   

    public int getAnio() {
        return anio;
    }   

    @Override
    public boolean equals(Object x){
        fecha otra=(fecha)x;        
    return dia==otra.dia && mes == otra.mes && anio == otra.anio;
    }

    /*@Override
    public String toString(){
    return dia+"/"+mes+"/"+anio;
    }*/
    
}
