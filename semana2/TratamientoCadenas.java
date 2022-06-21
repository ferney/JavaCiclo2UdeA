package com.mycompany.tratamientocadenas;

import javax.swing.JOptionPane;

public class TratamientoCadenas {
    public static void main(String[] args) {
        /*String a="es mi primera cadena de texto";
        //        0123456789........
        //hola -->4 caracteres -->0-3
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(5));
        System.out.println(a.charAt(a.length()-1));
        
        char c;//="a"
        for (int i = 0; i < a.length(); i++) {
            c=a.charAt(i);
            System.out.println(i+"-->"+c);
        } 
       
        char x[]={'h','o','l','a'};
        System.out.println(x.length);
        String s="hola";
        System.out.println(s.length());
        
        String a="Es mi Primera cadena de TEXTO";
        String mayusculas=a.toUpperCase();
        String minusculas=a.toLowerCase();        
        System.out.println(a+"\n"+mayusculas+"\n"+minusculas);
        System.out.println("#######");
        int p1=a.indexOf("E");
        int p2=a.indexOf("a");
        int p3=a.indexOf("z");
        int p4=a.lastIndexOf(a);-->a.lastIndexOf("de");
        System.out.println(p1+"\t"+p2+"\t"+p3+"\t"+p4); 
        String a="Es mi Primera cadena de TEXTO";
        String c=a.substring(0, 7);
        String x=a.substring(8, 11);
        String b=a.substring(8);
        System.out.println(c+"\n"+x+"\n"+b);
        //8,20
        String a="Es mi Primera cadena de TEXTO";
        boolean b1=a.startsWith("un buen");
        boolean b2=a.startsWith("Es");
        boolean b3=a.endsWith("n");
        boolean b4=a.endsWith("O");
        int p1=a.indexOf("cadena");
        int p2=a.lastIndexOf("de");
        System.out.println(b1+"\t"+b2+"\t"+b3+"\t"+b4+"\t"+p1+"\t"+p2);
        String d="a";
        String f="r";
        String m=d+f;*/
        
        String g="wrappers wrappers s s s s d d d e"      ;
        System.out.println(g.indexOf("d"));
        System.out.println(g.lastIndexOf("d"));
        String b=g.substring(g.length());
        System.out.println(b);
        int a = 23;
        //convertir int a string
        String s=Integer.toString(a);
        //convertir string a int
        int a2=Integer.parseInt(s);
        double msj=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero"));
        //doube a string
        
        double d=24.3;
        String m=Double.toString(d);
        double d2=Double.parseDouble(m);
    }
}
