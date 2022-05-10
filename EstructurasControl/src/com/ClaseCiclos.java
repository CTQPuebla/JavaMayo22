package com;

import java.util.Scanner;

public class ClaseCiclos {
	
	public static void main(String[] args) {
		
		//while, do-while, for, foreach

		int x=50;
		int y=0;
		
//		while(x<10 && y<5) {
//			//algo
//			System.out.println("x: "+x);
//			System.out.println("y: "+y);
//			y++;
//			x++;			
//		}
							
//		do {
//		System.out.println("hola: "+x);
//	
//		x--;
//		}while(x>10);
		
		//for
//		for (int i = 30; i > 5; i--) {			
//			System.out.println("hola: "+i);			
//		}
//		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Ingresa una frase");
//		String frase = sc.nextLine();
//	
//		String reversa="";
//		//     9
//		for (int i = frase.length()-1; i >=0; i--) {
//			System.out.println("posicion: "+i);
//			//Aislar un caracter a la vez
//			//System.out.println(frase.charAt(i));
//			reversa = reversa + frase.charAt(i);
//			System.out.println("Esto hay en reversa: "+reversa);
//		}		
//		//System.out.println(reversa);
//		if(frase.equals(reversa)) {
//			System.out.println("Si es palindromo");
//		}else {
//			System.out.println("No es palindromo");
//		}
		
		//Reloj
		
		//int segundos=0;
		//int minutos=0;
		//int horas=0;
//		for (int horas = 0; horas < 24; horas++) { //conteo de las horas
//			for (int minutos = 0; minutos < 60; minutos++) { //conteo de los minutos				
//				for (int segundos = 0; segundos < 60; segundos++) {	//conteo de los segundos
//					System.out.println(horas+":"+minutos+":"+segundos);			
//				}				
//			}			
//		}
		
		
//		int cont=0;
//		int sumImpar=0;
//		int sumPositivos=0;
//		
//		while(cont<10) {
//			System.out.println("Ingresa un numero");
//			int num = sc.nextInt();
//			
//			if(num>0) {
//				System.out.println("Es positivo");
//				sumPositivos = sumPositivos + num;
//			}else {
//				System.out.println("Negativo");
//			}
//			
//			if(num%2==0) {
//				System.out.println("Es par");
//			}else {
//				sumImpar = sumImpar + num;
//				System.out.println("Es impar");
//			}			
//			cont++;//cambio de valor			
//		}
//		
//		System.out.println("Sumatoria de positivos: "+sumPositivos);
//		System.out.println("Sumatoria de impares: "+sumImpar);
		
		//11
		
		boolean flag = true; //bandera
		String caracter="";
		int sum=0;
		int cont = 0;
		float promedio;
		String aux="";
		int mayores=0;		
		while(flag) {
			//indexOf
			System.out.println("Ingresa un numero");			
			caracter = sc.nextLine();			
			if("0123456789".indexOf(caracter)>=0) {
				//7,4,5,9,1,4,0,8,3
				aux = aux + caracter + ",";
				//convertir el string a int
				//     x  +  7                  "7"
				sum = sum + Integer.parseInt(caracter);
				System.out.println(sum);
				cont++;							
			}else {
				System.out.println("No es un numero");
				flag = false;
			}		
		}			
		promedio = sum/cont;
		System.out.println("Promedio: "+String.format("%.2f", promedio));		
		//7,4,5,9,1,4,0,8,3
		String[] array = aux.split(","); //cortando y separando valores		
		for (int i = 0; i < array.length; i++) {			
			if(Integer.parseInt(array[i])>promedio) {
				mayores++;
			}								
		}
		System.out.println("Mayores que la media: "+mayores);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
}
