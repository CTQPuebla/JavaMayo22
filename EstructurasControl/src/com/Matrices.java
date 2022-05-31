package com;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Matrices {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Inicializar un array solo con tamaño				
		int[] x = new int[5];
		
		//Inicializar un array con valores
		int y [] = {11,12,13,14,15,16};
		
		
		//Agregar valores a un array vacio
//		x[0] = 10;
//		x[1] = 11;
//		x[2] = 12;
//		x[3] = 13;
//		x[4] = 14;
		
		//Ver alguna posicion en especifico
//		System.out.println(x[3]);
//		System.out.println(y[3]);
//		
//		//Array de objetos
//		Object[] objetos = {"hola",12,56.90,true,'&',new Date()};		
//		Object[] o2 = new Object[10];
//		
//		//Llenar por teclado un array numerico
//		for (int i = 0; i < x.length; i++) {
//			System.out.println("Ingresa un numero");
//			x[i] = sc.nextInt();
//		}
//		
		
		
		
		
		
		//Arrays 2 dimensiones
		
		String[][] array = new String[5][4]; //vacio
		String[][] array2 = {{"1","2","3"},
				             {"4","5","6"},
				             {"7","8","9"},
				             {"10","11","12"}};
		
		//Asignarle valores al array bidimensional
		array[0][0] = "hola";
		array[0][1] = "8";
		array[0][2] = "a";
		array[0][3] = "b";
		
		array[1][0] = "c";
		array[1][1] = "d";
		array[1][2] = "e";
		array[1][3] = "f";
		
		array[2][0] = "g";
		array[2][1] = "h";
		array[2][2] = "i";
		array[2][3] = "j";
		
		array[3][0] = "k";
		array[3][1] = "l";
		array[3][2] = "m";
		array[3][3] = "n";
		
		array[4][0] = "ñ";
		array[4][1] = "o";
		array[4][2] = "p";
		array[4][3] = "q";
		
		
		//
		for (int i = 0; i < array.length; i++) { //Iterar sobre las filas
			
			for (int j = 0; j < array[i].length; j++) { //Iterar sobre columnas							
				//codigo ....
			}
		}
		
		
		//Imprimir el contenido del array		
		System.out.println(Arrays.deepToString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
