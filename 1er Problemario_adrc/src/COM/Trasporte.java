package COM;
import java.util.Scanner;

public class Trasporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kilos, destino;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido a nuestra paqueteria, ingresa el numero de kilogramos");
		kilos=sc.nextInt();
		
		if(kilos>5) {
			System.out.println("El peso exede la cantidad posible para enviar");
		}else {
			System.out.println("Escribe la el numero que corresponda al destino de envio:");
			System.out.println("1 America del norte //n"
					+ "2 America central //n"
					+ "3 America del sur //n"
					+ "4 Europa //n"
					+ "5 Asia");
			destino=sc.nextInt();
			if(destino<1 || destino>5) {
				System.out.println("Error, destino no encontrado");
			}else {
				switch (destino) {
				case 1:
					System.out.println("El costo de envio es de: " + kilos*24 + " euros");
					break;
				case 2:
					System.out.println("El costo de envio es de: " + kilos*20 + " euros");
					break;
				case 3:
					System.out.println("El costo de envio es de: " + kilos*21 + " euros");
					break;
				case 4:
					System.out.println("El costo de envio es de: " + kilos*10 + " euros");
					break;
				case 5:
					System.out.println("El costo de envio es de: " + kilos*18 + " euros");
					break;
				}
			}
		}

	}

}
