package com;

import java.util.Scanner;

public class EjerciciosArreglosBi {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String aux;
		System.out.println("Ingrese el Numero de filas:");
		int row = sc.nextInt();
		System.out.println("Ingresa el número de columnas: ");
		int colum = sc.nextInt();
		
		sc.nextLine();

		String[][] matriz1 = new String[row][colum];
		String[][] matriz2 = new String[row][colum];
		int[][] matrizR = new int[row][colum];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Ingrese un caracter numero o letra para la primera matriz:");
				matriz1[i][j] = sc.nextLine();
			}
		}
		for (int f = 0; f < matriz2.length; f++) {
			for (int g = 0; g < matriz2[f].length; g++) {
				System.out.println("Ingrese un caracter numero o letra para la segunda matriz:");
				matriz2[f][g] = sc.nextLine();
			}
		}

		for (int h = 0; h < matrizR.length; h++) {

			for (int k = 0; k < matrizR[h].length; k++) {
				
				if ("0123456789".indexOf(matriz1[h][k]) >= 0 && "0123456789".indexOf(matriz2[h][k]) >= 0) {
					System.out.println("entra if : " + matriz1[h][k]);
					int x = Integer.parseInt(matriz1[h][k]);
					int z = Integer.parseInt(matriz2[h][k]);
					matrizR[h][k] = x + z;
				} else {
					matrizR[h][k] = 0;

				}
			}

		}
		for (int p = 0; p < matrizR.length; p++) {
			for (int d = 0; d < matrizR[p].length; d++) {
				System.out.println("Resultado de coordenada: " + p + "," + d + " el resultado es:"+matrizR[p][d]);
			}

		}

	}

}
