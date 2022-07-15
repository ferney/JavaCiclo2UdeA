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
public class Fotocopia extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            try {
                Thread.sleep(10000);
                System.out.println("cliente "+(i+1));
                System.out.println("fotocopiando ");
                 Thread.sleep(8000);
                System.out.println("fotocoias terminadas\n fotocopiadora "+(i+1)+" libre  ");
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
            
        }
        System.out.println("fin fotocoliado");
    }
}
