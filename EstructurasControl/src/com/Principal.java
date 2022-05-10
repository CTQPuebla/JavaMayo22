package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		// 1
		Scanner sc = new Scanner(System.in); // Leer valores desde teclado
		// Condiciones iniciales
		int a = 0;
//		int b = 0;
//		
//		System.out.println("Ingresa el primer numero");
//		a = sc.nextInt();
//		System.out.println("Ingresa el segundo numero");
//		b = sc.nextInt();
//		
//		//Proceso
//		if(a==b) { // false
//			System.out.println("Son iguales");
//		}else if(a>b) {  // false
//			System.out.println("El primero es mayor");			
//		}else {
//			System.out.println("El segundo es mayor");
//		}
		// 2 ----------------------------------------------------------------

//		System.out.println("Ingresa un numero");
//		int x = sc.nextInt();
//		
//		if(x%2 == 0) {
//			System.out.println("Si es par");
//		}else {
//			System.out.println("Impar");
//		}
		// 3 ----------------------------------------------------------------
//		System.out.println("Ingresa el numero 1");
//		double xx = sc.nextDouble();
//		System.out.println("Ingresa el numero 2");
//		double xy = sc.nextDouble();
//		
//		if(xy==0) {
//			System.out.println("Error");
//		}else {
//			//Jerarquia de operadores
//			double aa=xx/xy;
//			System.out.println("Resultado: "+ aa);
//		}

		// -------------------------------------------------------------------
//		System.out.println("Ingresa una letra");
//		String letra = sc.nextLine();
//		
// 		if(letra.equals(letra.toUpperCase())) {
//			System.out.println("Si es igual");
//		}else {
//			System.out.println("No lo es");
//		}

		// ----------------------------------------
		// Nota 5, edad 18, sexo M = posible
		// Nota 5, edad 18, sexo F = aceptada
		int nota = 0;
		int edad = 0;
		String sexo = "";
		System.out.println("Ingresa la nota");
		nota = sc.nextInt();
		System.out.println("Ingresa la edad");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa el sexo");
		sexo = sc.nextLine();

		if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("Solicitud posible");
		} else if (nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("Solicitud aceptada");
		} else {
			System.out.println("No aceptada");
		}

		// 1-12
		System.out.println("Ingresa un numero del 1 al 12");
		int mes = sc.nextInt();

		switch (mes) {

		case 1:
			System.out.println("31 dias");
			break;

		case 2:
			System.out.println("28 dias");
			break;
			
			
			default:
				System.out.println("No existe ese mes");

		}

	}
}
