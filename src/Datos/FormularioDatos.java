package Datos;

import java.util.Scanner;

import Clases.Clientes;

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
		System.out.println("Cual es el dni del cliente");
		String dni = sc.nextLine();
		
		return dni;
	}
}
