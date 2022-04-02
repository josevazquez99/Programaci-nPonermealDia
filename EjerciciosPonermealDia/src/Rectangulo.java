package Rectangulo;

public class Rectangulo {
	private int longitud = 1;
	private int ancho = 1;

	public Rectangulo(int longitud, int ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;

	}

	public double perimetro() {
		double resultado;
		resultado = 2 * (this.longitud + this.ancho);
		return resultado;

	}

	public double area() {
		double resultado;
		resultado = this.longitud * this.ancho;
		return resultado;
	}

	public int getLongitud() {
		return longitud;
	}

	public String setLongitud(int longitud) {
		String variable = "";
		if (longitud < 0 && longitud > 20) {
			variable = "No puede ser menor que 0 y tampoco mayor que 20";

		} else {
			this.longitud = longitud;
		}
		return variable;
	}

	public int getAncho() {
		return ancho;
	}

	public String setAncho(int ancho) {
		String variable = "";
		if (ancho > 0 && ancho < 20) {
			variable = "El ancho no puede ser menor que 0 y tampoco mayor que 20";
		} else {
			this.ancho = ancho;
		}
		return variable;
	}

}