package com.endes.actividad4;

import java.util.Scanner;

/**
 * <h2>Clase Operaciones</h2> Clase que realiza las operaciones de:
 * <ul>
 * <li>Suma</li>
 * <li>Resta</li>
 * <li>Multiplicaci�n</li>
 * <li>Divisi�n</li>
 * </ul>
 * entre dos n�meros enteros.
 * 
 * @author Javier Gonz�lez �lvarez
 * @version Versi�n 1
 *
 */
public class Operaciones {

	/**
	 * <h2>M�todo que realiza la ejecuci�n del programa</h2>
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Declaraci�n de Variables
		int x, y;
		int suma, resta, multiplicacion, division;

		// Introducci�n de n�meros por teclado
		System.out.println("Introduzca un n�mero entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();

		System.out.println("Introduzca otro n�mero entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();

		/*
		 * En esta parte del c�digo se realizan las operaciones de suma, resta,
		 * multiplicaci�n y divisi�n utilizando las variables "x" e "y"
		 */

		suma = suma(x, y);
		resta = resta(x, y);
		multiplicacion = multiplicacion(x, y);
		division = division(x, y);

		// Salidas por pantalla
		visualizar(suma, resta, multiplicacion, division);
	}

	private static void visualizar(int suma, int resta, int multiplicacion, int division) {
		System.out.println("La Suma es =" + suma);
		System.out.println("La Resta es =" + resta);
		System.out.println("La Multiplicaci�n es =" + multiplicacion);
		System.out.println("La Divisi�n es =" + division);
	}	
	
	/**
	 * M�todo que realiza la suma de dos n�meros enteros 
	 * @param x
	 * @param y
	 * @return suma de x+y
	 */
	private static int suma(int x, int y) {
		int suma;
		suma = x + y;
		return suma;
	}
	
	/**
	 * M�todo que realiza la resta de dos n�meros enteros
	 * @param x
	 * @param y
	 * @return resta de x-y
	 */
	private static int resta(int x, int y) {
		int resta;
		resta = x - y;
		return resta;
	}
	
	/**
	 * M�todo que realiza la multiplicaci�n de dos n�meros enteros
	 * @param x
	 * @param y
	 * @return multiplicaci�n de x*y
	 */	
	private static int multiplicacion(int x, int y) {
		int multiplicacion;
		multiplicacion = x * y;
		return multiplicacion;
	}
	
	/**
	 * M�todo que realiza la divisi�n de dos n�meros enteros
	 * @param x
	 * @param y
	 * @return divisi�n de x/y
	 */	
	private static int division(int x, int y) {
		int division;
		division = x / y;
		return division;
	}     
}
