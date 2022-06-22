
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author kevinf
 */
public class Principal {
    public static void main(String[] args) {
        int a, b;
//        a=4;b=8;
        float termino, sumatoria = 0;

        Operaciones op = new Operaciones();
        DecimalFormat f = new DecimalFormat("#,###.##");

        JOptionPane.showMessageDialog(null, "Calcular una sumatoria de (k^3 + k^k)/(k - 5)\nDesde k=a hasta k=b","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor inicial de 'k' para la sumatoria (a):"));
        do{
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor final de 'k' para la sumatoria (b):"));
        }while(b < a);
        
       for(int k=a;k<=b;k++){
           try{
               termino = op.calcularTermino(k);
               System.out.println("-:Valor termino con k="+k+": "+f.format(termino));
               sumatoria = Operaciones.sumar(termino);
           }catch(ArithmeticException ae){
               System.out.println("Exception NO verificada, Aritmética de k="+k);
           }
       }
       System.out.println("-:El resultado de la Sumatoria es: "+f.format(sumatoria));
        JOptionPane.showMessageDialog(null, "El resultado de la sumatoria es: "+f.format(Operaciones.suma),"Resultado"
            ,JOptionPane.INFORMATION_MESSAGE);
    }
}
