package COM;
import java.util.Scanner;

public class Mes {
	
	public static void main(String args[]){
		int mes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe el numero del mes");
		mes=sc.nextInt();
		
		if(mes<1 || mes>12) {
			System.out.println("Error, numero fuera de rango");
		}else {
			switch(mes) {
			case 1:
				System.out.println("el mes es enero y tiene 31 dias");
				break;
			case 2:
				System.out.println("el mes es febrero y tiene 28 dias");
				break;
			case 3:
				System.out.println("el mes es marzo y tiene 31 dias");
				break;
			case 4:
				System.out.println("el mes es abril y tiene 30 dias");
				break;
			case 5:
				System.out.println("el mes es mayo y tiene 31 dias");
				break;
			case 6:
				System.out.println("el mes es junio y tiene 30 dias");
				break;
			case 7:
				System.out.println("el mes es julio y tiene 31 dias");
				break;
			case 8:
				System.out.println("el mes es agosto y tiene 31 dias");
				break;
			case 9:
				System.out.println("el mes es septiembre y tiene 30 dias");
				break;
			case 10:
				System.out.println("el mes es octubre y tiene 31 dias");
				break;
			case 11:
				System.out.println("el mes es noviembre y tiene 30 dias");
				break;
			case 12:
				System.out.println("el mes es diciembre y tiene 31 dias");
				break;
			}
		}
		
	}
}
