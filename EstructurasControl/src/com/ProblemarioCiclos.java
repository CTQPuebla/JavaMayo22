package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemarioCiclos {
	
	Scanner sc = new Scanner(System.in);
	
	public void tablaMultiplicar() {
		int num = 12;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
	
	public void tablaMultiplicarTeclado() {
		int numMultiplicar;
		int iteracion;
		System.out.print("Numero a multiplicar: ");
		numMultiplicar = sc.nextInt();
		System.out.print("Numero hasta donde va a llegar la iteracion: ");
		iteracion = sc.nextInt();
		
		for (int i = 1; i <= iteracion; i++) {
			System.out.println(numMultiplicar + " x " + i + " = " + (numMultiplicar * i));
		}
	}
	
	public void esStringPalindromo() {
		String cadena;
		String cadenaInvertida = "";
		System.out.print("Ingrese la cadena: ");
		cadena = sc.nextLine();
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		if (cadena.equals(cadenaInvertida)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}
	
	public void existeLetra() {
		String cadena;
		String letra;
		System.out.print("Ingrese la cadena: ");
		cadena = sc.nextLine();
		System.out.print("Ingresa que desea buscar en la cadena: ");
		letra = sc.nextLine();
		if (cadena.contains(letra)) {
			System.out.println("Caracter encontrado");
		} else {
			System.out.println("Caracter no encontrado");
		}
	}
	
	public void relojDigital() {
		for (int horas = 0; horas <= 23; horas++) {
			for (int minutos = 0; minutos <= 59; minutos++) {
				for (int segundos = 0; segundos <= 59; segundos++) {
					System.out.println("Horas: " + horas + " , minutos: " + minutos + " , segundos: " + segundos);
				}
			}
		}
	}
	
	public void inversionBanco1() {
		float porcentaje;
		float dineroFinal = 1000.00f;
		
		porcentaje = (2 * dineroFinal) / 100;
		for (int i = 1; i < 12; i++) {
			dineroFinal = dineroFinal + porcentaje;	
		}
		System.out.println("Dinero al terminar el año: " + dineroFinal);
	}
	
	public void inversionBanco2() {
		float dineroIncial = 700.0f;
		float porcentaje;
		int meses = 1;
		
		porcentaje = (2 * dineroIncial) / 100;
		
		while (dineroIncial <= 1500.0) {
			dineroIncial = dineroIncial + porcentaje;
			meses++;
		}
		System.out.println("En " + meses + " juntara el dinero" );
	}
	
	public void menorAMayor() {
		int num1;
		int num2;
		
		System.out.print("Ingresa un numero: ");
		num1 = sc.nextInt();
		System.out.print("Ingresa otro numero: ");
		num2 = sc.nextInt();
		
		while (num1 < num2) {
			System.out.println(num1);
			num1++;
		}		
	}
	
	public void numeroPares() {
		int num1;
		int num2;
		System.out.print("Ingresa un numero: ");
		num1 = sc.nextInt();
		System.out.print("Ingresa otro numero: ");
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i < num2; i++) {
				if (i % 2 == 0) {
					System.out.println("Numeros pares: " + i);
				}
			}
		}
	}
	
	public void positivosNegativos() {
		int cant;
		int num1;
		int num[];
		int numerosImpares = 0;
		int numerosPositivos = 0;
		System.out.print("¿Cuantos numeros va a imgresar?: ");
		cant = sc.nextInt();
		num = new int[cant];
		
		for (int i = 0; i < cant; i++) {
			System.out.print("Ingresa otro numero: ");
			num1 = sc.nextInt();
			num[i] = num1;
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.println("Numero positivo: " + num[i]);
				numerosPositivos += num[i];
				if (num[i] % 2 == 0) {
					System.out.println("Numero par: " + num[i]);
				}else {
					System.out.println("Numero impar: " + num[i]);
					numerosImpares += num[i];
				}
			}else {
				System.out.println("Numero negativo: " + num[i]);
			}
		}
		System.out.println("Sumatoria de numeros positivos: " + numerosPositivos);
		System.out.println("Sumatoria de numeros impares: " + numerosImpares);
		
		
	}
	
	public void calcularSumaMedia() {
		boolean flag = true; //bandera
		String caracter="";
		int sum=0;
		int cont = 0;
		float promedio;
		String aux="";
		int mayores=0;		
		while(flag) {
			//indexOf
			System.out.println("Ingresa un numero");			
			caracter = sc.nextLine();			
			if("0123456789".indexOf(caracter)>=0) {
				//7,4,5,9,1,4,0,8,3
				aux = aux + caracter + ",";
				//convertir el string a int
				//     x  +  7                  "7"
				sum = sum + Integer.parseInt(caracter);
				System.out.println(sum);
				cont++;							
			}else {
				System.out.println("No es un numero");
				flag = false;
			}		
		}			
		promedio = sum/cont;
		System.out.println("Promedio: "+String.format("%.2f", promedio));		
		//7,4,5,9,1,4,0,8,3
		String[] array = aux.split(","); //cortando y separando valores		
		for (int i = 0; i < array.length; i++) {			
			if(Integer.parseInt(array[i])>promedio) {
				mayores++;
			}								
		}
		System.out.println("Mayores que la media: "+mayores);
	}
	
	public void dibujarCuadrado() {
		int ancho;
		int alto;
		int i;
		int j = 0;
		System.out.print("Ingresa el alto: ");
		ancho = sc.nextInt();
		System.out.print("Ingresa el ancho: ");
		alto = sc.nextInt();
		System.out.println("\n");
		//String[][] a = new String[5][4];
		char cuadrado[][] = new char[alto][ancho];
		for (i = 0; i < alto; i++) {
			for (j = 0; j < ancho; j++) {
				cuadrado[i][j] = '*';
			}
		}
		
		for (i = 0; i < alto; i++) {
			System.out.print("        ");
			for (j = 0; j < ancho; j++) {
				System.out.print(cuadrado[i][j]);
			}
			System.out.println();
		}
	}
	
	public void calificaciones() {
		int calilificaciones[] = new int[5];
		
		calilificaciones[0] = 10;
		calilificaciones[1] = 7;
		calilificaciones[2] = 5;
		calilificaciones[3] = 9;
		calilificaciones[4] = 4;
		
		for (int i = 0; i < calilificaciones.length; i++) {
			if (!(calilificaciones[i] <= 5)) {
				System.out.println("Aprobado con: " + calilificaciones[i]);
			} else {
				System.out.println("Reprobado con: " + calilificaciones[i]);
			}
		}
		
	}
	
	public void frutas() {
		String frutas[] = new String[5];
		String reversa;
		frutas[0] = "Naranja";
		frutas[1] = "Mango";
		frutas[2] = "Sandia";
		frutas[3] = "Piña";
		frutas[4] = "Guanabana";
		
		for (int i = 0; i < frutas.length; i++) {
			reversa = "";
			for (int j = frutas[i].length() - 1; j >= 0; j--) {
				reversa += frutas[i].charAt(j);
			}
			System.out.println(reversa);
		}
		
	}
	
	public void ejemplos() {
		String[][] array = new String[5][4];
		array[0][0] = "hola";
		array[0][1] = "8";
		array[0][2] = "sd";
		array[0][3] = "vc";
		
		array[1][0] = "2";
		array[1][1] = "dsfg";
		array[1][2] = "xv";
		array[1][3] = "65";
		
		array[2][0] = "sfs";
		array[2][1] = "111";
		array[2][2] = "|";
		array[2][3] = ".";
		
		array[3][0] = "{";
		array[3][1] = "+";
		array[3][2] = "¿";
		array[3][3] = "656b";
		
		array[4][0] = "d}";
		array[4][1] = "343";
		array[4][2] = "%";
		array[4][3] = "$";
	
		System.out.println(Arrays.deepToString(array));
	}
	
	public void ejercicio() {
		int filas = 0,columnas = 0;
		int filas2 = 0, columnas2 = 0;
		String[][] array1;
		String[][] array2;
		int[][] arrayResultado;
		System.out.print("Ingresa el numero de las columnas del primer array: ");
		columnas = sc.nextInt();
		System.out.print("Ingresa el numero de las filas del primer array: ");
		filas = sc.nextInt();
		array1 = new String[columnas][filas];
		System.out.print("Ingresa el numero de las columnas del segundo array: ");
		columnas2 = sc.nextInt();
		System.out.print("Ingresa el numero de las filas del segundo array: ");
		filas2 = sc.nextInt();
		array2 = new String[columnas2][filas2];
		sc = new Scanner(System.in);
		if (columnas == columnas2 && filas == filas2) {
			arrayResultado = new int[columnas][filas];
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					System.out.print("Teclea algo para el primer array: ");
					array1[i][j] = sc.nextLine();
				}
			}
			for (int i = 0; i < array2.length; i++) {
				for (int j = 0; j < array2[i].length; j++) {
					System.out.print("Teclea algo para el segundo array: ");
					array2[i][j] = sc.nextLine();
				}
			}
			for (int i = 0; i < array1.length; i++) {
				for (int i2 = 0; i2 < array1[i].length; i2++) {
					if (!Character.isLetter(array1[i][i2].charAt(0))) {
						arrayResultado[i][i2] = Integer.parseInt(array1[i][i2]) + Integer.parseInt(array2[i][i2]);
					} else {
						arrayResultado[i][i2] = 0;
					}
				}
			}
			System.out.println(Arrays.deepToString(arrayResultado));
		} else {
			System.out.println("Introduce el mismo tamaño de filas y columnas para poder sumar");
		}
		
	}
	
	public void clase1() {
		String n = "Estes un mensaje de prueba";
		System.out.println(n.substring(9));
		System.out.println(n.substring(9, 16));
		
		float f = 3.1416f;
		System.out.println(n.valueOf(f));
		System.out.println(n.lastIndexOf('e'));
		System.out.println(n.lastIndexOf('e',10));
	}
	
	public void escribirArchivo() {
		String line = "";
		int contador = 0;
		
		try {
			File archivo= new File("C:\\Users\\Ruben\\Desktop\\archivo.txt");
			FileWriter linea = new FileWriter(archivo, true);
			
			for (int i = 0; i < 20; i++) {
				linea.write("Hola mundo" + "\n");
			}
			linea.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leerArchivo() {
		String line = "";
		int contador = 0;
		try {
			File archivo= new File("C:\\Users\\Ruben\\Desktop\\archivo.txt");
			FileReader linea = new FileReader(archivo);
			
			BufferedReader buffer = new BufferedReader(linea);
			
			while ((line = buffer.readLine()) != null ) {
				contador++;
				System.out.println("line" + line + " " + contador);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ejercicio2() {
		String line = "";
		String[] dias = {"", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE", 
				"DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE",
				"VENTIUNO", "VEINTIDOS", "VEINTITRES", "VEINTICUATRO", "VEINTICINCO", "VENTISEIS", "VEINTISIETE", "VEINTIOCHO"
				, "VEINTINUEVE",
				"TREINTA", "TREINTAIUNO"};
		String[] meses = {"", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO",
				"SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
		try {
			File archivo= new File("C:\\Users\\Ruben\\Desktop\\archivo.txt");
			FileReader linea = new FileReader(archivo);
			
			BufferedReader buffer = new BufferedReader(linea);
			
			while ((line = buffer.readLine()) != null ) {
				System.out.println(dias[Integer.parseInt(line.substring(0,2))] + " DE " 
				+ meses[Integer.parseInt(line.substring(2, 4))] + " " + line.substring(4, 8));
				System.out.println(line);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
