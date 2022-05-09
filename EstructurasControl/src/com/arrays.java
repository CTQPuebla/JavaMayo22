package com;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {

		// arrays de una dimension

		// String [] meses = new String[12];

//		meses[0] = "Enero";
//		meses[1] = "Febrero";
//		meses[2] = "Marzo";
//		meses[3] = "Abril";
//		meses[4] = "Mayo";
//		meses[5] = "Junio";
//		meses[6] = "Julio";
//		meses[7] = "Agosto";
//		meses[8] = "Septiembre";
//		meses[9] = "Octubre";
//		meses[10] = "Noviembre";
//		meses[11] = "Diciembre";

		// También podríamos haber creado este Array y asignado sus valores con la
		// siguiente expresión:

//			String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
//		for (int i = 0; i <12; i++){
//			System.out.println(meses[i]);
//	

//		String [][] diccionario = new String[3][2];
//		diccionario[0][0] = "Hola";
//		diccionario[0][1] = "Hello";
//		diccionario[1][0] = "Gato";
//		diccionario[1][1] = "Cat";
//		diccionario[2][0] = "Perro";
//		diccionario[2][1] = "Dog";
//		
//
//			int i = 0;
//			for (int j = 0; i < 2; j++){
//			System.out.print(diccionario [i] [j] );
//			}
//			System.out.println(" ");
//			}
//}
//		String [][] tabla = new String[8][8];
//		
//		tabla[0][0] = "*";
//		tabla[0][1] = "*";
//		tabla[0][2] = "*";
//		tabla[0][3] = "*";
//		tabla[0][4] = "*";
//		tabla[0][5] = "*";
//		tabla[0][6] = "*";
//		tabla[0][7] = "*";
//		
//		for (int i = 0; i <8; i++){
//		
//		}
//	}
//}
//		
//		String [] [] array = new String [5] [4];
//		//asignarle valores 
//		String [][] array2 = {{"1","2","3"},
//	              {"4","5","6"},
//	              {"7","8","9", "10","11","12"}};
//		
//		array [0] [0] ="hola";
//		array [0] [1] = "8";
//		array [0] [2] = "a";
//		array [0] [3] = "b";
//		array [1] [0] = "c";
//		array [1] [1] = "d";
//		array [1] [2] = "e";
//		array [1] [3] = "f";
//		array [2] [0] = "g";
//		array [2] [1] = "h";
//		array [2] [2] = "i";
//		array [2] [3] = "j";
//		array [3] [0] = "k";
//		array [3] [1] = "l";
//		array [3] [2] = "m";
//		array [3] [3] = "n";
//		array [4] [0] = "ñ";
//		array [4] [1] = "o";
//		array [4] [2] = "p";
//		array [4] [3] = "q";
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++ ) { 
//				
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(array));
//	}nextline
//}

//		String matriza[][] = new String[4][4];
//		String matrizb[][] = new String[4][4];
//		String matrizc[][] = new String[4][4];
//		int i = 0;
//		int j = 0;
//
//		Scanner dato = new Scanner(System.in);
//
//		System.out.println("Datos de la Matriz A :");
//
//		for (i = 0; i <= 3; i++) {
//			for (j = 0; j <= 3; j++) {
//				System.out.print("Escribir valor " + i + " , " + j + " : ");
//				matriza[i][j] = dato.nextLine();
//			}
//
//		}
//
//		System.out.println("Datos de la Matriz B :");
//		for (i = 0; i <= 3; i++) {
//			for (j = 0; j <= 3; j++) {
//				System.out.print("Escribir valor " + i + " , " + j + " : ");
//				matrizb[i][j] = dato.nextLine();
//			}
//		}
//
//		for (i = 0; i <= 3; i++) {
//			for (j = 0; j <= 3; j++) {
//				matrizc[i][j] = matriza[i][j] + matrizb[i][j];
//			}
//		}
//
//		System.out.println("Matriz resultante de la suma :");
//		if(i==0) {
//			System.out.println("0");
//		}else {
//		for (i = 0; i <= 3; i++) {
//			
//			if(j==0) {
//				System.out.println("0");
//			}else {
//			for (j = 0; j <= 3; j++) {
//				System.out.print(matrizc[i][j] + " ");
//				
//				
//			}
//			System.out.println("");
//
//		}
//	}
//}
//	}
//}
		
		

		Scanner scanner = new Scanner(System.in);
		String aux;
		System.out.println("Introduzca el numero de filas:");
		int row = scanner.nextInt();

		System.out.println("Introduzca el numero de columnas:");
		int colum = scanner.nextInt();
		scanner.nextLine();

		String arrayA[][] = new String[row][colum];
		String arrayB[][] = new String[row][colum];
		int[][]arrayc = new int [row][colum];
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[i].length; j++) { 
				System.out.println("Ingese los datos de la primera Matriz");
				arrayA[i][j] = scanner.nextLine();
			}
		}
		for (int f = 0; f < arrayB.length; f++) {
			for (int g = 0; g < arrayB[f].length; g++) { 
				System.out.println("Ingese los datos de la segunda Matriz");
				arrayB[f][g] = scanner.nextLine();
			}
		}
		
		for (int h = 0; h < arrayc.length; h++) {
			for (int k = 0; k < arrayc[h].length; k++) { 
				if("0123456789".indexOf(arrayA[h][k]) >= 0 && "0123456789".indexOf(arrayB[h][k]) >= 0){
				System.out.println("Entra if: " + arrayA[h][k]);
				int x = Integer.parseInt(arrayA[h][k]);
				int z = Integer.parseInt(arrayB[h][k]);
				arrayc[h][k] = x + z;
				
			} else {
				arrayc[h][k] = 0;
			}
		}
	
	
	for (int p = 0; p < arrayc.length; p++) {
		for (int d = 0; d < arrayc[p].length; d++) {
			System.out.println("Resultado de la coordenada: " + p + "," + d + "el resultado es:"+arrayc[p][d] );
			
			}
		}
}		//if (arrayA.length == arrayB.length) {
		
			
	}
}


