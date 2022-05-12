package ceteq;


public interface AccionesConcesionario {

	void registrarCliente(Cliente cliente);
	
	void registrarAutos(Auto auto);
	
	void seleccionarAuto(String identificador, String nombreCliente);
	
	void venderAuto();
	
	void eliminarAuto();
}
