package COM;
import java.util.Scanner;

public class Palindromo {

	public static void main(String args[]) {
		
		String palabra;
		Scanner sc=new Scanner(System.in);
		int i1=0, i2;
		boolean verdad=true;
		
		System.out.println("Podemos decirte si una palabra es palindromo, escribela");
		palabra=sc.nextLine();
		
		i2=palabra.length()-1;
		
		while(verdad && i1<palabra.length()){
			verdad = (palabra.charAt(i1) == palabra.charAt(i2));
			i1++;
			i2--;
			if(i1==i2) {
				break;
			}
		}
		
		if(verdad) {
			System.out.println("la palabra "+palabra+" es un palindromo");
		}else {
			System.out.println("la palabra "+palabra+" no es un palindromo");
		}
		
	}
}
