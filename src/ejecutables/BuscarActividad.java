package ejecutables;

import java.util.Scanner;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

public class BuscarActividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String partes;
		Actividad actividad=new Actividad();
	  ModeloActividad ma= new ModeloActividad();	
		Scanner teclado= new Scanner (System.in);
		
	
		System.out.println("Introduce una parte del nombre de la actividad");
		
		partes= teclado.nextLine();
		
		
		ma.SelectLike(partes);
		
		
		
		
		
		
	}

}
