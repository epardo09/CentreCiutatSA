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

			
//			  System.out.println("¡Conexión establecida!"); String sql =
//			  "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
//			  System.out.println("Base de datos creada con éxito.");
//			
//
//			System.out.println("¡Conexión establecida!");
//			
//			  sql = "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
//			 System.out.println("Base de datos creada con éxito.");
//			
//
//			// crear tabla usuarios
//			crearUsuarios(con, "centreciutat");
//			// crear estacionamiento
		//crearEstacionamientos(con, "centreciutat");
//			
//			// crear tabla inquilinos
//			crearInquilinos(con, "centreciutat");
//			// crear vehiculos
			//crearVehiculos(con, "centreciutat");
			
			//insertar usuarios
			
			//insertarUsuario(con, "centreciutat", "Carlos","2001");
			//insertarUsuario(con, "centreciutat", "David","1999");
			//insertarUsuario(con, "centreciutat", "Eric","1998");
			
			//insertar inquilinos


			
			
//		     insertarinquilino(con, "centreciutat", "43115892H","Carlos", "Medina","Calle falsa 123", "ES6621000418401234567891","BCD1234", "1A25","Carlos");
//		     insertarinquilino(con, "centreciutat", "43365874I","Eric", "Pardo","Calle erronea 404", "ES6000491500051234567892","JSA1684", "1A27 ","Eric");
//		     insertarinquilino(con, "centreciutat", "43223300K","David", "Quesada","Avenida incorrecta 7B", "ES9420805801101234567891","SAG7512", "1A30","David");
//		     
		      //insertar Estacionamientos
		    // insertarEstacionamiento(con, "centreciutat", "1A25","S", 5,100, "43115892H");
		   //  insertarEstacionamiento(con, "centreciutat", "1A27","S", 6,124.99, "43365874I");
		   //  insertarEstacionamiento(con, "centreciutat", "1A30","S", 4,87, "43223300K");
		     
		     //insertar vehiculos
		     insertarVehiculo(con, "centreciutat", "BCD1234","Ibiza", "Seat","Azul","Turismo", "43115892H");
		     insertarVehiculo(con, "centreciutat", "JSA1684","Clio", "Renault","Blanco","Turismo", "43365874I");
		     insertarVehiculo(con, "centreciutat", "SAG7512","SQ2", "Audi","Rojo","TodoTerreno", "43223300K");

		     
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

									break;

								case 2:
									//scanner
									Scanner admEdit = new Scanner(System.in);
									//cabezal
									System.out.println("");
									System.out.println(" =======================");
									System.out.println(" == EDITAR ALQUILERES ==");
									System.out.println(" =======================");
									System.out.println("");
									//pregunta con scaner
									System.out.println("Pon el nombre del Usuario: ");
									String editUser = admEdit.next();
									System.out.println("Pon el dni: ");
									String editDni = admEdit.next();
									System.out.println("Pon el estacionamiento que quieras editar al usuario: ");
									String editEst = admEdit.next();
									//llamada del metodo
									break;

								case 3:
									//scanner
									Scanner admEli = new Scanner(System.in);
									
									//cabezal
									System.out.println("");
									System.out.println(" =========================");
									System.out.println(" == ELIMINAR ALQUILERES ==");
									System.out.println(" =========================");
									System.out.println("");
									
									//pregunta con scaner
									System.out.println("Pon el nombre del Usuario: ");
									String eliUser = admEli.next();
									System.out.println("Pon el estacionamiento que quieras eliminar al usuario: ");
									String eliEst = admEli.next();
									//llamada del metodo
									break;
								case 4:
									//cabezal
									System.out.println("");
									System.out.println(" =======================");
									System.out.println(" == LISTAR ALQUILERES ==");
									System.out.println(" =======================");
									System.out.println("");
									
									//llamada del metodo
									
									
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
								String UserDNI= buscar.next();
								System.out.println("");
								
								//llamada del metodo BuscarUSUARIO
								break;

							case 2:
								//scanner
								Scanner matr = new Scanner(System.in);
								//cabezal
								System.out.println("");
								System.out.println(" =======================");
								System.out.println(" == BUSCAR VEHICULOS ==");
								System.out.println(" =======================");
								System.out.println("");
								//pregunta con scaner
								System.out.println("Pon el matricula del vehiculo: ");
								String BuscarMatr = matr.next();
						
								//llamada del metodo BuscarVEHICULO
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
						}
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
		String createString = "create table " + BDNombre + ".estacionamiento" + "(codigo_estacionamiento int NOT NULL, alquilado varchar(1),"
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
		String createString = "create table " + BDNombre + ".vehiculos" + "(matricula_vehiculo varchar(7) NOT NULL, modelo varchar(20),"
				+ " marca varchar(25), color varchar(25),"
				+ " tipoVehiculo varchar(25), dni_inquilino varchar(10),"
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
	
	private static void insertarUsuario(Connection connection, String BDNombre, String user, String password) 
			throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".usuarios");

			
			rs.moveToInsertRow();
	
			
			rs.updateString("user", user);
			rs.updateString("password",password);

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo usuario " + user +  " en la tabla usuaios!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}
	
	private static void insertarEstacionamiento(Connection connection, String BDNombre, String codigo_estacionamiento, String alquilado, int m2, double precio_mensual, String dni_inquilino) 
			throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".estacionamiento");

			
			rs.moveToInsertRow();
	
			
		
		
			rs.updateString("codigo_estacionamiento", codigo_estacionamiento);
			rs.updateString("alquilado",alquilado);
			rs.updateInt("m2", m2);
			rs.updateDouble("precio_mensual",precio_mensual);	
			rs.updateString("dni_inquilino",dni_inquilino);
			
			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo estacionamiento " + codigo_estacionamiento +  " en la tabla estacionamiento!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	private static void insertarVehiculo(Connection connection, String BDNombre, String matricula_vehiculo, String modelo, String marca, String color, String tipoVehiculo,  String dni_inquilino) 
			throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".vehiculos");

			
			rs.moveToInsertRow();
	
			
		
			rs.updateString("matricula_vehiculo", matricula_vehiculo);
			rs.updateString("modelo", modelo);
			rs.updateString("marca",marca);
			rs.updateString("color", color);
			rs.updateString("tipoVehiculo",tipoVehiculo);	
			rs.updateString("dni_inquilino",dni_inquilino);
			
			
			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo vehiculos " + matricula_vehiculo +  " en la tabla inquilinos!");

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}
	private static void insertarinquilino(Connection connection, String BDNombre, String dni_inquilino, String nombre, String apellidos, String direccion, String cuenta_corriente,  String matricula_vehiculo,  String codigo_estacionamiento,  String user) 
			throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".inquilinos");

			
			rs.moveToInsertRow();
	
			
		
			rs.updateString("dni_inquilino",dni_inquilino);
			rs.updateString("nombre", nombre);
			rs.updateString("apellidos",apellidos);
			rs.updateString("direccion", direccion);
			rs.updateString("cuenta_corriente",cuenta_corriente);	
			rs.updateString("matricula_vehiculo",matricula_vehiculo);
			rs.updateString("codigo_estacionamiento", codigo_estacionamiento);		
			rs.updateString("user", user);
			
			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");
			System.out.println("Se ha insertado correctamente el nuevo inquilino " + dni_inquilino +  " en la tabla inquilinos!");

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