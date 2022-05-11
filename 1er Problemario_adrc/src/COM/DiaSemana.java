package COM;
import java.util.Scanner;

public class DiaSemana {
	
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe el numero de la semana");
		n=sc.nextInt();
		
		if(n<1 || n>7) {
			System.out.println("Error, numero fuera de rango");
		}else {
			switch(n){
			case 1:
				System.out.println("El dia es: lunes");
				break;
			case 2:
				System.out.println("El dia es: martes");
				break;
			case 3:
				System.out.println("El dia es: miercoles");
				break;
			case 4:
				System.out.println("El dia es: jueves");
				break;
			case 5:
				System.out.println("El dia es: viernes");
				break;
			case 6:
				System.out.println("El dia es: sabado");
				break;
			case 7:
				System.out.println("El dia es: domingo");
				break;
			}
		}
		
		
	}
}
