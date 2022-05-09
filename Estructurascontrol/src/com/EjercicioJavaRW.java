package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class EjercicioJavaRW {

	public static void main(String [] date) {
		
		 int dia = 0;
	     int mes = 0;
	     int año = 0;
	     int dia1 = 0;
	     int mes1 = 0;
	     int año1 = 0;
	     int dia2 = 0;
	     int mes2 = 0;
	     int año2 = 0;
	     int dia3 = 0;
	     int mes3 = 0;
	     int año3 = 0;
	    double numeroDouble, sumaDouble = 0;

	        File f = new File("C:\\Users\\Aidde BE\\Desktop\\doc.txt");

	        try  (Scanner entrada = new Scanner(f)) {

	            
	            System.out.println("Fecha 1: ");
	            

	            while (entrada.hasNextInt()) { //mientras queden enteros por leer
	                dia = entrada.nextInt(); //se lee un entero del archivo
	                
	                if(dia==1) {
 						System.out.println("Primero de");
 	                
 	            }
                   mes = entrada.nextInt(); //se lee un entero del archivo
	                
	                if(mes==07) {
 						System.out.println("julio de");
 	                
 	            }
                    año = entrada.nextInt(); //se lee un entero del archivo
	           
	                System.out.print(año + " " ); //se muestra por pantalla
	          
	            }
	            Scanner entrada1 = new Scanner(f);
                    System.out.println("Fecha 2: ");
	            

	            while (entrada1.hasNextInt()) { //mientras queden enteros por leer
	                dia1 = entrada1.nextInt(); //se lee un entero del archivo
	                
	                if(dia1==11) {
 						System.out.println("once de");
 	                
 	            }
                   mes1 = entrada1.nextInt(); //se lee un entero del archivo
	                
	                if(mes1==04) {
 						System.out.println("abril de");
 	                
 	            }
                    año1 = entrada1.nextInt(); //se lee un entero del archivo
	           
	                System.out.print(año1 + " " ); //se muestra por pantalla
	          
	            }


	            Scanner entrada2 = new Scanner(f);
                System.out.println(+\n+"Fecha 3: ");
            

            while (entrada2.hasNextInt()) { //mientras queden enteros por leer
                dia2 = entrada2.nextInt(); //se lee un entero del archivo
                
                if(dia2==11) {
						System.out.println("Veintitres");
	                
	            }
               mes2 = entrada2.nextInt(); //se lee un entero del archivo
                
                if(mes2==04) {
						System.out.println("noviembre de");
	                
	            }
                año2 = entrada2.nextInt(); //se lee un entero del archivo
           
                System.out.print(año2 + " "); //se muestra por pantalla
          
            }

            Scanner entrada3 = new Scanner(f);
            System.out.println("Fecha 4: ");
        

        while (entrada3.hasNextInt()) { //mientras queden enteros por leer
            dia3 = entrada3.nextInt(); //se lee un entero del archivo
            
            if(dia3==04) {
					System.out.println("cuatro de");
             
         }
           mes3 = entrada3.nextInt(); //se lee un entero del archivo
            
            if(mes3==10) {
					System.out.println("octubre de");
             
         }
            año3 = entrada3.nextInt(); //se lee un entero del archivo
       
            System.out.print(año3 + " "); //se muestra por pantalla
        }

	       
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    
	}
}