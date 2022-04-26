package Avion;

public class Avion extends AvionException {
	private String idAvion;
	private int capacidad;
	private int numVuelos = 0;
	private double kmVolados = 0;
	private String compannia;

	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}

	public Avion(String idAvion, String compannia, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.compannia = compannia;
	}

	public boolean asignarVuelo(int capacidad, double kmVolados) throws AvionException {
		boolean resultado = true;
		if (capacidad < 0 || capacidad > this.capacidad || kmVolados < 0) {
			resultado = false;
			throw new AvionException("La capacidad debe ser mayor que 0");
		} else if (kmVolados < 0) {
			throw new AvionException("Los kilometros deben ser  debe ser mayor que 0");

		} else {
			resultado = true;
			this.capacidad++;
			this.kmVolados += kmVolados;
			this.numVuelos += 1;
		}

		return resultado;

	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public double getKmVolados() {
		return kmVolados;
	}

	public double getMediaKm() {
		double resultado;
		resultado = this.kmVolados / this.numVuelos;
		return resultado;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", capacidad=" + capacidad + ", numVuelos=" + numVuelos + ", kmVolados="
				+ kmVolados + ", compannia=" + compannia + "]";
	}

}

