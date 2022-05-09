package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
	public static void main(String [] args) {
		String line ="";
		int contador = 0;
		
		try {
			
			File archivo =new File("C:\\Users\\monse\\OneDrive\\Escritorio\\ClaseArchivo.txt");
			//Escritura
//			FileWriter linea = new FileWriter(archivo, true);
//			for (int i =0; i < 20; i++) {
//				linea.write("Hola mundo"+"\n");
//			}
//			linea.close();
			
			//Lectura
			FileReader linea2 = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(linea2);// es un espacio temporal
			System.out.println("dentro del archivo");
			
			while ((line= buffer.readLine()) != null) {
				contador ++;
				System.out.println("Linea:"+line+" "+contador);
			}
		} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}


