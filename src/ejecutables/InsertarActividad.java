package ejecutables;


import java.util.Scanner;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;


public class InsertarActividad {

	public static void main(String[] args) {

		ModeloActividad ma= new ModeloActividad();
		
		
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Introduce una id");
		int id =Integer.parseInt(teclado.next());
	
		
		System.out.println("Introduce un nombre");
		String nombre= teclado.next();
		
		System.out.println("Introduce un día de la semana");
		String dias_semana= teclado.next();
		
	//	System.out.println("Introduce una fecha de inicio");
		
		
		System.out.println("Introduce una hora");
		int horas =Integer.parseInt(teclado.next());
		
		
		System.out.println("Introduce el máximo de participantes");
		int max_participantes =Integer.parseInt(teclado.next());
		
		
		
		System.out.println("Introduce el precio");
		double precio =teclado.nextDouble();
		
	
		ma.Insert(nombre, dias_semana, horas, max_participantes,precio, id);
		
		
	}

}