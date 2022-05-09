package com;

import java.util.Arrays;

public class Arrays2Dimenciones {

	public static void main(String[] args) {

String [] [] array = new String [5] [4];
String [][] array2 = {{"1","2","3"},
		              {"4","5","6"},
		              {"7","8","9"}};


//asignarle valores 

array [0] [0] ="hola";
array [0] [1] = "8";
array [0] [2] = "a";
array [0] [3] = "b";

array [1] [0] = "c";
array [1] [1] = "d";
array [1] [2] = "e";
array [1] [3] = "f";

array [2] [0] = "g";
array [2] [1] = "h";
array [2] [2] = "i";
array [2] [3] = "j";

array [3] [0] = "k";
array [3] [1] = "l";
array [3] [2] = "m";
array [3] [3] = "n";

array [4] [0] = "ñ";
array [4] [1] = "o";
array [4] [2] = "p";
array [4] [3] = "q";

//
for (int i=0; i <array.length; i++) {//iterar sobre las fila
	for (int j=0; j< array[i].length; j++) {// iterar sobre columnas
		
}

}
	//imprimir el contenido del array

System.out.println(Arrays.deepToString(array));



	}
}
