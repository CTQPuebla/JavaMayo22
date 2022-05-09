package com;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class JavaRW {
	
	public static void main(String args[]) {
//		String m = "Este es un mensaje de prueba";
//		float f = 12.3f;
		
		//imprime un texte desde y hasta las posiciones indicadas
		//System.out.println(m.substring(9,15));
		
		//convierte tipos de valores en string
		//System.out.println(m.valueOf(f));
		
		//obtiene la ultima posicion de la letra indicada
		//System.out.println(m.lastIndexOf("es",10));
		
		String line = "";
		int contador = 0;
		
		try {
		File archivo = new File("C:\\Users\\manue\\OneDrive\\Escritorio\\Prueba_CETEC.txt");
		FileReader linea2 = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(linea2);//espacio temporal
		
		
//			FileWriter linea = new FileWriter(archivo, true);
//			for(int i = 0; i < 20; i++) {
//				linea.write("Hola mundo" + i + "\n");
//			}
//			linea.close();
			
		System.out.println("Dentro del archivo de texto");
		
		while((line = buffer.readLine()) != null) {
			contador++;
			System.out.println("line: " + line + " " + contador);
		}
		
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
