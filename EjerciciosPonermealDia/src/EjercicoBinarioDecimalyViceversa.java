import java.util.Scanner;

public class EjercicoBinarioDecimalyViceversa {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el codigo");
		int numero = teclado.nextInt();
		double binario = decimalABinario(numero);
		System.out.println(numero + " en binario es: " + binario);

		System.out.println("Introduce el codigo que quieras pasar a decimal");
		int numero2 = teclado.nextInt();
		int decimal = binarioADecimal(numero2);
		System.out.println(numero2 + " en decimal es: " + decimal);
	}

	public static double decimalABinario(int numero) {
		double binario = 0;
		int digito;
		int DIVISOR = 2;
		for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = i % DIVISOR;
			binario += digito * Math.pow(10, j);
		}
		return binario;
	}

	public static int binarioADecimal(int numero2) {

		int decimal = 0;
		int digito;
		int DIVISOR = 10;
		for (int i = numero2, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = (int) (i % DIVISOR);
			if (digito != 0 && digito != 1) {
				return -1;
			}
			decimal += digito * Math.pow(2, j);
		}
		return decimal;

	}

}
