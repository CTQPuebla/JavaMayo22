package COM;
import java.util.Scanner;

public class PromedioTope {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int suma=0, con=0, n;
		double promedio=0;
		
		while(promedio<=25) {
			System.out.println("Ingresa un numero");
			n=sc.nextInt();
			con++;
			suma=suma+n;
			promedio=suma/con;
		}
		
		System.out.println("El promedio es: "+promedio+" por eso nos detubimos");
		
	}

}
