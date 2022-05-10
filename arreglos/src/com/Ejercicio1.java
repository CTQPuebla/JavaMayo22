package com;

import java.util.Scanner;

public class Ejercicio1 {
	Scanner scan= new Scanner(System.in);

	public void alumnos() {
		double cal=0;
		int nAlumnos=0;
		double prom;
		
		System.out.println("ingresa el numero de alumnos a registrar");
		nAlumnos = scan.nextInt();
		
		double lista[][] = new double[nAlumnos][4];
		
		for(int i = 0; i<nAlumnos; i++) {
			System.out.println("calificaciones del alumno " +(i+1));
			for(int j = 0; j < 4; j++) {
				if(j<3) {
					System.out.println("ingresa la calificacion " + (j+1));
					lista[i][j] = scan.nextDouble();
					cal+=lista[i][j];
				}else {
					prom=cal/3;
					lista[i][j]=prom;
				}
			}
			cal=0;
		}
		
		System.out.println("la lista de los promedios de los alumnos"
				+ " es de:\n");
		
		for(int i=0; i < nAlumnos; i++) {
			System.out.println((i+1) + ".- " + lista[i][3]);
		}
		
	}
	
	
	
	
}
