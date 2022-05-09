package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class javaRW {
	public static void main(String[] args) {
		
		//JAVA RW
//		String line = "";
//		int contador = 0 ;
//		
//		try {
//			File archivo = new File( "C:\\Users\\Kike117\\Desktop\\doc.txt" );
////			FileWriter linea = new FileWriter(archivo, true);
////			
////			for (int i = 0; i < 20; i++) {
////				linea.write("Hola mundo" +i+ "\n");
////				
////			}
////			linea.close();
//			
//			
//			//Lectura
//			
//			FileReader linea2 = new FileReader(archivo);
//			BufferedReader buffer = new BufferedReader(linea2);
//			
//					
//		    System.out.println("Dentro del archivo de texto");
//			
//			while ((line = buffer.readLine()) != null) {
//				contador++;
//				System.out.println("line: " + line + " " + contador);
//				
//			}
//			
//			
//			
//			
//			
//		} catch (Exception E) {
//			E.printStackTrace();
//			
//		}
//	}
//}
		
	      
	     int dia = 0;
	     int mes = 0;
	     int año = 0;
	        

	        File f = new File("C:\\Users\\Kike117\\Desktop\\doc.txt");

	        try  (Scanner entrada = new Scanner(f)) {

	            //Primero están todos los int seguidos
	            System.out.println("Números de tipo int: ");
	            

	            while (entrada.hasNextInt()) { //mientras queden enteros por leer
	                dia = entrada.nextInt(); //se lee un entero del archivo
	                
	                if(dia==01) {
  						System.out.println("Primero de");
  					   
  	            }
	          
	                
      

	          

	        } catch (FileNotFoundException e) {
	            System.out.println(e.toString());
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    
	}
}


