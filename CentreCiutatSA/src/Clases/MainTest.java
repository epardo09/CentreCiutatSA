package Clases;
import Clases.Main;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;


public class MainTest {
	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	 public void testModificaAlquiler() throws SQLException{
	
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		Statement stmt = null;
		String dni="43115892H";
		String estacionamiento="1A27";
		String dniBDD = "43115892H";
		String codEstBDD = "1A27";
		String codEstBDD2 = "1A26";
		String query = "select * from centreciutat.estacionamiento where codigo_estacionamiento = " + "'"
				+ estacionamiento + "'";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				codEstBDD = rs.getString(1);

				dniBDD = rs.getString(5);

			}
			if (dniBDD == null) {
				String busca = "select * from centreciutat.estacionamiento where dni_inquilino = " + "'" + dni
						+ "'";

				ResultSet rs2 = stmt.executeQuery(busca);
				while (rs2.next()) {

					codEstBDD2 = rs2.getString(1);

					dniBDD = rs2.getString(5);

				}
				String eliminarfila = "UPDATE centreciutat.estacionamiento set dni_inquilino = null where codigo_estacionamiento = '" + codEstBDD2
						+ "'";
				stmt.executeUpdate(eliminarfila);
				String cambiarAlquilado = "UPDATE centreciutat.estacionamiento set alquilado = 'n' where codigo_estacionamiento = '" + codEstBDD2 + "'";
				stmt.executeUpdate(cambiarAlquilado);
				String cambiarDni = "UPDATE centreciutat.estacionamiento set dni_inquilino = '" + dni
						+ "' where codigo_estacionamiento = '" + codEstBDD + "'";
				stmt.executeUpdate(cambiarDni);
				String cambiarAlquilado2 = "UPDATE centreciutat.estacionamiento set alquilado = 's' where codigo_estacionamiento = '" + codEstBDD + "'";
				stmt.executeUpdate(cambiarAlquilado2);
				String cambiarCodEstInquilino = "UPDATE centreciutat.inquilinos set codigo_estacionamiento = '" + estacionamiento + "' where dni_inquilino = '" + dni + "'";
				stmt.executeUpdate(cambiarCodEstInquilino);

			} else {
				System.out.println("El estacionamiento está ocupado por otro usuario.");
			}


		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}
		Assert.assertEquals(codEstBDD,codEstBDD2);
	}
	 public void testEliminarAlquileress() throws SQLException{
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		 
		 String CodEst="1A27";
		 String dni="43365874I";
		String eliminarfila = "UPDATE centreciutat.estacionamiento set dni_inquilino = null where codigo_estacionamiento = '" + CodEst + "'";
		String cambiarAlquilado = "UPDATE centreciutat.estacionamiento set alquilado = 'n' where codigo_estacionamiento = '" + CodEst + "'";
		String cambiarInquilino = "UPDATE centreciutat.inquilinos set codigo_estacionamiento = null where dni_inquilino = '" + dni + "'";
		Statement stmt = null;

		try {

			stmt = con.createStatement();
			// poner los valores para que se cambie y la tabla
			stmt.executeUpdate(eliminarfila);
			stmt.executeUpdate(cambiarAlquilado);
			stmt.executeUpdate(cambiarInquilino);

			

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}
		Assert.assertNull(dni);
	}
	@Test
    public void testListadoAlquileres() throws SQLException{
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");

		Statement stmt = null;
		String query = "select * " + " from centreciutat.inquilinos";

		String dni_inquilino="43365874I";
		
		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

		

			while (rs.next()) {// lo que saldra por pantalla

				

				 dni_inquilino = rs.getString(1);

				String matricula_vehiculo = rs.getString(6);

				String codigo_estacionamiento = rs.getString(7);

				
			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}
		Assert.assertNotNull(dni_inquilino);
	}
	@Test
    public void testInsertarUsuariosEstacionamientos() throws SQLException{
   
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		
		String esta="1A25";
		String dni="43115892H";
		String esta2="1A28";
		
		String cambiarAlquilado = "UPDATE centreciutat.estacionamiento set alquilado = 's' where codigo_estacionamiento = '" + esta + "'";
		String añadirDni = "UPDATE centreciutat.estacionamiento set dni_inquilino = '" + dni
				+ "' where codigo_estacionamiento = '" + esta + "'";
		String añadirEstacionamientoInquilino = "UPDATE centreciutat.inquilinos set codigo_estacionamiento = '"
				+ esta2 + "' where dni_inquilino = '" + dni + "'";
		
		Statement stmt = null;

		try {

			stmt = con.createStatement();
			// poner los valores para que se cambie y la tabla

			stmt.executeUpdate(cambiarAlquilado);
			stmt.executeUpdate(añadirDni);
			stmt.executeUpdate(añadirEstacionamientoInquilino);

			// mensaje para que sepa que a ido todo bien
			
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}
		Assert.assertFalse(esta2.equals(esta));// si no son iguales nos dara true
	}
	@Test
    public void testbusquedaUsuarios() throws SQLException
    {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		Statement stmt = null;
		String dni ="43223300K";
		String query = "select * " + " from centreciutat.inquilinos WHERE dni_inquilino = '" + dni + "'";
		String matricula="SAG7512";
		String matricula_vehiculo="";
		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			
			
			
			while (rs.next()) {// lo que saldra por pantalla

				
				String nombre = rs.getString(2);
				

				String dni_inquilino = rs.getString(1);
				

				 matricula_vehiculo = rs.getString(6);
				

				String codigo_estacionamiento = rs.getString(7);
				

				

			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

		Assert.assertTrue(matricula.equals(matricula_vehiculo)); // si es igual nos dara true
    }
	
	@Test
    public void testBusquedaVehiculos() throws SQLException
    {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		Statement stmt = con.createStatement();
		
		String matricula="BCD1234";
		String c="Azul";
	
		String query = "select * " + " from centreciutat.vehiculos WHERE matricula_vehiculo = '" + matricula + "'";
		String color = "";
		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// listados
			

			while (rs.next()) {// lo que saldra por pantalla

				String matricula_vehiculo = rs.getString(1);
				

				String marca = rs.getString(3);
				

				String modelo = rs.getString(2);
				

				 color = rs.getString(4);
				

				String tipoVehiculo = rs.getString(5);
				

		
			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

		//hace una comparacion si los colores son iguales
		assertEquals(color, c);
		
    }

	@Test
    public void testInicioSesion() throws SQLException
    {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		Statement stmt = con.createStatement();
		
		
       int pass =1998;
       String user="Eric";
       
		String tipoUser = "";
		String query = "select user, password, admin from centreciutat.usuarios where user = '" + user
				+ "' and password = '" + pass + "'";
		// hacemos otro select para guardar el valor del user y la contraseña para tener
		// si es admin o no
		String passBDD = "";
		String userBDD = "";
		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				userBDD = rs.getString(1);
				// System.out.println("Usuario: " + userBase);

				passBDD = rs.getString(2);
				// System.out.println("Contraseña: " + passBase);

				

			}
			
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}
		//compara si los usuarios tienen el mismo nombre
		assertEquals(userBDD, user);
    }

	private void printSQLException(SQLException e) {
		e.printStackTrace(System.err);

		System.err.println("SQLState: " + e.getSQLState()); // getSQLState()
		System.err.println("Error Code: " + e.getErrorCode()); // getErrorCode()
		System.err.println("Message: " + e.getMessage()); // getMessage()

		Throwable t = e.getCause(); // getCause() - Leemos la primera causa

		while (t != null) {
			System.out.println("Cause: " + t); // Imprimimos una causa
			t = t.getCause(); // Leemos otra causa
		
	}
	
	}}

