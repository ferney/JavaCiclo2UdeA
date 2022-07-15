
package junit;

public class JUNit {

    public static void main(String[] args) {
        int a=16,b=20,c=30;
        
        System.out.println(calculo.mayor(a,b,c));
        System.out.println(calculadora.sumar(a,b,c));
        System.out.println(calculadora.resta(a,b,c));
        System.out.println(calculadora.multiplicacion(a,b,c));
        System.out.println(calculadora.divicion(a,b,c));
        
        System.out.println(reto1.mayor(a,b,c));
        System.out.println(reto1.menor(a,b,c));
        System.out.println(reto1.promedio(a,b,c));
        
        int z[]={56,45,89,78};
        System.out.println(xyz.mayor(z));
        System.out.println(xyz.menor(z));
        System.out.println(xyz.promedio(z));
        
        
        double[] datos={35.6,67.9,45.9,23.6};
        double max=0,min=100,prom=0;
        
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]<min) {
                min=datos[i];                
            }
            if (datos[i]>max) {
                max=datos[i];                
            }
            prom+=datos[i];            
        }
        prom=prom/datos.length;
        
        double x[]={max,min,prom};
       
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            
        }
    }

    
}
