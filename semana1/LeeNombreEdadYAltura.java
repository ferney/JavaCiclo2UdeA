
package UdeA;

import java.util.Scanner;

public class LeeNombreEdadYAltura
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);

		System.out.print("Ingrese su nombre y edad: ");
		
		// leemos el nombre 
		String nombre=scanner.next();
		
		// leemos la edad
		int edad=scanner.nextInt();
		
		// mostramos los datos ingresados
		System.out.println("Nombre: "+nombre+", Edad: "+edad);
	}
}
