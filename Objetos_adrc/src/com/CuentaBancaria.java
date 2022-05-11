package com;

public class CuentaBancaria {

	String titular;
	// se pone string en num de cuenta porque no haré operaciones con el
	String numCuenta;
	String tipoCuenta; // pueden ser objetos dentro de tu propia clase
	double saldoDisponible;
	boolean status;
	double min, max;

	public CuentaBancaria() {
	}

	public CuentaBancaria(String titular, String numCuenta, String tipoCuenta, double saldoDisponible, boolean status) {

		// Esto sale con clic derecho luego source, luego generate constructor fields

	}

	public CuentaBancaria(String titular, String numCuenta, String tipoCuenta, double saldoDisponible, boolean status,
			double min, double max) {

		this.titular = titular;
		this.numCuenta = numCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldoDisponible = saldoDisponible;
		this.status = status;
		this.min = min;
		this.max = max;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", numCuenta=" + numCuenta + ", tipoCuenta=" + tipoCuenta
				+ ", saldoDisponible=" + saldoDisponible + ", status=" + status + ", min=" + min + ", max=" + max + "]";
	}

	// Comportamineto depositar, retirar, tranferir

	public String depositar(double monto) {

		if (monto > this.max) { // Valido que no se pase del maximo la cantidad a depositar
			return "El monto sobre pasas el mác¡ximo permitido";

		} else if (monto + this.saldoDisponible > this.max) {
			return "El deposito llevaría por encima de la cuenta ";

		} else {
			// Aumento el saldo disponible
			this.saldoDisponible = this.saldoDisponible + monto;
			System.out.println("Saldo Disponible"+ this.getSaldoDisponible());
			return "Deposito existoso";
		}

	}

	public String retirar(double monto) {

		if (monto > this.saldoDisponible) {
			return "No hay suficientes fondos";
		} else if (this.saldoDisponible - monto < this.min) {
			return "El retiro dejaría por debajo del minimo a la cuenta ";
		} else {
			
			// Decremento el saldo disponible
			this.saldoDisponible = this.saldoDisponible-monto; 
			System.out.println("Saldo disponible "+ this.saldoDisponible);
			return "Retiro exitoso";
		}

	}

	public String transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) {

		// Validando la extracción de fondos

		if (monto > origen.getSaldoDisponible()) {
			System.out.println("Saldo disponible "+ origen.getSaldoDisponible());
			return "Sin fondos suficientes";

		} else if (origen.getSaldoDisponible() - monto < origen.getMin()) {
			System.out.println("Saldo disponible "+ origen.getSaldoDisponible());
			return "El retiro dejaría por debajo del minimo a la cuenta ";

		} else if (monto > destino.getMax()) {
			//linea final del metodo, deja de tener cotrol en el metodo
			//todo codigo tienen resultado final return se encraga de sacar el metodo 
			System.out.println("Saldo disponible "+ destino.getSaldoDisponible());
			return "El monto excede al maximo permitido";
		} else if (monto + destino.getSaldoDisponible() > destino.getMax()) {
			return "La transferencia llevaria por encima del maximo permitido a la cuenta";
		} else { // objeto completo que se le hace llegar
			origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
			destino.setSaldoDisponible(origen.getSaldoDisponible() + monto);
			
			System.out.println("Saldo origen" + origen.getSaldoDisponible());
			System.out.println("Saldo origen" + destino.getSaldoDisponible());
			return "Transferenecia exitosa";
			
		}
	}

}

//Trsansferencia entre cuentas 