package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;

public class GestionClientes {

	public static void run(Scanner sc) throws SQLException, ClassNotFoundException {
	int opcion_menu=0;
	GBDD gbd = new GBDD();
	
	do {		
		switch (opcion_menu) {
		case Menuss.DAR_DE_ALTA:
			gbd.conectar();
			gbd.darDeAltaCliente(FormularioDatos.pedirDatosCliente(sc));
			gbd.cerrar();
			break;
		case Menuss.DAR_DE_BAJA:
			System.out.println("segunda opcion seleccionada\n");
			break;
		case Menuss.INFORMACION:
			System.out.println("tercera opcion seleccionada\n");
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