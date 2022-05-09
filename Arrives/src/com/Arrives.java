package com;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Arrives {

	private static Scanner sc;

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		//Inicializar un array solo con tamaño
//		int[] x = new int [5];
//		
//		//Inicializar array con valores
//		int y[] = {11,12,13,14,15,16};
//		
//		//Agregar valores a un array vacio
////		x[0]=10;
////		x[1]=11;
////		x[2]=12;
////		x[3]=13;
////		x[4]=14;
//		
//		//Ver alguna posición en especifico 
////		System.out.println(x[3]);
////		System.out.println(y[3]);
//		
//		//Array de objetos
//		Object[] objetos = {"hola",12,56.90,true,'&', new Date()};
//		Object[] o2 = new Object[10];
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.println("Ingresa un numero");
//			x[i]= sc.nextInt();
//	
//--------------------------------------------------------------------------------------------------
// TAREA: Pedir 10 numeros por el teclado y obtener la suma, media aritmetica, el numero menor, el numero mayor y cuantas veces se repite cada numero.

//			Scanner sc= new Scanner(System.in);
//			
//			float x=0; //promedio
//			float y=0; //suma
//			int z=0; //mayor
//			int k=0; //menor
//			
//			int [] arreglo = new int[10];
//			for (int i=0; i<10; i++) {
//				
//				System.out.println("Ingrese el numero en la posición" + i + " : " );
//				
//				arreglo[i] = sc.nextInt();
//			}
//		//realizar la suma , promedio y elmayor
//			
//			for (int i=0; i< arreglo.length; i++) {
//				y = arreglo [i];
//				
//				if ( z <arreglo[i]) {
//					
//					z= arreglo [i];	
//				}
//				System.out.println(String.format("Posición[%d] " , arreglo[i]));
//			}
//			k=z;
//			
//			//Se busca el menor
//			
//			for(int i=0; i<arreglo.length; i++) {
//				
//			}
//			
//			//promedio
//			x = y /arreglo.length;
//			System.out.println("Salida");
//			
//			//contar las veces que se repite cada numero 
//			
//			int cont;
//			
//			for (int i=0; i<arreglo.length; i++) {
//				cont= 0;
//				
//				for(int j=i; j<arreglo.length; j++) {
//					cont=0;
//				if (arreglo[i] <= arreglo[j]) {
//					
//					cont++;
//				}
//				}
//				
//System.out.println(String.format("El numero %d se repite %d veces", arreglo[i], cont));
//			}
//			
//			System.out.println(String.format ("La suma es %.2, el promedio es %.2, el mayor es %d, el menor es %d") (y,x,z,k)));
////			

		// Array de 2 dimendiones

//		String[] [] array = new String[5] [4]; //vacio
//		String[] [] array2 = {{"1", "2", "3"},
//		                      {"4", "5", "6"},
//		                      {"7", "8", "9"},
//		                      {"10", "11", "12"}};
//		
//		//Asignarle valores al array bidimensional
//		array[0][0] ="`";
//		array[0][1] ="¡";		
//		array[0][2] ="¬";
//		array[0][3] ="^";
//		
//		array[1][0] ="~";
//		array[1][1] ="*";
//		array[1][2] ="+";
//		array[1][3] ="¿";
//		
//		array[2][0] ="?";
//		array[2][1] ="°";
//		array[2][2] ="|";
//		array[2][3] ="=";
//		
//		array[3][0] =")";
//		array[3][1] ="(";
//		array[3][2] ="/";
//		array[3][3] ="&";
//		
//		array[4][0] ="%";
//		array[4][1] ="#";
//		array[4][2] ="!";
//		array[4][3] ="$";
//		
//		//
//		for (int i=0; i<array.length; i++) { //Iterar sobre las filas
//			for (int j=0; j < array[i].length; j++) { //Iterar sobre columnas
//		}
//		
//	}
//
//		//Imprimir el contenido del array 
//		
//	System.out.println(Arrays.deepToString(array));

		sc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de filas");

		int fila = sc.nextInt();

		System.out.println("Ingrese la cantidad de columnas");

		int columna = sc.nextInt();

		String[][] matriz = new String[fila][columna];

		for (int i = 0; i <matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++) 
			{
				System.out.println("Ingrese datos: " );
				matriz[i][j]= sc.next();
				
		int[][] matrizSuma = new int[matriz.length][matriz[0].length];
		for (int y = 0; y < matriz.length; y++) {
		    for (int x = 0; x < matriz[y].length; x++) {
		        int [][] matriz1= new int [y][x];
		        int [][] matriz2= new int [y][x];
			     
		      int suma= sc.nextInt();
				
			} System.out.println(Arrays.deepToString(matriz));
				
			}
		}
	}
	}
}

