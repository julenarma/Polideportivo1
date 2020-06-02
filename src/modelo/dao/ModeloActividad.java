package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conexion;
import modelo.bean.Actividad;
import modelo.bean.Inscripcion;
import modelo.bean.Usuario;

public class ModeloActividad extends Conexion {

	public ArrayList<Actividad> SelectAll() {

		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		try {

			PreparedStatement pst = super.conexion.prepareStatement("select * from actividades");
			ResultSet rs = pst.executeQuery();

			System.out.println("Lista de todos los usuarios: ");

			System.out.println("**********************************************************************************");

			while (rs.next()) {

				Actividad actividad = new Actividad();

				actividad.setId(rs.getInt("id"));
				actividad.setNombre(rs.getString("nombre"));
				actividad.setFecha_inicio(rs.getDate("fecha_inicio"));
				actividad.setDias_semana(rs.getString("dias_semana"));
				actividad.setHoras(rs.getInt("horas"));
				actividad.setMax_participantes(rs.getInt("max_participantes"));
				actividad.setPrecio(rs.getDouble("precio"));

				System.out.println(actividad);
				System.out
						.println("**********************************************************************************");
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return actividades;

	}

	
	
	
	
	public Actividad select(int id) {

		Actividad actividad = new Actividad();

		try {

			PreparedStatement pst = super.conexion.prepareStatement("select * from actividades where id=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			System.out.println("Mostrando la actividad seleccionada: ");

			while (rs.next()) {

				actividad.setId(rs.getInt("id"));
				actividad.setNombre(rs.getString("nombre"));
				actividad.setFecha_inicio(rs.getDate("fecha_inicio"));
				actividad.setDias_semana(rs.getString("dias_semana"));
				actividad.setHoras(rs.getInt("horas"));
				actividad.setMax_participantes(rs.getInt("max_participantes"));
				actividad.setPrecio(rs.getDouble("precio"));

				System.out.println(actividad);

				System.out
						.println("**********************************************************************************");

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return actividad;

	}

	public Actividad SelectLike(String partes) {

		Actividad actividad = new Actividad();

		try {

			PreparedStatement pst = super.conexion.prepareStatement("select * from actividades where nombre like '%" + partes + "%'");
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				actividad.setId(rs.getInt("id"));
				actividad.setNombre(rs.getString("nombre"));
				actividad.setFecha_inicio(rs.getDate("fecha_inicio"));
				actividad.setDias_semana(rs.getString("dias_semana"));
				actividad.setHoras(rs.getInt("horas"));
				actividad.setMax_participantes(rs.getInt("max_participantes"));
				actividad.setPrecio(rs.getDouble("precio"));

				System.out.println(actividad);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return actividad;

	}

	
	
	public Actividad delete(int id) {

		Actividad actividad = new Actividad();

		try {
			PreparedStatement pstDelete = super.conexion.prepareStatement("delete from actividades where id=? ");

			pstDelete.setInt(1, id);
			pstDelete.execute();

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return actividad;

	}

	public void Update(String nombre, String dias_semana, int horas, int max_participantes, Double precio, int id) {

		try {

			PreparedStatement pstUpdate = super.conexion.prepareStatement(
					"update actividades set nombre=?,  dias_semana=?, horas=?, max_participantes=?, precio=? where id=?");

			pstUpdate.setString(1, nombre);
			pstUpdate.setString(2, dias_semana);
			pstUpdate.setInt(3, horas);
			pstUpdate.setInt(4, max_participantes);
			pstUpdate.setDouble(5, precio);
			pstUpdate.setInt(6, id);
			// pstUpdate.setDate(7, new
			// java.sql.Date(actividad.getFecha_inicio().getTime()));

			pstUpdate.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public void Insert(String nombre, String dias_semana, int horas, int max_participantes, Double precio, int id) {

		try {

			PreparedStatement pstInsert = super.conexion.prepareStatement(
					"insert into actividades (nombre,dias_semana, horas,max_participantes,precio, id) values (?,?,?,?,?,?)");

			pstInsert.setString(1, nombre);
			pstInsert.setString(2, dias_semana);
			pstInsert.setInt(3, horas);
			pstInsert.setInt(4, max_participantes);
			pstInsert.setDouble(5, precio);
			pstInsert.setInt(6, id);
			// pstUpdate.setDate(7, new
			// java.sql.Date(actividad.getFecha_inicio().getTime()));

			pstInsert.execute();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}