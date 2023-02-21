package Gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import BaseConector.Conector;
import Clases.Clientes;
import Clases.Habitaciones;
import Clases.Hoteles;
import Clases.Reservas;

public class GBDD extends Conector{

	public void darDeAltaCliente(Clientes cliente){
		super.conectar();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?)");
			pst.setString(1, cliente.getDni());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellido());
			pst.setString(4, cliente.getDireccion());
			pst.setString(5, cliente.getLocalidad());
			
			pst.execute();
			super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void darDeBajaCliente(String dni) throws ClassNotFoundException, SQLException {
		super.conectar();
		PreparedStatement pst = con.prepareStatement("DELETE FROM clientes WHERE dni = ? ");
		pst.setString(1, dni);
		
		pst.execute();
		super.cerrar();
		
	}
	
	public Clientes mostrarInfoCliente(String dni) throws ClassNotFoundException, SQLException {
		super.conectar();
		Clientes cliente = new Clientes();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM clientes WHERE dni = ?");
		pst.setString(1, dni);
		ResultSet resultado = pst.executeQuery();
		
	 while(resultado.next()) {
		 System.out.println(("DNI: "+resultado.getString("dni"))+", NOMBRE: "+(resultado.getString("nombre"))+", APELLIDO: "+(resultado.getString("apellidos"))+", DIRECCION: "+(resultado.getString("direccion"))+", LOCALIDAD: "+(resultado.getString("localidad")));
 }
		
		
		
		pst.execute();
		super.cerrar();
		
		return cliente;
		
	}
	
	public void ainadirHabitacion(Habitaciones habi) {
		super.conectar();
		try {
		PreparedStatement pst = con.prepareStatement("INSERT INTO habitaciones VALUES (?,?,?,?,?)");
		pst.setInt(1, habi.getId());
		pst.setInt(2, habi.getId_hotel());
		pst.setString(3, habi.getNumero());
		pst.setString(4, habi.getDescripcion());
		pst.setDouble(5, habi.getPrecio());
		
		pst.execute();
		
		super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarHabitacion(int id) throws SQLException {
		super.conectar();
		try {
		PreparedStatement pst = con.prepareStatement("DELETE FROM habitaciones WHERE id = ? ");
		pst.setInt(1, id);
		
		pst.execute();
		super.cerrar();
		super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Habitaciones> mostrarHabitaciones() {
		super.conectar();
		ArrayList<Habitaciones> habitaciones = new ArrayList<Habitaciones>();
		try {
		
		PreparedStatement pst = con.prepareStatement("SELECT * FROM habitaciones");
		ResultSet resultado = pst.executeQuery();
		while(resultado.next()){
			Habitaciones habi = new Habitaciones();
			habi.setId(resultado.getInt("id"));
			habi.setId_hotel(resultado.getInt("id_hotel"));
			habi.setNumero(resultado.getString("numero"));
			habi.setDescripcion(resultado.getString("descripcion"));
			habi.setPrecio(resultado.getDouble("precio"));
		
		
			habitaciones.add(habi);
		}
		pst.execute();
		super.cerrar();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return habitaciones;
	}
	
	public void nuevoHotel(Hoteles hotel) {
		super.conectar();
		try {
		PreparedStatement pst = con.prepareStatement("INSERT INTO hoteles (cif,nombre,gerente,estrellas,compania) VALUES (?,?,?,?,?)");
		pst.setString(1, hotel.getCif());
		pst.setString(2, hotel.getNombre());
		pst.setString(3, hotel.getGerente());
		pst.setInt(4, hotel.getEstrellas());
		pst.setString(5, hotel.getCompania());
		
		pst.execute();
		
		super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarHotel(int id) throws SQLException {
		super.conectar();
		try {
		PreparedStatement pst = con.prepareStatement("DELETE FROM hoteles WHERE id = ? ");
		pst.setInt(1, id);
		
		pst.execute();
		super.cerrar();
		super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public ArrayList<Hoteles> mostrarHoteles() {
		super.conectar();
		ArrayList<Hoteles> hoteles = new ArrayList<Hoteles>();
		
		try {
		Hoteles hotel = new Hoteles();	
		PreparedStatement pst = con.prepareStatement("SELECT * FROM hoteles");
		ResultSet resultado = pst.executeQuery();
		while(resultado.next()){
			
			hotel.setId(resultado.getInt("id"));
			hotel.setCif(resultado.getString("Cif"));
			hotel.setNombre(resultado.getString("nombre"));
			hotel.setEstrellas(resultado.getInt("estrellas"));
			hotel.setCompania(resultado.getString("compania"));
			
			hoteles.add(hotel);
			
		}
		pst.execute();
		super.cerrar();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hoteles;
	}
	
	
	public void hacerReserva(Reservas reserva) {
		super.conectar();
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO reservas (id,id_habitacion,dni,desde,hasta) VALUES (?,?,?,?,?)");
			pst.setInt(1, reserva.getId());
			pst.setInt(2, reserva.getId_habitacion());
			pst.setString(3, reserva.getDni());
			pst.setDate(4, new Date (reserva.getDesde().getTime()));
			pst.setDate(5, new Date (reserva.getHasta().getTime()));
			
			pst.execute();
			
			super.cerrar();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
