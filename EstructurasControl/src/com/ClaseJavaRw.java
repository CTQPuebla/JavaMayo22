package com;
import java.io.*;

public class ClaseJavaRw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		metodos clase string
//		substring
//		valueOf
//		lastindexOf
//		to lowercase
//		to Uppercase
	
		String line= "";
		int contador=0;
		
		try {
		File archivo = new File("C:\\Users\\villa\\OneDrive\\Desktop\\prueba.txt");
//		Escritura	
//		FileWriter linea = new FileWriter(archivo,true);
//
//			for(int i=0; i<20;i++) {
//				linea.write("hola mundo" + "\n");
//			}
//			linea.close();
		
		//Lectura
		
		FileReader linea2= new FileReader(archivo);
		BufferedReader buffer= new BufferedReader(linea2);
		System.out.println("dentro del archivo de texto");
		
		while((line=buffer.readLine()) != null) {
			contador++;
			System.out.println("line: "+ contador + " "+ line);
		}
		
		buffer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		
		



	}

}
