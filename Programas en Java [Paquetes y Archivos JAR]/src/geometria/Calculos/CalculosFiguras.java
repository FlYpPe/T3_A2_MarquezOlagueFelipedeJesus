package geometria.Calculos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import geometria.figuras.dosDimensiones.conicos.circulo.Circulo;
import geometria.figuras.dosDimensiones.conicos.elipse.Elipse;
import geometria.figuras.dosDimensiones.rombo.Rombo;
import geometria.figuras.tresDimensiones.cono.Cono;
import geometria.figuras.tresDimensiones.piramide.Piramide;
import geometria.figuras.triangulo.Triangulo;

class Gui extends JFrame{
	
	private JComboBox<String> comboTemperaturas;
	
	public Gui() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculos Figuras");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		String items[] = { "Circulo", "Elipse", "Rombo", "Cono", "Piramide", "Triangulo"};
		comboTemperaturas = new JComboBox<String>(items);
		comboTemperaturas.setBounds(10, 10, 100, 20);
		add(comboTemperaturas);
		
		JButton b1 = new JButton("Abrir");
		b1.setBounds(10,40,35,25);
		add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (comboTemperaturas.getSelectedIndex() == 0) {
					new Circulo();
				}else if (comboTemperaturas.getSelectedIndex() == 1) {
					new Elipse();
				}else if (comboTemperaturas.getSelectedIndex() == 2) {
					new Rombo();
				}else if (comboTemperaturas.getSelectedIndex() == 3) {
					new Cono();
				}else if (comboTemperaturas.getSelectedIndex() == 4) {
					new Piramide();
				}else if (comboTemperaturas.getSelectedIndex() == 5) {
					new Triangulo();
				}					
				
				
			}
		});
		
		
	}
}

public class CalculosFiguras {

	public static void main(String[] args) {
		
		

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

			new Gui();
			
			}
		});
		
		
	}

}
