package com;

import java.util.Scanner;
//import java.util.regex.*;

public class EjerciciosCiclos1al5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	/*	System.out.println("------ Ejercicio 1 ---------");
		int f=1, r;
		while (f<13) {
			r=12*f;
			System.out.println(r);
			f++;			
		}*/
		
		//--------------------------------------------------------------------------
	/*	System.out.println("------ Ejercicio 2 ---------");
		
	int numero, factor, c=1,producto;
	System.out.println("Tabla de:");
	numero=sc.nextInt();
	System.out.println("Ultimo factor:");
	factor=sc.nextInt();
	
	while(c<=factor){
		producto=numero*c;
		System.out.println(producto);
		c++;
		
		}*/
		//--------------------------------------------------------------------------	
	/*	System.out.println("------ Ejercicio 3 ---------");
 String text, text2, text3="", text4;
System.out.println("Ingresa el texto:");
text=sc.nextLine();
 text2= text.replaceAll(" ", "");
 text2= text2.toUpperCase();
 System.out.println(text);
 System.out.println(text2+" es");
 for (int con=text2.length()-1; con>=0; con--) {

	 text3+= text2.charAt(con);
	 
 }
 text3= text3.toUpperCase();
 if (text3.equals(text2)) {
	 System.out.println(text+" es palíndromo");
 } else {
	 System.out.println(text+" no palíndromo");
	 
 }*/
		
		//--------------------------------------------------------------------------	
/*			System.out.println("------ Ejercicio 4 ---------");
			
		String frase;
		char letra, caracter;
		System.out.println("Ingrsa frase:");
		frase=sc.nextLine();
		System.out.println("Letra a buscar:");
		letra= sc.next().charAt(0);
		int veces=0;
		
		for (int can= 0; can< frase.length(); can++) {
			 caracter= frase.charAt(can);
			 
			if  (letra==caracter) {
				veces++;
			}
		}
		System.out.println("La letra se repite "+veces+" en la frase."); */ 
		
	//	System.out.println("------ Ejercicio 5 ---------");
		for (int horas =00; horas <24; horas++) {
			for (int minutos=00; minutos <60; minutos++) {
				for (int segundos=00; segundos<60;segundos++) {
					System.out.println(horas+":"+minutos+":"+segundos);
					
				}
			}
		}
		
	}
	
}
