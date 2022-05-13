package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>(); //Lista original
		List<Person> filteredList = new ArrayList<Person>(); //Lista con elementos filtrados
		

		list.add(new Person("Antonio", 20, "MASCULINO"));
		list.add(new Person("Laura", 22, "FEMENINO"));
		list.add(new Person("Joel", 29, "MASCULINO"));
		list.add(new Person("Manuel", 18, "MASCULINO"));
		list.add(new Person("Ana", 15, "FEMENINO"));
		list.add(new Person("Cecilia", 23, "FEMENINO"));
		list.add(new Person("Miguel", 30, "MASCULINO"));
		list.add(new Person("Marisol", 28, "FEMENINO"));
		// Forma declarativa
		/*
		 * Es necesario especificar todas y cada una de las partes que formaran la
		 * expresion
		 */
		
		//Declarativa
		for (int i = 0; i < args.length; i++) {
			
			
		}
		
		for (Person item : list) {
			if(item.getGenero().equals("MASCULINO")) {
				filteredList.add(item);				
			}
		}
		
		//filteredList.forEach(System.out::println);
		//Forma imperativa
		/*
		 * Solamente vamos preguntando lo que queremos a traves de los metodos
		 * del api Stream
		 * 
		 */
		//Filtrando las que son mujeres
		List<Person> mujeres = list
				.stream()
				.filter(item->item.getGenero()
				.equals("FEMENINO"))
				.collect(Collectors.toList());
		
		//mujeres.forEach(System.out::println);
		
		
		//list.stream().filter(item->item.getGenero().equals("FEMENINO")).collect(Collectors.toList());
		
		//Ordenando por edad - ASC
		List<Person> orderedByAge = list.stream()
				.sorted(Comparator.comparing(Person::getEdad))
				.collect(Collectors.toList());
		
		//orderedByAge.forEach(System.out::println);
		
		List<Person> orderedByAgeDesc = list.stream()
				.sorted(Comparator.comparing(Person::getEdad)
				.reversed())
				.collect(Collectors.toList());
		//orderedByAgeDesc.forEach(System.out::println);

//		//Todos cumplan una determinada condicion
		boolean cumple  = list.stream().allMatch(item->item.getEdad()>20);
		//System.out.println(cumple);
//		
//		//Alguno cumple ? 
		boolean any  = list.stream().anyMatch(item->item.getEdad()>20);
		//System.out.println(any);
//		
//		
//		//Ninguno cumple ?
		boolean none  = list.stream().anyMatch(item->item.getNombre().equals("Eduardo"));
		//System.out.println(none);
//		
//		//Retorna un optional
		Optional<Person> mayorEdad = list.stream().max(Comparator.comparing(Person::getEdad));
		//System.out.println(mayorEdad);
//		
		Optional<Person> menorEdad = list.stream().min(Comparator.comparing(Person::getEdad));
		//System.out.println(menorEdad);
//		
//		//Agrupando por alguna propiedad
//		Map<String, List<Person>> groupByGender = list.stream()
//				.collect(Collectors.groupingBy(Person::getGenero));
//		
//		groupByGender.forEach((genero, item)->{
//			
//			System.out.println(genero);
//			item.forEach(System.out::println);
//			
//			System.out.println();
//		});
//		
//		//Buscando un valor que cumpla varias condiciones
		Optional<String> oldestFemale = list.stream()
				.filter(person->person.getGenero()
				.equals("FEMENINO"))
				.max(Comparator.comparing(Person::getEdad))
				.map(Person::getNombre);
		oldestFemale.ifPresent(System.out::println);
	}

}
