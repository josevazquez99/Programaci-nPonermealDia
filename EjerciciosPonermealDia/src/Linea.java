package Relacion7;

import java.util.Objects;

public class Linea extends Punto {
	private Punto puntoA;
	private Punto puntoB;

	public Linea() {
		super();
	}

	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;

	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	@Override
	public int hashCode() {
		return Objects.hash(puntoA, puntoB);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		return puntoA == other.puntoA && puntoB == other.puntoB;
	}

	public void moverDerecha(double cant) {
		this.puntoA.setX(this.puntoA.getX() + cant);
		this.puntoB.setX(this.puntoB.getX() + cant);

	}

	public void moverIzquierda(double cant) {
		this.puntoA.setX(this.puntoA.getX() - cant);
		this.puntoB.setX(this.puntoB.getX() - cant);

	}

	public void moverArriba(double cant) {
		this.puntoA.setY(this.puntoA.getY() + cant);
		this.puntoB.setY(this.puntoB.getY() + cant);
	}

	public void moverAbajo(double cant) {
		this.puntoA.setY(this.puntoA.getY() - cant);
		this.puntoB.setY(this.puntoB.getY() - cant);
	}

	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}

}
