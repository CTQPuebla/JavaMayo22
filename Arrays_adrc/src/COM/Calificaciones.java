package COM;
import java.util.Scanner;

public class Calificaciones {
	
	public static void main(String Args[]) {
		
		//Declaracion de variables 
		double [] notas;
		String [] alumnos;
		Scanner sc=new Scanner(System.in);
		double mayor=0.0, menor=0.0, promedio=0.0;
		int iteraciones=0;
		
		
		//Obtener iteraciones
		System.out.println("¿Cuantas notas deseas ingresar?");
		iteraciones=sc.nextInt();
		
		//Inicializacoin de arreglos
		notas=new double[iteraciones];
		alumnos=new String[iteraciones];
		
		//Obtener Calificaciones 
		for(int i=0; i<iteraciones; i++) {
			System.out.println("introduce el nombre del alumno: ");
			alumnos[i]=sc.next();
			System.out.println("introduce su nota: ");
			notas[i]=sc.nextDouble();
		}
		
		//Imprimir calificaciones
		System.out.println("Calificaciones");
		for(int i=0; i<iteraciones; i++) {
			System.out.println("Alumno: "+alumnos[i]+", nota: "+notas[i]);
		}
		
		//Mayor y Menor
		mayor=notas[0];
		menor=notas[0];
		for(int i=1; i<iteraciones; i++) {
			if(notas[i]>mayor) {
				mayor=notas[i];
			}
			if(notas[i]<menor) {
				menor=notas[i];
			}
		}
		
		//imprimir mayor y menor
		System.out.println("La nota menor es: "+menor);
		System.out.println("La nota mayor es: "+mayor);
		
		//promedio	
		for(int i=0; i<notas.length; i++) {
			promedio=promedio+ notas[i];
		}
		promedio=promedio/notas.length;
		System.out.println("El promedio es: "+promedio);
	}
}
