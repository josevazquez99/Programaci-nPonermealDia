package Cafe;

import java.util.Scanner;

public class PrincipalCafe {

	public static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) throws CafeException {
		
		//Declaramos el objeto
		Cafe cafe1=new Cafe(20);

		char opcion;
		double cantidad=0;
		
		String menu=menu();
		System.out.println("Bienvenido a tu maquina de cafe de confianza");
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion=teclado.nextLine().charAt(0);
		
		while (opcion != 5) {
			switch (opcion) {
			case '1':{
				System.out.println("Introduce una cantidad");
				cantidad=Double.parseDouble(teclado.nextLine());
				System.out.println(cafe1.servirCafeSolo(cantidad));
			}
			break;
			case '2':{
				System.out.println("Introduce una cantidad");
				cantidad=Double.parseDouble(teclado.nextLine());
				System.out.println(cafe1.servirLecheSola(cantidad));
			}
			break;
			case '3':{
				System.out.println("Introduce una cantidad");
				cantidad=Double.parseDouble(teclado.nextLine());
				System.out.println(cafe1.servirCafeconLeche(cantidad));
			}
			break;
			case '4':{
				System.out.println(cafe1.toString());
			}
			break;
			case '5':{
				System.out.println("Apagar y salir");
			}
			break;
			default:
				throw new CafeException("Error");
			}
			System.out.println(menu());
			System.out.println("Elija una opcion");
			opcion=teclado.nextLine().charAt(0);
			}
		}
	
	

	

	private static String menu() {
		return "1-.Servir cafe solo (1 euro)\n"+"2-.Servir leche (0.8 euros)\n"+"3-.Servir cafe con leche (1.5 euros)\n"+
	"4-.Consultar estado de la maquina\n"+"5-.Apagar y salir";
	}
}
