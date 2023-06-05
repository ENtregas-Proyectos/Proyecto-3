package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pantalla_Habitacion extends JFrame  {
	private static PanelLogo panelLogo;

	
	public Pantalla_Habitacion(List <String> respuesta){
		this.setLocation(0, 0);
		this.setSize(new Dimension(1400,1000));
		this.getContentPane().setBackground(new Color (244,238,226));
		this.setVisible(true);
		PanelLogo(this);
		centro(this, respuesta);
	}
	public void PanelLogo(JFrame frame) {
		//frame.setResizable(false);
		JPanel intento = new JPanel();
		intento.setLayout(new GridLayout(1,2));
		panelLogo= new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
		
		
	    frame.add(panelLogo, BorderLayout.NORTH);
	    
	    
	    intento.setBackground(new Color(244,238,226));
	    JPanel hotel= new JPanel();
	    hotel.setBackground(new Color(244,238,226));
	    hotel.setLayout(new FlowLayout());
	    JLabel label1 = new JLabel ("Caracteristicas del Hotel :");
	    JLabel label2 = new JLabel (" Parqueadero pago en el Hotel,");
	    JLabel label3 = new JLabel (" Parqueadero gratis en el Hotel, ");
	    JLabel label4 = new JLabel (" Piscina y Zonas Humedas, ");
	    JLabel label5 = new JLabel (" Espacio para BBQ, ");
	    JLabel label6 = new JLabel (" Wifi Gratis, ");
	    JLabel label7 = new JLabel (" Recepcion 24 Horas, ");
	    JLabel label8 = new JLabel (" Aceptamos Mascotas!!");
	    
	    hotel.add(label1);
	    hotel.add(label2);
	    hotel.add(label3);
	    hotel.add(label4);
	    hotel.add(label5);
	    hotel.add(label6);
	    hotel.add(label7);
	    hotel.add(label8);
	    hotel.setVisible(true);
	    intento.add(hotel);
	    
	    frame.add(intento, BorderLayout.SOUTH);
	    
	    
	    
	}
	public void centro(JFrame frame,List <String> respuesta) {
		
		JPanel base = new JPanel();
		base.setBackground(new Color(244,238,226));
		base.setSize(new Dimension (200,150));
		base.setLayout(new BorderLayout());
		base.setVisible(true);
		base.setLayout(new BorderLayout());
		
		JLabel label = new JLabel();
		
		ImageIcon imagen ;
		
		imagen = new ImageIcon("./data/Cuarto12.png");
		label.setSize(new Dimension (100,100));
	
		label.setIcon(imagen);
		label.setVisible(true);
		base.add(label,BorderLayout.LINE_START);
		frame.add(base,BorderLayout.LINE_START);
		
		//parte texto
		JPanel base2 = new JPanel();
		base2.setBackground(new Color(244,238,226));
		//base.setSize(new Dimension (300,300));
		base2.setLayout(new GridLayout(10,2));
		base2.setVisible(true);
		
		JLabel label1 = new JLabel (respuesta.get(0));
		JLabel label2 = new JLabel (respuesta.get(1));
		JLabel label3 = new JLabel (respuesta.get(2));
		JLabel label4 = new JLabel (respuesta.get(3));
		JLabel label5 = new JLabel (respuesta.get(4));
		JLabel label6 = new JLabel (respuesta.get(5));
		JLabel label7 = new JLabel (respuesta.get(6));
		JLabel label8 = new JLabel (respuesta.get(7));
		JLabel label9 = new JLabel (respuesta.get(8));
		JLabel label10 = new JLabel (respuesta.get(9));
		JLabel label11 = new JLabel (respuesta.get(10));
		JLabel label12 = new JLabel (respuesta.get(11));
		JLabel label13 = new JLabel (respuesta.get(12));
		JLabel label14 = new JLabel (respuesta.get(13));
		JLabel label15 = new JLabel (respuesta.get(14));
		JLabel label16 = new JLabel (respuesta.get(15));
		JLabel label17 = new JLabel (respuesta.get(16));
		JLabel label18 = new JLabel (respuesta.get(17));
		JLabel label19 = new JLabel (respuesta.get(18));
		JLabel label20 = new JLabel (respuesta.get(19));
		
		
		
		base2.add( label1);
		base2.add( label2);
		base2.add( label3);
		base2.add( label4);
		base2.add( label5);
		base2.add( label6);
		base2.add( label7);
		base2.add( label8);
		base2.add( label9);
		base2.add( label10);
		base2.add( label11);
		base2.add( label12);
		base2.add( label13);
		base2.add( label14);
		base2.add( label15);
		base2.add( label16);
		base2.add( label17);
		base2.add( label18);
		base2.add( label19);
		base2.add( label20);
		
		
		
		frame.add(base2,BorderLayout.CENTER);
		
		
	}
}
