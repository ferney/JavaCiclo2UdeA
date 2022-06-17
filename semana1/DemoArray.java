
package UdeA;

import java.util.Scanner;

public class DemoArray
{
	public static void main(String[] args)
	{
		// defino un array de 10 enteros
		int arr[]=new int[10];
		
		// el scanner para leer por teclado...
		Scanner scanner = new Scanner(System.in);
		
		// leo el primer valor
		System.out.print("Ingrese un valor (0=>fin): ");
		int v = scanner.nextInt();

		int i=0;
		while( v!=0 && i<10 )
		{
			arr[i++]=v;
			
			// leo el siguiente valor
			System.out.print("Ingrese el siguiente valor (0=>fin): ");
			v = scanner.nextInt();
		}

		// recorro el array mostrando su contenido
		for( int j=0; j<i; j++ )
		{
			System.out.println(arr[j]);
		}
	}
}
