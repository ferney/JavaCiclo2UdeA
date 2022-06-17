
package UdeA;

import java.util.Scanner;

public class DemoArray2
{
	public static void main(String[] args)
	{
		String dias[] = { "Lunes", "Martes", "Miercoles"
				          , "Jueve", "Viernes"
				          , "Sabado", "Domingo" };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un dia de la semana (numero): ");
		int v = scanner.nextInt();
		
		if( v <= dias.length )
		{
			// recordemos que los arrays se numeran desde cero
			System.out.println( dias[v-1] );
		}
		else
		{
			String error = "Dia incorrecto... Ingrese un valor entre 1 y 7.";
			System.out.println(error);
		}
	}
}
