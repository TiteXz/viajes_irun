package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Menus.Menuss;

public class GestorViajes {

	public static void run() throws ClassNotFoundException, SQLException{
		Scanner scan = new Scanner(System.in);
		int opcion_menu;

			Menuss.mostrarMenuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menuss.GESTOR_CLIENTES:
				GestionClientes.run(scan);
				break;
			case Menuss.GESTOR_RESERVAS:
				System.out.println("segunda opcion seleccionada\n");
				break;
			case Menuss.GESTOR_HABITACIONES:
				System.out.println("tercera opcion seleccionada\n");
				break;
			case Menuss.GESTOR_HOTELES:
				System.out.println("ADIOS");
				break;
			case Menuss.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		scan.close();
		
		
	}
}
