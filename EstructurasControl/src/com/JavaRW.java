package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaRW {
	public static void main(String[] args) {
		// JavaRW
		String line = "";
		int contador = 0;		
		String[] diasLetra = {"1ero","2do","3ro","4to","5to","6to","7mo","8vo","9no","10mo","11vo","12vo","13vo","14vo","15vo","16vo","17vo","18vo","19vo","20mo","21vo","22vo","23vo","24vo","25vo","26vo","27vo","28vo","29vo","30vo","31vo"};
		String[] mesesLetra = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre", "Diciembre"};		
		try {
			File archivo = new File("C:\\Users\\César\\Desktop\\archivo.txt");
			FileReader linea2 = new FileReader(archivo); //
			BufferedReader buffer = new BufferedReader(linea2); //Espacio temporal
			System.out.println("Dentro del archivo de texto");
			int dia=0;
			int mes = 0;
			String resultado = "";
			while ((line = buffer.readLine()) != null) {
				contador++;
				System.out.println("linea: " + line);
				dia = Integer.parseInt(line.substring(0, 2));
				mes = Integer.parseInt(line.substring(2, 4));			
				System.out.println("Fecha: "+diasLetra[dia-1]+
						" de "+ mesesLetra[mes-1]+
						" de "+ line.substring(4, line.length()));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
