package Clases;

import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean salida = false;

		// conexi�n al servidor
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
			Statement stmt = con.createStatement();

			// SI NO TEN�IS LA BASE DE DATOS CREADA, DESCOMENTAD ESTE TROZO DE C�DIGO
			// EJECUTAD EL ARCHIVO Y YA

			/*
			 * // System.out.println("�Conexi�n establecida!"); String sql =
			 * "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 * System.out.println("Base de datos creada con �xito.");
			 */
			// crear tabla usuarios
			// crearUsuarios(con, "centreciutat");

			do { // Hasta que la variable salida no tenga el valor true no se terminara el
					// programa
				System.out.println(" =======================================");
				System.out.println(" === Bienvenido al parking APP  v1.0 ===");
				System.out.println(" =======================================");
				System.out.println("");

				System.out.println("MENU:");
				System.out.println("");

				System.out.println("1.Login");
				System.out.println("2.Salir ");
				System.out.println("");

				System.out.print("�Que desea hacer?: ");

				int op = sc.nextInt();
				if (op == 2) {// Aqu� comparo el valor de usuario que ha dado si es true saldr� del programa,
								// si
								// nos pasara al else
					System.out.println("");
					System.out.println("");
					System.out.println(" ==================================");
					System.out.println(" == Saliendo al parking APP v1.0 ==");
					System.out.println(" ==================================");
					System.out.println("");
					System.out.println("Saliste Correctamente");
					salida = true;
					continue;

				} else {

					switch (op) {
					case 1:
						Scanner login = new Scanner(System.in);

						// usuario
						System.out.println("Usuario: ");
						String usuario = login.next();
						System.out.println("");
						// contrase�a
						System.out.println("Contrase�a: ");
						String contrase�a = login.next();
						System.out.println("");
						/*
						 * if() { //admin }else { //normal }
						 */
						break;
					default:
						System.out.println("");
						System.out.println("No has puesto ninguna opcion permitida");
					}
				}

			} while (salida != true);
		} catch (SQLException e) {

			printSQLException(e);
		}
	}

	private static void crearUsuarios(Connection connection, String BDNombre) throws SQLException {

		String createString = "create table " + BDNombre + ".usuarios" + "(user varchar(50) NOT NULL,"
				+ "password varchar(50) NOT NULL, PRIMARY KEY (user))";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("�Se ha creado la tabla usuarios correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexi�n
		}

	}

	private static void crearInquilinos(Connection connection, String BDNombre) throws SQLException {
		String createString = "create table " + BDNombre + ".inquilinos" + "(dni_inquilino varchar(10) NOT NULL,"
				+ "nombre varchar(25) NOT NULL, apellidos varchar(50), direccion varchar(25),"
				+ "cuenta_corriente varchar(50), matricula varchar(7), codigo_estacionamiento int, PRIMARY KEY (dni_inquilino)"
				+ ", FOREIGN_KEY )";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("�Se ha creado la tabla usuarios correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexi�n
		}
	}

	private static void printSQLException(SQLException ex) {

		ex.printStackTrace(System.err);

		System.err.println("SQLState: " + ex.getSQLState()); // getSQLState()
		System.err.println("Error Code: " + ex.getErrorCode()); // getErrorCode()
		System.err.println("Message: " + ex.getMessage()); // getMessage()

		Throwable t = ex.getCause(); // getCause() - Leemos la primera causa

		while (t != null) {
			System.out.println("Cause: " + t); // Imprimimos una causa
			t = t.getCause(); // Leemos otra causa
		}

	}
}