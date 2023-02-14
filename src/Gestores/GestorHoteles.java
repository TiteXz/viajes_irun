package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;
import Menus.Visor;

public class GestorHoteles {

	public static void run(Scanner sc) throws SQLException {
		GBDD gbd = new GBDD();
		int opcion_menu=0;
		
		do {		
			Menuss.mostrarMenuHoteles();
			opcion_menu = Integer.parseInt(sc.nextLine());
			switch (opcion_menu) {
			case Menuss.NUEVO_HOTEL:
				gbd.conectar();
				gbd.nuevoHotel(FormularioDatos.pedirDatosHotel(sc));
				gbd.cerrar();
				break;
			case Menuss.ELIMINAR_HOTEL:
				gbd.conectar();
				gbd.eliminarHotel(FormularioDatos.pedirIdHotel(sc));
				gbd.cerrar();
				break;
			case Menuss.MOSTRAR_HABITACIONES:
				gbd.conectar();
				Visor.mostrarHoteles(gbd.mostrarHoteles());
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
