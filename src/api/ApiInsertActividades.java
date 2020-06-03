package api;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiInsertUsuario
 */
@WebServlet("/ApiInsertUsuario")
public class ApiInsertActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiInsertActividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	
		 
		String jsonUsuario= request.getParameter("actividades");
		JSONObject jsonObject= new JSONObject(jsonUsuario);
		
		Actividad actividad= new Actividad();
	
		
		actividad.setId(jsonObject.getInt("id"));
		actividad.setNombre(jsonObject.getString("nombre"));
		actividad.setFecha_inicio(jsonObject.getDate("fecha_inicio"));
		actividad.setDias_semana(jsonObject.getString("dias_semana"));
		actividad.setHoras(jsonObject.getInt("horas"));
		actividad.setMax_participantes(jsonObject.getInt("max_participantes"));
		actividad.setPrecio(jsonObject.getDouble("precio"));
		
		
		ModeloActividad ma= new ModeloActividad();
		
		
		ma.insert(actividad);
		 try {
			ma.getConexion().close();
		} catch (SQLException e) {
			e.printStackTrace();
		
			
		}
		
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");
		request.setCharacterEncoding("UTF-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
