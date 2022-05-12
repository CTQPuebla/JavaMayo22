package COM;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("escribe un numero: ");
		n=sc.nextInt();
		
		if(n%2==1) {
			System.out.println(n + " es un numero impar");
		}else {
			System.out.println(n + " es un numero par");
		}
	}

}
