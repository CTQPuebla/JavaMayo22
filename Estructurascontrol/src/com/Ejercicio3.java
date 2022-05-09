package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n1= 0;
		int n2= 0;
		int resultado= 0;

		Scanner reader = new Scanner (System.in);
		System.out.println("Ingresa un numero");
	     n1 = reader.nextInt();
		
		System.out.println("Ingresa un segundo numero");
		 n2 = reader.nextInt();
		 
		
		
		 if (n2== 0) {
			 System.out.println("Error, el dividendo debe ser mayor a 0");
		 }else {
			 System.out.println("La division es:" + n1+ "/" + n2 + "=" + resultado);
			 
		 }
	}

}
