package com;

import java.util.Scanner;

public class Ejercicio4Ciclos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		char letra, caracter;
		System.out.println("Introduzca una frase:");
		frase=sc.nextLine();
		System.out.println("Caracter deseado a buscar:");
		letra= sc.next().charAt(0);
		int veces=0;
		
		for (int can= 0; can< frase.length(); can++) {
			 caracter= frase.charAt(can);
			 
			if  (letra==caracter) {
				veces++;
			}
		}
		System.out.println("La letra se repite "+veces+" en la frase.");
	    
	    
	   
	}

}
