package com;

import java.util.Scanner;

public class Ejercicio2 {
	public void numeros() {
		int n=0;
		
		String pares="";
		String impares="";
		Scanner scan=new Scanner(System.in);
		System.out.println("ingresa la catidad de numeros que desea ingresar");
		n=scan.nextInt();
		
		double lista[]=new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("ingresa el " + (i+1) + " numero");
			lista[i]=scan.nextDouble();
			if(lista[i]%2 == 0) {
				pares+=lista[i] + "\n";
			}else {
				impares+=lista[i] + "\n";
			}
		}
		if("".equalsIgnoreCase(pares)){
			System.out.println("la lista de numeros impares ingresados es:\n" + impares +"\nno se ingresaron numeros pares" );
		}else {
			System.out.println("la lista de numeros pares ingresados es:\n" + pares + "\n"
					+ " la lista de numeros impares ingresados es:\n" + impares);
		}
	}
}
