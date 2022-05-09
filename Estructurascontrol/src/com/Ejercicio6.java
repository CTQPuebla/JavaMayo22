package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 
		int kilos;
		double precioInicial;
	    String tipo ;
	    int tamanio;
	    
		System.out.println("Ingresa los kilos de uva: ");
		kilos=sc.nextInt();
		
		System.out.println("Ingresa precio inicial del kilo de uva: ");
	    precioInicial=sc.nextDouble();
		
		System.out.println("Ingresa el tipo de uva: A/B");
		tipo=sc.next();sc.nextLine();
		
		System.out.println("Ingresa el tamaño de uva: 1 o 2");
		tamanio=sc.nextInt();
		
		if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamanio == 1 || tamanio == 2))) {
		      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamanio == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamanio == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamanio == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamanio == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		
		
		
		

	}

}
