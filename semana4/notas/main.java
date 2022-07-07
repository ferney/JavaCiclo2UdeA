/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

import java.util.ArrayList;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class main {
    public static void main(String[] args) {
        ArrayList<empleado> em= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            em.set(i, new empleado("s", 20));
            
        }
        
    }
            
}
