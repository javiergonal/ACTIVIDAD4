package com.endes.actividad4;

import java.util.Scanner;

public class Operaciones {

	
	public static void main(String[] args) {
		
		int x,y;
		int suma,resta,multiplicacion,division;

		System.out.println("Introduzca un n�mero entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();
		
		System.out.println("Introduzca otro n�mero entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();
				
		suma = x+y;
		resta = x-y;
		multiplicacion = x*y;
		division = x/y;
		

		System.out.println("La Suma es ="+suma);
		System.out.println("La Resta es ="+resta);
		System.out.println("La Multiplicaci�n es ="+multiplicacion);
		System.out.println("La Divisi�n es ="+division);

	}

}
