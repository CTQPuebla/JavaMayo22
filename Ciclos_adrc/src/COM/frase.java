package COM;
import java.util.Scanner;

public class frase {

	public static void main(String args[]) {
		int con=0;
		String frase;
		char letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu frase");
		frase=sc.nextLine();
		
		System.out.println("Escribe una letra");
		letra=sc.nextLine().charAt(0);
		
		for(int i=0; i<frase.length(); i++) {
			
			if(letra==frase.charAt(i)) {
				con++;
			}
		}
		
		if(con==0) {
			System.out.println("Caracter no encontrado en la frase");
		}else {
			System.out.println("el caracter: "+letra+ " se ha encontrado "+ con +" veces");
		}
		
	}
}
