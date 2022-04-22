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
				double parteReal = 0, parteImaginaria = 0;
				Complejo n1 = new Complejo(parteReal, parteImaginaria);
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());

				Complejo n2 = new Complejo(parteReal, parteImaginaria);
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());

				System.out.println(n2.sumar(n2));
				System.out.println(n1.sumar(n1));
				break;
			}
			case 2: {
				double parteReal, parteImaginaria;
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());

				Complejo n1 = new Complejo(parteReal, parteImaginaria);
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());

				Complejo n2 = new Complejo(parteReal, parteImaginaria);
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());

				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());

				System.out.println(n1.restar(n1));
				System.out.println(n2.restar(n2));
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