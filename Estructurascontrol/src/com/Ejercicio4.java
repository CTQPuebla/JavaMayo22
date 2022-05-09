package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresa una letra");
	
	String letra = sc.nextLine();
	
	if(letra.equals(letra.toUpperCase())) {
		System.out.println("si es igual");
	}else {
		System.out.println("No lo es");
	}
	}
}
