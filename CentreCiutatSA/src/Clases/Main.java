package Clases;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean salida = false;

		// conexión al servidor
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
			Statement stmt = con.createStatement();

			// SI NO TENÉIS LA BASE DE DATOS CREADA, DESCOMENTAD ESTE TROZO DE CÓDIGO
			// EJECUTAD EL ARCHIVO Y YA

			/*
			 * // System.out.println("¡Conexión establecida!"); String sql =
			 * "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 * System.out.println("Base de datos creada con éxito.");
			 */

			// System.out.println("¡Conexión establecida!");
			/*
			 * String sql = "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 * System.out.println("Base de datos creada con éxito.");
			 */

			// crear tabla usuarios
			// crearUsuarios(con, "centreciutat");
			// crear tabla inquilinos
			//crearInquilinos(con, "centreciutat");

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

				System.out.print("¿Que desea hacer?: ");

				int op = sc.nextInt();
				if (op == 2) {// Aquí comparo el valor de usuario que ha dado si es true saldrá del programa,
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
						// contraseña
						System.out.println("Contraseña: ");
						String contraseña = login.next();
						System.out.println("");
						// el int i y la condicion son para que no de error
						int i = 0;
						if (i != 2) {// metodo verUser
							// admin
							int salir = 0;
							while (salir != 5) {
								Scanner Adm = new Scanner(System.in);

								System.out.println(" ======================================");
								System.out.println(" == Bienvenido Adm parking APP  v1.0 ==");
								System.out.println(" ======================================");
								System.out.println("");

								System.out.println("MENU:");
								System.out.println("");

								System.out.println("1) AÑADIR USUARIOS NUEVOS A ESTACIONAMIENTOS");
								System.out.println("2) EDITAR ALQUILERES");
								System.out.println("3) ELIMINAR ALQUILERES");
								System.out.println("4) LISTAR ALQUILERES");
								System.out.println("5) SALIR AL INICIO");
								System.out.println("");

								System.out.print("¿Que desea hacer?: ");
								int opAdm = Adm.nextInt();

								switch (opAdm) {
								case 1:
									Scanner admInsert = new Scanner(System.in);
									System.out.println(" ======================================");
									System.out.println(" == Bienvenido Adm parking APP  v1.0 ==");
									System.out.println(" ======================================");
									System.out.println("");

									System.out.println("Pon el nombre del Usuario: ");
									String UserN = admInsert.next();
									System.out.println("Pon el dni: ");
									String UserDni = admInsert.next();
									System.out.println("Pon el estacionamiento que quieras añadir con el usuario: ");
									String UserEst = admInsert.next();
									System.out.println("");
									// metodo

									break;

								case 2:

									break;

								case 3:

									break;
								case 4:

									break;
								case 5:
									System.out.println("");
									System.out.println("");
									System.out.println(" ===================================");
									System.out.println(" == Saliendo del menu Adm v.1 ==");
									System.out.println(" ===================================");
									System.out.println("");
									System.out.println("Saliste Correctamente");
									i = 2;
									break;
								default:
									System.out.println("");
									System.out.println("No has puesto ninguna opcion permitida");
								}
							}
						} else {
							// normal
						}
						break;

					default:
						System.out.println("");
						System.out.println("No has puesto ninguna opcion permitida");

						// admin

					}
				}
			} while (salida != true);

		} catch (

		SQLException e) {

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

			System.out.println("¡Se ha creado la tabla usuarios correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexión
		}

	}

	private static void crearInquilinos(Connection connection, String BDNombre) throws SQLException {
		String createString = "create table " + BDNombre + ".inquilinos" + "(dni_inquilino varchar(10) NOT NULL,"
				+ "nombre varchar(25) NOT NULL, apellidos varchar(50), direccion varchar(25),"
				+ " cuenta_corriente varchar(50), matricula varchar(7), codigo_estacionamiento int, user varchar(50),"
				+ " PRIMARY KEY (dni_inquilino),"
				+ " FOREIGN KEY (user) REFERENCES usuarios(user))";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("¡Se ha creado la tabla usuarios correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexión
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