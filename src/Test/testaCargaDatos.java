package Test;

import java.io.File;
import java.util.Map;

import Modelo.CoordinadorInventario;
import Modelo.Habitacion;

class testaCargaDatos {

	 

	//carga de datos inventario
	public void test() {
		CoordinadorInventario clase= new CoordinadorInventario();
		File Cuartos= new File("./data/Habitaciones.txt");
		String archivo= "./data/Habitaciones.txt";
		int esperado =10; 
		
		clase.cargarCuartos(Cuartos);
		Map<String, Habitacion> listaHabitaciones = clase.getLista();
		
		Assertions.assertEquals(esperado,listaHabitaciones.size());
	}

}
