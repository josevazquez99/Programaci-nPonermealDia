import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		System.out.println("Introduce el codigo");
		codigo = teclado.nextLine();
		System.out.println(comprobarCodigo(codigo));
		String categoria;
		System.out.println("Introduce la categoria");
		categoria = teclado.nextLine();
		System.out.println(comprobarCategoria(categoria));
	}

	public static String comprobarCodigo(String codigo) {
		int contador = 0;
		String cadena;
		boolean comprobacion = false;
		for (int i = 0; i <= codigo.length() - 1; i++) {
			int ascii = codigo.charAt(i);

			if (ascii >= 48 && ascii <= 57) {
				contador++;
			}
		}

		if (codigo.length() >= 5 && codigo.length() < 12 && contador > 3) {
			comprobacion = true;
		}

		if (comprobacion == true) {
			cadena = "El codigo es correcto";
		} else {
			cadena = "El codigo no es correcto";
		}
		return cadena;

	}

	public static String comprobarCategoria(String categoria) {
		int contador = 0;
		String cadena;
		String vocales = "AEIOU";
		boolean comprobacion = false;
		for (int i = 0; i <= categoria.length() - 1; i++) {
			char caracter = categoria.charAt(i);
			if (vocales.indexOf(categoria) > -1 || (caracter == 'C' && i == 0)) {
				contador++;
			}
		}
		if (categoria.length() >= 2 && categoria.length() < 5 && contador == categoria.length()) {
			comprobacion = true;
		}

		if (comprobacion == true) {
			cadena = "La categoria es correcta";
		} else {
			cadena = "La categoria no es correcto";
		}
		return cadena;

	}
}
