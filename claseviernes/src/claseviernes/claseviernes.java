package claseviernes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class claseviernes {
	public static void main(String[] args) {

	String m = "FOO";
    System.out.println(m.charAt(1));

		String line = "";
		int contador = 0;

		try {
			File archivo = new File("D:\\Users\\JAHC\\Desktop\\Hola.txt");

//			FileWriter linea = new FileWriter(archivo, true);
//
//			for (int i = 0; i < 20; i++) {
//				System.out.println("el valor de i es: +i");
//
//				linea.write("Hola mundo" +i + "\n");
//			}
//			linea.close();

		//Lectura
			
		FileReader linea2 = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(linea2);
		
		System.out.println("Dentro del archivo de texto");
		
		while ((line = buffer.readLine()) != null) {
			contador++;
			System.out.println("line:" + line + " " + contador);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
