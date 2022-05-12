package ceteq;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		
		lista.add("Hi");
		lista.add("Hi1");
		lista.add("Hi2");
		lista.add("Hi3");
		lista.add("Hi4");
		
		System.out.println(lista);
		System.out.println(lista.get(3));
		System.out.println(lista.remove(2));
		System.out.println(lista.remove("Hi"));
		System.out.println(lista);
		System.out.println(lista.size());
		lista.add(2, "5");
		System.out.println(lista);
		System.out.println(lista.indexOf("5"));
		System.out.println(lista.isEmpty());
		System.out.println(lista.set(2, "Hola"));
		System.out.println(lista);
		//no mas de 5 coches
		
	}

}
