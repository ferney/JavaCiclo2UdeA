/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculo_de_notas;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class notas { 

    
   double [] notas= new double [4];
   String [] nombres= new String[4];

   
    
    
    private double notaPromedioCurso;  
    private int x, y, a, b;  
    private String msj1;
    private String nombre; 

    notas() {
       
    }

    public notas(double notaPromedioCurso, int x, int y, int a, int b, String msj1, String nombre) {
        this.notaPromedioCurso = notaPromedioCurso;
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.msj1 = msj1;
        this.nombre = nombre;
           }

    
    
public void registrarnota(double n, int i)  {   
    notas[(i-1)]=n;  } 

public void registrarnombre(String nom, int cod) {
        nombres[cod-1]=nom;
    }

public void calcularpromedio()  {   
    double suma=0;   
    for(int i=0;i<notas.length;i++)   { 
        suma=suma+notas[i];   
    }   
    notaPromedioCurso= suma/notas.length;  
}

public double darnotapromediocurso()  {   
    return notaPromedioCurso; 
} 

public String darnotaestudiante(int cod)  { 
    String mensaje=nombres[cod-1]+"\t"+notas[cod-1];
    return mensaje;  
} 

public String darlistadonotas()  {    
    String msj="Cod\tNombre\tNota\n";    
    for(int i=0;i<notas.length;i++)    {     
        msj=msj+(i+1)+"\t"+nombres[i]+"\t"+notas[i]+"\n";    
    }       return msj;  
}     

public String darlistaaprobados()  {   
    String msj="Alumno\tNombre\tNota\n";    
    for(int i=0;i<notas.length;i++)    {    
        if(notas[i]>=3.0)     { 
    msj=msj+(i+1)+"\t"+nombres[i]+"\t"+notas[i]+"\n";        
        } 
        if(notas[i]>=3.0)     {      
            x=4-(i++);      
            y=notas.length-x;     
            a=x*100/notas.length;     
            b=y*100/notas.length;
            msj1=a+"%\t"+b+"%\n";       
        } 
    }       
    return msj+msj1;  
}   

public String darlistadesaprobados()  {   
    String msj="Alumno\tNombre\tNota\n";    
    for(int i=0;i<notas.length;i++)    {    
        if(notas[i]<=2.99)     { 
            x=4-(i++);      
            y=notas.length-x;     
            a=x*100/notas.length;
            b=y*100/notas.length;
    msj+=(i+1)+a+"%\t"+notas[i]+"\t"+b+"%\n";        
        }  }
    return msj;  
}

   

    
}     
