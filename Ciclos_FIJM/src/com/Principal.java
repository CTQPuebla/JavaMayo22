package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
//		int x=0;
//		int y = 0;
//		while(x < 10 && y < 4) {
//			System.out.println("uno: " + x);
//			System.out.println("y:" + y);
//			x++;
//			y++;
//		}
//		
//		do {
//			System.out.println("Hola" + x);
//			x++;
//		}while(x < 0);
//		
//		
//		for (int i = 0;i <= 10; i++) {
//			System.out.println("iteracion numero: " + i);
//		}
//		
		Scanner sc = new Scanner(System.in);
		
//		int limiteArray = 0;
//		int x[];
//		int indiceDelMayor = 0;
//		
//		System.out.println("Ingrese la cantidad de numeros que desea operar");
//		limiteArray = sc.nextInt();
//		
//		x = new int[limiteArray];
//		
//		for(int i = 0; i < x.length; i++) {
//			System.out.println("Ingresa un valor");
//			x[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//			if (x[i] > indiceDelMayor) {
//				indiceDelMayor = x[i];
//				System.out.println(x[i]);
//			}
//		}
//		
//		System.out.println("El numero mayor es: " + indiceDelMayor);
		
		OperacionesCiclos op = new OperacionesCiclos();
		
		String [][] array = new String[5][4];
		String array2 [][] = {{"1","2","3"},
							 {"1","2","3"},
							 {"1","2","3"},
							 {"1","2","3"}};
		
		array[0][0] = "1";
		array[0][1] = "2";
		array[0][2] = "3";
		array[0][3] = "4";
		
		array[1][0] = "5";
		array[1][1] = "6";
		array[1][2] = "7";
		array[1][3] = "8";
		
		array[2][0] = "9";
		array[2][1] = "10";
		array[2][2] = "11";
		array[2][3] = "12";
		
		array[3][0] = "13";
		array[3][1] = "14";
		array[3][2] = "15";
		array[3][3] = "16";
		
		array[4][0] = "17";
		array[4][1] = "18";
		array[4][2] = "19";
		array[4][3] = "20";
		
		for(int i = 0; i < array.length; i++) {
			for(int j =0; j < array[i].length; j++) {
				System.out.print(i + j);
			}
			System.out.println("");
		}
		
		System.out.println(Arrays.deepToString(array));
		
		}
	
	//imprimir contenido de array
	
	//llenar valores de 2 matrices 
	
	}

