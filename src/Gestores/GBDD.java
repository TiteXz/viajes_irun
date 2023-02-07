package Gestores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import BaseConector.Conector;
import Clases.Clientes;

public class GBDD extends Conector{

	public void darDeAltaCliente(Clientes cliente) throws ClassNotFoundException, SQLException {
		super.conectar();
		PreparedStatement pst = con.prepareStatement("INSERT INTO clientes VALUES (?,?,?,?,?)");
		pst.setString(1, cliente.getDni());
		pst.setString(2, cliente.getNombre());
		pst.setString(3, cliente.getApellido());
		pst.setString(4, cliente.getDireccion());
		pst.setString(5, cliente.getLocalidad());
		
		pst.execute();
		super.cerrar();
		
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
		PreparedStatement pst = con.prepareStatement("SELECT FROM clientes WHERE dni = ?");
		pst.setString(1, dni);
		ResultSet resultado = pst.executeQuery();
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellido(resultado.getString("apellido"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("localidad"));
		
		pst.execute();
		super.cerrar();
		
		return cliente;
		
	}
}
