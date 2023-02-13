package Datos;

import java.util.Scanner;

import Clases.Clientes;
import Clases.Habitaciones;

public class FormularioDatos {

	public static Clientes pedirDatosCliente(Scanner sc) {
		Clientes cliente = new Clientes();
		
		System.out.println("¿Cual es el dni del cliente?");
		cliente.setDni(sc.nextLine());
		System.out.println("¿Cual es el nombre del cliente?");
		cliente.setNombre(sc.nextLine());
		System.out.println("¿Cual es el apellido del cliente?");
		cliente.setApellido(sc.nextLine());
		System.out.println("¿Cual es la dirección del cliente?");
		cliente.setDireccion(sc.nextLine());
		System.out.println("¿Cual es la localidad del cliente?");
		cliente.setLocalidad(sc.nextLine());
		
		return cliente;
		
	}
	
	public static String pedirDniCliente(Scanner sc) {
		System.out.println("Cual es el dni del cliente?");
		String dni = sc.nextLine();
		
		return dni;
	}
	
	public static Habitaciones pedirDatosHabitacion(Scanner sc){
		Habitaciones habi = new Habitaciones();
		
		System.out.println("¿Cual es el id de la habitación?");
		habi.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("¿Cual es el id del hotel?");
		habi.setId_hotel(Integer.parseInt(sc.nextLine()));
		System.out.println("¿Cual es el numero de la habitación?");
		habi.setNumero(sc.nextLine());
		System.out.println("¿Cual es la descripción de la habitación?");
		habi.setDescripcion(sc.nextLine());
		System.out.println("¿Cual es el precio de la habitación?");
		habi.setPrecio(Double.parseDouble(sc.nextLine()));
		
		return habi;
		
	}
	
	public static int pedirIdHotel(Scanner sc) {
		System.out.println("Cual es el id del hotel?");
		int id = Integer.parseInt(sc.nextLine());
		
		return id;
	}
	
	public static int pedirIdHabitacion(Scanner sc) {
		System.out.println("Cual es el id de la habitacion?");
		int id = Integer.parseInt(sc.nextLine());
		
		return id;
	}
}
