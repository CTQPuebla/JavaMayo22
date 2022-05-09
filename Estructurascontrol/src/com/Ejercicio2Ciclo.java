package com;

import java.util.Scanner;

public class Ejercicio2Ciclo {

	public static void main(String[] args) {
		
		int n;
	      int m;
		Scanner sc = new Scanner(System.in);
		Scanner mn= new Scanner(System.in);
      
    
      System.out.println("Introduce la tabla: ");                                                         
      m = sc.nextInt();
      System.out.println("Introduce la iteracion deseada:");
      n =mn.nextInt();
      
		for(int i = 1; i<=n; i++){
			int y= m*i;
            System.out.println(n + " * " + i + " = " + y);                                                     
       }
   }
	}

