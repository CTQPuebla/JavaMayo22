package ceteq;

import java.util.Date;

public class Cajero {
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

	public CuentaBancaria[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(CuentaBancaria[] cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", id=" + id + "]";
	}

	public CuentaBancaria buscarCuenta(String numCuenta) {
		CuentaBancaria cuentaTemp = null;

		for (int i = 0; i < cuentas.length; i++) {
			if (numCuenta.equals(cuentas[i].getNumCuenta())) {
				cuentaTemp = cuentas[i];
				break;
			}
		}
		return cuentaTemp;
	}

	public Object depositar(String numCuenta, double monto) {
		CuentaBancaria cuentaTemp = buscarCuenta(numCuenta);
		if (cuentaTemp != null) {
			if (monto > cuentaTemp.getMax()) {
				return "El monto sobre pasa el maximo permitido";
			} else if (monto + cuentaTemp.getSaldoDisponible() > cuentaTemp.getMax()) {
				return "El deposito llevaria por encima del maximo permitido a la cuenta";
			} else {
				cuentaTemp.setSaldoDisponible(cuentaTemp.getSaldoDisponible() + monto);
				System.out.println("Saldo disponible: " + cuentaTemp.getSaldoDisponible());
				return new Comprobante(this.direccion, this.id, new Date(), cuentaTemp.getSaldoDisponible());
			}
		} else {
			return "La cuenta no existe";
		}
	}

	public Object retirar(String numCuenta, double monto) {
		CuentaBancaria cuentaTemp = buscarCuenta(numCuenta);
		if (cuentaTemp != null) {
			if (monto > cuentaTemp.getSaldoDisponible()) {
				return "No hay suficientes fondos";
			} else if (cuentaTemp.getSaldoDisponible() - monto < cuentaTemp.getMin()) {
				return "El retiro dejaria por debajo del minimo a la cuenta";
			} else {
				cuentaTemp.setSaldoDisponible(cuentaTemp.getSaldoDisponible() - monto);
				System.out.println("Saldo disponible: " + cuentaTemp.getSaldoDisponible());
				return new Comprobante(this.direccion, this.id, new Date(), cuentaTemp.getSaldoDisponible());
			}
		} else {
			return "La cuenta no existe";
		}
	}
	
	public String transferir(String numCuentaOrigen, String numCuentaDestino, double monto) {
		
		CuentaBancaria cuentaOrigen = buscarCuenta(numCuentaOrigen);
		CuentaBancaria cuentaDestino = buscarCuenta(numCuentaDestino);
		
		if (cuentaOrigen != null && cuentaDestino != null) {
			if (monto > cuentaOrigen.getSaldoDisponible()) {
				System.out.println("Saldo: " + cuentaOrigen.getSaldoDisponible());
				return "Sin fondos suficientes";
			} else if (cuentaOrigen.getSaldoDisponible() - monto < cuentaOrigen.getMin()) {
				System.out.println("Saldo: " + cuentaOrigen.getSaldoDisponible());
				return "El retiro dejaria por debajo del minimo a la cuenta";
			} else if (monto > cuentaDestino.getMax()) {
				System.out.println("Saldo: " + cuentaDestino.getSaldoDisponible());
				return "El monto excede el maximo permitido";
			} else if (monto + cuentaDestino.getSaldoDisponible() > cuentaDestino.getMax()) {
				System.out.println("Saldo: " + cuentaDestino.getSaldoDisponible());
				return "La transferencia llevaria por encima del maximo permitido a la cuenta";
			}else {
				cuentaOrigen.setSaldoDisponible(cuentaOrigen.getSaldoDisponible() - monto);
				cuentaDestino.setSaldoDisponible(cuentaDestino.getSaldoDisponible() + monto);
				System.out.println("Saldo cuenta origen: " + cuentaOrigen.getSaldoDisponible());
				System.out.println("Saldo cuenta destino: " + cuentaDestino.getSaldoDisponible());
				return "Transferencia exitosa";
			}
		} else {
			return "Alguna de las cuentas no existen";
		}
		
	}
}
