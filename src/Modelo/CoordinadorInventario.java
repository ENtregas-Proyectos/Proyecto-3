package Modelo;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CoordinadorInventario {
	public static Hashtable<String, Habitacion> listaHabitaciones = new Hashtable<String , Habitacion>();
	 File Cuartos= new File("./data/Habitaciones.txt");

	
	public void mostrarMenu() {
		System.out.println("\n1. Crear inventario de Habitaciones \t\t (Si crea un inventario se borra el inventario anterior)"); 
		System.out.println("2. Cargar archivo de Habitaciones"); //ya
		System.out.println("3. Cargar Habitacion Manualmente ");//ya
		System.out.println("4. Actualizar informacion de una Habitacion");//ya 
		System.out.println("5. Cargar tarifa de Tipo de habitacion");
		System.out.println("6. Consultar Inventario");//ya 
		System.out.println("7. Consultar informacion de una Habitacion ");//ya 
		System.out.println("8. Consultar reserva en determinada fecha ");
		System.out.println("9. Volver al menu inicial\n\n");
		
		
		
	}
	
	public void cargarCuartos() {
		try { 
			BufferedReader br = new BufferedReader(new FileReader(Cuartos));
			String linea = br.readLine();
			while (linea!= null) {
				String[] partes = linea.split(";");
				String  numero=partes[0];
				String ubicacion = partes[1];
				int capacidad = Integer.parseInt(partes[2]);
				int camas =Integer.parseInt(partes[3]);
				String tamano= partes[4];
				String tipo= partes[5];
				String extras= partes[6];
				String tarifa = partes[7]; 
				
				
				Boolean Aire = Boolean.parseBoolean(partes[8]);
				Boolean calefaccion = Boolean.parseBoolean(partes[9]);
				String dimensionCamas = partes[10];
				Boolean television = Boolean.parseBoolean(partes[11]);
				Boolean cafetera = Boolean.parseBoolean(partes[12]);
				Boolean hipoalergenicos = Boolean.parseBoolean(partes[13]);
				Boolean plancha = Boolean.parseBoolean(partes[14]);
				Boolean secador = Boolean.parseBoolean(partes[15]);
				String voltaje = partes[16];
				Boolean USBA = Boolean.parseBoolean(partes[17]);
				Boolean USBC = Boolean.parseBoolean(partes[18]);
				Boolean desayuno = Boolean.parseBoolean(partes[19]);
				Habitacion nuevo = new Habitacion(numero, ubicacion, capacidad, camas, tamano, tipo, extras, tarifa,Aire,calefaccion,dimensionCamas,television,cafetera, hipoalergenicos
						,plancha,secador,voltaje,USBA,USBC,desayuno);
				listaHabitaciones.put(numero, nuevo);
				linea = br.readLine();
		}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	private  ArrayList<String> arreglarTamano(String lista) {
		 ArrayList<String> TamanosCamas = new ArrayList<String>();
		 String [] partes= lista.split(",");
		 for (int a =0; a< partes.length; a++) {
			 TamanosCamas.add(partes[a]);	 
		 }
		return TamanosCamas;
		
	}
	
	public void anadir (Habitacion nuevo, String nombre) {
		listaHabitaciones.put(nombre, nuevo);
	}
	public void modificarCuarto() {
		String viejo = JOptionPane.showInputDialog("Cual es el nombre de la habitacion que desea modificar?");
		Habitacion aModificar = listaHabitaciones.get(viejo);
		mostrarHabitacion(aModificar);
		listaHabitaciones.remove(viejo);
		
	 	
	 	
	 	
		
	}
	public static String input(String mensaje)
		{
			try
			{
				System.out.print(mensaje );
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return reader.readLine();
			}
			catch (IOException e)
			{
				System.out.println("Error leyendo de la consola");
				e.printStackTrace();
			}
			return null;
		}
	public  List<String> consultarInventario() {
	 Set<String> nombres = listaHabitaciones.keySet();
	 System.out.println("Lista bien");
	 System.out.println(listaHabitaciones.size());
	 Object[] nuevo = nombres.toArray();
	 List<String> inventariofinal = new ArrayList<>();
	 if (listaHabitaciones.size()==0) {
		 inventariofinal.add("El inventario esta vacio");
	 }
	 else {
		 for ( int a =0 ; a< listaHabitaciones.size(); a++) {
		 String texto = "\nNombre: "+nuevo[a] +"--------------->";
		 texto += ("\t\t Ubicacion: "+ listaHabitaciones.get(nuevo[a]).getUbicacion()+ "\n\t\t Capacidad: "+ listaHabitaciones.get(nuevo[a]).getCapacidad() +"\n\t\t Tipo: "+
				 listaHabitaciones.get(nuevo[a]).getTipo()+"\n\t\t Caracteristicas Extra: "+ listaHabitaciones.get(nuevo[a]).getExtra()+"\n\t\t Tarifa: "+ listaHabitaciones.get(nuevo[a]).getTarifa()
				 + "\n\t\t Tamano Camas: "+ listaHabitaciones.get(nuevo[a]).getTamano()+ "\n\t\t AireAcondicionado: "+ listaHabitaciones.get(nuevo[a]).getAire() + "\n\t\t Calefaccion: "+ listaHabitaciones.get(nuevo[a]).getCalefaccion()+ "\n\t\t Dimensiones Camas: "+ listaHabitaciones.get(nuevo[a]).getDimensionesCamas()+ "\n\t\t Television: "+ listaHabitaciones.get(nuevo[a]).getTV()
				 + "\n\t\t Cafetera: "+ listaHabitaciones.get(nuevo[a]).getCafetera()+ "\n\t\t Cama y Tapete Hipoalergenicos: "+ listaHabitaciones.get(nuevo[a]).getHipo()+ "\n\t\t Plancha: "+ listaHabitaciones.get(nuevo[a]).getPlancha()+ "\n\t\t Secador: "+ listaHabitaciones.get(nuevo[a]).getSecador()+ "\n\t\t Voltaje AC: "+ listaHabitaciones.get(nuevo[a]).getVoltaje()+ "\n\t\t Toma USB-A: "+ listaHabitaciones.get(nuevo[a]).getUSBA()
				 + "\n\t\t Tomas USB-C: "+ listaHabitaciones.get(nuevo[a]).getUSBC()+ "\n\t\t Incluye Desayuno: "+ listaHabitaciones.get(nuevo[a]).getDesayuno());
				 
		
		 
		 
		
		inventariofinal.add(texto);
	 }
	 }
	 
	return inventariofinal;
	
	 }
	public List<String> consultarHabitacion(String habitacion) {
		Habitacion aBuscar = listaHabitaciones.get(habitacion);
		System.out.println(aBuscar);
		List<String> respuesta = mostrarHabitacion(aBuscar);
		return respuesta;
		
	}
	private List<String> mostrarHabitacion( Habitacion nombre) {
		List <String> respuesta= new ArrayList <String>();
		
		respuesta.add("Nombre: "+nombre.getNumero()+ "\n");
		respuesta.add("Ubicacion: "+nombre.getUbicacion()+ "\n");
		respuesta.add("Capacidad: "+nombre.getCapacidad()+ "\n");
		respuesta.add("Camas: "+nombre.getCamas()+ "\n");
		respuesta.add("Tamano camas: "+nombre.getTamano()+ "\n");
		respuesta.add("Tipo: "+ nombre.getTipo()+ "\n");
		respuesta.add("Caracteristicas Extras:  "+nombre.getExtra()+ "\n");
		respuesta.add("Tarifa: "+nombre.getTarifa()+ "\n");
		
		respuesta.add("Aire Acondicionado: "+nombre.getAire()+"\n");
		respuesta.add("Calefaccion: "+nombre.getCalefaccion()+"\n");
		respuesta.add("Dimensiones camas: "+nombre.getDimensionesCamas()+"\n");
		respuesta.add("Television : "+nombre.getTV()+"\n");
		respuesta.add("Cafetera: "+nombre.getCafetera()+"\n");
		respuesta.add("Cama y tapete Hipoalergenicos: "+nombre.getHipo()+"\n");
		respuesta.add("Plancha: "+nombre.getPlancha()+"\n");
		respuesta.add("Secador de pelo : "+nombre.getSecador()+"\n");
		respuesta.add("Voltaje AC: "+nombre.getVoltaje()+"\n");
		respuesta.add("Tomas USB-A: "+nombre.getUSBA()+"\n");
		respuesta.add("Tomas USB-C : "+nombre.getUSBC()+"\n");
		respuesta.add("Incluye desayuno: "+nombre.getDesayuno()+"\n");
		return respuesta;
		
	}
		
	public void cargarTarifa() {
		int tipoACambiar = Integer.parseInt(JOptionPane.showInputDialog("Porfavor seleccione el tipo de cuarto para el cual desea modificar la tarifa\n 1. Estandar \\n2. Suite \\n3. Suite Doble "));
		
		String tipoFijo;
		while (tipoACambiar > 3 || tipoACambiar <1) {
			tipoACambiar = Integer.parseInt(input("Porfavor ingrese una opcion valida"));
		}
		if (tipoACambiar == 1) {
			tipoFijo ="Estandar";
		}
		else if(tipoACambiar == 2) {
			tipoFijo = "Suite";
		}
		else {
			tipoFijo = "Doble Suite";
		}
		String tarifa = JOptionPane.showInputDialog("Porfavor indique la tarifa que desea aplicar ");
		Set<String> nombres = listaHabitaciones.keySet();
		Object[] nuevo = nombres.toArray();
		for ( int a =0 ; a< listaHabitaciones.size(); a++) {
			if (listaHabitaciones.get(nuevo[a]).getTipo().equals(tipoFijo)) {
				listaHabitaciones.get(nuevo[a]).setTarifa(tarifa);
				listaHabitaciones.replace(listaHabitaciones.get(nuevo[a]).getNumero(), listaHabitaciones.get(nuevo[a]));
				
			}
		}
	}
	
	
	public void escribirArchivo() {
		String data = escribirInventario();
		System.out.println("hola"+data);
		System.out.println(listaHabitaciones.size());

	    try {
	      // Creates a FileWriter
	      FileWriter file = new FileWriter("./data/Inventario.txt");

	      // Creates a BufferedWriter
	      BufferedWriter output = new BufferedWriter(file);

	      // Writes the string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	}
	private String escribirInventario() {
		String fin="";
		Set<String> nombres = listaHabitaciones.keySet();
		Object[] nuevo = nombres.toArray();
		for (int a =0 ; a < listaHabitaciones.size(); a++) {
			fin+= listaHabitaciones.get(nuevo[a]).getNumero()+ ";" + listaHabitaciones.get(nuevo[a]).getUbicacion()+ ";" +
		Integer.toString(listaHabitaciones.get(nuevo[a]).getCapacidad())+ ";" +Integer.toString(listaHabitaciones.get(nuevo[a]).getCamas())+ ";" +listaHabitaciones.get(nuevo[a]).getTamano()+ ";" + listaHabitaciones.get(nuevo[a]).getTipo()+ ";" + listaHabitaciones.get(nuevo[a]).getExtra()+ ";" + listaHabitaciones.get(nuevo[a]).getTarifa()+ 
		";" + listaHabitaciones.get(nuevo[a]).getAire()+";"+listaHabitaciones.get(nuevo[a]).getCalefaccion()+";"+listaHabitaciones.get(nuevo[a]).getDimensionesCamas()+";"+listaHabitaciones.get(nuevo[a]).getTV()+";"+listaHabitaciones.get(nuevo[a]).getCafetera()+";"+listaHabitaciones.get(nuevo[a]).getHipo()+";"+listaHabitaciones.get(nuevo[a]).getPlancha()+";"+
		listaHabitaciones.get(nuevo[a]).getSecador()+";"+listaHabitaciones.get(nuevo[a]).getVoltaje()+";"+listaHabitaciones.get(nuevo[a]).getUSBA()+";"+listaHabitaciones.get(nuevo[a]).getUSBC()+";"+listaHabitaciones.get(nuevo[a]).getDesayuno()+"\n";
			
		}
		return fin;
	}
	public void crearInventario() {
		listaHabitaciones.clear();
		System.out.println(listaHabitaciones.size());
	}
	public void iniciar() {
		File inventario= new File("./data/Inventario.txt");
		try { 
			BufferedReader br = new BufferedReader(new FileReader(inventario));
			String linea = br.readLine();
			if (linea== null) {
				System.out.println("El inventario esta vacio");
			}
			while (linea!= null) {
				String[] partes = linea.split(";");
				String  numero=partes[0];
				String ubicacion = partes[1];
				int capacidad = Integer.parseInt(partes[2]);
				int camas =Integer.parseInt(partes[3]);
				String tamano= partes[4];
				String tipo= partes[5];
				String extras= partes[6];
				String tarifa = partes[7]; 
				
				
				Boolean Aire = Boolean.parseBoolean(partes[8]);
				Boolean calefaccion = Boolean.parseBoolean(partes[9]);
				String dimensionCamas = partes[10];
				Boolean television = Boolean.parseBoolean(partes[11]);
				Boolean cafetera = Boolean.parseBoolean(partes[12]);
				Boolean hipoalergenicos = Boolean.parseBoolean(partes[13]);
				Boolean plancha = Boolean.parseBoolean(partes[14]);
				Boolean secador = Boolean.parseBoolean(partes[15]);
				String voltaje = partes[16];
				Boolean USBA = Boolean.parseBoolean(partes[17]);
				Boolean USBC = Boolean.parseBoolean(partes[18]);
				Boolean desayuno = Boolean.parseBoolean(partes[19]);
				Habitacion nuevo = new Habitacion(numero, ubicacion, capacidad, camas, tamano, tipo, extras, tarifa,Aire,calefaccion,dimensionCamas,television,cafetera, hipoalergenicos
						,plancha,secador,voltaje,USBA,USBC,desayuno);

				listaHabitaciones.put(numero, nuevo);
				linea = br.readLine();
		}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void vaciarArchico() {
		String data = "";
		 
	    try {
	      // Creates a FileWriter
	      FileWriter file = new FileWriter("./data/Inventario.txt");
	      

	      // Creates a BufferedWriter
	      BufferedWriter output = new BufferedWriter(file);
	      

	      // Writes the string to the file
	      output.write(data);
	      
	      // Closes the writer
	      output.close();
	     
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	      System.out.print("CAOS");
	    }
	}
}

