package com;

import java.util.Arrays;

public class ArreglosBi {

	public static void main(String[] args) {
		String [][] array = new String [5][4];
		array [0][0] = "hola";
		array [0][1] = "ciao";
		array [0][2] = "hello";
		array [0][3] = "hi";
		
		array [1][0] = "adios";
		array [1][1] = "arrivederchi";
		array [1][2] = "bye";
		array [1][3] = "see you";
		
		array [2][0] = "tú";
		array [2][1] = "yo";
		array [2][2] = "ella";
		array [2][3] = "él";
		
		array [3][0] = "mamá";
		array [3][1] = "papá";
		array [3][2] = "hermano";
		array [3][3] = "hermana";
		
		array [4][0] = "no";
		array [4][1] = "si";
		array [4][2] = "tal ves";
		array [4][3] = "para nada";
		
		for (int i = 0; i < array.length; i++) {
			for (int j =0; j<array[i].length; j++) {
		//	array [i][j];
				
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}
