/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fotocopiadora;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class main {
    public static void main(String[] args) {
        Fotocopia hilo1= new Fotocopia();
        hilo1.start();
        Fotocopia hilo2= new Fotocopia();
        hilo2.start();
        Fotocopia hilo3= new Fotocopia();
        hilo3.start();
        Fotocopia hilo4= new Fotocopia();
        hilo4.start();
        Fotocopia hilo5= new Fotocopia();
        hilo5.start();
        Impresion hilo6= new Impresion();
        hilo6.start();
        Impresion hilo7= new Impresion();
        hilo7.start();
        Impresion hilo8= new Impresion();
        hilo8.start();
        
        
    }
    
            
}
