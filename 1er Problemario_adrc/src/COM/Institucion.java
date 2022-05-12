package COM;
import java.util.Scanner;

public class Institucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int donacion;
		
		System.out.println("Cuanto deseas donar");
		donacion=sc.nextInt();
		System.out.println("Tu donacion se invertira de la siguiente forma: ");
		
		if(donacion<10000) {
			System.out.println("25% centro de salud: " + donacion*.25);
			System.out.println("60% comedor de niños: " + donacion*.6);
			System.out.println("15% bolsa de valores: " + donacion*.15);
		}else {
			System.out.println("30% centro de salud: " + donacion*.3);
			System.out.println("50% comedor de niños: " + donacion*.5);
			System.out.println("15% bolsa de valores: " + donacion*.2);
		}
		
	}

}
