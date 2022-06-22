/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructure;

import java.util.Scanner;

/**
 *
 * @author kevinf
 */
public class ControlStructure {
    public static void main(String[] args){
        String nombre;
        int codigo;
        char jornada;
        double promedio;
        
//        nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
//        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código: "));
//        jornada = JOptionPane.showInputDialog("Jornada (D/N): ").charAt(0);
//        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio: "));
//        
//        JOptionPane.showMessageDialog(null, "Hola. "+nombre+"\nTu código: "+codigo+"\nJornada: "+jornada+"\nPromedio: "+promedio);
//        System.out.println("Hola "+ nombre+" ,\nCodigo: "+codigo+"\nJornada: "+jornada+"\nPromedio: "+promedio);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Ingrese codigo: ");
        codigo = sc.nextInt();
        
        System.out.print("Jornada (D/N): ");
        jornada = sc.next().charAt(0);
        
        System.out.print("Ingrese promedio: ");
        promedio = sc.nextDouble();
    }
}
