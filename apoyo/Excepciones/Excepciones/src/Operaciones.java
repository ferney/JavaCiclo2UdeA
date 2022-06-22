
/**
 *
 * @author kevinf
 */
public class Operaciones {
    static int potencia;
    private float termino;
    static float suma;
 
   public static int elevarAPotencia(int base, int exp){
       potencia = 1;
       for(int i=1;i<=exp;i++){
           potencia*=base;
       }
       return potencia;
   }
   public float calcularTermino(int k) throws ArithmeticException {
       termino = (elevarAPotencia(k,3)+elevarAPotencia(k,k))/(k-5);
       return termino;
   }
   public static float sumar(float termino){
       suma+=termino;
       return suma;
   }
}
