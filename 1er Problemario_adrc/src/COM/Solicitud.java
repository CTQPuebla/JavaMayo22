package COM;
import java.util.Scanner;

public class Solicitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nota, edad;
		char sexo=' ';
		String s = new String();
		
		System.out.println("Ingresa los siguientes datos para llenar tu solicitud");
		
		System.out.println("Escribe el valor de tu nota");
		nota=sc.nextInt();
		
		System.out.println("Escribe tu edad");
		edad=sc.nextInt();
		
		System.out.println("Escribe tu sexo M:masculino     F:femenino");
		s=sc.next();
		
		sexo=s.charAt(0);
		
		if(nota<5) {
			System.out.println("No aceptada");
		}else if(edad<18) {
			System.out.println("No aceptada");
		}else if(sexo=='M') {
			System.out.println("posible aceptacion");
		}else {
			System.out.println("Aceptada");
		}
		
		
	}

}
