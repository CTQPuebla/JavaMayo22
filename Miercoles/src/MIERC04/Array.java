package MIERC04;

import java.sql.Date;
import java.util.Scanner;

public class Array { 
	private static Scanner sc;

	public static void main(String[] args) {
		
//		 Scanner ss = new Scanner (System.in);  
//		 
//		//Inicializar un array solo con tamaño 
//		
//		int [] x = new int[5] ;
//		
//		//Inicializar un array solo con valores 
//		
//		int y[] = { 11, 12, 13, 14, 15, 16};
//		
//		//Agregar valores a un array vacio
//		
//		x [0] = 10;
//		x [1] = 11;
//		x [2] = 12;
//		x [3] = 13;
//		x [4] = 14;
//		
//		//Ver alguna posición en específico 
//		
//		System.out.println(x [1]);
//		System.out.println(y [3]);
//		
//		//Array de objetos 
//		
//		Object [] objetos = { "hola", 12, 56.90, true,"&", new Date(0) };
//		Object [] ob2 = new Object [10];
//		
//		// Llenar por teclado un array numerico 
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.println("Ingresar un numero");
//			x[i] = sc.nextInt();	
//		}
//		
		//Array video 
		
//		{
//		int [] mimatriz = new int [5];
//		
//		mimatriz [0]= 15;
//		mimatriz [1]= 25;
//		mimatriz [2]= 8;
//		mimatriz [3]= -7;
//		mimatriz [4]= 92 ;
//		
//		System.out.println(mimatriz [0]);
//		System.out.println(mimatriz [1]);
//		System.out.println(mimatriz [2]);
//		System.out.println(mimatriz [3]);
//		System.out.println(mimatriz [4]);
//		
//		for (int i =0; 1<5 ; i++ ) {
//			System.out.println("Si mi indice " + i + "=" + mimatriz [i]);
//		}
//		}
//		
//		 
		//Selecciona el pais que tenga mas letras 
			String [] paises= new String [6]; 
			
			paises [0]= " España";
			paises [1]= " México";
			paises [2]= " Colombia";
			paises [3]= " Perú";
			paises [4]= " Chile";
			paises [5]= " Argentina";
			
			
		for ( int i=0; i<paises.length; i++)
			
		{ System.out.println( "País " + (i+1) + paises [i]);
		System.out.println( "El país con mas letras es: " + (i+1) + paises [i]);
		
		
		System.out.println("La primera letra de mi nombre es:" + nombre + " es la " + nombre.charAt(0));
		
		
		}
		
		
		
		
			}
}
