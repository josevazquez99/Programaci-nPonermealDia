package Relacion7;

import java.util.Scanner;

public class MainProducto {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuantos productos quieres");
		int cant = Integer.parseInt(teclado.nextLine());
		Producto p1 = new Producto(2, "cascos", 20, 20);
		p1.precioVenta(cant);
		System.out.println("Lo que tienes que pagar es " + p1.precioVenta(cant) + " euros");

	}

}