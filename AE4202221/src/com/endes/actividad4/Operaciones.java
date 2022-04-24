package com.endes.actividad4;

import java.util.Scanner;
/**
 * <h2> Clase Operaciones</h2>
 * Clase que realiza las operaciones de:
 * <ul>
 *    <li>Suma</li>
 *    <li>Resta</li>
 *    <li>Multiplicación</li>
 *    <li>División</li>
 *</ul>     
 *entre dos números enteros.
 * 
 * @author Javier González Álvarez
 * @version Versión 1
 *
 */
public class Operaciones {

/**
 * <h2>Método que realiza la ejecución del programa</h2>	
 * @param args 
 */
	
	public static void main(String[] args) {
		
		// Declaración de Variables
		int x,y;
		int suma,resta,multiplicacion,division;
		
		// Introducción de números por teclado
		System.out.println("Introduzca un número entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();
		
		System.out.println("Introduzca otro número entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();
		
		/* En esta parte del código se realizan las 
		 * operaciones de suma, resta, multiplicación y división 
		 * utilizando las variables "x" e "y" */

		suma = x+y;
		resta = x-y;
		multiplicacion = x*y;
		division = x/y;
		
		// Salidas por pantalla
		System.out.println("La Suma es ="+suma);
		System.out.println("La Resta es ="+resta);
		System.out.println("La Multiplicación es ="+multiplicacion);
		System.out.println("La División es ="+division);

	}

}
