package CuentaCorriente;

import java.util.Scanner;

public class PrincipalCuenta{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta(20);
		int texto;
		System.out.println("Que operación desea realizar");
		texto = Integer.parseInt(teclado.nextLine());

		while (texto != 4) {
			if (texto == 1) {
				System.out.println("Cual es la cantidad que desea retirar");
				texto = Integer.parseInt(teclado.nextLine());
				c.setReintegro(texto);
				System.out.println(c.getSaldo());
			} else if (texto == 2) {
				System.out.println(" Que cantidad deseas ingresar ");
				texto = Integer.parseInt(teclado.nextLine());
				c.setIngreso(texto);
				System.out.println(c.getSaldo());
			} else if (texto == 3) {
				System.out.println(c.getSaldo());
			}

		}

	}

}
