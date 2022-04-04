package CuentaCorriente;

public class Cuenta {
	private double ingreso;
	private double reintegro;
	private double saldo;
	private int contadoringreso;
	private int contadorreintegro;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public String getSaldo() {
		return " Tienes este saldo " + this.saldo + " y tienes esta cantidad de ingreso " + this.contadoringreso
				+ " y esta de reintegro " + this.contadorreintegro;

	}

	public int getContadoringreso() {
		return contadoringreso;
	}

	public int getContadorreintegro() {
		return contadorreintegro;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.saldo += ingreso;
		this.contadoringreso++;
	}

	public double getReintegro() {
		return reintegro;
	}

	public void setReintegro(double reintegro) {
		this.saldo -= reintegro;
		this.contadorreintegro++;
	}

}