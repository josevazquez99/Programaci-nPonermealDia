package Relacion7;

import java.util.Scanner;

public class LineaMain {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce las coordenadas x  del punto A ");
		int x = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce las coordenadas y  del punto A ");
		int y = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce las coordenadas x punto B");
		int xB = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce las coordenadas y del punto B");
		int yB = Integer.parseInt(teclado.nextLine());
		Punto p1 = new Punto(x, y);
		Punto p2 = new Punto(xB, yB);
		Linea linea1 = new Linea(p1, p2);
		char opcion;
		char movimiento;
		int cant;
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion = teclado.nextLine().charAt(0);
		while (opcion != 3) {
			switch (opcion) {
			case '1': {
				System.out.println("Introduce el movimiento ");
				movimiento = teclado.nextLine().charAt(0);
				if (movimiento == 'A') {
					System.out.println("Introduce la cantidad que quieras mover");
					cant = Integer.parseInt(teclado.nextLine());
					linea1.moverArriba(cant);
					System.out.println(linea1);
				} else if (movimiento == 'B') {
					System.out.println("Introduce la cantidad que quieras mover");
					cant = Integer.parseInt(teclado.nextLine());
					linea1.moverAbajo(cant);
					System.out.println(linea1);
				} else if (movimiento == 'I') {
					System.out.println("Introduce la cantidad que quieras mover");
					cant = Integer.parseInt(teclado.nextLine());
					linea1.moverIzquierda(cant);
					System.out.println(linea1);
				} else if (movimiento == 'D') {
					System.out.println("Introduce la cantidad que quieras mover");
					cant = Integer.parseInt(teclado.nextLine());
					linea1.moverDerecha(cant);
					System.out.println(linea1);

				}
			}
				break;
			case '2': {
				System.out.println(linea1.toString());
			}
				break;
			case '3': {
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
		return "1-.Mover Linea\n" + "2-.Mostrar Linea\n" + "3-.Salir\n";
	}

}

