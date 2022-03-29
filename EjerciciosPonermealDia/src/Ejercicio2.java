import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String texto, textoVocalesEnMayusculas;
		System.out.println("Introduce un texto: ");
		texto = teclado.nextLine();
		textoVocalesEnMayusculas = VocalesMayusculas(texto);
		System.out.println("La cadena con solo las vocales y en may�sculas es " + textoVocalesEnMayusculas);
	}

	private static String VocalesMayusculas(String cadena) {
		StringBuilder builder = new StringBuilder();
		String vocales = "AEIOU";
		char caracter;
		int indice;
		String cadenaux = cadena.toUpperCase();
		for (indice = 0; indice < cadena.length(); indice++) {
			caracter = cadenaux.charAt(indice);
			if (vocales.indexOf(caracter) >= 0) {
				builder.append(caracter);
			}
		}
		return builder.toString();
	}
}
// Prueba 1 te muestra un mensaje de La cadena con solo las vocales y en mayusculas es I.
// Solo reconoce la primera mayuscula ,no reconoce la segunda de A.

// Prueba 2 te muestra un mensaje de La cadena con solo las vocales y en may�sculas es E.
// Reconoce la unica vocal mayuscula que hay que es la E.
