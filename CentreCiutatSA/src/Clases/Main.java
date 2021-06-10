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


			// System.out.println("¡Conexión establecida!");
			
			 // String sql = "CREATE DATABASE CentreCiutat"; stmt.executeUpdate(sql);
			 // System.out.println("Base de datos creada con éxito.");
			 

//github.com/epardo09/CentreCiutatSA.git

			
			
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
									insertarUsuariosEstacionamientos(con, "centreciutat", UserN, UserDni, UserEst);
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

									
									// llamada del metodo
									modificaAlquiler(con, "centreciutat", editUser, editDni,editEst);

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
									System.out.println("Pon el Dni del Usuario: ");
									String elidni = admEli.next();
									System.out.println("Pon el estacionamiento que quieras eliminar al usuario: ");
									String eliEst = admEli.next();

									
									// llamada del metodo
									eliminarAlquileres(con, "centreciutat", elidni, eliEst, eliUser);

									//llamada del metodo

									break;
								case 4:

									Scanner admlistar = new Scanner(System.in);
									

									//cabezal

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
									salir = 5;
									break;
								default:
									System.out.println("");
									System.out.println("No has puesto ninguna opcion permitida");
								}//switch admin cierre
							}//while admin cierre
						} else {
							int salir = 0;
							while (salir != 3) {
								Scanner Adm = new Scanner(System.in);
								
								System.out.println("");
								System.out.println(" ======================================");
								System.out.println(" == Bienvenido Adm parking APP  v1.0 ==");
								System.out.println(" ======================================");
								System.out.println("");

								System.out.println("MENU:");
								System.out.println("");

								System.out.println("1) BUSCAR USUARIOS");
								System.out.println("2) BUSCAR VEHICULOS");
								System.out.println("5) SALIR AL INICIO");
								System.out.println("");

								System.out.print("¿Que desea hacer?: ");
								int opUser = Adm.nextInt();
							switch (opUser) {
							case 1:
								Scanner buscar = new Scanner(System.in);
								
								System.out.println("");
								System.out.println(" =====================");
								System.out.println(" == BUSCAR USUARIOS ==");
								System.out.println(" =====================");
								System.out.println("");

								System.out.println("Pon el dni del Usuario que quieres buscar: ");
								String UserDNI= buscar.next();
								System.out.println("");
								
								//llamada del metodo BuscarUSUARIO
								busquedaUsuarios(con, "centreciutat", UserDNI);
								break;

							case 2:
								//scanner
								Scanner matr = new Scanner(System.in);
								//cabezal
								System.out.println("");
								System.out.println(" ======================");
								System.out.println(" == BUSCAR VEHICULOS ==");
								System.out.println(" ======================");
								System.out.println("");
								//pregunta con scaner
								System.out.println("Pon el matricula del vehiculo: ");
								String BuscarMatr = matr.next();
								busquedaVehiculos(con, "centreciutat", BuscarMatr);
						
								//llamada del metodo BuscarVEHICULO
								
								break;							
								
							case 3:
								
								System.out.println("");
								System.out.println(" ==================================");
								System.out.println(" == Saliendo del menu normal v.1 ==");
								System.out.println(" ==================================");
								System.out.println("");
								System.out.println("Saliste Correctamente");
								salir=3;
								break;
							default:
								System.out.println("");
								System.out.println("No has puesto ninguna opcion permitida");
						}//cierre swicth user
						
						
							
						}//ciera el while del user normal 

					}//ciera el else
					default:
						System.out.println("");
						System.out.println("No has puesto ninguna opcion permitida");
						}//cierre switch login
				}
			
				
			}//cierre del DO
			while (salida != true);

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


			// Nos posicionamos con el cursor en la próxima fila vacía de la tabla
			rs.moveToInsertRow();


			// Insertamos la nueva fila con los datos proporcionados
		
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
	private static void insertarUsuariosEstacionamientos(Connection connection, String BDNombre,  String user, String dni, String esta) 
			throws SQLException {

		Statement stmt = null;

		try {

			stmt = connection.createStatement();
			stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM " + BDNombre + ".estacionamiento");

			
			rs.moveToInsertRow();
			//donde se guardara los valores de las preguntas
			rs.updateString("Dni del usuario: ", dni);
			rs.updateString("Estacionamiento: ", esta);
			
			

			rs.insertRow();
			rs.beforeFirst();

			System.out.println("");//mensaje de que todo a ido bien
			System.out.println("Se ha insertado correctamente el nuevo estacionamiento: "+esta+" al  usuario: " + user );

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close();
		}

	}
	private static void busquedaUsuarios(Connection con, String BDNombre,String dni) throws SQLException {

		Statement stmt = null;
		String query = "select * " + " from " + BDNombre + ".inquilino";

		try {

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			//listados
			System.out.println("");
			System.out.println("**** Busqueda de Usuario ****");

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
	private static void busquedaVehiculos(Connection con, String BDNombre,String matricula) throws SQLException {

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