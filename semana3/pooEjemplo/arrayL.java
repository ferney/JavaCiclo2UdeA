
package pooEjemplo;

public class arrayL {
    public static void main(String[] args) {
        estudiante[] es= new estudiante[2];
        es[0]=new estudiante("jorge", 25);
        es[1]=new estudiante("diana", 15);
        System.out.println(es[0].toString());
         System.out.println(es[1].toString());
        
    }
}
