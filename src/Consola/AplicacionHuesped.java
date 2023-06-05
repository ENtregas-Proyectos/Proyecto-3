package Consola;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Modelo.Administrador;
import Modelo.Huespedus;
import Modelo.Recepcionista;
import Modelo.Trabajador;
import Interfaz.PanelLogo; 


public class AplicacionHuesped extends JFrame implements ActionListener{
	
	ArrayList<Huespedus> listaHuespedes= new ArrayList<Huespedus>();
	private static PanelLogo panelLogo;
	private static JButton NuevoUsuario;
	private static JButton IniciarSesion;
	
	
	public AplicacionHuesped() {
		setLocationRelativeTo(null);
		setTitle("Aplicacion Usuario");
		getContentPane().setBackground(new Color (244,238,226));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(1400,700);
		setBackground(new Color (244,238,226));
	
		PanelLogo(this);
		botones(this);
		IniciarSesion.addActionListener(this);
		NuevoUsuario.addActionListener(this);
	}

	public void PanelLogo(JFrame frame) {
		panelLogo= new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
	    frame.add(panelLogo, BorderLayout.NORTH);
	}
	
	
	public static void botones (JFrame frame) {
		JPanel base = new JPanel();
		
		base.setBackground(new Color(244,238,226));
		base.setPreferredSize(new Dimension(100,100));
		base.setVisible(true);
		
		IniciarSesion= new JButton("Iniciar Sesion");
		NuevoUsuario = new JButton("Nuevo Usuario");
		
		base.add(NuevoUsuario);
		base.add(IniciarSesion);
		frame.add(base, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		AplicacionHuesped aplicacion = new AplicacionHuesped();
	
	}
	
	public void crearCuentaHuesped() {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    	String login = JOptionPane.showInputDialog("Ingrese su login");
        String contrasena = JOptionPane.showInputDialog("Ingrese su Contraseña");
        Huespedus huesped = new Huespedus(login, nombre, contrasena);
        listaHuespedes.add(huesped);
        JOptionPane.showMessageDialog(null, "Usuario Creado");
       	
	}

	public void iniciarsesion() {
		String login = JOptionPane.showInputDialog("Ingrese su login:  ");
		String clave = JOptionPane.showInputDialog("Ingrese su clave:  ");
		for (int a =0 ; a<listaHuespedes.size();a++) {
			if (listaHuespedes.get(a).getLogin().equals(login) && listaHuespedes.get(a).getClave().equals(clave)) {
				
				
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource()== NuevoUsuario) {
			crearCuentaHuesped();
		}
		if(e.getSource()==IniciarSesion) {
			iniciarsesion();
			MenuHuesped menu = new MenuHuesped();
		}
		
	}

}
