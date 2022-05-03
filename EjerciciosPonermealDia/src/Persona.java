package persona;

import java.util.Random;

public class Persona {
	private final static char sexodefenido = 'H';
	public static final int infrapeso = -1;
	public static final int pesoideal = 0;
	public static final int sobrepeso = 1;
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	public Persona() {
		super();
		generaDni();
		comprobarSexo();
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		generaDni();
		comprobarSexo();

	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		generaDni();
		this.sexo = sexo;
		comprobarSexo();
	}

	private void comprobarSexo() {
		if (sexo != 'H' && sexo != 'M') {
			this.sexo = sexodefenido;
		}
	}

	private String generaLetraDni(String numerosDni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String resultado = numerosDni;
		int asignarLetra = Integer.parseInt(resultado) % 23;
		resultado += letras.charAt(asignarLetra);
		return resultado;
	}

	private String generaNumero() {
		Random dni = new Random();
		int randomAscii;
		String resultado = "";
		for (int i = 0; i < 8; i++) {
			randomAscii = dni.nextInt(9) + 1;
			resultado = resultado + randomAscii;
		}
		return resultado;
	}

	private String generaDni() {
		String resultadoDni = "", numerosDni;
		numerosDni = generaNumero();
		resultadoDni += generaLetraDni(numerosDni);
		return resultadoDni;
	}

	public String getdni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC() {
		double pesoActual = peso / (Math.pow(altura, 2));
		if (pesoActual >= 20 && pesoActual <= 25) {
			return pesoideal;
		} else if (pesoActual < 20) {
			return infrapeso;
		} else {
			return sobrepeso;
		}
	}

	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}

	@Override
	public String toString() {
		String sexo;
		if (this.sexo == 'H') {
			sexo = "hombre";
		} else {
			sexo = "mujer";
		}
		return "Informacion de la persona:\n" + "Nombre: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Edad: " + edad
				+ " años\n" + "DNI: " + dni + "\n" + "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";
	}

}
