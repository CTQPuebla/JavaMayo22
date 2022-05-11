package com;

import java.util.Date;

public class Cajero {

	//Actualizar datos de cuenta dentro del array
	
	String direccion;
	String id;

	CuentaBancaria[] cuentas;

	public Cajero() {

	}

	public Cajero(String direccion, String id, CuentaBancaria[] cuentas) {
		super();
		this.direccion = direccion;
		this.id = id;
		this.cuentas = cuentas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", id=" + id + "]";
	}

	public Object depositar(String numCuenta, double monto) {
		CuentaBancaria temp = null;
		// Buscando la cuenta
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getNumCuenta().equals(numCuenta)) {
				temp = cuentas[i];
				break;
			}
		}
		if (temp != null) {
			// Validacion de reglas
			if (monto > temp.getMax()) { // Valido que no se pase del maximo la cantidad a depositar
				System.out.println("Saldo disponible: " + temp.getSaldoDisponible());
				return "el monto sobrepasa el maximo permitido";
			} else if (monto + temp.getSaldoDisponible() > temp.getMax()) { // Valido que el deposito no
																			// exceda el maximo
																			// permitido
				System.out.println("Saldo disponible: " + temp.getSaldoDisponible());
				return "el deposito llevaria por encima  del maximo permitido a la cuenta";
			} else {				
				// Aumento el saldo disponible
				temp.setSaldoDisponible(temp.getSaldoDisponible() + monto);
				return new Comprobante(this.direccion, this.id, new Date(), temp.getSaldoDisponible());
			}

		} else {
			return "La cuenta no existe";
		}

	}

	public String retirar(String numCuenta, double monto) {
		CuentaBancaria temp = null;

		// Buscando la cuenta
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getNumCuenta().equals(numCuenta)) {
				temp = cuentas[i];
				break;
			}
		}
		// Si la variable temporal contiene una cuenta ...
		if (temp != null) {
			if (monto > temp.getSaldoDisponible()) {
				System.out.println("Saldo disponible: " + temp.getSaldoDisponible());
				return "No hay suficientes fondos";
			} else if (temp.getSaldoDisponible() - monto < temp.getMin()) {
				System.out.println("Saldo disponible: " + temp.getSaldoDisponible());
				return "El retiro dejaria por debajo del minimo a la cuenta";
			} else {
				// Decremento el saldo disponible
				temp.setSaldoDisponible(temp.getSaldoDisponible() + monto);
				System.out.println("Saldo disponible: " + temp.getSaldoDisponible());
				return "Retiro exitoso";
			}
		} else {
			return "La cuenta no existe";
		}

	}

	public String transferir(String cuentaO, String cuentaD, double monto) {

		CuentaBancaria auxO = null;
		CuentaBancaria auxD = null;
		// Buscando la cuenta origen
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getNumCuenta().equals(cuentaO)) {
				auxO = cuentas[i];
				break;
			}
		}
		// Buscando la cuenta destino
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getNumCuenta().equals(cuentaD)) {
				auxD = cuentas[i];
				break;
			}
		}
		if (auxO != null && auxD != null) {
			// Validando la extraccion de los fondos
			if (monto > auxO.getSaldoDisponible()) { // f
				System.out.println("Saldo: " + auxO.getSaldoDisponible());
				return "Sin fondos suficientes";
			} else if (auxO.getSaldoDisponible() - monto < auxO.getMin()) {
				System.out.println("Saldo: " + auxO.getSaldoDisponible());
				return "El retiro dejaria por debajo del minimo a la cuenta";

			} else if (monto > auxD.getMax()) {
				System.out.println("Saldo: " + auxD.getSaldoDisponible());
				return "El monto excede el maximo permitido";
			} else if (monto + auxD.getSaldoDisponible() > auxD.getMax()) {
				System.out.println("Saldo: " + auxD.getSaldoDisponible());
				return "La transferencia llevaria por encima del maximo permitido a la cuenta";
			} else {
				auxO.setSaldoDisponible(auxO.getSaldoDisponible() - monto);
				auxD.setSaldoDisponible(auxD.getSaldoDisponible() + monto);

				System.out.println("Saldo origen: " + auxO.getSaldoDisponible());
				System.out.println("Saldo destino: " + auxD.getSaldoDisponible());
				return "Transferencia exitosa";
			}

		}else {
			return "Alguna de las 2 cuentas no existe";
		}

	}

}
