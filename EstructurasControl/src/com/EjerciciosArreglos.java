package com;

import java.util.Scanner;

public class EjerciciosArreglos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	String m="";
		int numMes=0;
		String [] mes = new String [12];
	//	System.out.println("Ingresa el mes:");
	//	m=sc.nextLine();
		System.out.println("Ingresa el numero delmex:");
		int m= sc.nextInt();
		mes [0] = "enero";
		mes [1] = "febrero";
		mes [2] = "marzo";
		mes [3] = "abril";
		mes [4] = "mayo";
		mes [5] = "junio";
		mes [6] = "julio";
		mes [7] = "agosto";
		mes [8] = "septiembre";
		mes [9] = "octubre";
		mes [10] = "noviembre";
		mes [11] = "diciembre";
		int i=m-1;
		
System.out.println("mes "+mes[i]);
		
	//	for (int i=0; i<; i++) {
			
//			for (String text:mes) {
//				
//				if (text.contentEquals(m)) {
//					numMes= 1; 
//					//System.out.println("mes"+mes[i]);
//					System.out.println("mes"+text);
//				}
			}
	//	}
	//	System.out.println("tu mes el numero:"+numMes);
		
	}


