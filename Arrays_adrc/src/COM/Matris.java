package COM;
import java.util.Arrays; import java.util.Scanner;

public class Matris {
	public static void main(String[] args) {
		String [][] m1, m2;
		int [][] m3;
		int fila, columna;
		Scanner sc=new Scanner(System.in);
		//Pedir datos
		System.out.println("Introduce la cantidad de filas para la matris");
		fila=sc.nextInt();
		System.out.println("Introduce la cantidad de columnas para la matris");
		columna=sc.nextInt();
		//Inicializar Arreglos
		m1=new String[fila][columna]; m2=new String[fila][columna]; m3=new int[fila][columna];
		//Recabar datos matris uno
		System.out.println("ingresa los datos de la primera matris");
		for(int i=0; i<fila; i++){
			for(int j=0; j<columna; j++) {
				System.out.println("Ingresa el valor de la coordenada: ("+i+","+j+")"); m1[i][j]=sc.next();
			}}
		//Recabar datos matris dos
		System.out.println("ingresa los datos de la segunda matris");
		for(int i=0; i<fila; i++){
			for(int j=0; j<columna; j++) {
				System.out.println("Ingresa el valor de la coordenada: ("+i+","+j+")"); m2[i][j]=sc.next();
			}}
		//Operaciones entre matrices
				for(int i=0; i<fila; i++){
					for(int j=0; j<columna; j++) {
						try {
						m3[i][j] = Integer.parseInt(m1[i][j]) + Integer.parseInt(m2[i][j]);
						}catch(Exception e) {
							m3[i][j]=0;
						}}}
		//Imprimir matris resultado
		System.out.println(Arrays.deepToString(m3));
	}
}
