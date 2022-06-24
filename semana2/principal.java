/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto;


public class principal {
    public static void main(String[] args) {
        metodonoestatico();
        
        
        fecha f= new fecha(24, 6, 2022);
        
      
        fecha n= new fecha(24, 6, 2022);
        
       
        System.out.println(f.equals(n));
        
        
        /*
        System.out.println(f.toString());
        
        String ejemplo="esto es un ejemplo";
        System.out.println(ejemplo.indexOf("e"));
        System.out.println(ejemplo.indexOf('e'));
         
        /*int a=45;
        String s="";
        s+=a;*/
        //System.out.println(s+5);
        
        /*
        
        char[] x={'a','b','c'};
        String s="";
        for (int i = 0; i < x.length; i++) {
            s+=x[i];
        }
      s+=56789;
        String d=String.valueOf(s);
        System.out.println(d+45);
    */
    }

    private static void metodonoestatico() {
     }
}

