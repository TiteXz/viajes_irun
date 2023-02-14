package Menus;

import java.util.ArrayList;

import Clases.Clientes;
import Clases.Habitaciones;
import Clases.Hoteles;

public class Visor {

	public static void mostrarCliente(Clientes cliente) {
		System.out.println(cliente);
	}
	
	public static void mostrarClientes(ArrayList<Clientes>cliente) {
		System.out.println(cliente);
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitaciones> habi){
			for (Habitaciones habitaciones : habi) {
				System.out.println(habitaciones);
			}
	}
	
	public static void mostrarHoteles(ArrayList<Hoteles> hotel) {
		for ( Hoteles hoteles : hotel) {
			System.out.println(hoteles);
		}
	}
}
