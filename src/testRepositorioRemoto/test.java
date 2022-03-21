package testRepositorioRemoto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in); 
		int valorEntradaTeclado = -1; 
		boolean salir = false; 

		// Mientras no se pulse la opci�n de salir, ejecutar el programa
		while (!salir) 
		{
			// Mostrar el men� inicial
			System.out.println("\nElige el n�mero que quieras del 1 al 16 para mostrar el mensaje del alumno/a");
			System.out.println("0: Salir");

			try 
			{
				// Obtenemos el valor introducido por el usuario
				System.out.print("\nN�mero: ");
				valorEntradaTeclado = entradaTeclado.nextInt();
				
				// Vamos a la opci�n elegida por el usuario
				switch (valorEntradaTeclado) 
				{
					case 1:
						NoHayAlumno();
						break;
					case 2:
						NoHayAlumno();
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
						
					// Opci�n 4. Salir del programa.	
					case 0:
						// Indicamos al usuario que va a salir del programa
						System.out.println("Has seleccionado la opcion Salir");
						System.out.println("�Adios! :) ");
						
						// Asignamos el valor true a la variable "salir" para no volver a entrar en el bucle que muestra en men�
						salir = true;
						
						// Se cierra la entrada por teclado y se finaliza el programa
						entradaTeclado.close();
						System.exit(0);
						break;
					
					// Si se ha elegido una opci�n distinta, se recuerda al usuario las opciones disonibles
					default:
						System.out.println("Introduce un n�mero del 1 al 14 para ver el mensaje del alumno/a o el 0 para salir.");
				}
				
			} catch (InputMismatchException e) 
			{
				System.out.println("Valor incorrecto. Debes insertar un n�mero\n");
				entradaTeclado.next();
			}
		}
	}
	
	
	/**
	 * Este m�todo se encarga de mostrar un mensaje indicando que la opci�n no tiene asignada ning�n alumno/a
	 * @return void
	*/
	public static void NoHayAlumno()
	{
		System.out.println("Esta opci�n no tiene asignada nung�n alumno/a");
	}
}
