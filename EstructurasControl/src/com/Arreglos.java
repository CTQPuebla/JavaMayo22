package com;

import java.util.Scanner;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Arreglos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Inicializa array con tamaño
		int [] x = new int [5];
		//Inicializa array con valores
		int y [] = {11,12,13,14,15,16};
		//agregar valores a un array vacio
	/*	x[0]= 10;
		x[1]= 11;
		x[2]= 12;
		x[3]= 13;
		x[4]= 14;*/
		
		System.out.println(x[4]);
		
		//Array de objetos: le cabe cualquier cosa 
		Object[] objetos = {};
		Object[] ob=new Object [10];
		
		//llenar un arreglo nuemrico 
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("ingresa numero:");
			x[i]=sc.nextInt();
		}
	}
	

}
