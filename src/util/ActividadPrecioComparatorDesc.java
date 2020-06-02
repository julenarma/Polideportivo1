package util;

import java.util.Comparator;

import modelo.bean.Actividad;

//Precio descendente
public class ActividadPrecioComparatorDesc implements Comparator<Actividad> {

	@Override
	public int compare(Actividad a1, Actividad a2) {
		
		if(a2.getPrecio() > a1.getPrecio()) {
			return 1;
		}else if(a2.getPrecio() < a1.getPrecio()) {
			return -1;
		}else {
			return 0;
		}
			
	}

}