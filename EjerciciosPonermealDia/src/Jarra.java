package Relacion7;

public class Jarra {
	private int capacidad;
	private int cantidad = 0;

	public Jarra() {
		super();
	}

	public Jarra(int capacidad) {
		this.capacidad = capacidad;

	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void llenarJarra(int cantidad) {
		if (this.capacidad >= cantidad) {
			capacidad -= cantidad;
			this.cantidad += cantidad;
		}
	}

	public void vaciarJarra() {
		this.capacidad = this.cantidad;
		this.cantidad = 0;
	}

	public void volcarJarraAb(Jarra b) {
		b.llenarJarra(this.cantidad);
		this.capacidad += cantidad;
		this.cantidad = 0;

	}

	public void volcarJarraBa(Jarra a) {
		a.llenarJarra(this.cantidad);
		this.capacidad += cantidad;
		this.cantidad = 0;

	}

	@Override
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", cantidad=" + cantidad + "]";
	}

}