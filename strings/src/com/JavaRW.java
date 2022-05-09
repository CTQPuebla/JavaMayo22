package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaRW {
	public static void main(String[] args) {
		//JavaRW
		String line="";
		int contador=0;
		
		try {
			File archivo = new File("C:\\Users\\bullc\\Desktop\\pruebajavarw.txt");
//			FileWriter linea = new FileWriter(archivo, true);
//			for(int i= 0; i < 20; i++) {
//				//System.out.println("el valor de i es: " + i );
//				linea.write("hola mundo" + i +"\n" );
//			}
//			linea.close();
			//lectura
			FileReader linea2 = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea2);
			System.out.println("Dentro del archivo de texto");
			
			while((line = buffer.readLine()) != null ) {
				contador++;
				System.out.println("line : " + line + " " + contador);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
