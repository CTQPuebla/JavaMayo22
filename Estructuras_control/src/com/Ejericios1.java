package com;

import java.util.Scanner;

public class Ejericios1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int a = sc.nextInt();
		System.out.println("ingrese un segundo numero");
		int b = sc.nextInt();
		if (a-b > 0) {
			System.out.println("el primer numero ingresado es mayor");
		} else if (a-b < 0) {
			System.out.println("el segundo numero es mayor");
		}else {
			System.out.println("ambos numeros son iguales");
		}
	}

}
