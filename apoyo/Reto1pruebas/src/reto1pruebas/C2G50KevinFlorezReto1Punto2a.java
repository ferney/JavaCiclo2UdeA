/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2g50kevinflorezreto1punto2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class C2G50KevinFlorezReto1Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        float smlv,costoCredito,incremento,descuento,baseMatricula,totalMatricula;
        short cantCreditos,programa,hijos; 
        char genero;
//       variables para iteraciones y calculos 
        boolean continuar; 
        int cateee, catesa, caot,nest;
        continuar = true; 
        cateee = 0; 
        catesa = 0; 
        caot = 0; 
        nest = 0;
        
        float totalRecaudo, mayorMatricula;
        totalRecaudo = 0; 
        mayorMatricula = 0;
        
    do{
        nest += 1;
        JOptionPane.showMessageDialog(null, "Calcular costo de matricula estudiante #"+nest,"Bienvenido",JOptionPane.INFORMATION_MESSAGE);
        
        nombre = JOptionPane.showInputDialog("Escriba el NOMBRE del estudiante");
        do{
            cantCreditos = Short.parseShort(JOptionPane.showInputDialog("Escriba la cantidad de CREDITOS a matricular"));
        }while(cantCreditos <= 0);
        
        do{
            programa = Short.parseShort(JOptionPane.showInputDialog("1. Tecnología EE\n2. Tecnología Salud\n3. Otros\nEscriba el CODIGO del Programa:"));
        }while((programa < 1) || (programa > 3));
        
        do{
            genero = JOptionPane.showInputDialog("Digite el GENERO del estudiante \n(M: masculino, F: femenino)").charAt(0);
        }while((genero != 'F') & (genero !='M'));
        
        smlv = 900000;
        costoCredito = smlv/10;
        incremento = 0;
        descuento = 0;
        totalMatricula = 0;
        hijos = 0;
        baseMatricula = costoCredito * cantCreditos;
        switch (genero) {
            case 'M':
                switch (programa) {
                    case 1:
                        incremento = (float) (baseMatricula * 0.15);
                        cateee += 1;
                        break;
                    case 2:
                        incremento = (float) (baseMatricula * 0.325);
                        catesa += 1;
                        break;
                    case 3:
                        incremento = (float) (baseMatricula * 0.045);
                        caot += 1;
                        break;
                    default:
                        break;
                }
                totalMatricula = baseMatricula + incremento;
                break;
            case 'F':
                switch (programa) {
                    case 1:
                        incremento = (float) (baseMatricula * 0.1);
                        cateee += 1;
                        break;
                    case 2:
                        incremento = (float) (baseMatricula * 0.207);
                        catesa += 1;
                        break;
                    case 3:
                        incremento = (float) (baseMatricula * 0.032);
                        caot += 1;
                        break;
                    default:
                        break;
                }
                    hijos = Short.parseShort(JOptionPane.showInputDialog("Por ser mujer se te otorga un DESCUENTO por hijos\nEscriba la cantidad de hijos:"));
                if(hijos <= 2){
                    descuento = 30000 * hijos;
                }else if((hijos > 2) & (hijos <= 5) ){
                    descuento = (float) (baseMatricula * 0.25);
                }else if(hijos > 5){
                    descuento = (float) (baseMatricula * 0.35);
                }
                totalMatricula = baseMatricula + incremento - descuento;
                break;
            default:
                break;
        }
//        //Creación de un formato con separadores de decimales y millares, con 2 decimales
        DecimalFormat formato = new DecimalFormat("$#,###.##");
        String valorFormateado = formato.format(totalMatricula);
        JOptionPane.showMessageDialog(null, "El total de la matricula para "+nombre.toUpperCase()+" es: "+valorFormateado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        
//   calculos mientras realizamos la parte de vector 
        totalRecaudo += totalMatricula; 
        if(totalMatricula > mayorMatricula){
            mayorMatricula = totalMatricula;
        }
    
        if(nest >= 3){
            int resp=JOptionPane.showConfirmDialog(null,"Desea calcular otra matricula?");
            if (JOptionPane.OK_OPTION == resp){
                System.out.println("Selecciona opción Afirmativa");
                continuar = true;
            }
            else{
                System.out.println("No selecciona una opción afirmativa");
                continuar = false;
            }
        }
        
    }while(continuar);
    
    JOptionPane.showMessageDialog(null, "Tecnología EE: "+cateee+"\nTecnología Salud: "+catesa+
            "\nOtros: "+caot+"\n\nTotal Estudiantes: "+nest,"Estudiantes por programa Punto 2(a)",JOptionPane.INFORMATION_MESSAGE);
     
    //    punto 2 B, mientras vemos vectores
    DecimalFormat formato = new DecimalFormat("$#,###.##");
        String valorFormatTR = formato.format(totalRecaudo);
        String valorFormatMM = formato.format(mayorMatricula);
    JOptionPane.showMessageDialog(null, "Total Recaudo: "+valorFormatTR+"\n\nMatricula más alta: "+valorFormatMM,"Datos financieros Punto 2(b)",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
