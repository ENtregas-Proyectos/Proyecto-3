package Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Map;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Modelo.CoordinadorInventario;
import Modelo.Habitacion;


public class testCargaDeDatos {

	
	public void test() {
		CoordinadorInventario clase= new CoordinadorInventario();
		File Cuartos= new File("./data/Habitaciones.txt");
		String archivo= "./data/Habitaciones.txt";
		int esperado =10; 
		// que se cargue el archivo completo 
		clase.cargarCuartos(Cuartos);
		Map<String, Habitacion> listaHabitaciones = clase.getLista();
		Assert.assertEquals(esperado, listaHabitaciones.size());
		
		
		//Probar que se cargue la informacionesperada
		Habitacion habitacion = listaHabitaciones.get("101");
        Assert.assertNotNull(habitacion); 
        Assert.assertEquals("Esquina", habitacion.getUbicacion()); 
	}
}
