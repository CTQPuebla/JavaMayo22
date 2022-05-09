package com;

import java.util.Scanner;

public class Ejercicio3Ciclos {

	public static void main(String[] args) {
		String n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la  palbra: ");                                                         
	    n= sc.nextLine();
		
		String str = n, reverseStr = "";
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " Es palíndromo.");
	    }
	    else {
	      System.out.println(str + " No es palíndromo.");
	    }
	    

	}
	

}

//

