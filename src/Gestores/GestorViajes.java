package Gestores;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import Menus.Menuss;

public class GestorViajes {

	public static void run() throws ClassNotFoundException, SQLException, ParseException{
		Scanner scan = new Scanner(System.in);
		int opcion_menu;

			Menuss.mostrarMenuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case Menuss.GESTOR_CLIENTES:
				GestionClientes.run(scan);
				break;
			case Menuss.GESTOR_RESERVAS:
				GestorReservas.run(scan);
				break;
			case Menuss.GESTOR_HABITACIONES:
				GestorHabitaciones.run(scan);;
				break;
			case Menuss.GESTOR_HOTELES:
				GestorHoteles.run(scan);
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
