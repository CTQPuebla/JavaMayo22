package COM;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		n1 = sc.nextInt();
		System.out.println("Escribe un segundo numero");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1 + " es mayor que " + n2);
		}else if(n1<n2) {
			System.out.println(n2 + " es mayor que " + n1);
		}else {
			System.out.println("los numeros son iguales");
		}
	}

}
