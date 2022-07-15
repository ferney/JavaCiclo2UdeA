/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class xyz {

    static int mayor(int[] z) {
     return Arrays.stream(z).max().getAsInt();
    }

    static int menor(int[] z) {
     return Arrays.stream(z).min().getAsInt();
    }

    static double promedio(int[] z) {        
       return Arrays.stream(z).average().getAsDouble();
    }
    
}
