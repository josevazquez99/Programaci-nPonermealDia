package Parking;

import java.util.Objects;

public class Parking {
	private String nombre;
	private Categoria categoria;
	private int numeroplazas;
	private int numeroplazasocupadas;
	private int codigo;
	private double recaudacion;

	public Parking(String nombre, Categoria categoria, int totalPlazas) throws ParkingException {
		super();
		if (totalPlazas < 0) {
			throw new ParkingException("Error, el total de plazas es negativo");
		}
		this.nombre = nombre;
		this.categoria = categoria;
		this.numeroplazas = totalPlazas;
		this.numeroplazasocupadas = 0;
		this.recaudacion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getNumeroplazas() {
		return numeroplazas;
	}

	public void setNumeroplazas(int numeroplazas) {
		this.numeroplazas = numeroplazas;
	}

	public int getNumeroplazasocupadas() {
		return numeroplazasocupadas;
	}

	public void setNumeroplazasocupadas(int numeroplazasocupadas) {
		this.numeroplazasocupadas = numeroplazasocupadas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public double cobrarYsalirDelParking(double minutosUsados) {
		double resultado;
		resultado = minutosUsados * this.categoria.getPrecioporminuto();
		this.numeroplazasocupadas--;
		this.recaudacion = +resultado;
		return resultado;
	}

	public void entrarParking() throws ParkingException {
		if (numeroplazas == numeroplazasocupadas) {
			throw new ParkingException("El parking est� lleno.");
		}
		this.numeroplazasocupadas++;

	}

	public Parking clone(String nombre) throws ParkingException {
		Parking nuevo = new Parking(nombre, this.categoria, this.numeroplazas);
		return nuevo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Parking [nombre=" + nombre + ", numeroplazas=" + numeroplazas + ", numeroplazasocupadas="
				+ numeroplazasocupadas + ", codigo=" + codigo + ", recaudacion=" + recaudacion + "]";
	}

}