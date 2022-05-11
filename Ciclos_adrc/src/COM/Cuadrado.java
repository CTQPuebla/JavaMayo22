package COM;
import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Podemos dibujar un cuadrado");
		
		System.out.println("Introduce el ancho");
		n1=sc.nextInt();
		
		System.out.println("Introduce el largo");
		n2=sc.nextInt();
		
		for(int i=0; i<n2; i++) {
			
			for(int j=0; j<n1; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
