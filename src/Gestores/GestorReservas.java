package Gestores;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;

public class GestorReservas {

	
	public static void run(Scanner sc) throws ClassNotFoundException, SQLException, ParseException {
		int opcion_menu=0;
		GBDD gbd = new GBDD();
		
		do {	
			Menuss.mostrarMenuReservas();
			opcion_menu = Integer.parseInt(sc.nextLine());
			switch (opcion_menu) {
			case Menuss.RESERVAR:
				gbd.conectar();
				gbd.hacerReserva(FormularioDatos.pedirDatorReserva(sc));
				gbd.cerrar();
				break;
			case Menuss.CANCELAR_RESERVA:
				System.out.println("segunda opcion seleccionada\n");
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
