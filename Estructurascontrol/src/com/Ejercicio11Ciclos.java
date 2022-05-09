package com;

import java.util.Scanner;

public class Ejercicio11Ciclos {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
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
