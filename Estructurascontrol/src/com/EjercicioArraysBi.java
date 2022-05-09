package com;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArraysBi {

	public static void main(String[] args) {

		int f = 0;
		int c = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el numero de filas:");
		f = scanner.nextInt();

		System.out.println("Introduzca el numero de columnas:");
		c = scanner.nextInt();

		String arrayA[][] = new String[f][c];
		String arrayB[][] = new String[f][c];
		
		
		//if (arrayA.length == arrayB.length) {
		
			int [][] arrayC = new int [f] [c];
		for(int i =0; i < arrayA.length; i++) {
			for(int j =0; j< arrayA[i].length; j++) {
				System.out.println("Ingrese la variable para la matriz 1:");
				arrayA[i][j] = scanner.nextLine();
			}
			}
	
		for (int a=0; a < arrayB.length; a++) {
			for(int b = 0; a < arrayB.length; b++ ) {
				System.out.println("Ingrese la variable para la matriz 2:");
				arrayB[a][b] = scanner.nextLine();
			}
			}

		for(int h=0; h < arrayC[h].length; h++) {
			for(int k = 0; k < arrayC[k].length; k++ ) {
				if ("0123456789".indexOf(arrayA[h][k]) >= 0 && "0123456789".indexOf(arrayB[h][k]) >=0) {
					System.out.println("Entra if:"+arrayA[h][k]);
					int x= Integer.parseInt(arrayA[h][k]);
					int z= Integer.parseInt(arrayA[h][k]);
					arrayC[h][k] = + z;
				}else {
					arrayC[h][k] =0;
				}
				}
			}
			for (int p=0; p < arrayC.length; p++){
				for (int d =0; d< arrayC[p].length; p++) {
					System.out.println("Resultado coordenadas"+p+"," +d +"el resultado es:"+arrayC[p][d] );
			
			}
			}
			
			
	}


		
	}

