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
public class C2G50KevinFlorezReto1Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String nombre;
        final float smlv = 900000; 
        float costoCredito,incremento,descuento,baseMatricula,totalMatricula;
        short cantCreditos,programa,hijos; 
        char genero;
        boolean continuar; 
        int cateee, catesa, caot,nest;
        
        continuar = true; 
        cateee = 0; catesa = 0; caot = 0; nest = 0;
        
        float totalRecaudo, mayorMatricula;
        totalRecaudo = 0; mayorMatricula = 0;
        
        float Totales[];
        Totales = new float[5];
        
        DecimalFormat f = new DecimalFormat("$#,###.##");
        
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
        }while((genero != 'F') & (genero !='M'));
        
        costoCredito = smlv/10;
        incremento = 0;
        descuento = 0;
        totalMatricula = 0;
//        hijos = 0;
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
    
        JOptionPane.showMessageDialog(null, "Detalle matricula de "+nombre.toUpperCase()+
                "\nCosto Credito: "+f.format(costoCredito)+"\nBasico Matricula: "+f.format(baseMatricula)+
                "\nIncremento por programa: "+f.format(incremento)+"\nDescuento por hijos: "+f.format(descuento)+
                "\nTotal Matricula: "+f.format(totalMatricula)
                ,"Resultado Facturación",JOptionPane.INFORMATION_MESSAGE);
        
//   calculos mientras realizamos la parte de vector 
        totalRecaudo += totalMatricula; 
        if(totalMatricula > mayorMatricula){
            mayorMatricula = totalMatricula;
        }
        ///////////////ALIMENTANDO VECTOR 
        Totales[nest-1] = totalMatricula;
        /////////////
    
        if(nest > 2 & nest < 5){
            int resp=JOptionPane.showConfirmDialog(null,"Desea calcular otra matricula?");
            if (JOptionPane.OK_OPTION == resp){
                System.out.println("Selecciona opción Afirmativa");
                continuar = true;
            }
            else{
                System.out.println("No selecciona una opción afirmativa");
                continuar = false;
            }
        }else if(nest == 5){
            continuar = false;
            JOptionPane.showMessageDialog(null, "Solo se permiten maximo 5 calculos de matricula","Registro se completó",JOptionPane.WARNING_MESSAGE);
        }
        
    }while(continuar);
    
    JOptionPane.showMessageDialog(null, "Tecnología EE: "+cateee+"\nTecnología Salud: "+catesa+
            "\nOtros: "+caot+"\n\nTotal Estudiantes: "+nest,"Estudiantes por programa Punto 2(a)"
            ,JOptionPane.INFORMATION_MESSAGE);
     
    //    punto 2 B,
    JOptionPane.showMessageDialog(null, "Total Recaudo: "+f.format(totalRecaudo)+
            "\n\nMatricula más alta: "+f.format(mayorMatricula)
            ,"Datos financieros Punto 2(b)",JOptionPane.INFORMATION_MESSAGE);

    //////AGREGADO DESPUES DE LA CLASE VECTORES
        float sumTotal,mayorMat;
        
        Arrays.sort(Totales);
        sumTotal = 0;
        mayorMat = Totales[Totales.length -1];
        
        for(int i = 0; i < Totales.length; i++){
            sumTotal+=Totales[i];
        }
    /////MANDO POR CONSOLA PARA NO SATURAR DE VENTANAS, Y PROBAR RESULTADO SIMILAR USANDO VECTOR
        System.out.println("");
        System.out.println("2b-a. "+f.format(sumTotal));
        System.out.println("2b-b. "+f.format(mayorMat));
    }
   
}
