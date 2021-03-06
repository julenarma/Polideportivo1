package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Aqui tenemos la conexion de la base de datos.
 * @author gaizka
 *
 */
public class Conexion {
	
	protected Connection conexion;
	
	protected Conexion() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}

