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
public class Impresion extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            try {
                Thread.sleep(10000);
                System.out.println("cliente "+(i+1));
                System.out.println("imprimiendo... ");
                 Thread.sleep(150000);
                System.out.println("impresion terminado\n impresora "+(i+1)+" libre");
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
            
        }
        System.out.println("fin impresiones");
    }
}
