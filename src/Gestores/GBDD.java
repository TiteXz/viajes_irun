package Gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BaseConector.Conector;
import Clases.Clientes;
import Clases.Habitaciones;

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
	
	public void mostrarHabitaciones(int id) {
		super.conectar();
		try {
		Habitaciones habi = new Habitaciones();
		PreparedStatement pst = con.prepareStatement("SELECT FROM habitaciones WHERE id_hotel = ? ");
		pst.setInt(1, id);
		ResultSet resultado = pst.executeQuery();
		habi.setId(resultado.getInt(id));
		habi.setId_hotel(resultado.getInt("id_hotel"));
		habi.setNumero(resultado.getString("numero"));
		habi.setDescripcion(resultado.getString("descripcion"));
		habi.setPrecio(resultado.getDouble("precio"));
		
		pst.execute();
		super.cerrar();
		super.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void hacerReserva(String id) throws ClassNotFoundException, SQLException {
		super.conectar();
		
		
		super.cerrar();
		
	}
}
