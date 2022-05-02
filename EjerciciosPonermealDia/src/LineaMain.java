package Relacion7;

import java.util.Scanner;

public class LineaMain {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce las coordenadas x  del punto A ");
		int x = teclado.nextInt();
		System.out.println("Introduce las coordenadas y  del punto A ");
		int y = teclado.nextInt();
		System.out.println("Introduce las coordenadas x punto B");
		int xB = teclado.nextInt();
		System.out.println("Introduce las coordenadas y del punto B");
		int yB = teclado.nextInt();

		Linea Linea1 = new Linea(x, y, xB, yB);
		char opcion;
		char movimiento;
		System.out.println("Elija una opcion");
		opcion = teclado.nextLine().charAt(0);
		while (opcion != 3) {
			switch (opcion) {
			case '1': {
				System.out.println("Introduce el movimiento ");
				movimiento = teclado.nextLine().charAt(0);
				if (movimiento == 'A') {
					System.out.println(Linea1.moverArriba());
				} else if (movimiento == 'B') {
					System.out.println(Linea1.moverAbajo());
				} else if (movimiento == 'I') {
					System.out.println(Linea1.moverIzquierda());
				} else if (movimiento == 'D') {
					System.out.println(Linea1.moverDerecha());
				}
			}
				break;
			case '7': {
				System.out.println(Linea1.toString());
			}
				break;
			default:
				System.out.println("Error");
			}
		}
	}

}
