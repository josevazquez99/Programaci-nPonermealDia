package Cafe;

import java.util.Scanner;

public class Cafe extends CafeException {
	private static int depositocafe = 50;
	private static int depositoleche = 50;
	private static int depositovasos = 80;
	private double monedero;
	private int cafe;
	private int vasos;
	private int leche;
	private static double preciocafe = 1;
	private static double precioleche = 0.8;
	private static double preciocafeconleche = 1.5;

	public Cafe(double monedero) {
		super();
		this.setMonedero(monedero);
		this.cafe = Cafe.depositocafe;
		this.leche = Cafe.depositoleche;
		this.vasos = Cafe.depositovasos;
	}

	public String servirCafeSolo(double cantidad) throws CafeException {
		String mensaje;
		double vuelta;
		if (cantidad - this.preciocafe > this.monedero) {
			throw new CafeException("No dispone de saldo suficiente");
		} else if (this.vasos <= 0 || this.cafe <= 0) {
			throw new CafeException("No quedan existencias");
		} else if (cantidad < this.preciocafe) {
			mensaje = "Introduzca la cantidad correcta que se le pide";
		} else {
			this.cafe--;
			this.vasos--;
			this.monedero += this.preciocafe;
			vuelta = cantidad - this.preciocafe;
			mensaje = "Aqui tiene su cafe, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	public String servirLecheSola(double cantidad) throws CafeException {
		String mensaje;
		double vuelta;
		if (cantidad - this.precioleche > this.monedero) {
			throw new CafeException("No dispone de saldo suficiente");
		} else if (this.vasos <= 0 || this.cafe <= 0) {
			throw new CafeException("No quedan existencias");
		} else if (cantidad < this.precioleche) {
			throw new CafeException("Introduzca la cantidad correcta que se le pide");
		} else {
			this.leche--;
			this.vasos--;
			this.monedero += this.precioleche;
			vuelta = cantidad - this.precioleche;
			mensaje = "Aqui tiene su leche, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	public String servirCafeconLeche(double cantidad) throws CafeException {
		String mensaje;
		double vuelta;
		if (cantidad - this.preciocafeconleche > this.monedero) {
			throw new CafeException("No dispone de saldo suficiente");
		} else if (this.vasos <= 0 || this.cafe <= 0) {
			throw new CafeException("No quedan existencias");
		} else if (cantidad < this.preciocafeconleche) {
			throw new CafeException("Introduzca la cantidad correcta que se le pide");
		} else {
			this.cafe--;
			this.leche--;
			this.vasos--;
			this.monedero += this.preciocafeconleche;
			vuelta = cantidad - this.preciocafeconleche;
			mensaje = "Aqui tiene su cafe con leche, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	@Override
	public String toString() {
		return "Maquina [depositocafe=" + depositocafe + ", depositoleche=" + depositoleche + ", depositovasos="
				+ depositovasos + ", monedero=" + monedero + ", cafe=" + cafe + ", vasos=" + vasos + ", leche=" + leche
				+ ", preciocafe=" + preciocafe + ", precioleche=" + precioleche + ", preciocafeconleche="
				+ preciocafeconleche + "]";
	}

	public void vaciarMonedero() {
		monedero = 0;
	}

	public void llenarDeposito() {

	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		if (monedero > 0) {
			this.monedero = monedero;
		}
	}

}

