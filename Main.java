package Parking;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws ParkingException {
		int opcion;

		Categoria c2;
		c2 = new Categoria("Verde",2.25);

		Parking p1 = new Parking("Nombre2",c2,5);
		
		p1.setNumeroplazasocupadas(10);
		do {
			menu();
			opcion = leerInt("Dame la opci�n: ");
			switch (opcion) {
			case 1:
				try {
					p1.entrarParking();
				} catch (ParkingException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				double tiempo = leerDouble("Tiempo usado en el parking:");
				System.out.println("Tienes que pagar " + p1.cobrarYsalirDelParking(tiempo) + " euros.");
				break;
			case 3:
				System.out.println(p1.toString());
				break;

			}

		} while (opcion != 4);

	}
	public static void menu() {
		System.out.println("1.- Entrar al parking.\n" + "2.- Salir de parking.\n"
				+ "3.- Mostrar informaci�n del parking.\n" + "4.- Salir del programa.");
	}

	/**
	 * Este m�todo nos permite introducir texto por teclado tipo String
	 * 
	 * @param texto es el texto que va a leer
	 * @return la String introducida si hubiera un throw ser�a importante tb
	 */
	public static String leerString(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}

	public static double leerDouble(String texto) {
		System.out.println(texto);
		return Double.parseDouble(teclado.nextLine());
	}

	public static int leerInt(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}

}
