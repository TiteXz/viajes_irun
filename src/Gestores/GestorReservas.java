package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;

public class GestorReservas {

	
	public static void run(Scanner sc) throws ClassNotFoundException, SQLException {
		int opcion_menu=0;
		GBDD gbd = new GBDD();
		
		do {		
			switch (opcion_menu) {
			case Menuss.RESERVAR:
				gbd.conectar();
				//gbd.r(FormularioDatos.pedirDatosCliente(sc));
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
