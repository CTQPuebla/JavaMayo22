package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Ingresa un numero");
//		int p = sc.nextInt();
//		
//		String m =sc.nextLine();
//		System.out.println("Ingresa un nombre");
//		String n = sc.nextLine();
//		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa un numero");
		int p = sc.nextInt();
		
		System.out.println("Ingresa un segundo numero");
		int q = sc.nextInt();
   if (p == q) {
	   System.out.println("Son iguales");
  
   }
   else if(p>q) {
			System.out.println("numero 1 es mayor que numero 2");
	}else {
		
		System.out.println("numero 2 es mayor quen numero 1");
		}
	}

}
