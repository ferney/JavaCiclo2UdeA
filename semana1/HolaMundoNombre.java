
package UdeA;

import java.util.Scanner;

public class HolaMundoNombre
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// Mensaje para el usuario
		System.out.print("Ingrese nombre edad altura: ");

		// leemos el nombre
		String nom = scanner.next();
		
		// leemos la edad
		int edad= scanner.nextInt();
		
		// leemos la altura
		double altura = scanner.nextDouble();

		// mostramos los datos por consola
		System.out.println("Nombre: "+nom+" Edad: "+edad+" Altura :"+altura);
	}
}
