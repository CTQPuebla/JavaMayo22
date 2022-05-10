package com;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	Scanner scan=new Scanner(System.in);
	public void sumaMatrices() {
		
		int fil=0;
		int col=0;
		String car;
		int sum;

		while(fil <= 0 && col <= 0 ) {
			
			System.out.println("ingresa la cantidad de filas que tendra la matriz");
			fil = scan.nextInt();
			System.out.println("ingresa la cantida de columnas que tendra la matriz");
			col = scan.nextInt();
			
			String arregloA[][] = new String[fil][col];
			String arregloB[][] = new String[fil][col];
			String arregloC[][] = new String[fil][col];
			
			//rellenando la matriz A
			if(fil > 0 || col > 0){
				System.out.println("ingresa los datos de la matriz A");
				for (int i = 0; i < fil; i++) {
					for (int j = 0; j < col; j++) {
						System.out.println("ingresa un valor");
						car=scan.next();
						arregloA[i][j]=car;
					}	
				}
				
				//rellanando la matriz B
				System.out.println("ingresa los datos de la matriz B");
				
				for (int i = 0; i < fil; i++) {
					for (int j = 0; j < col; j++) {
						System.out.println("ingresa un valor");
						car=scan.next();
						arregloB[i][j]=car;
					}	
				}
				
				for (int i = 0; i < fil; i++) {
					for (int j = 0; j < col; j++) {
						if("0123456789".indexOf(arregloA[i][j])>=0 && "0123456789".indexOf(arregloB[i][j])>=0 ) {
							sum = Integer.parseInt(arregloA[i][j]) + Integer.parseInt(arregloB[i][j]);
							System.out.println(sum);	
							arregloC[i][j] ="" + sum;
						}else {
							arregloC[i][j] = "X";
							}
						}
					}
				System.out.println("los valores del 3er arreglo son:");
				System.out.println(Arrays.deepToString(arregloC));
				}else {
				System.out.println("no puede haber 0 filas  o columnas en la matriz");
			}
		}
	}
}
