
package objetos;

public class prueba {
    public static void main(String[] args) {
        fecha f= new fecha();
        f.setDia(5);
        f.setMes(6);
        f.setAnio(2022);
        //imprimir el dia
        System.out.println("Dia ="+f.getDia());
        //imprimir el mes
        System.out.println("Mes ="+f.getMes());
        //imprimir el año
        System.out.println("Anio ="+f.getAnio());
        
        //imprimir el objeto completo
        System.out.println(f);
        
    }
    
}
