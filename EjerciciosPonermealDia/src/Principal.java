package CuentaCorriente;

import java.util.Scanner;

public class Principal {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta(20);
		String texto;
		System.out.println("Que operación desea realizar");
		texto = teclado.nextLine();

		while (texto != "4") {
			if (texto == "1") {
				System.out.println("Cual es la cantidad que desea retirar");
				texto=teclado.nextLine();
				c.setReintegro(0);
				System.out.println(c.getSaldo());
			} else if (texto == "2") {
				System.out.println(" Que cantidad deseas ingresar ");
				texto=teclado.nextLine();
				c.setIngreso(0);
				System.out.println(c.getSaldo());
			} else if (texto == "3") {
				System.out.println(c.getSaldo());
				System.out.println(c.getContadoringreso());
				System.out.println(c.getContadoringreso());
			}

		}

	}

}