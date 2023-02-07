package principal;

import java.sql.SQLException;
import java.text.ParseException;

import Gestores.GestorViajes;

public class Main {
	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
		GestorViajes gV = new GestorViajes();
		gV.run();
		//gb viene de GestorViajes
	}
}
