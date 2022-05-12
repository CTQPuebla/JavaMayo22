package COM;
import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double imc, peso, altura;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kilogramos: ");
		peso=sc.nextDouble();
		System.out.println("Introduce tu altura en metros");
		altura=sc.nextDouble();
		
		imc=peso/altura;
		
		System.out.println("Tu indice de masa corporal es:"  + imc);
		
		if(imc<16) {
			System.out.println("Diagnostico: Criterio de ingreso en hospital");
		}else if(imc>=16 && imc<17) {
			System.out.println("Diagnostico: Infrapeso");
		}else if(imc>=17 && imc<18) {
			System.out.println("Diagnostico: Bajo peso");
		}else if(imc>=18 && imc<25) {
			System.out.println("Diagnostico: Peso normal (saludable)");
		}else if(imc>=25 && imc<30) {
			System.out.println("Diagnostico: Sobrepeso (obesidad de grado I)");
		}else if(imc>=30 && imc<35) {
			System.out.println("Diagnostico: Sobrepeso cronico (obecidad de grado II)");
		}else if(imc>=35 && imc<40) {
			System.out.println("Diagnostico: Obecidad premorbida (obesidad de grado III)");
		}else if(imc>=40) {
			System.out.println("Diagnostico: Obecidad morbida (obecidad de grado IV)");
		}else {
			System.out.println("Error");
		}
	}

}
