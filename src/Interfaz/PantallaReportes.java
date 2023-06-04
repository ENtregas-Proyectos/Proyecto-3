package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Modelo.CoordinadorDeServicios;

public class PantallaReportes extends JFrame implements ActionListener 
{
	
	private JButton btnVentasPorProducto;
	private JButton btnValorDeFacturas;
	private JButton btnRelacionConsumosNoche;
	private CoordinadorDeServicios cooServicios;
	private JLabel labelTitulo;
	private JLabel espacio;
	private PanelLogo panelLogo;
	
	public PantallaReportes() 
	{
		
		
		cooServicios = new CoordinadorDeServicios();
		getContentPane().setBackground(new Color (244,238,226));
		setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		setLayout( new GridLayout( 7,1 ) );
        setSize( 1400,550 );
        setVisible(true);
        
		setLayout( new BorderLayout( ) );
        
		PanelLogo(this);
		
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color (244,238,226));
        panelCentro.setLayout( new GridLayout( 7,1 ) );		
		
        labelTitulo = new JLabel("En que momento desea realizar el pago? ");
        labelTitulo.setOpaque(true);
        panelCentro.add(labelTitulo);
        
        espacio = new JLabel();
        panelCentro.add(espacio);
		
        
        btnVentasPorProducto = new JButton("Ventas por producto");
        panelCentro.add(btnVentasPorProducto);
		
        espacio = new JLabel();
        panelCentro.add(espacio);
		
        
		btnValorDeFacturas = new JButton("Valor de las facturas");
		panelCentro.add(btnValorDeFacturas);
		
		espacio = new JLabel();
		panelCentro.add(espacio);
		
		btnRelacionConsumosNoche = new JButton("Relación valores entre consumo y noche");
		panelCentro.add(btnRelacionConsumosNoche);
		
		
		add(panelCentro, BorderLayout.CENTER);
		
	

	}
	
	public void PanelLogo(JFrame frame) {
		//frame.setResizable(false);
		panelLogo= new PanelLogo(frame);
		frame.setLayout(new BorderLayout());
	    frame.add(panelLogo, BorderLayout.NORTH);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource( )==btnVentasPorProducto)
        {
            
            
        }
		
		if(e.getSource( )==btnValorDeFacturas)
        {
            
            
        }
		
		if(e.getSource( )==btnRelacionConsumosNoche)
        {
            
            
        }
		
	}

}
