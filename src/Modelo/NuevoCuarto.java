package Modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Interfaz.PanelLogo;
import Interfaz.VentanaPrincipal;

public class NuevoCuarto extends JFrame implements ActionListener{
	public static CoordinadorInventario Coordinador = new CoordinadorInventario();
	private static PanelLogo panelLogo;
	private static String nombre, ubicacion, tamano, tipo,extras,tarifa,tamanoscamas,voltaje;
	private static JButton SNumero, SUbicacion,SCapacidad,SCamas,STamanos,STipo,SExtra, STarifa,cerrar;
	private JTextField TNumero, TUbicacion,TCapacidad,TCamas,TTamanos, TTipo,TExtra,TTarifa; 
	private JPanel centro;
	private JButton SAire,SCalefaccion,  STv, SCafe, SHipo, SPlancha, SSecador, SUA, SUC, SDesayuno,STamanoCamas,SVoltaje; 
	private JTextField TAire,TCalefaccion, TTv, TCafe, THipo, TPlancha, TSecador, TUA, TUC, TDesayuno,TTamanoCamas,TVoltaje; 
	private static int  capacidad,numcamas;
	private static Boolean aire,calefaccion,television,cafetera,hipo,plancha,secador,usba,usbc,desayuno;   
	
	
	public NuevoCuarto() {
		this.setLocation(0,0);
		this.setSize(new Dimension(1400,700));
		this.getContentPane().setBackground(new Color (244,238,226));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		PanelLogo(this);
		centro(this);
		cerrar(this);
		//Habitacion nuevo = new Habitacion(nombre, ubicacion, capacidad, numcamas, tamano, tipo, extras, tarifa,aire,calefaccion,tamanoscamas,television,cafetera,hipo,plancha,secador,voltaje,usba,usbc,desayuno);
	    //Coordinador.anadir(nuevo,nombre);
	}
	public void PanelLogo(JFrame frame) {
		//frame.setResizable(false);
		panelLogo= new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
	    frame.add(panelLogo, BorderLayout.NORTH);
	}
	public void centro(JFrame frame) {
		centro = new JPanel();
		centro.setBackground(new Color(244,238,226));
		centro.setLayout(new GridLayout(5,4));
		centro.setVisible(true);
		
		
		numero(frame);
		ubicacion (frame);
		capacidad (frame);
		camas(frame);
		tamanos(frame);
		tipo(frame);
		extras(frame);
		tarifa(frame);
		// originales 
		aire(frame);
		calefaccion(frame);
		tamanoCamas(frame);
		TV(frame);
		cafetera(frame);
		hipo(frame);
		plancha(frame);
		secador(frame);
		voltaje(frame);
		usba(frame);
		usbc(frame);
		desayuno(frame);
		
	}
	public static void main (String[ ] args) {
		NuevoCuarto interfaz= new NuevoCuarto();
        interfaz.setLocationRelativeTo( null );
        interfaz.getContentPane().setBackground(new Color (244,238,226));
        interfaz.setVisible( true );
        
        
	}
	public void cerrar(JFrame frame) {
		cerrar=new JButton("Crear Cuarto");
		cerrar.setVisible(true);
		cerrar.addActionListener(this);
		frame.add(cerrar, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource()== SNumero) {
			nombre=TNumero.getText();
			System.out.println(nombre);
			TNumero.setEditable(false);
			SNumero.setEnabled(false);
		}
		if ( e.getSource()== SUbicacion) {
			ubicacion=TUbicacion.getText();
			TUbicacion.setEditable(false);
			SUbicacion.setEnabled(false);
		}
		if ( e.getSource()== SCapacidad) {
			capacidad=Integer.parseInt(TCapacidad.getText());
			TCapacidad.setEditable(false);
			SCapacidad.setEnabled(false);
		}
		if ( e.getSource()== SCamas) {
			numcamas=Integer.parseInt(TCamas.getText());
			TCamas.setEditable(false);
			SCamas.setEnabled(false);
		}
		if ( e.getSource()== STamanos) {
			System.out.println(TTamanos.getText());
			tamano=TTamanos.getText();
			TTamanos.setEditable(false);
			STamanos.setEnabled(false);
		}
		if ( e.getSource()== STamanoCamas) {
			tamanoscamas=TTamanoCamas.getText();
			TTamanoCamas.setEditable(false);
			STamanoCamas.setEnabled(false);
		}
		if ( e.getSource()== STipo) {
			tipo=TTipo.getText();
			TTipo.setEditable(false);
			STipo.setEnabled(false);
		}
		if ( e.getSource()== SExtra) {
			extras=TExtra.getText();
			TExtra.setEditable(false);
			SExtra.setEnabled(false);
		}
		if ( e.getSource()== STarifa) {
			tarifa=TTarifa.getText();
			TTarifa.setEditable(false);
			STarifa.setEnabled(false);
		}
		if ( e.getSource()== SAire) {
			aire=Boolean.parseBoolean(TAire.getText());
			TAire.setEditable(false);
			SAire.setEnabled(false);
		}
		if ( e.getSource()== SCalefaccion) {
			calefaccion=Boolean.parseBoolean(TCalefaccion.getText());
			TCalefaccion.setEditable(false);
			SCalefaccion.setEnabled(false);
		}
		if ( e.getSource()== STv) {
			television=Boolean.parseBoolean(TTv.getText());
			TTv.setEditable(false);
			STv.setEnabled(false);
		}
		if ( e.getSource()== SCafe) {
			cafetera=Boolean.parseBoolean(TCafe.getText());
			TCafe.setEditable(false);
			SCafe.setEnabled(false);
		}
		if ( e.getSource()== SHipo) {
			hipo=Boolean.parseBoolean(THipo.getText());
			THipo.setEditable(false);
			SHipo.setEnabled(false);
		}
		if ( e.getSource()== SPlancha) {
			plancha=Boolean.parseBoolean(TPlancha.getText());
			TPlancha.setEditable(false);
			SPlancha.setEnabled(false);
		}
		if ( e.getSource()== SSecador) {
			secador=Boolean.parseBoolean(TSecador.getText());
			TSecador.setEditable(false);
			SSecador.setEnabled(false);
		}
		if ( e.getSource()== SUA) {
			usba=Boolean.parseBoolean(TUA.getText());
			TUA.setEditable(false);
			SUA.setEnabled(false);
		}
		if ( e.getSource()== SUC) {
			usbc=Boolean.parseBoolean(TUC.getText());
			TUC.setEditable(false);
			SUC.setEnabled(false);
		}
		if ( e.getSource()== SDesayuno) {
			desayuno=Boolean.parseBoolean(TDesayuno.getText());
			TDesayuno.setEditable(false);
			SDesayuno.setEnabled(false);
		}
		if ( e.getSource()== SVoltaje) {
			voltaje=TVoltaje.getText();
			TVoltaje.setEditable(false);
			SVoltaje.setEnabled(false);
		}
		if (e.getSource()==cerrar) {
			Habitacion nuevo = new Habitacion(nombre, ubicacion, capacidad, numcamas, tamano, tipo, extras, tarifa,aire,calefaccion,tamanoscamas,television,cafetera,hipo,plancha,secador,voltaje,usba,usbc,desayuno);
		    Coordinador.anadir(nuevo,nombre);
		    Coordinador.escribirArchivo();
		    this.dispose();
		    JOptionPane.showMessageDialog(null, "Habitacion Cargada", "Habitacion", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
	}
	
	
	private void numero(JFrame frame) {
		JPanel base = new JPanel (); 
		base.setBackground(new Color(244,238,226));
		base.setLayout(new BorderLayout());
		base.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Ingrese el numero de la Habitacion");
		label.setVisible(true);
		base.add(label,BorderLayout.NORTH);
		JPanel control= new JPanel();
		control.setBackground(new Color(244,238,226));
		control.setLayout(new BorderLayout());
		control.setVisible(true);
		
		TNumero= new JTextField(); 
		TNumero.setPreferredSize(new Dimension(250,40));
		TNumero.setVisible(true);
		SNumero=new JButton("Submit");
		SNumero.setVisible(true);
		SNumero.addActionListener(this);
		
		
		control.add(TNumero,BorderLayout.WEST);
		control.add(SNumero,BorderLayout.EAST);
		base.add(control, BorderLayout.CENTER);
		base.setVisible(true);
		centro.add(base);
		frame.add(centro, BorderLayout.CENTER);	
	}
	private void ubicacion(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Ingrese la ubicacion de la Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TUbicacion= new JTextField(); 
		TUbicacion.setPreferredSize(new Dimension(190,40));
		TUbicacion.setVisible(true);
		SUbicacion=new JButton("Submit");
		SUbicacion.setVisible(true);
		SUbicacion.addActionListener(this);
		
		
		control1.add(TUbicacion,BorderLayout.WEST);
		control1.add(SUbicacion,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void capacidad(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Ingrese la capacidad de la Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TCapacidad= new JTextField(); 
		TCapacidad.setPreferredSize(new Dimension(190,40));
		TCapacidad.setVisible(true);
		SCapacidad=new JButton("Submit");
		SCapacidad.setVisible(true);
		SCapacidad.addActionListener(this);
		
		
		control1.add(TCapacidad,BorderLayout.WEST);
		control1.add(SCapacidad,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
		}
	private void camas(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Ingrese la cantidad de camas en la Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TCamas= new JTextField(); 
		TCamas.setPreferredSize(new Dimension(190,40));
		TCamas.setVisible(true);
		SCamas=new JButton("Submit");
		SCamas.setVisible(true);
		SCamas.addActionListener(this);
		
		
		control1.add(TCamas,BorderLayout.WEST);
		control1.add(SCamas,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
		}
	private void tamanos (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Ingrese los tamanos de camas");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TTamanos= new JTextField(); 
		TTamanos.setPreferredSize(new Dimension(190,40));
		TTamanos.setVisible(true);
		STamanos=new JButton("tamanos");
		STamanos.setVisible(true);
		STamanos.addActionListener(this);
		
		
		control1.add(TTamanos,BorderLayout.WEST);
		control1.add(STamanos,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
		
		
		
	}
	private void tipo (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tipo de Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TTipo= new JTextField(); 
		TTipo.setPreferredSize(new Dimension(190,40));
		TTipo.setVisible(true);
		STipo=new JButton("Submit");
		STipo.setVisible(true);
		STipo.addActionListener(this);
		
		
		control1.add(TTipo,BorderLayout.WEST);
		control1.add(STipo,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void extras (JFrame frame){
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Extras en la Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TExtra= new JTextField(); 
		TExtra.setPreferredSize(new Dimension(190,40));
		TExtra.setVisible(true);
		SExtra=new JButton("Submit");
		SExtra.setVisible(true);
		SExtra.addActionListener(this);
		
		
		control1.add(TExtra,BorderLayout.WEST);
		control1.add(SExtra,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void tarifa (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tarifa de la Habitacion");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TTarifa= new JTextField(); 
		TTarifa.setPreferredSize(new Dimension(190,40));
		TTarifa.setVisible(true);
		STarifa=new JButton("Submit");
		STarifa.setVisible(true);
		STarifa.addActionListener(this);
		
		
		control1.add(TTarifa,BorderLayout.WEST);
		control1.add(STarifa,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void aire (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene aire acondicionado? (true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TAire= new JTextField(); 
		TAire.setPreferredSize(new Dimension(190,40));
		TAire.setVisible(true);
		SAire=new JButton("Submit");
		SAire.setVisible(true);
		SAire.addActionListener(this);
		
		
		control1.add(TAire,BorderLayout.WEST);
		control1.add(SAire,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
		
	}
	private void calefaccion (JFrame frame){
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene calefaccion? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TCalefaccion= new JTextField(); 
		TCalefaccion.setPreferredSize(new Dimension(190,40));
		TCalefaccion.setVisible(true);
		SCalefaccion=new JButton("Submit");
		SCalefaccion.setVisible(true);
		SCalefaccion.addActionListener(this);
		
		
		control1.add(TCalefaccion,BorderLayout.WEST);
		control1.add(SCalefaccion,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
		}
	private void tamanoCamas(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Dimensiones de camas?(separadas por comas)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TTamanoCamas= new JTextField(); 
		TTamanoCamas.setPreferredSize(new Dimension(190,40));
		TTamanoCamas.setVisible(true);
		STamanoCamas=new JButton("Submit");
		STamanoCamas.setVisible(true);
		STamanoCamas.addActionListener(this);
		
		
		control1.add(TTamanoCamas,BorderLayout.WEST);
		control1.add(STamanoCamas,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void TV(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene television? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TTv= new JTextField(); 
		TTv.setPreferredSize(new Dimension(190,40));
		TTv.setVisible(true);
		STv=new JButton("Submit");
		STv.setVisible(true);
		STv.addActionListener(this);
		
		
		control1.add(TTv,BorderLayout.WEST);
		control1.add(STv,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void cafetera (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene Cafetera? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TCafe= new JTextField(); 
		TCafe.setPreferredSize(new Dimension(190,40));
		TCafe.setVisible(true);
		SCafe=new JButton("Submit");
		SCafe.setVisible(true);
		SCafe.addActionListener(this);
		
		
		control1.add(TCafe,BorderLayout.WEST);
		control1.add(SCafe,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void hipo (JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Camas y tapetes Hipoalergenicos? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		THipo= new JTextField(); 
		THipo.setPreferredSize(new Dimension(190,40));
		THipo.setVisible(true);
		SHipo=new JButton("Submit");
		SHipo.setVisible(true);
		SHipo.addActionListener(this);
		
		
		control1.add(THipo,BorderLayout.WEST);
		control1.add(SHipo,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void plancha(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene plancha? (escriba true o false) ");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TPlancha= new JTextField(); 
		TPlancha.setPreferredSize(new Dimension(190,40));
		TPlancha.setVisible(true);
		SPlancha=new JButton("Submit");
		SPlancha.setVisible(true);
		SPlancha.addActionListener(this);
		
		
		control1.add(TPlancha,BorderLayout.WEST);
		control1.add(SPlancha,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void secador(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene secador de pelo? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TSecador= new JTextField(); 
		TSecador.setPreferredSize(new Dimension(190,40));
		TSecador.setVisible(true);
		SSecador=new JButton("Submit");
		SSecador.setVisible(true);
		SSecador.addActionListener(this);
		
		
		control1.add(TSecador,BorderLayout.WEST);
		control1.add(SSecador,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void voltaje(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Cual es el voltaje?");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TVoltaje= new JTextField(); 
		TVoltaje.setPreferredSize(new Dimension(190,40));
		TVoltaje.setVisible(true);
		SVoltaje=new JButton("Submit");
		SVoltaje.setVisible(true);
		SVoltaje.addActionListener(this);
		
		
		control1.add(TVoltaje,BorderLayout.WEST);
		control1.add(SVoltaje,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void usba(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene tomas USB-A? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TUA= new JTextField(); 
		TUA.setPreferredSize(new Dimension(190,40));
		TUA.setVisible(true);
		SUA=new JButton("Submit");
		SUA.setVisible(true);
		SUA.addActionListener(this);
		
		
		control1.add(TUA,BorderLayout.WEST);
		control1.add(SUA,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void usbc(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Tiene tomas USB-C? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TUC= new JTextField(); 
		TUC.setPreferredSize(new Dimension(190,40));
		TUC.setVisible(true);
		SUC=new JButton("Submit");
		SUC.setVisible(true);
		SUC.addActionListener(this);
		
		
		control1.add(TUC,BorderLayout.WEST);
		control1.add(SUC,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
	private void desayuno(JFrame frame) {
		JPanel base1 = new JPanel (); 
		base1.setBackground(new Color(244,238,226));
		base1.setLayout(new BorderLayout());
		base1.setVisible(true);
		
		JLabel label1 = new JLabel();
		label1.setText("Desayuno incluido? (escriba true o false)");
		label1.setVisible(true);
		base1.add(label1,BorderLayout.NORTH);
		JPanel control1= new JPanel();
		control1.setBackground(new Color(244,238,226));
		control1.setLayout(new BorderLayout());
		control1.setVisible(true);
		
		TDesayuno= new JTextField(); 
		TDesayuno.setPreferredSize(new Dimension(190,40));
		TDesayuno.setVisible(true);
		SDesayuno=new JButton("Submit");
		SDesayuno.setVisible(true);
		SDesayuno.addActionListener(this);
		
		
		control1.add(TDesayuno,BorderLayout.WEST);
		control1.add(SDesayuno,BorderLayout.EAST);
		base1.add(control1, BorderLayout.CENTER);
		base1.setVisible(true);
		centro.add(base1);
		frame.add(centro, BorderLayout.CENTER);
	}
}
