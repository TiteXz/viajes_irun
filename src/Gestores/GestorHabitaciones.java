package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;

public class GestorHabitaciones {

	public static void run(Scanner sc) throws SQLException {
		GBDD gbd = new GBDD();
		int opcion_menu=0;
		
		do {		
			Menuss.mostrarMenuHabitaciones();
			opcion_menu = Integer.parseInt(sc.nextLine());
			switch (opcion_menu) {
			case Menuss.NUEVA_HABITACION:
				gbd.conectar();
				gbd.ainadirHabitacion(FormularioDatos.pedirDatosHabitacion(sc));
				gbd.cerrar();
				break;
			case Menuss.ELIMINAR_HABITACION:
				gbd.conectar();
				gbd.eliminarHabitacion(FormularioDatos.pedirIdHabitacion(sc));
				gbd.cerrar();
				break;
			case Menuss.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
			
		} while (opcion_menu != Menuss.SALIR);
		sc.close();
	}
}
