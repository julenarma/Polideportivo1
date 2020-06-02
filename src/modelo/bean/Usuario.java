package modelo.bean;

public class Usuario {

	private int id;
	private String nombre_apellido;
	private String dni;
	private String codigo;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(int id, String nombre_apellido, String dni, String codigo) {
		super();
		this.id = id;
		this.nombre_apellido = nombre_apellido;
		this.dni = dni;
		this.codigo = codigo;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_apellido() {
		return nombre_apellido;
	}
	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre_apellido=" + nombre_apellido + ", dni=" + dni + ", codigo=" + codigo
				+ "]";
	}
	
	
	
	
}
