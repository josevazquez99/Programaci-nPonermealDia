package Relacion7;

import java.util.Scanner;

public class MainJarra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Introduce la capacidad de la jarra A");
		int a = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce la capacidad de la jarra B ");
		int b = Integer.parseInt(teclado.nextLine());
		Jarra j1 = new Jarra(a);
		Jarra j2 = new Jarra(b);

		char opcion;
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion = teclado.nextLine().charAt(0);
		while (opcion != 6) {
			switch (opcion) {
			case '1': {
				char opcion2;
				System.out.println("Que jarra desea llenar");
				opcion2 = teclado.nextLine().charAt(0);
				if (opcion2 == 'A' || opcion2 == 'a') {
					System.out.println("Que cantidad quieres llenar");
					a = Integer.parseInt(teclado.nextLine());
					j1.llenarJarra(a);
				} else if (opcion == 'B' || opcion2 == 'b') {
					System.out.println("Que cantidad quieres llenar");
					b = Integer.parseInt(teclado.nextLine());
					j2.llenarJarra(b);
				}

			}
				break;
			case '2':
				char opcion3;
				System.out.println("Que jarra desea vaciar");
				opcion3 = teclado.nextLine().charAt(0);
				if (opcion3 == 'A' || opcion3 == 'a') {
					j1.vaciarJarra();
				} else if (opcion3 == 'B' || opcion3 == 'b') {
					j2.vaciarJarra();
				}

				break;
			case '3': {
				j1.volcarJarraAb(j2);
				break;

			}

			case '4': {
				j2.volcarJarraBa(j1);
			}

				break;
			case '5': {
				System.out.println(j1.toString());
				System.out.println(j2.toString());

			}

				break;
			case '6': {
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
		return "1-.Llenar jarra\n" + "2-.Vaciar jarra\n" + "3-.Volcar jarra A en B\n" + "4-.Volcar jarra B en A\n"
				+ "5.-Ver estado de la jarra\n" + "6.-Apagar y salir\n";
	}

}
