package CuentaCorriente;


public class Cuenta {
	private double saldo;
	private int contadoringreso;
	private int contadorreintegro;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public String getSaldo() {
		return " Tienes este saldo " + this.saldo + " y tienes " + this.contadoringreso + " ingresos y " + this.contadorreintegro + " reintegro ";

	}

	public String setIngreso(double ingreso) {
		String resultado = "";
		if (ingreso < 0) {
			resultado = "El ingreso debe ser mayor que 0";
		} else {
			this.saldo += ingreso;
			this.contadoringreso++;

		}

		return resultado;

	}

	public void setReintegro(double reintegro) {
		String resultado = "";
		if (reintegro < 0) {
			resultado = "El reintegro debe ser mayor que 0";
		} else {
			this.saldo -= reintegro;
			this.contadorreintegro++;
		}
	}

}
