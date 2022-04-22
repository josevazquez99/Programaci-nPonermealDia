package Complejo;

import java.util.Objects;

public class Complejo {
	private double real;
	private double imag;

	public Complejo() {
		super();
	}

	public Complejo(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public Complejo sumar(Complejo c) {
		Complejo aux = new Complejo();
		aux.real = real + c.real;
		aux.imag = imag + c.imag;
		return aux;
	}

	public Complejo restar(Complejo c) {
		Complejo aux = new Complejo();
		aux.real = real - c.real;
		aux.imag = imag - c.imag;
		return aux;
	}

	@Override
	public String toString() {
		return "(" + real + ", " + imag + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return Double.doubleToLongBits(imag) == Double.doubleToLongBits(other.imag)
				&& Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
	}


}
