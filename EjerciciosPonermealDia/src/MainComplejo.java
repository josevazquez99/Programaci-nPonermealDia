package Complejo;

import java.util.Scanner;

public class MainComplejo {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;
		

		while (opc != 3) {
			System.out.println(menu());
			System.out.println("Introduce una opcion");
			opc = Integer.parseInt(teclado.nextLine());
			switch (opc) {
			case 1: {
				double real = 0, imag = 0;
				Complejo c1 = new Complejo(real, imag);
				System.out.println("Introduce la parte real de tu numero");
				real = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				imag = Double.parseDouble(teclado.nextLine());

				Complejo c2 = new Complejo(real, imag);
				System.out.println("Introduce la parte real de tu numero");
				real = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				imag = Double.parseDouble(teclado.nextLine());

				System.out.println(c2.sumar(c2));
				break;
			}
			case 2: {
				double real = 0, imag = 0;
				Complejo c1 = new Complejo(real, imag);
				System.out.println("Introduce la parte real de tu numero");
				real = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				imag = Double.parseDouble(teclado.nextLine());

				Complejo c2 = new Complejo(real, imag);
				System.out.println("Introduce la parte real de tu numero");
				real = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				imag = Double.parseDouble(teclado.nextLine());

				System.out.println(c2.restar(c2));
				break;


			}
			default:
				System.out.println("Error");
			}
			System.out.println(menu());
			System.out.println("Introduce una opcion");
			opc = Integer.parseInt(teclado.nextLine());
		}

	}

	public static String menu() {
		return "1. Sumar complejos\n" + "2.Restar complejos\n" + "3.Apagar y Salir";
	}
}
