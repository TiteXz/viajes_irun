import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import BaseConector.Conector;
import Clases.Reservas;
import Gestores.GBDD;


public class Main2 extends Conector{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	}

	
	public void PedirNombreHotelYvisuHabitas(Scanner sc){
		String nombreHotel;
		PreparedStatement pst;
		
		System.out.println("Cual es el nombre del hotel?");
		nombreHotel = sc.nextLine();
		
		GBDD gbd = new GBDD();
		gbd.conectar();
		Hotel hotel = gbd.getHotel(nombreHotel);
		
		ArrayList<Habitaciones> habitaciones = gbd.getHabitaciones(hotel);
		
		for (Hotel hotel : habitaciones) {
			System.out.println(habitaciones);
		}
		
		gbd.cerrar();
	}
	
}
