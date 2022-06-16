package com.mycompany.notas;

import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {
        int z[]={1,2,3,4};
        int notas[]= new int[4];
        String nombres[]= new String[4];
        String aprobo[]= new String[4];
        String desaprobo[]= new String[4];
        String msj="";
        for (int i = 0; i < 4; i++) {
            String n=JOptionPane.showInputDialog("ingrese el nombre del estudiante");
            int nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota de "+n));
            nombres[i]=n;
            notas[i]=nota;
        }
        for (int i = 0; i < 4; i++) {
            if (notas[i]>=3) {
                aprobo[i]=nombres[i]+"\t"+notas[i];                
            }else{
                desaprobo[i]=nombres[i]+"\t"+notas[i]; 
            }
        }
        System.out.println("lista de estudiantes");
        for (int i = 0; i < 4; i++) {
            msj+=nombres[i]+"\t"+notas[i]+"\n";
        }
        System.out.println(msj);
        System.out.println("Aprobados");
        for (int i = 0; i < aprobo.length; i++) {
            System.out.println(aprobo[i]);
        }
        System.out.println("Desaprobados");
        for (int i = 0; i < desaprobo.length; i++) {
            System.out.println(desaprobo[i]);
        }
    }
}
