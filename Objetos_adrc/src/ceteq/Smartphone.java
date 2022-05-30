package ceteq;

public class Smartphone extends Celular{
	private String camara;
	private String tarjetaRed;
	private String chip;
	
	public Smartphone() {
		
	}

	public Smartphone(String camara, String tarjetaRed, String chip) {
		this.camara = camara;
		this.tarjetaRed = tarjetaRed;
		this.chip = chip;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getTarjetaRed() {
		return tarjetaRed;
	}

	public void setTarjetaRed(String tarjetaRed) {
		this.tarjetaRed = tarjetaRed;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Smartphone [camara=" + camara + ", tarjetaRed=" + tarjetaRed + ", chip=" + chip + "]";
	}
	
	
}
