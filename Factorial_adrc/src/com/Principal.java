package com;

import java.util.Scanner;

public class Principal {

	public static void main (String args[]) {
		int f=0, fac=1;;
		Scanner s = new Scanner(System.in);
		
		f=s.nextInt();
		
		for(int n=1;n<=f;n++) {
			fac=fac*n;
		}
		
		System.out.println(fac);
	}
}
