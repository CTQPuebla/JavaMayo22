package com;

public class PrimerClase {
 //Anatomia de una clase POJO
	
 //	Atributos 
	//Constructores (1-n)
	//Getter y Setters son mecanismos para dar y recuperar valores del objeto 
	//toString
	
	 // 1 Atributos 
	//color,material, dimensiones, forma.
	//Estos son atributos de clase 
	String color;
	String material;
	double alto, ancho, profundidad;
	String forma; 
	
	// 2 Metodos Constructores (1-n)
	//vacío 
	public PrimerClase() {  
		
	}
	
	//                      color es referencia 
	public PrimerClase(String color) {
	   this.color = color;
		
	}

	public PrimerClase(String color, String material, double alto, double ancho, double profundidad, String forma) {
		
		//Esto sale con clic derecho luego source, luego generate constructor fields 
		this.color = color;
		this.material = material;
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.forma = forma;
	}
		
	//Getter y Setters 
	//Setter especifico a cada atributo  
	// Set darles valor 
	public void setColor (String color) {
	this.color = color;           //hay un setter por cada atributo asumes sin esperar que devuelva algo
	}
	//Valor String  si devuelve algo  me devuelve el valor del tipo de dato 
	//get para recuperarlos 
	public String getColor () {
	 return color;
	}
//clic derecho source y generate setters & getters, select all y generate 
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	
	//clic derecho- source -generate to String 
	//los azules van directo al metodo los verdes hacen lo mismo pero de otra manera  
	
	//toString detalles del objeto, de "atributos"
	@Override
	public String toString() {
		return "PrimerClase [color=" + color + ", material=" + material + ", alto=" + alto + ", ancho=" + ancho
				+ ", profundidad=" + profundidad + ", forma=" + forma + "]";
	}
	
	
	
} 
