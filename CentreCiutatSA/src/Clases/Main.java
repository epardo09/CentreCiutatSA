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

			// la base de datos esta creada entera
			// SI NO TENÉIS LA BASE DE DATOS CREADA, DESCOMENTAD ESTE TROZO DE CÓDIGO
			// EJECUTAD EL ARCHIVO Y YA

			/*
			 * // System.out.println("¡Conexión establecida!"); String sql =
			 * "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 * System.out.println("Base de datos creada con éxito.");
			 */

			// System.out.println("¡Conexión establecida!");
			
			 // String sql = "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 // System.out.println("Base de datos creada con éxito.");
			 

			// crear tabla usuarios
			// crearUsuarios(con, "centreciutat");
			// crear estacionamiento
			// crearEstacionamientos(con, "centreciutat");

			// crear tabla inquilinos
			// crearInquilinos(con, "centreciutat");
			// crear vehiculos
			 //crearVehiculos(con, "centreciutat");

			do { // Hasta que la variable salida no tenga el valor true no se terminara el
					// programa
				System.out.println("");
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

								System.out.println("");
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

									System.out.println("");
									System.out.println(" ===============================================");
									System.out.println(" == AÑADIR USUARIOS NUEVOS A ESTACIONAMIENTOS ==");
									System.out.println(" ===============================================");
									System.out.println("");

									System.out.println("Pon el nombre del Usuario: ");
									String UserN = admInsert.next();
									System.out.println("Pon el dni: ");
									String UserDni = admInsert.next();
									System.out.println("Pon el estacionamiento que quieras añadir al usuario: ");
									String UserEst = admInsert.next();
									System.out.println("");
									
									// metodo
									insertarUsuariosEstacionamiento(con, "centreciutat", UserN, UserDni, UserEst);
											break;

								case 2:
									// scanner
									Scanner admEdit = new Scanner(System.in);
									// cabezal
									System.out.println("");
									System.out.println(" =======================");
									System.out.println(" == EDITAR ALQUILERES ==");
									System.out.println(" =======================");
									System.out.println("");
									// pregunta con scaner
									System.out.println("Pon el nombre del Usuario: ");
									String editUser = admEdit.next();
									System.out.println("Pon el dni: ");
									String editDni = admEdit.next();
									System.out.println("Pon el estacionamiento que quieras editar al usuario: ");
									String editEst = admEdit.next();
									
									// llamada del metodo
									modificaAlquiler(con, "centreciutat", editUser, editDni,editEst);
									break;

								case 3:
									// scanner
									Scanner admEli = new Scanner(System.in);

									// cabezal
									System.out.println("");
									System.out.println(" =========================");
									System.out.println(" == ELIMINAR ALQUILERES ==");
									System.out.println(" =========================");
									System.out.println("");

									// pregunta con scaner
									System.out.println("Pon el nombre del Usuario: ");
									String eliUser = admEli.next();
									System.out.println("Pon el Dni del Usuario: ");
									String elidni = admEli.next();
									System.out.println("Pon el estacionamiento que quieras eliminar al usuario: ");
									String eliEst = admEli.next();
									
									// llamada del metodo
									eliminarAlquileres(con, "centreciutat", elidni, eliEst, eliUser);
									break;
								case 4:
									Scanner admlistar = new Scanner(System.in);
									// cabezal
									System.out.println("");
									System.out.println(" =======================");
									System.out.println(" == LISTAR ALQUILERES ==");
									System.out.println(" =======================");
									System.out.println("");

									// llamada del metodo
									listadoAlquileres(con, "centreciutat");
									break;
								case 5:

									System.out.println("");
									System.out.println(" ===============================");
									System.out.println(" == Saliendo del menu Adm v.1 ==");
									System.out.println(" ===============================");
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
							Scanner Norm = new Scanner(System.in);
							int normal = Norm.nextInt();
							switch (normal) {
							case 1:
								Scanner buscar = new Scanner(System.in);

								System.out.println("");
								System.out.println(" ===============================================");
								System.out.println(" == BUSCAR USUARIOS ==");
								System.out.println(" ===============================================");
								System.out.println("");

								System.out.println("Pon el dni del Usuario que quieres buscar: ");
								String UserDNI = buscar.next();
								System.out.println("");

								// llamada del metodo BuscarUSUARIO
								break;

							case 2:
								// scanner
								Scanner matr = new Scanner(System.in);
								// cabezal
								System.out.println("");
								System.out.println(" =======================");
								System.out.println(" == BUSCAR VEHICULOS ==");
								System.out.println(" =======================");
								System.out.println("");
								// pregunta con scaner
								System.out.println("Pon el matricula del vehiculo: ");
								String BuscarMatr = matr.next();

								// llamada del metodo BuscarVEHICULO
								break;

							case 3:

								System.out.println("");
								System.out.println(" ===============================");
								System.out.println(" == Saliendo del menu normal v.1 ==");
								System.out.println(" ===============================");
								System.out.println("");
								System.out.println("Saliste Correctamente");
								i = 2;
								break;
							default:
								System.out.println("");
								System.out.println("No has puesto ninguna opcion permitida");
							}
						}
						break;
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
				+ " cuenta_corriente varchar(50), matricula_vehiculo varchar(7), codigo_estacionamiento int, user varchar(50),"
				+ " PRIMARY KEY (dni_inquilino),"
				+ " FOREIGN KEY (user) REFERENCES usuarios(user), FOREIGN KEY (matricula_vehiculo) REFERENCES vehiculos(matricula_vehiculo))";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("¡Se ha creado la tabla inquilinos correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexión
		}
	}

	private static void crearEstacionamientos(Connection connection, String BDNombre) throws SQLException {
		String createString = "create table " + BDNombre + ".estacionamiento"
				+ "(codigo_estacionamiento int NOT NULL, alquilado varchar(1),"
				+ " m2 int, precio_mensual decimal, dni_inquilino varchar(10),"
				+ " PRIMARY KEY (codigo_estacionamiento),"
				+ " FOREIGN KEY (dni_inquilino) REFERENCES inquilinos(dni_inquilino))";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("¡Se ha creado la tabla estacionamientos correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexión
		}
	}

	private static void crearVehiculos(Connection connection, String BDNombre) throws SQLException {
		String createString = "create table " + BDNombre + ".vehiculos"
				+ "(matricula_vehiculo varchar(7) NOT NULL, modelo varchar(20),"
				+ " marca varchar(25), color varchar(25)," + " tipoVehiculo varchar(25), dni_inquilino varchar(10),"
				+ " PRIMARY KEY (matricula_vehiculo),"
				+ " FOREIGN KEY (dni_inquilino) REFERENCES inquilinos(dni_inquilino))";

		Statement stmt = null;

		try {

			stmt = connection.createStatement(); // Creamos un Statement
			stmt.executeUpdate(createString); // Ejecutamos la consulta

			System.out.println("¡Se ha creado la tabla vehiculos correctamente!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); // Cerramos la conexión
		}
	}
	
	// insertar cosas
	
	
	
//metodo insertar usuarios al estacionamiento
	private static void insertarUsuariosEstacionamiento(Connection con, String BDNombre, String usuario, String Dni,
			String estacionamiento)

			throws SQLException {

		Statement stmt = null;
		
		try {

			stmt = con.createStatement();

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".centreciutat" );

			// Nos posicionamos con el cursor en la próxima fila vacía de la tabla

			rs.moveToInsertRow();

			// Actualizamos los campos con los datos pasados por parámetro en la llamada al
			

			rs.updateString("Usuario", usuario);

			rs.updateString("Dni", Dni);

			rs.updateString("Estacionamiento", estacionamiento);


			// Insertamos la nueva fila con los datos proporcionados

			rs.insertRow();

			// Nos posicionamos con el cursor antes de la primera fila

			rs.beforeFirst();

			System.out.println("");

			System.out.println("Insertado correctamente el nuevo " +usuario+ " al nuevo "+ estacionamiento);

		} catch (SQLException e) {

			printSQLException(e);

		} finally {

			stmt.close();

		}

	}
	// Modificar la BBDD 
	private static void modificaAlquiler(Connection con, String BDNombre,String usuario, String dni,String estacionamiento) throws SQLException {

		Statement stmt = null;

		try {
			//modificaAlquiler(con, "centreciutat", editUser, editDni,editEst);
			stmt = con.createStatement();
			stmt.executeUpdate("UPDATE " + BDNombre + ".estacionamiento SET codigo_estacionamiento = "+"'"+ estacionamiento +"'"+ " where dni_inquilino = "+dni);

			System.out.println("");
			System.out.println("Se ha modificado el estacionamiento: "+estacionamiento+" del usuario: "+usuario);

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}
	private static void eliminarAlquileres(Connection con, String BDNombre, String dni, String CodEst,String usuario) throws SQLException {

		 
		String eliminarfila= "DELETE FROM "+ BDNombre+ ".estacionamiento "+ "WHERE  numeroInterno= "+dni;
		
		Statement stmt = null;
		stmt.executeUpdate("UPDATE + BDNombre .estacionamiento set alquilado = 'N' where codigo_estacionamiento = CodEst");
		try {

			stmt = con.createStatement();
			// poner los valores para que se cambie y la tabla
			stmt.executeUpdate(eliminarfila);

			// mensaje para que sepa que a ido todo bien
			System.out.println("");
			System.out.println("se a eliminado correctamente el alquiler del usuario:  "+usuario+ " de la tabla ordenadores");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}
	private static void listadoAlquileres(Connection con, String BDNombre) throws SQLException {

		Statement stmt = null;
		String query = "select * " + " from " + BDNombre + ".inquilino";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			//listados
			System.out.println("");
			System.out.println("**** Lista de Alquileres ****");

			while (rs.next()) {

				System.out.println("");
				System.out.println("*************************************");

				int dni_inquilino = rs.getInt(1);
				System.out.println("Dni inquilino: " + dni_inquilino);
				
				String matricula_vehiculo = rs.getString(2);
				System.out.println("Matricula vehiculo: " + matricula_vehiculo);
				
				String codigo_estacionamiento = rs.getString(3);
				System.out.println("Codigo estacionamiento: " + codigo_estacionamiento);
				
				System.out.println("*************************************");
				
			
				 
			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
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