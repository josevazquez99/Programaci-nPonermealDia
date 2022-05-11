package relacion7Liga;

import java.util.Scanner;

public class MainEquipo {

	public static Scanner teclado = new Scanner(System.in);
	public static final int NUMEROPARTIDOS = 100;
	public static final int NUMEROEQUIPOS = 20;
	public static Partido[] partidos = new Partido [NUMEROPARTIDOS];
	public static int numeroPartidos=0;
	public static Equipo[] equipos = new Equipo [NUMEROEQUIPOS];
	public static int numeroEquipos=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {
			menu();
			opcion=leerInt("¿Que quieres hacer?");
			switch (opcion) {
			case 1:
				if (numeroEquipos<NUMEROEQUIPOS) {
					String nombreEquipo=leerString("Dame el nombre del equipo: ");
					String nombreCiudad=leerString("Dame el nombre de la ciudada: ");
					String nombreEstadio=leerString("Dame el nombre del estadio: ");
					
					Equipo eq= new Equipo(nombreEquipo, nombreCiudad, nombreEstadio);
					
					boolean encontrado= false;
					for (int i = 0; i < NUMEROEQUIPOS && !encontrado; i++) {
						if (eq.equals(equipos[i])) encontrado=true;
						
					}
					if (encontrado) System.out.println("El equipo ya existe.");
					else {
						equipos[numeroEquipos++] = eq;
					}
				}else System.out.println("Número máximo de equipos alcanzados.");
				
				break;
				
			case 2:
				String nombreEquipo=leerString("Dame el nombre del equipo que quieres cambiar: ");
				String nombreCiudad=leerString("Dame el nuevo nombre de la ciudad");
				
				boolean encontrado=false;
				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)) {
						equipos[i].setCiudad(nombreCiudad);
						encontrado=true;
					}
				}
				if(encontrado)System.out.println("Modificado con exito.");
				
				else System.out.println("El equipo no existe.");
				
				break;
				
			case 3:
				nombreEquipo=leerString("Dame el nombre del equipo que quieres cambiar: ");
				String estadio=leerString("Dame el nuevo estadio.");
				
				encontrado=false;
				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)) {
						equipos[i].setEstadio(estadio);
						encontrado=true;
					}
				}
				if(encontrado)System.out.println("Modificado con exito.");
				
				else System.out.println("El estadio no existe.");
				
				break;
				
			case 4:
				nombreEquipo = leerString("Dame el nombre del equipo que quieres ver: ");
				
				encontrado=false;
				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)) {
						System.out.println(equipos[i]);
						encontrado=true;
					}
					if (!encontrado) System.out.println("No existe el equipo.");
				}
				
				break;
				
			case 5:
				String local = leerString("Dame el nombre del equipo local: ");
				String visitante = leerString("Dame el nombre del equipo visitante: ");

				
				encontrado=false;
				
				Equipo e1=null,e2=null;
				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(e1==null && equipos[i].getNombre().equalsIgnoreCase(local))
						e1=equipos[i];
					
					else if(e2==null && equipos[i].getNombre().equalsIgnoreCase(visitante))
						e2=equipos[i];
					if(e1!=null && e2!=null) encontrado=true;
				}
				if(!encontrado) System.out.println("Los equipo introducidos no existen.");
				
				else if(numeroPartidos<NUMEROPARTIDOS) {
						int jornada = leerInt("Dame el numero de la jornada: ");
						Partido p=null;
						try {
							p= new Partido(jornada, e1, e2);
						} catch (PartidoException e) {
							// TODO Auto-generated catch block
							System.out.println("No ha sido posible crear el partido");
							e.printStackTrace();
						}
						encontrado=false;
					for (int i = 0; i < numeroPartidos && !encontrado; i++) {
						if(p.equals(partidos[i])) encontrado=true;
					}	
						if(!encontrado) 
						partidos[numeroPartidos++]=p;
					
						else System.out.println("Este partido ya existe");
					
					}else System.out.println("Número máximo de partidos jugados.");
					
				
				break;
				
				
			case 6:
				local = leerString("Dame el nombre del equipo local: ");
				visitante = leerString("Dame el nombre del equipo visitante: ");
				
				encontrado=false;
				e1=null;
				e2=null;

				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(e1==null || equipos[i].getNombre().equalsIgnoreCase(local))
						e1=equipos[i];
					
					else if(e2==null || equipos[i].getNombre().equalsIgnoreCase(visitante))
						e2=equipos[i];
					if(e1!=null && e2!=null) encontrado=true;
				}
				if(!encontrado) System.out.println("Los equipo introducidos no existen.");
				
						int orden=-1;
						int jornada = leerInt("Dame el numero de la jornada: ");
						Partido p=null;
						try {
							p= new Partido(jornada, e1, e2);
						} catch (PartidoException e) {
							// TODO Auto-generated catch block
							System.out.println("No ha sido posible crear el partido");
							e.printStackTrace();
						}
						encontrado=false;
					for (int i = 0; i < numeroPartidos && !encontrado; i++) {
						if(p.equals(partidos[i])) {
							encontrado=true;
							orden=i;
						}
					}	
						if(encontrado) {
							String resultado = leerString("Dame el resultado(X-X):");
							try {
								partidos[orden].ponerResultado(resultado);
							} catch (PartidoException e) {
								// TODO Auto-generated catch block
								System.out.println("No se ha podido poner el resultado");
								e.printStackTrace();
							}					
				}else System.out.println("Este partido no existe");
				
				break;
				
			case 7:
				orden=-1;
				local = leerString("Dame el nombre del equipo local: ");
				visitante = leerString("Dame el nombre del equipo visitante: ");
				
				encontrado=false;
				e1=null;
				e2=null;

				for (int i = 0; i < numeroEquipos && !encontrado; i++) {
					if(e1==null || equipos[i].getNombre().equalsIgnoreCase(local))
						e1=equipos[i];
					
					else if(e2==null || equipos[i].getNombre().equalsIgnoreCase(visitante))
						e2=equipos[i];
					if(e1!=null && e2!=null) encontrado=true;
				}
				if(!encontrado) System.out.println("Los equipo introducidos no existen.");
				
				jornada = leerInt("Dame el numero de la jornada: ");
					p=null;
				try {
					p= new Partido(jornada, e1, e2);
				} catch (PartidoException e) {
					// TODO Auto-generated catch block
					System.out.println("No ha sido posible crear el partido");
					e.printStackTrace();
				}
				encontrado=false;
			for (int i = 0; i < numeroPartidos && !encontrado; i++) {
				if(p.equals(partidos[i])) {
					encontrado=true;
					orden=i;
				}
			}System.out.println(partidos[orden]);	
				
				break;
				
			case 8:
				for (int i = 0; i < numeroPartidos; i++) {
					System.out.println(partidos[i]);
				}
				break;
				
			case 9:
				for (int i = 0; i < numeroEquipos; i++) {
					System.out.println(equipos[i]);
				}
				break;
			}
			
		}while (opcion!=10);
		
	}

	public static String leerString(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	public static int leerInt(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static boolean leerBoolean(String texto) {
		System.out.println(texto);
		return teclado.nextBoolean();
	}
	public static void menu() {
		System.out.println("1.- Dar de alta un equipo.\r\n"
				+ "2.- Modificar la ciudad del equipo.\r\n"
				+ "3.- Modificar el estadio de un equipo.\r\n"
				+ "4.- Imprimir el equipo.\r\n"
				+ "5.- Dar de alta un partido.\r\n"
				+ "6.- Poner el resultado de un partido.\r\n"
				+ "7.- Mostrar un partido.\r\n"
				+ "8.- Mostrar todos los partidos.\r\n"
				+ "9.- Mostrar todos los equipos.\r\n"
				+ "10.- Salir");
	}
}
