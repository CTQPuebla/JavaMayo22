package miercoles;

import java.sql.Date;
import java.util.Scanner;

public class arrays {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	//Inicializar un array solo con tamaño
	
	int[] x = new int [5];
	
	//Inicializamos un array con valores
	
	int y[] = {11,12,13,14,15,16};
	
	//Agregar valores a un array vacio
	
	x[0] = 10;
	x[1] = 11;
	x[2] = 12;
	x[3] = 13;
	x[4] = 14;
	
	//Ver alguna posicion en especifico
	
	System.out.println(x[1]);
	System.out.println(y[3]);
	
	//Array de objetos
	
	Object[] objetos = {"hola",12,56.90,true,"&",new Date(0)};
	Object[] o2 = new Object[10];
	
	//llenar por teclado un arary numerico
	
	for (int i = 0; i < x.length; i++) {
		System.out.println("ingresar un numero");
		x[i] = sc.nextInt();
	}
	
	
}
}
