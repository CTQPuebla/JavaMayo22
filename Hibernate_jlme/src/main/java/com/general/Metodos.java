package com.general;

import java.util.List;

public interface Metodos {

	String guardar(Object o);
	String actualizar(Object o);
	String eliminar(int id);
	Object buscar(int id);
	List mostrar();
}
