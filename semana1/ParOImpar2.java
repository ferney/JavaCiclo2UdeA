
package UdeA;

import java.util.Scanner;

public class ParOImpar2
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);

		System.out.print("Ingrese un valor: ");
		int v=scanner.nextInt();

		// obtenemos el resto de dividir v por 2
		int resto= v % 2;
		
		// utilizando un if in-line
		String mssg = (resto == 0 ) ? "es Par": "es Impar"; 
		
		// muestro resultado
		System.out.println(v+" "+mssg);
	}
}
