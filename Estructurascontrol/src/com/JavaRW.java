package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaRW {

	public static void main(String[] args) {
		// metodos de clase string
		//substring = sirve para cortar una secion de un string
		//charAt
		//tolowercase
		//value
		//lastIndexof
		
		
//		String m = "Este es un mensaje de prueba";
//		System.out.println(m.substring(9,15));

		
//		String m = "Este es un mensaje de prueba";
//		//System.out.println(m.substring(9,16));
//
//		System.out.println(m.lastIndexOf('b',10));
//		
		
	//java Rw
		String line ="";
		int contador =0;
		try {
			File archivo = new File("C:\\Users\\Aidde BE\\Desktop\\doc.txt");
//		FileWriter linea = new FileWriter(archivo, true);
//		
//		for (int i =0; i< 20; i++) {
//		//System.out.println("el valor de i es:"+i);
//		linea.write("Hola mundo"+i+"\n");
//		}
//		linea.close();
			
			//lectura
			
			FileReader linea2 = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea2);//linea temporal
			System.out.println("Dentro del achivo de texto");
			while ((line = buffer.readLine())!= null) {
				contador++;
				System.out.println("line"+line+ "hola"+contador);
			}
			
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

