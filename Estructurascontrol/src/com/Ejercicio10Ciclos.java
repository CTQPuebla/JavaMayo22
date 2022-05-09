package com;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio10Ciclos {
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int cont=0;
        int sumImpar=0;
        int sumPositivos=0;
        
while(cont<10) {
	System.out.println("Ingresa un numero");
	int num = sc.nextInt();
	
	if(num>0) {
		System.out.println("Es positivo:");
		sumPositivos = sumPositivos + num;
}else {
	
	System.out.println("Es negativo");
	
}
	if (num%2==0) {
		System.out.println("Es par:");
	}else {
		sumImpar = sumImpar + num;
		System.out.println("Es impar:");
	}
	cont ++;
}
System.out.println("Sumatoria de positivos "+sumPositivos);
System.out.println("sumatoria impares"+sumImpar);
	}
	
            
                	 	            }
                	 	        
                
            
        
	
        
	


