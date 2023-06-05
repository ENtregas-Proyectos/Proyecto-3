package CargaDinamica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tarjetas extends JFrame

{
	private ArrayList<ITarjetas> tjs;
	private JPanel optionsPanel;
	private int numero;
	
	public static void main(String[] args)
	{
		Tarjetas tj = new Tarjetas();

	}


	
	public Tarjetas()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout( new GridLayout( numero,1 ) );	
        add(optionsPanel, BorderLayout.CENTER);
        loadClassesFromTextFile("./data/tarjetas.txt");
        setVisible(true);
	}


	private void loadClassesFromTextFile(String fileName) 
	{
		try
		{
			
			FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String className;
            List<String> classNames = new ArrayList<>();

            while ((className = bufferedReader.readLine()) != null) 
            {
                classNames.add(className);
            }

            bufferedReader.close();
            
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			tjs = new ArrayList<ITarjetas>();
			String linea = br.readLine();
			
			
			for (String name : classNames) 
			{
				numero +=1;
				String paquete = "CargaDinamica";
                Class<?> cls = Class.forName(paquete+"."+name);
                Tarjeta obj = (Tarjeta) cls.getDeclaredConstructor().newInstance();
                
                JButton btnN = new JButton(name);
                optionsPanel.add(btnN);
                
			}
				
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al leer el archivo", "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
