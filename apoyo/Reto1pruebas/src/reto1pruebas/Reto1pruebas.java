/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1pruebas;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Reto1pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String nombre;
        final float smlv = 900000; ///como const en JS
        float costoCredito,incremento,descuento,baseMatricula,totalMatricula;
        short cantCreditos,programa,hijos; char genero;
//       variables para iteraciones y calculos 
        boolean continuar; int cateee, catesa, caot,nest;
        continuar = true; cateee = 0; catesa = 0; caot = 0; nest = 0;
        float totalRecaudo, mayorMatricula;
        totalRecaudo = 0; mayorMatricula = 0;
        /////////////
        float Totales[];
        Totales = new float[5];
        
    do{
        nest += 1;
        JOptionPane.showMessageDialog(null, "Calcular costo de matricula estudiante #"+nest,"Bienvenido",JOptionPane.INFORMATION_MESSAGE);
        
        nombre = JOptionPane.showInputDialog("Escriba el NOMBRE del estudiante");
        do{
            cantCreditos = Short.parseShort(JOptionPane.showInputDialog("Escriba la cantidad de CREDITOS a matricular"));
        }while(cantCreditos <= 0);
        
        do{
            Object prog = JOptionPane.showInputDialog(null,"Seleccione Un Programa",
                "programas ofertados", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Seleccione","Tecnología EE", "Tecnología Salud", "Otros" },"Seleccione");
            if(prog=="Tecnología EE"){
                programa = 1;
            }else if(prog == "Tecnología Salud"){
                programa = 2;
            }else if(prog == "Otros"){
                programa = 3;
            }else{
                programa = 0;
            }
//            programa = Short.parseShort(JOptionPane.showInputDialog("1. Tecnología EE\n2. Tecnología Salud\n3. Otros\nEscriba el CODIGO del Programa:"));
        }while((programa < 1) || (programa > 3));
        
        do{
            Object sexo = JOptionPane.showInputDialog(null,"Seleccione Un Genero",
                "Generos", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Seleccione","Femenino", "Masculino" },"Seleccione");
            if(sexo=="Femenino"){
                genero = 'F';
            }else if(sexo == "Masculino"){
                genero = 'M';
            }else{
                genero = '1';
            }
//            genero = JOptionPane.showInputDialog("Digite el GENERO del estudiante \n(M: masculino, F: femenino)").charAt(0);
        }while((genero != 'F') & (genero !='M'));
        
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
        String formatTM = formato.format(totalMatricula);
//        JOptionPane.showMessageDialog(null, "El total de la matricula para "+nombre.toUpperCase()+" es: "+valorFormateado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        String formatCC = formato.format(costoCredito);
        String formatBM = formato.format(baseMatricula);
        String formatI = formato.format(incremento);
        String formatD = formato.format(descuento);
        JOptionPane.showMessageDialog(null, "Detalle matricula de "+nombre.toUpperCase()+
                "\nCosto Credito: "+formatCC+"\nBasico Matricula: "+formatBM+
                "\nIncremento por programa: "+formatI+"\nDescuento por hijos: "+formatD+
                "\nTotal Matricula: "+formatTM
                ,"Resultado Facturación",JOptionPane.INFORMATION_MESSAGE);
        
//   calculos mientras realizamos la parte de vector 
        totalRecaudo += totalMatricula; 
        if(totalMatricula > mayorMatricula){
            mayorMatricula = totalMatricula;
        }
        ///////////////
        Totales[nest-1] = totalMatricula;
        /////////////77
    
        if(nest > 2){
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
            "\nOtros: "+caot+"\n\nTotal Estudiantes: "+nest,"Estudiantes por programa Punto 2(a)"
            ,JOptionPane.INFORMATION_MESSAGE);
     
    //    punto 2 B, mientras vemos vectores
    DecimalFormat formato = new DecimalFormat("$#,###.##");
        String valorFormatTR = formato.format(totalRecaudo);
        String valorFormatMM = formato.format(mayorMatricula);
    JOptionPane.showMessageDialog(null, "Total Recaudo: "+valorFormatTR+"\n\nMatricula más alta: "+valorFormatMM
            ,"Datos financieros Punto 2(b)",JOptionPane.INFORMATION_MESSAGE);
    
        System.out.println("array. "+Arrays.toString(Totales));
//        System.out.println("array. "+Totales[1]);
        float sum,may; 
         
        Arrays.sort(Totales);
        
        sum = 0;
//        may = totales[0];
        may = Totales[Totales.length -1];
        System.out.println("array SORT. "+Arrays.toString(Totales));
        for(int i = 0; i < Totales.length; i++){
            sum+=Totales[i];
//            if(Totales[i]>may){
//                may=Totales[i];
//            }
        }
        System.out.println("");
        System.out.println("2b-a. "+sum);
        System.out.println("2b-b. "+may);
    }
   
}
