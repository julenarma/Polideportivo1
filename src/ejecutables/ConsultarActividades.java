package ejecutables;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

public class ConsultarActividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Actividad> actividades= new ArrayList <Actividad>();
		
		ModeloActividad ma= new ModeloActividad();
		
		actividades=ma.SelectAll();
		
		//Recorrer el array para la lista de Actividades
		
		
		for (int i = 0; i < actividades.size(); i++) {
			
			System.out.println(actividades.get(i));
			
			
		}
		
		
		
		
	}

}
