package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroAlumnos;
		
		System.out.print("Número de alumnos: ");
        numeroAlumnos = sc.nextInt();
        if (numeroAlumnos >= 100) {
        	
        	System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
  + "euros y cada alumno debe pagar 65 euros");

        } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
  + "euros y cada alumno debe pagar 70 euros");

        } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
  + "euros y cada alumno debe pagar 95 euros");

        } else {
System.out.println("El coste del autobús es de 4000 euros y cada alumno "
  + "debe pagar " + (4000/numeroAlumnos) + " euros.");
} 
}

	}


