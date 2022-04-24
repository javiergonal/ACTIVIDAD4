package com.endes.actividad4;

import java.util.Scanner;
/**
 * <h2> Clase Operaciones</h2>
 * Clase que realiza las operaciones de:
 * <ul>
 *    <li>Suma</li>
 *    <li>Resta</li>
 *    <li>Multiplicaci�n</li>
 *    <li>Divisi�n</li>
 *</ul>     
 *entre dos n�meros enteros.
 * 
 * @author Javier Gonz�lez �lvarez
 * @version Versi�n 1
 *
 */
public class Operaciones {

/**
 * <h2>M�todo que realiza la ejecuci�n del programa</h2>	
 * @param args 
 */
	
	public static void main(String[] args) {
		
		// Declaraci�n de Variables
		int x,y;
		int suma,resta,multiplicacion,division;
		
		// Introducci�n de n�meros por teclado
		System.out.println("Introduzca un n�mero entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();
		
		System.out.println("Introduzca otro n�mero entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();
		
		/* En esta parte del c�digo se realizan las 
		 * operaciones de suma, resta, multiplicaci�n y divisi�n 
		 * utilizando las variables "x" e "y" */

		suma = x+y;
		resta = x-y;
		multiplicacion = x*y;
		division = x/y;
		
		// Salidas por pantalla
		System.out.println("La Suma es ="+suma);
		System.out.println("La Resta es ="+resta);
		System.out.println("La Multiplicaci�n es ="+multiplicacion);
		System.out.println("La Divisi�n es ="+division);

	}

}
