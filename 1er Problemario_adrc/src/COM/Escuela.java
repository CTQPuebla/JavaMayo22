package COM;
import java.util.Scanner;
public class Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnos;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribe la cantidad de alumnos");
		alumnos=sc.nextInt();
		
		if(alumnos>99) {
			System.out.println("El costo por alumno es de: 75 euros");
			System.out.println("Y el costo del bus es de: " + 75*alumnos);
		}else if(alumnos<100 && alumnos>49) {
			System.out.println("El costo por alumno es de 70 euros");
			System.out.println("Y el costo del bus es de: " + 70*alumnos);
		}else if(alumnos>29 && alumnos<50) {
			System.out.println("El costo por alumno es de 95 euros");
			System.out.println("Y el costo del bus es de: " + 95*alumnos);
		}else if(alumnos<31) {
			System.out.println("El costo por alumno es de: " + 4000/alumnos);
			System.out.println("Y el costo del bus es de: 4000");
		}

	}

}
