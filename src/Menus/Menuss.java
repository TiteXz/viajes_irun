package Menus;

public class Menuss {

	//declaracion de constantes (final) para las opciones
	
	final int GESTOR_CLIENTES = 1;
	final int GESTOR_HABITACIONES = 2;
	final int GESTOR_HOTELES = 3;
	final int GESTOR_RESERVAS = 4;
	
	final int DAR_DE_ALTA = 1;
	final int DAR_DE_BAJA = 2;
	final int INFORMACION = 3;
	
	final int RESERVAR = 1;
	final int CANCELAR_RESERVA = 2;
	
	final int NUEVO_HOTEL = 1;
	final int ELIMINAR_HOTEL = 2;
	
	final int NUEVA_HABITACION = 1;
	final int ELIMINAR_HABITACION = 2;
	
	final int SALIR = 0;

	
	public void mostrarMenuPrincipal() {
		System.out.println("------MENU-------");
		System.out.println(GESTOR_CLIENTES + ". Mostrar menu de clientes");
		System.out.println(GESTOR_HABITACIONES + ". Mostrar menu de habitaciones");
		System.out.println(GESTOR_HOTELES + ". Mostrar menu de hoteles");
		System.out.println(GESTOR_RESERVAS + ". Mostrar menu de reservas");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}	
	
	public void mostrarMenuClientes() {
		System.out.println("------MENU-------");
		System.out.println(DAR_DE_ALTA + ". Dar de alta un cliente");
		System.out.println(DAR_DE_BAJA + ". Dar de baja un cliente");
		System.out.println(INFORMACION + ". Mostrar información de un cliente");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}	
	
	public void mostrarMenuReservas() {
		System.out.println("------MENU-------");
		System.out.println(RESERVAR + ". Hacer una reserva");
		System.out.println(CANCELAR_RESERVA + ". Cancelar una reserva");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}	
	
	public void mostrarMenuHoteles() {
		System.out.println("------MENU-------");
		System.out.println(NUEVO_HOTEL + ". Añadir un nuevo hotel");
		System.out.println(ELIMINAR_HOTEL + ". Eliminar un hotel");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}	
	
	public void mostrarMenuHabitaciones() {
		System.out.println("------MENU-------");
		System.out.println(NUEVA_HABITACION + ". Añadir una habitación");
		System.out.println(ELIMINAR_HABITACION + ". Eliminar una habitación");
		System.out.println(SALIR + ". Salir");
		System.out.println("Elije una de las opciones");
	}	
	
}
