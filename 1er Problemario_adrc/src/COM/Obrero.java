package COM;
import java.util.Scanner;

public class Obrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salario, horas;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de horas");
		horas=sc.nextInt();
		
		if(horas<=40) {
			salario=horas*16;
		}else {
			salario=(40*16)+((horas-40)*20);
		}
		
		System.out.println("Tu salario es de: " + salario);
	}

}
