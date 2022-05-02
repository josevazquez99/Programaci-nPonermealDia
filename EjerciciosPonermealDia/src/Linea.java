package Relacion7;

import java.util.Objects;

public class Linea {
	private int puntoA;
	private int puntoB;
	public int x;
	public int y;
	public int xB;
	public int yB;

	public Linea() {
		super();
	}

	public Linea(int x, int y, int xB, int yB) {
		this.x = puntoA;
		this.y = puntoA;
		this.xB = puntoB;
		this.yB = puntoB;

	}

	public int getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(int puntoA) {
		this.puntoA = puntoA;
	}

	public int getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(int puntoB) {
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

	public double moverDerecha() {
		double resultado;
		resultado = this.x++;
		resultado = this.xB++;
		return resultado;

	}

	public double moverIzquierda() {
		double resultado;
		resultado = this.x--;
		resultado = this.yB--;
		return resultado;

	}

	public double moverArriba() {
		double resultado;
		resultado = this.y++;
		resultado = this.yB++;
		return resultado;
	}

	public double moverAbajo() {
		double resultado;
		resultado = this.y--;
		resultado = this.yB--;
		return resultado;
	}

	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + ", x=" + x + ", y=" + y + ", xB=" + xB + ", yB=" + yB
				+ "]";
	}

}
