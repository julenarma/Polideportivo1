package ejecutables;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;


public class ActualizarActividad {

	public static void main(String[] args) {

		ModeloActividad ma= new ModeloActividad();
		
		
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Introduce una id");
		int id =Integer.parseInt(teclado.next());
	
		
		System.out.println("Introduce un nombre");
		String nombre= teclado.next();
		
		System.out.println("Introduce un d�a de la semana");
		String dias_semana= teclado.next();
		
	//	System.out.println("Introduce una fecha de inicio");
		
		
		System.out.println("Introduce una hora");
		int horas =Integer.parseInt(teclado.next());
		
		
		System.out.println("Introduce el m�ximo de participantes");
		int max_participantes =Integer.parseInt(teclado.next());
		
		
		
		System.out.println("Introduce el precio");
		double precio =teclado.nextDouble();
		
	
		ma.Update(nombre, dias_semana, horas, max_participantes,precio, id);
		
		
	}

}
