package com;

import java.util.Date;
import java.util.Scanner;

public class Array {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		//inicializar un array solo con tamaño
		int [] x = new int [5];
		
		//inicializamos un array con valores
		int y [] = {11,12,13,14,15,16};
		
		//agregar valores a un array vacio
		x[0] = 10;
		x[1] = 11;
		x[2] = 12;
		x[3] = 13;
		x[4] = 14;
		
		//ver alguna posicion en especifico
		System.out.println(x[0]);
		System.out.println(y[4]);
		
		//array de objetos
		Object [] objetos = {"hola",12,56,90,true,'&',new Date()};
		Object [] o2 = new Object[10];
		
		//llenar por teclado un array numerico
		for(int i = 0; i <= x.length; i++) {
			System.out.println("Ingresa un numero:");
			x[i] = sc.nextInt();
		}
		
		
	}

}
