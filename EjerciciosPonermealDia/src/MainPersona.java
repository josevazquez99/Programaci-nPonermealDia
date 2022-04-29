package persona;

import java.util.Scanner;

public class MainPersona {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();

		System.out.println("Introduce la edad");
		int edad = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el sexo");
		char sexo = teclado.nextLine().charAt(0);

		System.out.println("Introduce el peso");
		double peso = Double.parseDouble(teclado.nextLine());

		System.out.println("Introduce la altura");
		double altura = Double.parseDouble(teclado.nextLine());
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);


		System.out.println("Persona1");
		muestraMensajePeso(persona1);
		muestraMayorDeEdad(persona1);
		System.out.println(persona1.toString());


		System.out.println("Introduce el nombre");
		String nombre2 = teclado.nextLine();

		System.out.println("Introduce la edad");
		int edad2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el sexo");
		char sexo2 = teclado.nextLine().charAt(0);

		System.out.println("Introduce el peso");
		double peso2 = Double.parseDouble(teclado.nextLine());

		System.out.println("Introduce la altura");
		double altura2 = Double.parseDouble(teclado.nextLine());
		Persona persona2 = new Persona(nombre2, edad2, sexo2, peso2, altura2);

		System.out.println("Persona2");
		muestraMensajePeso(persona2);
		muestraMayorDeEdad(persona2);
		System.out.println(persona2.toString());

	}

	public static void muestraMensajePeso(Persona p) {
		int IMC = p.calcularIMC();
		switch (IMC) {
		case Persona.pesoideal:
			System.out.println("La persona esta en su peso ideal");
			break;
		case Persona.infrapeso:
			System.out.println("La persona esta por debajo de su peso ideal");
			break;
		case Persona.sobrepeso:
			System.out.println("La persona esta por encima de su peso ideal");
			break;
		}
	}

	public static void muestraMayorDeEdad(Persona p) {

		if (p.esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}

}