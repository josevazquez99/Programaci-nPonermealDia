package Avion;

import java.util.Scanner;

public class MainAvion {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaramos el objeto
		Avion a1 = new Avion("2", "TRAVEL", 100);
		Avion a2 = new Avion("3", 40);

		char opcion;
		System.out.println("Bienvenido a tu próximo viaje");
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion = teclado.nextLine().charAt(0);

		while (opcion != 7) {
			switch (opcion) {
			case '1': {
				int capacidad;
				double km;
				System.out.println("Introduce el número de asientos ");
				capacidad = Integer.parseInt(teclado.nextLine());
				System.out.println("Introduce el número de kilometros ");
				km = Double.parseDouble(teclado.nextLine());
				try {
					System.out.println(a1.asignarVuelo(capacidad, km));
				} catch (AvionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
				break;
			case '2': {
				try {
					System.out.println(a1.getNumVuelos());
				} catch (AvionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
				break;
			case '3': {
				try {
					System.out.println(a1.getKmVolados());
				} catch (AvionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
				break;
			case '4': {
				System.out.println(a1.getMediaKm());
			}
				break;
			case '5': {
				String compannia;
				System.out.println("Que compañía ha comprado el avión");
				compannia = teclado.nextLine();
				a1.setCompannia(compannia);
			}
				break;
			case '6': {
				System.out.println(a1.toString());

			}
				break;
			case '7': {
				System.out.println("Apagar y salir");
			}
				break;
			default:
				System.out.println("Error");
			}
			System.out.println(menu());
			System.out.println("Elija una opcion");
			opcion = teclado.nextLine().charAt(0);
		}

	}

	private static String menu() {
		return "1-.Asignar Vuelo\n" + "2-.Obtener numero de vuelos\n" + "3-.Obtener numero de km\n"
				+ "4-.Obtener la media de km\n" + "5-.Cambio de compañia\n" + "6-.Mostrar Información del avión\n"
				+ "5-.Apagar y salir\n";
	}
}