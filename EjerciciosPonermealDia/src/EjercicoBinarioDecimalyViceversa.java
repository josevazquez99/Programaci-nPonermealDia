import java.util.Scanner;

public class EjercicoBinarioDecimalyViceversa {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String numero;
		System.out.println("Introduzca un numero que quieras pasar a binario");
		numero = teclado.nextLine();
		System.out.println(decimalABinario(numero));
		String numero2;
		System.out.println("Introduzca un numero que quieras pasar a decimal");
		numero2 = teclado.nextLine();
		System.out.println(binarioADecimal(numero2));
	}

	public static String decimalABinario(String numero) {
		String binario = "";
		int decimal = Integer.parseInt(numero);
		int digito;
		int DIVISOR = 2;
		for (int i = decimal, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = i % DIVISOR;
			binario = (int) Math.pow(digito, j) + binario;
		}
		return binario;
	}

	public static String binarioADecimal(String numero2) {
		String decimal = "";
		int binario2 = 0;
		int decimal2 = 0;
		int posicion = 0;
		for (int x = numero2.length() - 1; x >= 0; x--) {
			int digito = 1;

			if (numero2.charAt(x) == '0') {
				digito = 0;
			}
			double multiplicador = (int) Math.pow(2, posicion);
			decimal2 =(int) ( digito *  multiplicador);
			binario2+=decimal2;
			posicion++;
		}
		decimal=String.valueOf(binario2);
		return decimal;
	}

}
