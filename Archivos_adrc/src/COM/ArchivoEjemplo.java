package COM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchivoEjemplo {

	public static void main (String args[]) {
		
		//javaRW
		
		String line="";
		int contador=0;
		
		try {
			File archivo=new File("C:\\Users\\52224\\Desktop\\Ejemplo.txt");
//			FileWriter linea=new FileWriter(archivo,true);
//			for(int i=0; i<20;i++) {
//				System.out.println("El valor de i es: "+ i);
//				linea.write("hola mundo"+"\n");
//			}
//			
//			linea.close();
			
			//Lectura
			FileReader linea2=new FileReader(archivo);
			BufferedReader buffer=new BufferedReader(linea2);
			
			System.out.println("Dentro del archiivo de texto");
			
			while((line=buffer.readLine()) != null) {
				contador++;
				System.out.println("line: "+ line+" "+ contador);	
			}
			
			
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
