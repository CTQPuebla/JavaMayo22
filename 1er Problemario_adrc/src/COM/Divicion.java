package COM;
import java.util.Scanner;

public class Divicion {

	public static void main(String args[]) {
		int n1, n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		n1=sc.nextInt();
		
		System.out.println("Escribe otro numero");
		n2=sc.nextInt();
		
		if(n2==0) {
			System.out.println("Error al ejecutar la divicion");
		}else {
			System.out.print("el resultado de la divicion es: " + n1/n2);
		}
			
	}
}
