package COM;
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tex = new String();
		
		System.out.println("Escribe uan letra");
		tex=sc.nextLine();
		
		if(Character.isUpperCase(tex.charAt(0))) {
			System.out.println("es mayuscula");
		}else {
			System.out.println("es minuscula");
		}
	
	}

}
