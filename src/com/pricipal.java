package com;

import java.io.IOException;
import java.util.Scanner;

public class pricipal {
	
	public static void main(String[] args) throws IOException {
		
		/*if (condicion)
		 * codigo a ejecutarse cuando condicion = true
		 * }else{
		 * codigo a ejecutarse cuando condicion = false
		 */
		
//		String x = "abcd";
//		String xx = "ABCD";
//		int y = 0;
//		int z =0;
//		//proceso
//		//15 < 10 - true 
//		if(x.length()<10) {
//			//si
//			System.out.println("Si lo cumple"); //salidas
//		}else {
//			//no 
//			System.out.println("No lo cumple");
//		}
//		
//		//evaluar 2 condicones juntas (condicion compuesta)
//		
//		if (x.length()<10 || y>0) {
//			System.out.println("OR: true");
//		}else {
//			System.out.println("OR: false ");
//		}
//		
//		//AND
//		if (x.length()<10 && y>0) {
//			System.out.println("AND: true");
//		}else {
//			System.out.println("AND: false ");
//		}
//		
//		//NOT
//		if (!(x.length()<10 || y>0)) {
//			System.out.println("NOT: true");
//		}else {
//			System.out.println("NOT: false ");
//		}
//		
//		//DIFERENTE DE 
//		if (y !=z) {
//			System.out.println("Si es diferente");
//		}else {
//			System.out.println("No es diferente");
//		}
//		
//		//igual que 
//		if (y==z) {
//			System.out.println("Simon");
//		}else {
//			System.out.println("No lo es");
//		}
//		
//		if (x.equals(xx)) {
//			System.out.println("Si son iguales");
//		}else {
//			System.out.println("No es lo mismo ");
//		}
	//---------------------------------------------------	
		//EVALUAR CONDICIONES
	
		
	//---------------------------------------------------
	//SWITCH

//	Scanner sc = new Scanner (System.in);
//	System.out.println("Ingresa un numero:");
////	int p = sc.nextInt();
////	System.out.println(p);
//	
//	String m = sc.nextLine();
//	System.out.println(m);
		
//--------------------------------------------------------------------------
//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
//		Scanner scanner = new Scanner (System.in);
//		int numero1;
//		int numero2;
//		
//		System.out.println("Introduzca el primer numero");
//		numero1 = scanner.nextInt();
//		
//		System.out.println("Introduzca el sgundo numero");
//		numero2 = scanner.nextInt();
//		
//		if (numero1 > numero2) {
//			System.out.println("El primer numero," +numero1+ ", es mayor que el numero dos, " +numero2 );
//		}else if (numero1 < numero2) {
//			System.out.println("El segundo numero, " +numero2+ ", es mayor que el primer numero, " +numero1);
//		}else{
//			System.out.println("Ambos nuemros son iguales" +numero1);
//		}
		
//--------------------------------------------------------------------------------------------------------------
//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
//		int numero;
//		
//		Scanner teclado = new Scanner (System.in);
//		System.out.println("introduzca un numero entero: ");
//		numero = teclado.nextInt();
//		
//		if(numero % 2 ==0) {
//			System.out.println("ES PAR");
//		}else {
//			System.out.println("ES IMPAR");
//		}
		
//----------------------------------------------------------------------------------------------------------
//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
	
		
//	Scanner sc = new Scanner (System.in);
//	double dividendo, divisor;
//	
//	System.out.println("Introduzca el dividendo: ");
//	dividendo = sc.nextDouble();
//	
//	System.out.println("Introduzca el divisor: ");
//	divisor = sc.nextDouble();
//	
//	if (divisor==0) {
//		System.out.println("No se puede dividir por cero");
//	}else {
//		System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);
//		System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor, dividendo/divisor);
//	}
	
//-----------------------------------------------------------------------------------------------------------------------
//Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
//		Scanner scanner = new Scanner (System.in);
//		String cadena;
//		
//		System.out.println("Introduzca la cadena que desee: ");
//		cadena = scanner.nextLine();
//		
//		if (cadena.length() !=1) {
//			System.out.println("La cadena no es una letra mayuscula");
//		}else if((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)){
//			System.out.println("La cadena es una letra mayuscula.");
//		}else {
//			System.out.println("La cadena no es una letra mayuscula");
//		}
		
//------------------------------------------------------------------------------------------------------------------------------------
//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA

//		Scanner sc = new Scanner (System.in);
//		int nota=0;
//		int edad=0;
//		String sexo="";
//		
//		System.out.println("Ingresa la nota: ");
//		nota=sc.nextInt();
//		System.out.println("Ingrsa la edad: ");
//		edad=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Ingrese el sexo: ");
//		sexo=sc.nextLine();
//		
//		if (nota>=5 && edad>=18 && sexo.equals("M")) {
//			System.out.println("Solicitud posible");
//		}else if (nota>=5 && edad>=18 && sexo.equals("F")) {
//			System.out.println("Solicitud aceptada");
//		}else{
//			System.out.println("No aceptada");
//		}
		
//----------------------------------------------------------------------------------------------------------------
//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

		
//		Scanner sc= new Scanner (System.in);
//		int kilos;
//		double precioInicial;
//		String tipo; 
//		int tamano;
//		
//		System.out.println("Introduce los Kg. de uva entregada");
//		kilos = sc.nextInt();
//		System.out.println("Precio por Kg. inicial");
//		precioInicial = sc.nextDouble();
//		System.out.println("Uva de valor \"A\" ó \"B\" : ");
//		tipo = sc.next();
//		sc.nextLine();
//		System.out.println("Tipo de uva \"1\" ó \"2\" : ");
//		tamano= sc.nextInt();
//		
//		if (!(tipo.toUpperCase().contentEquals("A") || tipo.toUpperCase().equals("B") && (tamano == 1 || tamano== 2))) {
//			System.out.println("Tipo o tamano incorrecto, vuelva a introducir los valores.");
//		}else {
//			if
//			(tipo.toUpperCase().equals("A") && tamano==1) {
//				System.out.println("La ganancia final es de : " +((kilos * precioInicial)+(kilos *0.20)));
//			}else if 
//			(tipo.toUpperCase().equals("A") && tamano == 2) {
//				System.out.println("La ganancia final es de : " + ((kilos * precioInicial) +(kilos * 0.30)));
//			}else if 
//			(tipo.toUpperCase().contentEquals("B") && tamano == 1) {
//				System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos * 0.30)));
//			}else if 
//			(tipo.toUpperCase().contentEquals("B") && tamano == 2 ) {
//				System.out.println("La ganancia final es de: " + ((kilos * precioInicial)- (kilos * 0.50)));
//			}
//		}
//	
//----------------------------------------------------------------------------------------------------------------------------------------------
//El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
	//	* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
	
		
//		Scanner  sc = new Scanner (System.in);
//		int numeroAlumnos;
//		System.out.println("Numero de alumnos: ");
//		numeroAlumnos = sc.nextInt();
//		
//		if (numeroAlumnos >= 100) {
//			System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " " +"Euros y cada alumno debe pagar 65 Euros");
//		}else if (numeroAlumnos <100 && numeroAlumnos >=50) {
//			System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " " + "Euros y cada alumno de pagar 70 Euros");
//		}else if (numeroAlumnos <50 &&  numeroAlumnos >= 30) {
//			System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " " +"Euros y cada alumno debe pagar 95 Euros");
//		}else {
//			System.out.println("El coste del autobus es de 4000 Euros y cada alumno " + "debe pagar " + (4000/numeroAlumnos) + " Euros");
//			
//		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//	Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.


		
//		Scanner sc = new Scanner (System.in); 
//		int dado;
//		
//		System.out.println("Resultado de la cara obtenida: ");
//		dado = sc.nextInt();
//		
//		switch (dado) {
//		case 1: 
//			System.out.println("En la cara opuesta esta el \"seis\" . ");
//			break;
//		case 2: 
//			System.out.println("En la cara opuesta esta el \"cinco\" . ");
//			break;
//		case 3: 
//			System.out.println("En la cara opuesta esta el \"cuatro\" . ");
//			break;
//		case 4: 
//			System.out.println("En la cara opuesta esta el \"tres\" . ");
//			break;
//		case 5: 
//			System.out.println("En la cara opuesta esta el \"dos\" . ");
//			break;
//		case 6: 
//			System.out.println("En la cara opuesta esta el \"uno\" . ");
//			break;
//			default : 
//				System.out.println("ERROR: numero incorrecto. ");
//		}
		
//-----------------------------------------------------------------------------------------------------------------
//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		
//	
//	Scanner sc = new Scanner (System.in);
//	int dia;
//	
//	System.out.println("El programa te devuelve el dia de la semana seleccionado");
//	System.out.println("1.- Lunes.");
//	System.out.println("2.- Martes.");
//	System.out.println("3.- Miercoles.");
//	System.out.println("4.- Jueves.");
//	System.out.println("5.- Viernes.");
//	System.out.println("6.- Sabado.");
//	System.out.println("7.- Domingo.");
//	dia = sc.nextInt();
//	
//	switch (dia) {
//	case 1 : 
//		System.out.println("El dia seleccionado es Lunes");
//		break;
//	case 2 : 
//		System.out.println("El dia seleccionado es Martes");
//		break;
//	case 3 : 
//		System.out.println("El dia seleccionado es Miercoles");
//		break;
//	case 4 : 
//		System.out.println("El dia seleccionado es Jueves");
//		break;
//	case 5 : 
//		System.out.println("El dia seleccionado es Viernes");
//		break;
//	case 6 : 
//		System.out.println("El dia seleccionado es Sabado");
//		break;
//	case 7 : 
//		System.out.println("El dia seleccionado es Domingo");
//		break;
//		default : 
//			System.out.println("ERROR: número incorrecto.");
//	   }
		
//----------------------------------------------------------------------------------------------
//Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
	
		
//	Scanner sc = new Scanner (System.in);
//	int mes;
//	System.out.println("El programa te devuelve el numero de dias del mes seleccionado:");
//	System.out.println(" 1.- Enero.");
//	System.out.println(" 2.- Febrero.");
//	System.out.println(" 3.- Marzo.");
//	System.out.println(" 4.- Abril.");
//	System.out.println(" 5.- Mayo.");
//	System.out.println(" 6.- Junio.");
//	System.out.println(" 7.- Julio.");
//	System.out.println(" 8.- Agosto.");
//	System.out.println(" 9.- Septiembre.");
//	System.out.println(" 10.- Octubre.");
//	System.out.println(" 11.- Noviembre.");
//	System.out.println(" 12.- Diciembre.");
//	mes = sc.nextInt();
//
//	if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
//		System.out.println("El mes seleccionado tiene 31 dias ");
//	}else if (mes ==2) { 
//		System.out.println("El mes seleccionado tiene 28 dias ");
//	}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
//		System.out.println("El mes seleccionadio tiene 30 dias");
//	}else { 
//		System.out.println("Error, el mes debe estar entre 1-12.");
//	}
	
//----------------------------------------------------------------------------------------------------------------------------------------
//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, 
//América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida

		
//	Scanner sc = new Scanner (System.in);
//	int peso;
//	int zona;
//	
//	System.out.println("Calcula la tarifa para el envio segun peso y zona de destino.");
//	System.out.println("zonas de envio");
//	System.out.println("1.- America del Norte");
//	System.out.println("2.- America Central");
//	System.out.println("3.- America del Sur");
//	System.out.println("4.- Europa");
//	System.out.println("5.- Asia");
//	zona = sc.nextInt();
//	System.out.println("Introduce el peso del paquete en gramos: ");
//	peso =sc.nextInt();
//	
//	if (peso >5) {
//		System.out.println("El paquete no puede ser admitido por motivos de seguridad");
//	}else if (peso <1) {
//		System.out.println("El peso del paquete debe ser un entero positivo.");
//	}else {
//		switch (zona) {
//		case 1:
//			System.out.println("El paquete de " + peso + " Kilogramos enviado a America del Norte sale por " + (peso*24) + " Euros");
//			break;
//		case 2:
//			System.out.println("El paquete de " + peso + " Kilogramos enviado a America Central sale por " + (peso*20) + " Euros");
//			break;
//		case 3:
//			System.out.println("El paquete de " + peso + " Kilogramos enviado a America del Sur sale por " + (peso*21) + " Euros");
//			break;
//		case 4:
//			System.out.println("El paquete de " + peso + " Kilogramos enviado a Europa sale por " + (peso*10) + " Euros");
//			break;
//		case 5:
//			System.out.println("El paquete de " + peso + " Kilogramos enviado a Asia sale por " + (peso*18) + " Euros");
//			break;
//		default :
//			System.out.println("ERROR: zona elegida incorrecta");
//			break;
//		}
//	}

//----------------------------------------------------------------------------------------------------------------------------------------------------
//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
//	Scanner sc = new Scanner(System.in);
//	double IMC;
//	int peso;
//	double altura;
//	
//	System.out.println("Introduzca su peso");
//	peso = sc.nextInt();
//	
//	System.out.println("Introduzca su altura EN METROS");
//	altura = sc.nextDouble();
//	
//	IMC = peso/(altura*altura);
//	System.out.println(IMC);
//	
//	if (IMC<16) {
//		System.out.println("Ingreso al hospital");
//	}else if (IMC >= 16 && IMC <= 17) {
//		System.out.println("Infrapeso");
//	}else if (IMC >= 17 && IMC <= 18) {
//		System.out.println("Bajo peso");
//	}else if (IMC >= 18 && IMC <= 25) {
//		System.out.println("Peso normal");
//	}else if (IMC >=25 && IMC <= 30) {
//		System.out.println("Sobrepeso (obesidad grado 1)");
//	}else if (IMC >= 30 && IMC <= 35) {
//		System.out.println("Sobrepeso cronico (obesidad grado 2)");
//	}else if (IMC >=35 && IMC <= 40) {
//		System.out.println("Obesidad premorbida (obesidad grado 3)");
//	}else if (IMC > 40){
//		System.out.println("Obesidad morbida (obesidad grado 4)");
//	}

//--------------------------------------------------------------------------------------------------------------
//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, 
//un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		
		
//---------------------------------------------------------------------------------------------------------------------------------------------
// while, do, for 	
		
		int x=50;
		int y=0;
//		
//		while (x<10 && y<5) {
//			System.out.println("x: " +x);
//			System.out.println("y: " +y);
//			x++;
//			y++;
//		}
//		
//		do {
//			System.out.println("hola " +x);
//			x++;
//		}while (x==5);
		
		//for
//		for (int i = 30; i > 5 ; i--) {
//			
//		System.out.println("hola: " +i);
//			
//		}

//-------------------------------------------------------------------------------------------
//Programa un algoritmo que realice la tabla de multiplicar del 12
		
//		Scanner sc = new Scanner (System.in);
//		int n;
//		
//		System.out.println("Introduce un numero entero: ");
//		n = sc.nextInt();
//		System.out.println("Tabla del " + n);
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(n+ " * " + i + " = " + n*i);
//		}
		
//----------------------------------------------------------------------------------------------------
//	Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
//hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???;
		
//		Scanner sc = new Scanner (System.in);
//		int n1;
//		int n2;
//		
//		System.out.println("Introduce un numero entero: ");
//		n1 = sc.nextInt();
//		System.out.println("¿Hasta que numero quieres que llegue tu tabla?: ");
//		n2 = sc.nextInt();
//		
//		System.out.println("Tabla del " + n1);
//		for (int i = 1; i <= n2; i++) {
//			System.out.println(n1+ " * " + i + " = " + n1*i);
//		}
	
//---------------------------------------------------------------------------------------------------------------------------
//Realiza un programa para determinar si un String es palíndromo.		
		
		
//	String [] cadenas = { "La ruta natural", "Esto no es", "Hola", "Sol", "Ana", "Oro", "Oso",
//			"a ti no, bonita", 
//			"Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta,acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de panico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida",
//			"A mamá, Roma le aviva el amor a papá y a papá, Roma le aviva el amor a Mamá", "Me gusta programar en Java"};
//	for (String cadena : cadenas) {
//		System.out.println("¿" + cadena + "' es palindromo? " + esPalindromo(cadena));
//	}
//	
//	}
//	public static boolean esPalindromo (String cadena) {
//		
//		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("o´", "o").replace("ú", "u").replace("", " ").replace(".", "").replace(",", "");
//		
//		String invertida = new StringBuilder (cadena).reverse().toString();
//		return invertida.contentEquals(cadena);
//	} 
//	

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
//		
//	Scanner sc = new Scanner (System.in);
//	String texto;
//	char caracter; 
//	int numeroDeVeces = 0;
//	
//	do {
//		System.out.println("Introduce texto: ");
//		texto = sc.nextLine();
//	}while (texto.isEmpty());
//	System.out.println("Introduce un caracter: ");
//	caracter = (char) System.in.read();
//	numeroDeVeces = contarCaracteres (texto, caracter); 
//	System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
//	
//	
//	}
//		public static int contarCaracteres (String cadena, char caracter) {
//			int posicion, contador = 0; 
//			posicion = cadena.indexOf(caracter);
//			while (posicion != -1) {
//				contador++; 
//				posicion = cadena.indexOf(caracter, posicion + 1);
//			}
//			return contador;
		
//------------------------------------------------------------------------------------------------------------------------------
//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
//		
//	for (int h = 0; h<= 23; h++)
//		for (int m = 0; m <= 59; m++)
//			for (int s = 0; s <= 59; s++)
//				System.out.println(h+ "h " + m + "m " + s + "s");

		
		
//----------------------------------------------------------------------------------------------------------		
//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.		
	
//		
//		double dinero =1000;
//		int mes = 1;
//		
//		while (mes <=12) {
//			dinero = dinero * 1.02; 
//			mes++; 
//			
//		}
//		System.out.println("$" + dinero);
//		
	
//------------------------------------------------------------------------------------------------------------------
//Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.		
		
//		double dinero =700.00;
//		int mes = 1;
//		
//		while (dinero <=1500) {
//			dinero = dinero * 1.02; 
//			mes++; 
//			
//		}
//		System.out.println(mes + " meses");
//		
	
//-------------------------------------------------------------------------------------------------------------------------------
// Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
//		
//		Scanner sc = new Scanner (System.in); 
//		int numero1, numero2, mayor, menor;
//		
//		do {
//			System.out.println("Introduce un numero entero: ");
//			numero1 =sc.nextInt();
//			System.out.println("Introduce otro numero destinto del anterior");
//			numero2 = sc.nextInt();
//			if (numero1 == numero2) {
//				System.out.println("Debes introducir dos numeros distintos");
//			}
//			
//		} while (numero1 == numero2);
//		
//		if (numero1 > numero2) {
//			mayor = numero1; 
//			menor = numero2; 
//		}else {
//			mayor = numero2;
//			menor = numero1;
//		}
//		
//		System.out.println("\nNumeros desde " + menor + " hasta " + mayor + " : ");
//		for (int i = menor; i <= mayor; i++ ) {
//			System.out.println(i);
//		}
//		
	}
	
}
