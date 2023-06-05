package Consola;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Interfaz.PanelLogo;
import Modelo.Habitacion;
import Modelo.CoordinadorDeReservas;

public class MenuHuesped extends JFrame implements ActionListener{
	private static PanelLogo panelLogo;
	private static JButton CheckearDisponibilidad;
	private static JButton ReservarHabitacion;
	private static JButton PagarReserva;
	CoordinadorDeReservas coordinador = new CoordinadorDeReservas();
	
	public MenuHuesped() {
		setLocationRelativeTo(null);
		setTitle("menuHuesped");
		getContentPane().setBackground(new Color (244,238,226));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(1400,700);
		setBackground(new Color (244,238,226));
		PanelLogo(this);
		botones(this);
		CheckearDisponibilidad.addActionListener(this);
		ReservarHabitacion.addActionListener(this);
		PagarReserva.addActionListener(this);
		
	}
	public void PanelLogo(JFrame frame) {
		panelLogo = new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
	    frame.add(panelLogo, BorderLayout.NORTH);
	}
	
	public static void botones (JFrame frame) {
		
		JPanel base = new JPanel();
		base.setBackground(new Color(244,238,226));
		base.setPreferredSize(new Dimension(100,100));
		base.setVisible(true);
		CheckearDisponibilidad = new JButton("Checkear Habitacion");
		ReservarHabitacion = new JButton("Reservar");
		PagarReserva = new JButton("pagar reserva");
		base.add(CheckearDisponibilidad);
		base.add(ReservarHabitacion);
		base.add(PagarReserva);
		frame.add(base,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()== CheckearDisponibilidad) {
			String fechaInicioInput = JOptionPane.showInputDialog("Ingrese la fecha de entrada en el formato Y-M-D");
	        LocalDate fechaInicio = LocalDate.parse(fechaInicioInput);
	        
	        // Ingresar la fecha de salida utilizando JOptionPane
	        String fechaFinalInput = JOptionPane.showInputDialog("Ingrese la fecha de salida en el formato Y-M-D");
	        LocalDate fechaFinal = LocalDate.parse(fechaFinalInput);
	        
	        // Ingresar la cantidad de personas utilizando JOptionPane
	        String cantidadPersonasInput = JOptionPane.showInputDialog("Ingrese la cantidad de personas");
	        int cantidadPersonas = Integer.parseInt(cantidadPersonasInput);
			Habitacion habitacion = coordinador.encontrarHabitacionReserva(fechaInicio, fechaFinal, cantidadPersonas);
			Boolean disponibilidad = coordinador.checkearDisponibilidad(habitacion, fechaInicio, fechaFinal);
			
			if (disponibilidad) {
				JOptionPane.showMessageDialog(null, "SI HAY DISPONIBILIDAD EN LA HABITACION SELECCIONADA", "Disponibilidad", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "NO HAY DISPONIBILIDAD EN LA HABITACION SELECCIONADA", "Disponibilidad", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if ( e.getSource()== ReservarHabitacion) {
			
	        String nombreHuesped = JOptionPane.showInputDialog("Nombre Huésped:");
	        
	       
	        String documentoIdentidad = JOptionPane.showInputDialog("Documento Identidad Huésped:");
	        String numeroCelular = JOptionPane.showInputDialog("Número Celular Huésped:");
	  
	        String correoElectronico = JOptionPane.showInputDialog("Correo Electrónico Huésped:");

	        String fechaEntradaInput = JOptionPane.showInputDialog("Ingrese la fecha de entrada en formato Y-M-D (ejemplo 2023-02-01):");
	        LocalDate fechaEntrada = LocalDate.parse(fechaEntradaInput);
	      
	        String fechaSalidaInput = JOptionPane.showInputDialog("Ingrese la fecha de salida en formato Y-M-D (ejemplo 2023-02-01):");
	        LocalDate fechaSalida = LocalDate.parse(fechaSalidaInput);
	        
	        String tamanioReservaInput = JOptionPane.showInputDialog("Desea hacer una reserva singular o grupal?\n1. Singular\n2. Grupal");
	        int tamanioReserva = Integer.parseInt(tamanioReservaInput);
	        
	        // Mostrar los valores ingresados
	        JOptionPane.showMessageDialog(null, "Nombre Huésped: " + nombreHuesped +
	                                            "\nDocumento Identidad Huésped: " + documentoIdentidad +
	                                            "\nNúmero Celular Huésped: " + numeroCelular +
	                                            "\nCorreo Electrónico Huésped: " + correoElectronico +
	                                            "\nFecha de entrada: " + fechaEntrada +
	                                            "\nFecha de salida: " + fechaSalida +
	                                            "\nTamaño de la reserva: " + tamanioReserva);
	        if (tamanioReserva == 1) {
	        	String cantidadPersonasInput = JOptionPane.showInputDialog("Ingrese la cantidad de personas:");
	            int cantidadPersonas = Integer.parseInt(cantidadPersonasInput);
				Habitacion habitacion = coordinador.encontrarHabitacionReserva(fechaEntrada, fechaSalida, cantidadPersonas);
				coordinador.crearReserva(nombreHuesped,documentoIdentidad,correoElectronico,numeroCelular, cantidadPersonas, habitacion, fechaEntrada, fechaSalida);
				JOptionPane.showMessageDialog(null, "Reserva Creada", "Reserva", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(tamanioReserva==2) {
				String numeroHabitacionesInput = JOptionPane.showInputDialog("Digite el número de habitaciones:");
		        int numeroHabitaciones = Integer.parseInt(numeroHabitacionesInput);
				
				for (int i=1;i<=numeroHabitaciones; i++) {
					String cantidadPersonasInput = JOptionPane.showInputDialog("Cantidad de personas habitación "+i+":");
			        int cantidadPersonasGrupal = Integer.parseInt(cantidadPersonasInput);
					Habitacion habitacion = coordinador.encontrarHabitacionReserva(fechaEntrada, fechaSalida, cantidadPersonasGrupal);
					coordinador.crearReserva(nombreHuesped,documentoIdentidad,correoElectronico,numeroCelular, cantidadPersonasGrupal, habitacion, fechaEntrada, fechaSalida);
					JOptionPane.showMessageDialog(null, "Reserva Creada", "Reserva", JOptionPane.INFORMATION_MESSAGE);
					
					
					
				}
				
			}
	    }
		
		}
		
	}



