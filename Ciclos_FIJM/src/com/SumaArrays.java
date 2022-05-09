package com;
import java.util.Arrays;
import java.util.Scanner;

public class SumaArrays {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int col = 0;
		int filas = 0;
		int contador = 0;
		int suma = 0;
		
		String arrayA [][];
		String arrayB [][];
		String arrayC [][];
		
		System.out.println("Ingresa el numero de columnas");
		col = sc.nextInt();
		
		System.out.println("Ingresa el numero de filas");
		filas = sc.nextInt();
		
		arrayA = new String[col][filas];
		
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayA[i].length; j++) {
				System.out.println("Ingresa un valor");
				arrayA[i][j] = sc.next();
			}
		}
		
		arrayB = new String[col][filas];
		arrayC = new String[col][filas];
		
		for(int i = 0; i < arrayB.length; i++) {
			for(int j = 0; j < arrayB[i].length; j++) {
				System.out.println("Ingresa los valores (matriz2)");
				arrayB[i][j] = sc.next();
			}
		}
		
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayA[i].length; j++) {
				if("0123456789".indexOf(arrayA[i][j]) >=0 && "0123456789".indexOf(arrayB[i][j]) >=0 ) {
					suma = Integer.parseInt(arrayA[i][j]) + Integer.parseInt(arrayB[i][j]);
					arrayC[i][j] = "" + suma;
				}else {
					arrayC[i][j] = "0";
				}
			}
		}
		
		for(int i = 0; i < arrayC.length; i++) {
			for(int j =0; j < arrayC[i].length; j++) {
				System.out.print(arrayC[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println(Arrays.deepToString(arrayC));
		
	}

}
