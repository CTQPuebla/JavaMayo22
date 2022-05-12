package COM;
import java.util.Scanner;

public class NumerosPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1, n2, menor=0, mayor=0;
		
		System.out.println("Ingresa un numero entero");
		n1=sc.nextInt();
		
		System.out.println("Ingresa otro numero entero");
		n2=sc.nextInt();
		
		if(n1==n2) {
			System.out.println("numeros iguales");
		}else if(n1<n2) {
			menor=n1;
			mayor=n2;
		}else {
			menor=n2;
			mayor=n1;
		}
		
		for(int i=menor; i<=mayor; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		

	}

}
