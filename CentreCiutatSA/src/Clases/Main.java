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

//			  System.out.println("¡Conexión establecida!");

			// CREAR BDD

			// String sql = "CREATE DATABASE CentreCiutat";
			// stmt.executeUpdate(sql);
			// System.out.println("Base de datos creada con éxito.");
//			
//
//			crear tabla usuarios
			// crearUsuarios(con, "centreciutat");
//			// crear estacionamiento
			// crearEstacionamientos(con, "centreciutat");
//			
//			// crear tabla inquilinos
			// crearInquilinos(con, "centreciutat");
//			// crear vehiculos
			// crearVehiculos(con, "centreciutat");

			// insertar usuarios

			// insertarUsuario(con, "centreciutat", "Carlos","2001", "s");
			// insertarUsuario(con, "centreciutat", "Eric","1998", "s");
			// insertarUsuario(con, "centreciutat", "David","1999", "s");
			// insertarUsuario(con, "centreciutat", "Bryan","1998", "n");
			// insertarUsuario(con, "centreciutat", "Bo","1995", "n");
			// insertarUsuario(con, "centreciutat", "Andrea","1993", "n");
			// insertarUsuario(con, "centreciutat", "Laura","1990", "n");
			// insertarUsuario(con, "centreciutat", "Cinzia","1986", "n");
			// insertarUsuario(con, "centreciutat", "Bernat","2002", "n");
			// insertarUsuario(con, "centreciutat", "Jose","1982", "s");

			// insertar inquilinos

			// insertarInquilino(con, "centreciutat", "43115892H","Carlos", "Medina","Calle
			// falsa 123", "ES6621000418401234567891","BCD1234", "1A25","Carlos");
			// insertarInquilino(con, "centreciutat", "43365874I","Eric", "Pardo","Calle
			// erronea 404", "ES6000491500051234567892","JSA1684", "1A27 ","Eric");
			// insertarInquilino(con, "centreciutat", "43223300K","David",
			// "Quesada","Avenida incorrecta 7B", "ES9420805801101234567891","SAG7512",
			// "1A30","David");

			// insertarInquilino(con, "centreciutat", "43845474K", "Bryan", "Tenorio",
			// "Avenida del master 190", "ES6000491500051234561478", "PHP8000", null,
			// "Bryan");
			// insertarInquilino(con, "centreciutat", "43845474K", "Bo", "Cuellar", "Calle
			// Churreria 42", "ES6000491500051234566325", "GPS2510", null, "Bo");
			// insertarInquilino(con, "centreciutat", "43845474K", "Andrea", "Pousada",
			// "Calle Python 39", "ES6000491500051234567894", "SUG3333", null, "Andrea");
			// insertarInquilino(con, "centreciutat", "43845474K", "Laura", "Montenegro",
			// "Calle quetuquieras 123", "ES6000491500051234567458", "ASD5476", null,
			// "Laura");
			// insertarInquilino(con, "centreciutat", "43845474K", "Cinzia", "Pikachu",
			// "Calle macarroni 4 B", "ES6000491500051234560000", "ITL5555", null,
			// "Cinzia");
			// insertarInquilino(con, "centreciutat", "43845474K", "Bernat", "Coll", "Calle
			// Melilla 123 ", "ES6000491500051234560123", "MRC6987", null, "Bernat");
			// insertarInquilino(con, "centreciutat", "v", "Jose", "Galvez",
			// "Avenida Java 8", "ES6000491500051234569870", "ROB2671", null, "Jose");

			// insertar Estacionamientos
			// insertarEstacionamiento(con, "centreciutat", "1A25","s", 5,100, "43115892H");
			// insertarEstacionamiento(con, "centreciutat", "1A27","s", 6,124.99,
			// "43365874I");
			// insertarEstacionamiento(con, "centreciutat", "1A30","s", 4,87, "43223300K");
			// insertarEstacionamiento(con, "centreciutat", "1A20","n", 4,87, null);
			// insertarEstacionamiento(con, "centreciutat", "1A21","n", 5,100, null);
			// insertarEstacionamiento(con, "centreciutat", "1A22","n", 4,87, null);
			// insertarEstacionamiento(con, "centreciutat", "1A23","n", 4,87, null);
			// insertarEstacionamiento(con, "centreciutat", "1A24","n", 6,124.99, null);
			// insertarEstacionamiento(con, "centreciutat", "1A26","n", 5,100, null);
			// insertarEstacionamiento(con, "centreciutat", "1A28","n", 6,124.99, null);
			// insertarEstacionamiento(con, "centreciutat", "1A29","n", 4,87, null);

			// insertar vehiculos
			// insertarVehiculo(con, "centreciutat", "BCD1234", "Ibiza", "Seat", "Azul",
			// "Turismo", "43115892H");
			// insertarVehiculo(con, "centreciutat", "JSA1684", "Clio", "Renault", "Blanco",
			// "Turismo", "43365874I");
			// insertarVehiculo(con, "centreciutat", "SAG7512", "SQ2", "Audi", "Rojo",
			// "TodoTerreno", "43223300K");

			// bucle
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

				switch (op) {
				case 1:
					Scanner login = new Scanner(System.in);

					// usuario
					System.out.println("Usuario: ");
					String user = login.next();
					System.out.println("");
					// contraseña
					System.out.println("Contraseña: ");
					String pass = login.next();
					System.out.println("");
					inicioSesion(con, "centreciutat", user, pass);

					// el int i y la condicion son para que no de error

					String tipoUser = "";
					String query = "select user, password, admin from centreciutat.usuarios where user = '" + user
							+ "' and password = '" + pass + "'";
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

							tipoUser = rs.getString(3);
							// System.out.println("Tipo: " + tipoUser);

						}
					} catch (SQLException e) {
						printSQLException(e);
					} finally {
						stmt.close();
					}

					// admin
					if (userBDD.equals(user) && passBDD.equals(pass)) {
						System.out.println("Sesión iniciada.");
						if (tipoUser.equals("s")) {
							System.out.println("Eres administrador, menu admin.");
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

								switch (opAdm) {// TODO SWICTH ADMIN
								case 1:// TODO AÑADIR NUEVOS ESTACIONAMIENTOS ADMIN
									Scanner admInsert = new Scanner(System.in);

									System.out.println("");
									System.out.println(" ===============================================");
									System.out.println(" == AÑADIR USUARIOS NUEVOS A ESTACIONAMIENTOS ==");
									System.out.println(" ===============================================");
									System.out.println("");
									System.out.println("¿El usuario ha sido inquilino anteriormente?");
									System.out.println("s/n");
									char res = admInsert.next().charAt(0);
									if (res == 's') {
										System.out.println("Pon el nombre del Usuario: ");
										String UserN = admInsert.next();
										System.out.println("Pon el dni: ");
										String UserDni = admInsert.next();
										System.out.println("Pon el estacionamiento que quieras añadir al usuario: ");
										String UserEst = admInsert.next();
										System.out.println("");
										insertarUsuariosEstacionamientos(con, "centreciutat", UserN, UserDni, UserEst);
									} else if (res == 'n') {
										Scanner nuevo = new Scanner(System.in);
										System.out.println("Pon el nombre del Usuario: ");
										String UserN = nuevo.nextLine();
										System.out.println("Pon el dni: ");
										String UserDni = nuevo.nextLine();
										System.out.println("Pon el nombre: ");
										String UserNombre = nuevo.nextLine();
										System.out.println("Pon el apellido: ");
										String UserApellido = nuevo.nextLine();
										System.out.println("Pon la direccion: ");
										String UserDir = nuevo.nextLine();
										System.out.println("Pon la cuenta corriente: ");
										String UserCC = nuevo.nextLine();
										System.out.println("Pon la matricula del vehiculo: ");
										String UserMatVe = nuevo.nextLine();
										System.out.println("Pon el estacionamiento que quieras añadir al usuario: ");
										String UserEst = nuevo.nextLine();

										System.out.println("");
										insertarInquilino(con, "centreciutat", UserDni, UserNombre, UserApellido,
												UserDir, UserCC, UserMatVe, UserEst, UserN);
										insertarUsuariosEstacionamientos(con, "centreciutat", UserN, UserDni, UserEst);
									} else {
										System.out.println("Respuesta incorrecta.");
									}

									// metodo

									break;

								case 2:// TODO EDITAR ALQUILER ADMIN
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
									System.out.println("Pon el estacionamiento nuevo: ");
									String editEst = admEdit.next();

									// llamada del metodo
									modificaAlquiler(con, "centreciutat", editUser, editDni, editEst);

									// llamada del metodo

									break;

								case 3:// TODO ELIMINAR ALQUILER ADMIN
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

									// llamada del metodo

									break;
								case 4:// TODO LISTAR ALQUILER ADMIN

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
								case 5:// TODO CERRAR SESION ADMIN

									System.out.println("");
									System.out.println(" ============================");
									System.out.println(" == Cerrar sesion  Adm v.1 ==");
									System.out.println(" ============================");
									System.out.println("");
									salir = 5;
									break;

								default:
									System.out.println("");
									System.out.println("No has puesto ninguna opcion permitida");
								}// switch admin cierre
							} // while admin cierre
						} else if (tipoUser.equals("n")) {
							System.out.println("No eres administrador, menu normal.");
							int salir = 0;
							while (salir != 3) {// TODO while user
								Scanner userMenu = new Scanner(System.in);

								System.out.println("");
								System.out.println(" ==========================================");
								System.out.println(" == Bienvenido Usuario parking APP  v1.0 ==");
								System.out.println(" ==========================================");
								System.out.println("");

								System.out.println("MENU:");
								System.out.println("");

								System.out.println("1) BUSCAR USUARIOS");
								System.out.println("2) BUSCAR VEHICULOS");
								System.out.println("3) SALIR AL INICIO");
								System.out.println("");

								System.out.print("¿Que desea hacer?: ");
								int opUser = userMenu.nextInt();
								switch (opUser) {
								case 1:// TODO buscar usuarios user
									Scanner buscar = new Scanner(System.in);

									System.out.println("");
									System.out.println(" =====================");
									System.out.println(" == BUSCAR USUARIOS ==");
									System.out.println(" =====================");
									System.out.println("");

									System.out.println("Pon el dni del Usuario que quieres buscar: ");
									String UserDNI = buscar.next();
									System.out.println("");

									// llamada del metodo BuscarUSUARIO
									busquedaUsuarios(con, "centreciutat", UserDNI);
									break;

								case 2:// TODO buscar vehiculos user
										// scanner
									Scanner matr = new Scanner(System.in);
									// cabezal
									System.out.println("");
									System.out.println(" ======================");
									System.out.println(" == BUSCAR VEHICULOS ==");
									System.out.println(" ======================");
									System.out.println("");
									// pregunta con scaner
									System.out.println("Pon el matricula del vehiculo: ");
									String BuscarMatr = matr.next();
									busquedaVehiculos(con, "centreciutat", BuscarMatr);

									// llamada del metodo BuscarVEHICULO

									break;

								case 3:// TODO cerrar sesion user

									System.out.println("");
									System.out.println(" ===================================");
									System.out.println(" == Cerrar sesion User normal v.1 ==");
									System.out.println(" ===================================");
									System.out.println("");
									salir = 3;
									break;
								default:
									System.out.println("");
									System.out.println("No has puesto ninguna opcion permitida");
								}// cierre swicth user

							} // ciera el while del user normal

						}
					} // ciera el else

				case 2:
					System.out.println("");
					System.out.println("");
					System.out.println(" ==================================");
					System.out.println(" == Saliendo al parking APP v1.0 ==");
					System.out.println(" ==================================");
					System.out.println("");
					System.out.println("Saliste Correctamente");
					salida = true;
					break;
				default:
					System.out.println("");
					System.out.println("No has puesto ninguna opcion permitida");
				}
				// cierre switch login
			} // cierre del DO
			while (salida != true);

		} catch (

		SQLException e) {

			printSQLException(e);
		}
	}

	private static void crearUsuarios(Connection connection, String BDNombre) throws SQLException {

		String createString = "create table " + BDNombre + ".usuarios" + "(user varchar(50) NOT NULL,"
				+ "password varchar(50) NOT NULL, admin varchar(1) NOT NULL, PRIMARY KEY (user))";

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
				+ " cuenta_corriente varchar(50), matricula_vehiculo varchar(7), codigo_estacionamiento varchar(4), user varchar(50),"
				+ " PRIMARY KEY (dni_inquilino),"
				+ " FOREIGN KEY (user) REFERENCES usuarios(user), FOREIGN KEY (matricula_vehiculo) REFERENCES vehiculos(matricula_vehiculo),"
				+ "FOREIGN KEY (codigo_estacionamiento) REFERENCES estacionamiento (codigo_estacionamiento))";

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
				+ "(codigo_estacionamiento varchar(4) NOT NULL, alquilado varchar(1),"
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

	private static void insertarUsuario(Connection connection, String BDNombre, String user, String password,
			String admin) throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".usuarios");

			rs.moveToInsertRow();

			rs.updateString("user", user);
			rs.updateString("password", password);
			rs.updateString("admin", admin);

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo usuario " + user + " en la tabla usuaios!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void insertarEstacionamiento(Connection connection, String BDNombre, String codigo_estacionamiento,
			String alquilado, int m2, double precio_mensual, String dni_inquilino) throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".estacionamiento");

			rs.moveToInsertRow();

			rs.updateString("codigo_estacionamiento", codigo_estacionamiento);
			rs.updateString("alquilado", alquilado);
			rs.updateInt("m2", m2);
			rs.updateDouble("precio_mensual", precio_mensual);
			rs.updateString("dni_inquilino", dni_inquilino);

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo estacionamiento " + codigo_estacionamiento
					+ " en la tabla estacionamiento!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void insertarVehiculo(Connection connection, String BDNombre, String matricula_vehiculo,
			String modelo, String marca, String color, String tipoVehiculo, String dni_inquilino) throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".vehiculos");

			rs.moveToInsertRow();

			rs.updateString("matricula_vehiculo", matricula_vehiculo);
			rs.updateString("modelo", modelo);
			rs.updateString("marca", marca);
			rs.updateString("color", color);
			rs.updateString("tipoVehiculo", tipoVehiculo);
			rs.updateString("dni_inquilino", dni_inquilino);

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo vehiculos " + matricula_vehiculo
					+ " en la tabla inquilinos!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void insertarInquilino(Connection connection, String BDNombre, String dni_inquilino, String nombre,
			String apellidos, String direccion, String cuenta_corriente, String matricula_vehiculo,
			String codigo_estacionamiento, String user) throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".inquilinos");

			rs.moveToInsertRow();

			rs.updateString("dni_inquilino", dni_inquilino);
			rs.updateString("nombre", nombre);
			rs.updateString("apellidos", apellidos);
			rs.updateString("direccion", direccion);
			rs.updateString("cuenta_corriente", cuenta_corriente);
			rs.updateString("matricula_vehiculo", matricula_vehiculo);
			rs.updateString("codigo_estacionamiento", codigo_estacionamiento);
			rs.updateString("user", user);

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println(
					"Se ha insertado correctamente el nuevo inquilino " + dni_inquilino + " en la tabla inquilinos!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	// Modificar la BBDD
	private static void modificaAlquiler(Connection con, String BDNombre, String usuario, String dni,
			String estacionamiento) throws SQLException {

		String eliminarfila = "UPDATE " + BDNombre
				+ ".estacionamiento set dni_inquilino = null where codigo_estacionamiento = '" + estacionamiento + "'";
		// String cambiarEstacionamiento = "UPDATE " + BDNombre + ".estacionamiento set
		// dni_inquilino = '" + dni + "' where codigo_estacionamiento = '" +
		// estacionamiento + "'";
		// String cambiarEstacionamientoInquilino = "UPDATE " + BDNombre + ".inquilinos
		// set codigo_estacionamiento = '" + estacionamiento + "' where dni_inquilino =
		// '" + dni + "'";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(eliminarfila);
			// stmt.executeUpdate(cambiarEstacionamiento);
			// stmt.executeUpdate(cambiarEstacionamientoInquilino);
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM " + BDNombre + ".estacionamiento WHERE dni_inquilino = '" + dni + "'");
			System.out.println("");
			System.out.println("Se ha modificado el estacionamiento: " + estacionamiento + " del usuario: " + usuario);

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void eliminarAlquileres(Connection con, String BDNombre, String dni, String CodEst, String usuario)
			throws SQLException {

		String eliminarfila = "UPDATE " + BDNombre
				+ ".estacionamiento set dni_inquilino = null where codigo_estacionamiento = '" + CodEst + "'";
		String cambiarAlquilado = "UPDATE " + BDNombre
				+ ".estacionamiento set alquilado = 'n' where codigo_estacionamiento = '" + CodEst + "'";
		String cambiarInquilino = "UPDATE " + BDNombre
				+ ".inquilinos set codigo_estacionamiento = null where dni_inquilino = '" + dni + "'";
		Statement stmt = null;

		try {

			stmt = con.createStatement();
			// poner los valores para que se cambie y la tabla
			stmt.executeUpdate(eliminarfila);
			stmt.executeUpdate(cambiarAlquilado);
			stmt.executeUpdate(cambiarInquilino);

			// mensaje para que sepa que a ido todo bien
			System.out.println("");
			System.out.println("se ha eliminado correctamente el alquiler del usuario:  " + usuario
					+ " de la tabla estacionamientos");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void listadoAlquileres(Connection con, String BDNombre) throws SQLException {

		Statement stmt = null;
		String query = "select * " + " from " + BDNombre + ".inquilinos";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// listados
			System.out.println("");
			System.out.println("**** Lista de Alquileres ****");

			while (rs.next()) {

				System.out.println("");
				System.out.println("*************************************");

				String dni_inquilino = rs.getString(1);
				System.out.println("Dni inquilino: " + dni_inquilino);

				String matricula_vehiculo = rs.getString(6);
				System.out.println("Matricula vehiculo: " + matricula_vehiculo);

				String codigo_estacionamiento = rs.getString(7);
				System.out.println("Codigo estacionamiento: " + codigo_estacionamiento);

				System.out.println("*************************************");

			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void insertarUsuariosEstacionamientos(Connection con, String BDNombre, String user, String dni,
			String esta) throws SQLException {

		String cambiarAlquilado = "UPDATE " + BDNombre
				+ ".estacionamiento set alquilado = 's' where codigo_estacionamiento = '" + esta + "'";
		String añadirDni = "UPDATE " + BDNombre + ".estacionamiento set dni_inquilino = '" + dni
				+ "' where codigo_estacionamiento = '" + esta + "'";
		String añadirEstacionamientoInquilino = "UPDATE " + BDNombre + ".inquilinos set codigo_estacionamiento = '"
				+ esta + "' where dni_inquilino = '" + dni + "'";
		Statement stmt = null;

		try {

			stmt = con.createStatement();
			// poner los valores para que se cambie y la tabla

			stmt.executeUpdate(cambiarAlquilado);
			stmt.executeUpdate(añadirDni);
			stmt.executeUpdate(añadirEstacionamientoInquilino);

			// mensaje para que sepa que a ido todo bien
			System.out.println("");
			System.out.println("se ha actualizado correctamente el alquiler del usuario:  " + user);
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void busquedaUsuarios(Connection con, String BDNombre, String dni) throws SQLException {

		Statement stmt = null;
		String query = "select * " + " from " + BDNombre + ".inquilinos WHERE dni_inquilino = '" + dni + "'";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// listados
			System.out.println("");
			System.out.println("**** Busqueda de Usuario ****");

			while (rs.next()) {

				System.out.println("");
				System.out.println("*************************************");
				String nombre = rs.getString(2);
				System.out.println("Nombre: " + nombre);

				String dni_inquilino = rs.getString(1);
				System.out.println("Dni inquilino: " + dni_inquilino);

				String matricula_vehiculo = rs.getString(6);
				System.out.println("Matricula vehiculo: " + matricula_vehiculo);

				String codigo_estacionamiento = rs.getString(7);
				System.out.println("Codigo estacionamiento: " + codigo_estacionamiento);

				System.out.println("*************************************");

			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void busquedaVehiculos(Connection con, String BDNombre, String matricula) throws SQLException {

		Statement stmt = null;
		String query = "select * " + " from " + BDNombre + ".vehiculos WHERE matricula_vehiculo = '" + matricula + "'";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// listados
			System.out.println("");
			System.out.println("**** Busqueda de vehiculo ****");

			while (rs.next()) {

				System.out.println("");
				System.out.println("*************************************");
		

				String dni_inquilino = rs.getString(6);
				System.out.println("Dni inquilino: " + dni_inquilino);

				String matricula_vehiculo = rs.getString(1);
				System.out.println("Matricula vehiculo: " + matricula_vehiculo);

				String modelo = rs.getString(2);
				System.out.println("Modelo: " + modelo);
				
				String marca = rs.getString(3);
				System.out.println("Marca: " + marca);
				
				String color = rs.getString(4);
				System.out.println("Color: " + color);
				
				String tipoVehiculo = rs.getString(5);
				System.out.println("Tipo vehiculo: " + tipoVehiculo);

				System.out.println("*************************************");

			}

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void inicioSesion(Connection con, String BDNombre, String user, String pass) throws SQLException {

		Statement stmt = null;
		String passBDD = "";
		String userBDD = "";
		String query = "select user, password, admin from " + BDNombre + ".usuarios where user = " + "'" + user + "'"
				+ "and password = " + "'" + pass + "'";
		;

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