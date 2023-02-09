package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Datos.FormularioDatos;
import Menus.Menuss;

public class GestionClientes {

	public static void run(Scanner sc) throws SQLException, ClassNotFoundException{
	GBDD gbd = new GBDD();
	int opcion_menu = 0;
	
	
	do {		
		Menuss.mostrarMenuClientes();
		opcion_menu = Integer.parseInt(sc.nextLine());
		switch (opcion_menu) {
		case Menuss.DAR_DE_ALTA:
			gbd.conectar();
			gbd.darDeAltaCliente(FormularioDatos.pedirDatosCliente(sc));
			gbd.cerrar();
			break;
		case Menuss.DAR_DE_BAJA:
			gbd.conectar();
			gbd.darDeBajaCliente(FormularioDatos.pedirDniCliente(sc));
			gbd.cerrar();
			break;
		case Menuss.INFORMACION:
			gbd.conectar();
			gbd.mostrarInfoCliente(FormularioDatos.pedirDniCliente(sc));
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
