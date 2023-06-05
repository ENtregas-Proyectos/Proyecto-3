package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import Modelo.CoordinadorInventario;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pantalla_Inventario extends JFrame  {
	private static PanelLogo panelLogo;
	public static CoordinadorInventario Coordinador = new CoordinadorInventario();
	
	
	public Pantalla_Inventario(List<String> respuesta){
		this.setLocation(0,0);
		this.setSize(new Dimension(1400,800));
		this.getContentPane().setBackground(new Color (244,238,226));
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		PanelLogo(this);
		botones(this, respuesta);
	}
	public void PanelLogo(JFrame frame) {
		//frame.setResizable(false);
		panelLogo= new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
	    frame.add(panelLogo, BorderLayout.NORTH);
	}
	public static void botones (JFrame frame, List<String> respuesta) {
		JPanel base = new JPanel();
		base.setBackground(new Color(244,238,226));
		//base.setPreferredSize(new Dimension(200,200));
		base.setLayout(new FlowLayout());
		base.setVisible(true);
		base.setLayout(new FlowLayout());
		for ( int a =0 ; a< respuesta.size();a++) {
			JLabel label = new JLabel(respuesta.get(a));
			label.setFont(new Font ("Consolas",Font.PLAIN,6));
			base.add(label);			
		}
		//frame.add(base);
		
		System.out.println("HOLA");
		frame.add(base,BorderLayout.CENTER);
		JPanel base1 = new JPanel();
		base1.setBackground(Color.black);
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		frame.add(base1,BorderLayout.WEST);
		
	}
}
