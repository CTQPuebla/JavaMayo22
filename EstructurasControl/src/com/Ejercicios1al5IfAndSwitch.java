package com;

import java.util.Scanner;

public class Ejercicios1al5IfAndSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	Scanner ss =  new Scanner(System.in);
		//	Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

	/*	System.out.println("------ Ejercicio 1 ---------");
		
		System.out.println("ingresa X: ");
		int x= sc.nextInt();
		
		System.out.println("ingresa Y: ");
		int y= sc.nextInt();
		
		if (x>y){
		System.out.println(x+" es mayor que "+y);	
		} else {
			System.out.println(y+" es mayor que "+x );
		}*/
		//--------------------------------------------------------------------------
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

	/*	System.out.println("------- Ejercicio 2 ---------- ");
		System.out.println("Ingresa Z: ");
		int z = sc.nextInt();
		
		if (z/2==0) {
			System.out.println(z+" es un número par.");
			
		} else {
			System.out.println(z+" es un número impar ");
		}*/
		//--------------------------------------------------------------------------
		//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
	/*	System.out.println("------- Ejercicio 3 ---------- ");
		System.out.println("Ingresa m: ");
		int m = sc.nextInt();
		System.out.println("Ingresa n: ");
		int n = sc.nextInt();
		
		if (n!=0) {
			double p = m/n;
			System.out.println("P es igual: "+p);
			
		} else {
			System.out.println("Error "+ n +" no es valido");
		}*/
		
		//--------------------------------------------------------------------------
		//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

	/*	SIN TERMINAR System.out.println("------ Ejercicio 4 ---------");
		
		System.out.println("Ingresa T: ");
		String t = sc.nextLine();
		int c=0;
		if (c>t.length() ) {
			
		}
		-----CODIGO DE CESAR---
		System.out.println("Ingresa una letra");
		String letra = sc.nextLine();
		
 		if(letra.equals(letra.toUpperCase())) {
			System.out.println("Si es igual");
		}else {
			System.out.println("No lo es");
		}
		--------
		*/
		//--------------------------------------------------------------------------
		//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		
		System.out.println("------ Ejercicio 5 ---------");
		
		System.out.println("Ingresa nota: ");
		int no= sc.nextInt();
		System.out.println("Ingresa edad: ");
		int e= sc.nextInt();
		System.out.println("Ingresa Sexo M/F: ");
		String s= sc.nextLine();
		s=sc.nextLine();
		
		if (no>=0 && e==18 && s=="M") {
		
			System.out.println("Posible");	
	} else if (no>=0 && e==18 && s=="F") {
		System.out.println("Aceptado");
	} else {
		System.out.println("No Aceptado");
	}
			
		}
}
