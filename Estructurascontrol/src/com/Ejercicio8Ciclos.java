package com;

import java.util.Scanner;

public class Ejercicio8Ciclos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        //Lectura de dos números enteros distintos
        do {
            System.out.print("Introduce un número entero: ");
            numero1 = sc.nextInt();
            System.out.print("Introduce otro número entero distinto del anterior: ");                   
            numero2 = sc.nextInt();
            if(numero1 == numero2){
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);
       
        //Calcular cuál de los números es el mayor y cuál el menor
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        //Mostrar por pantalla los números desde el menor hasta el mayor.
        System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

	}

}
