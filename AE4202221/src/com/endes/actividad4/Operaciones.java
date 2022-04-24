package com.endes.actividad4;

import java.util.Scanner;

/**
 * <h2>Clase Operaciones</h2> Clase que realiza las operaciones de:
 * <ul>
 * <li>Suma</li>
 * <li>Resta</li>
 * <li>Multiplicación</li>
 * <li>División</li>
 * </ul>
 * entre dos números enteros.
 * 
 * @author Javier González Álvarez
 * @version Versión 1
 *
 */
public class Operaciones {

	/**
	 * <h2>Método que realiza la ejecución del programa</h2>
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Declaración de Variables
		int x, y;
		int suma, resta, multiplicacion, division;

		// Introducción de números por teclado
		System.out.println("Introduzca un número entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();

		System.out.println("Introduzca otro número entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();

		/*
		 * En esta parte del código se realizan las operaciones de suma, resta,
		 * multiplicación y división utilizando las variables "x" e "y"
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
		System.out.println("La Multiplicación es =" + multiplicacion);
		System.out.println("La División es =" + division);
	}	
	
	/**
	 * Método que realiza la suma de dos números enteros 
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
	 * Método que realiza la resta de dos números enteros
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
	 * Método que realiza la multiplicación de dos números enteros
	 * @param x
	 * @param y
	 * @return multiplicación de x*y
	 */	
	private static int multiplicacion(int x, int y) {
		int multiplicacion;
		multiplicacion = x * y;
		return multiplicacion;
	}
	
	/**
	 * Método que realiza la división de dos números enteros
	 * @param x
	 * @param y
	 * @return división de x/y
	 */	
	private static int division(int x, int y) {
		int division;
		division = x / y;
		return division;
	}     
}
