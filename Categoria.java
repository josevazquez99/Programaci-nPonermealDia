package Parking;

import java.util.Objects;

public class Categoria {
	private String nombre;
	private double precioporminuto;

	public Categoria(String nombre, double precioporminuto) {
		super();
		this.nombre = nombre;
		this.precioporminuto = precioporminuto;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioporminuto() {
		return precioporminuto;
	}

	public void setPrecioporminuto(double precioporminuto) {
		this.precioporminuto = precioporminuto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", precioporminuto=" + precioporminuto + "]";
	}

}