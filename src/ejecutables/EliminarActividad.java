package ejecutables;

import java.util.Scanner;

import modelo.dao.ModeloActividad;

public class EliminarActividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ModeloActividad ma= new ModeloActividad();
		
		Scanner teclado= new Scanner (System.in);
		
		
		System.out.println("Introduce la id de la actividad que deseas eliminar");
		
		
		int id=Integer.parseInt(teclado.next());
		
		
		ma.delete(id);
		
		
		
	}

}
