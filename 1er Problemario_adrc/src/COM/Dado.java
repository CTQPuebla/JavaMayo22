package COM;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cara;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe el numero del dado");
		cara=sc.nextInt();
		
		if(cara<1 || cara>6) {
			System.out.println("Error, numero fuera del rango");
		}else {
			switch(cara) {
				case 1:
					System.out.println("la cara opuesta es: 6");
				break;
				case 2:
					System.out.println("la cara opuesta es: 5");
					break;
				case 3:
					System.out.println("la cara opuesta es: 4");
					break;
				case 4:
					System.out.println("la cara opuesta es: 3");
					break;
				case 5:
					System.out.println("la cara opuesta es: 2");
					break;
				case 6:
					System.out.println("la cara opuesta es: 1");
					break;
		}
		}
	}

}
