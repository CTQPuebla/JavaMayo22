package com;

public class CuentaBancaria {
	
	String titular;
	String numCuenta;
	private String tipoCuenta;
	private double saldoDisponible;
	boolean status;
	double min, max;
		
	public CuentaBancaria() {
		
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


	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", numCuenta=" + numCuenta + ", tipoCuenta=" + tipoCuenta
				+ ", saldoDisponible=" + saldoDisponible + ", status=" + status + "]";
	}
	
	//Comportamiento depositar, retirar, transferir
	

	
	public String retirar(double monto) {
		
		if(monto>this.saldoDisponible) {
			System.out.println("Saldo disponible: "+this.saldoDisponible);
			return "No hay suficientes fondos";
		}else if(this.saldoDisponible-monto<this.min) {
			System.out.println("Saldo disponible: "+this.saldoDisponible);
			return "El retiro dejaria por debajo del minimo a la cuenta";
		}else {
			//Decremento el saldo disponible
			this.saldoDisponible = this.saldoDisponible-monto;
			System.out.println("Saldo disponible: "+this.saldoDisponible);
			return "Retiro exitoso";
		}		
		
	}
	
	public String transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) {
		
		//Validando la extraccion de los fondos
		if(monto>origen.getSaldoDisponible()) { //f
			System.out.println("Saldo: "+origen.getSaldoDisponible());
			return "Sin fondos suficientes";
		}else if(origen.getSaldoDisponible()-monto<origen.getMin()) {
			System.out.println("Saldo: "+origen.getSaldoDisponible());
			return "El retiro dejaria por debajo del minimo a la cuenta";			
		
		}else if(monto>destino.getMax()) {
			System.out.println("Saldo: "+destino.getSaldoDisponible());
			return "El monto excede el maximo permitido";			
		}else if(monto+destino.getSaldoDisponible()>destino.getMax()) {
			System.out.println("Saldo: "+destino.getSaldoDisponible());
			return "La transferencia llevaria por encima del maximo permitido a la cuenta";
		}else {			
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);	
			
			System.out.println("Saldo origen: "+origen.getSaldoDisponible());
			System.out.println("Saldo destino: "+destino.getSaldoDisponible());
			return "Transferencia exitosa";		
		}
		
	}
	
}
