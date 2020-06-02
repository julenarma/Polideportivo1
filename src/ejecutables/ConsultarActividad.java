package ejecutables;

import java.util.Scanner;

import modelo.dao.ModeloActividad;

public class ConsultarActividad {

	public static void main(String[] args) {
		
		ModeloActividad ma= new ModeloActividad();
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce una id");
		int id= Integer.parseInt(teclado.next());
		ma.select(id);
		
		
		

	}

}
