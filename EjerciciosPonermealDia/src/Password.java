package persona;

public class Password {
	private static int longitud = 8;
	private String contrasenna;

	public Password() {
		super();
		this.longitud = longitud;
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		contrasenna = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public boolean esFuerte() {
		int cuentanumeros = 0;
		int cuentaminusculas = 0;
		int cuentamayusculas = 0;
		for (int i = 0; i < contrasenna.length(); i++) {
			if (contrasenna.charAt(i) >= 97 && contrasenna.charAt(i) <= 122) {
				cuentaminusculas += 1;
			} else {
				if (contrasenna.charAt(i) >= 65 && contrasenna.charAt(i) <= 90) {
					cuentamayusculas += 1;
				} else {
					cuentanumeros += 1;
				}
			}
		}
		if (cuentanumeros >= 5 && cuentaminusculas >= 1 && cuentamayusculas >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public String generarPassword() {
		String password = "";
		for (int i = 0; i < longitud; i++) {
			int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				password += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					password += mayusculas;
				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					password += numeros;
				}
			}
		}
		return password;
	}
}
