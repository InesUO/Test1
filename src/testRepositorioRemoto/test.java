package testRepositorioRemoto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in); 
		int valorEntradaTeclado = -1; 
		boolean salir = false; 

		// Mientras no se pulse la opción de salir, ejecutar el programa
		while (!salir) 
		{
			// Mostrar el menú inicial
			System.out.println("\nElige el número que quieras del 1 al 16 para mostrar el mensaje del alumno/a");
			System.out.println("0: Salir");

			try 
			{
				// Obtenemos el valor introducido por el usuario
				System.out.print("\nNúmero: ");
				valorEntradaTeclado = entradaTeclado.nextInt();
				
				// Vamos a la opción elegida por el usuario
				switch (valorEntradaTeclado) 
				{
					case 1:
						MetodoInesNeira();
						break;
					case 2:
						MetodoCarmenR();
						break;
					case 3:
						NoHayAlumno();
						break;
					case 4:
						NoHayAlumno();
						break;
					case 5:
						NoHayAlumno();
						break;
					case 6:
						NoHayAlumno();
						break;
					case 7:
						NoHayAlumno();
						break;
					case 8:
						NoHayAlumno();
						break;
					case 9:
						NoHayAlumno();
						break;
					case 10:
						NoHayAlumno();
						break;
					case 11:
						NoHayAlumno();
						break;
					case 12:
						NoHayAlumno();
						break;
					case 13:
						NoHayAlumno();
						break;
					case 14:
						NoHayAlumno();
						break;
					case 15:
						NoHayAlumno();
						break;
					case 16:
						NoHayAlumno();
						break;
						
					// Opción 4. Salir del programa.	
					case 0:
						// Indicamos al usuario que va a salir del programa
						System.out.println("Has seleccionado la opcion Salir");
						System.out.println("¡Adios! :) ");
						
						// Asignamos el valor true a la variable "salir" para no volver a entrar en el bucle que muestra en menú
						salir = true;
						
						// Se cierra la entrada por teclado y se finaliza el programa
						entradaTeclado.close();
						System.exit(0);
						break;
					
					// Si se ha elegido una opción distinta, se recuerda al usuario las opciones disonibles
					default:
						System.out.println("Introduce un número del 1 al 14 para ver el mensaje del alumno/a o el 0 para salir.");
				}
				
			} catch (InputMismatchException e) 
			{
				System.out.println("Valor incorrecto. Debes insertar un número\n");
				entradaTeclado.next();
			}
		}
	}
	
	
	/**
	 * Este método se encarga de mostrar un mensaje indicando que la opción no tiene asignada ningún alumno/a
	 * @return void
	*/
	public static void NoHayAlumno()
	{
		System.out.println("Esta opción no tiene asignada nungún alumno/a");
	}
	
	/**
	 * Este método se encarga de mostrar un mensaje de Ines
	 * @return void
	*/
	public static void MetodoInesNeira()
	{
		System.out.println("Hola, soy Ines");
	}
	
	public static void MetodoCarmenR()
	{
		System.out.println("Hola, soy R, Carmen R");
	}
	
}
