package ejercicios;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String line="";
		Date conversion;
		String[] mes= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		SimpleDateFormat formato=new SimpleDateFormat("ddMMyyyyy"); 
		
		File archivo = new File("C:\\Users\\villa\\OneDrive\\Desktop\\prueba.txt");
		
		FileReader texto= new FileReader(archivo);
		BufferedReader buffer= new BufferedReader(texto);
		//System.out.println("dentro del archivo de texto");
	
		while((line=buffer.readLine()) != null) {
			
			System.out.println(line);
			conversion= formato.parse(line);		
			System.out.println(conversion.d +" de "+mes[conversion.getMonth()]+ " de "+ (conversion.getYear()+1900));

			
			
			
		}
		
		buffer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
