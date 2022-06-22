/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreCompleto;
int cod;
byte opc;
char programa;
float totalpagar;
float totalvalor = 0;
int creditos;
float smlv = 900000;
int hijos = 0;
char sigue = 0;

 Scanner sc = new Scanner(System.in);

 cod = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo del estudiante: "));
nombreCompleto = JOptionPane.showInputDialog("Ingrese su nombre: ");
creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de créditos: "));

 System.out.println("Codigo ingresado: " + cod);
System.out.println("Nombre ingresado: " + nombreCompleto);
System.out.println("Créditos ingresado: " + creditos);

 System.out.println("Seleccione Programa Técnico:\n1. Tecnologia en Electricidad y Electronica\n 2. Técnologia en Salúd\n3. Otros: ");

 do {
totalpagar = creditos * smlv;

 System.out.print("\n Especifique el genero: H/M: ");
   sigue = sc.next().charAt(0);
while (sigue == 'M');

 System.out.println("1. Menor o igual a 2 hijos obtiene $30.000 por cada hijo");
System.out.println("2. Entre 3 y 5 hijos obtiene 25% de descuento sobre el costo base de la matricula");
System.out.println("3. Más de 5 hijos obtiene 35% de descuento sobre el costo base de la matricula");

 hijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de Hijos: "));

 System.out.print("\nIngrese su opción: ");
opc = sc.nextByte();
switch (opc) {
case 1:
if (hijos <= 2) {
totalvalor = totalpagar - (hijos * 30000);
}

 JOptionPane.showMessageDialog(null, "El total a pagar es " + totalvalor);
break;

 case 2:
if (hijos >= 3) {
totalvalor = totalpagar * hijos * (float) 0.25;
}

 JOptionPane.showMessageDialog(null, "El total a pagar es " + totalvalor);
break;

 case 3:
if (hijos >= 5) {
totalvalor = (totalpagar * (float) 0.35) * (hijos);
}

 JOptionPane.showMessageDialog(null, "El total a pagar es " + totalvalor);
break;

 default: //System.out.println("\nOPERACION SUMA");
JOptionPane.showMessageDialog(null, "Opción no válida");
break;

 }
System.out.println("Desea realizar otro cálculo? (S/N): ");
sigue = sc.next().charAt(0);
}while (sigue == 'S');
    }
    
}
