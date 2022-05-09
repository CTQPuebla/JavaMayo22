package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_arrays {
	public void uno() {
		Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; //contadores
        int i;
       
        //Leemos los valores por teclado y los guardamos en el array                                              
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
  
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
  
        //mostrar resultados
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
	}
	
	public void dos() {
		String [][] a = new String [4][4];
		a [0][0] = "1";
		a [0][1] = "2";
		a [0][2] = "3";
		a [0][3] = "4";
		
		a [1][0] = "5";
		a [1][1] = "6";
		a [1][2] = "7";
		a [1][3] = "8";
		
		a [2][0] = "9";
		a [2][1] = "10";
		a [2][2] = "11";
		a [2][3] = "12";
		
		a [3][0] = "13";
		a [3][1] = "14";
		a [3][2] = "15";
		a [3][3] = "16";
		
		//System.out.println(a.deepToString());
		
	} 
	
	public void tres() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de columnas");
		int a = sc.nextInt(); 
		System.out.println("Ingrese el numero de filas");
		int b = sc.nextInt(); 
		int sum = 0;
		int n1,n2;
		String [][] m1 = new String [b][a];
		String [][] m2 = new String [b][a];
		String [][] m3 = new String [b][a];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.println("ingrese un numero para la primera matriz");
				m1 [i][j] = sc.next(); 
				System.out.println("ingrese un numero para la segunda matriz");
				m2 [i][j] = sc.next(); 
				//m2 [i][j] = m1 [i][j];
				try {
					n1 = Integer.parseInt(m1[i][j]);
					n2 = Integer.parseInt(m2[i][j]);
					sum = n1 + n2;
					m3 [i][j] = String.valueOf(sum);
				}catch (Exception e){
					m3 [i][j] = String.valueOf(0);
				}
		}
		}
		
		
		System.out.println(Arrays.deepToString(m1));
		System.out.println(Arrays.deepToString(m2));
		System.out.println(Arrays.deepToString(m3));
		
	}

}
