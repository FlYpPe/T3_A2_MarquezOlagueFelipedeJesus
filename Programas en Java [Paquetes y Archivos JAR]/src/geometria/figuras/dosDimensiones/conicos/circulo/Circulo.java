package geometria.figuras.dosDimensiones.conicos.circulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circulo extends JFrame{

	private double radio;
	private JLabel lb4;
	private JLabel lb6;
	public Circulo() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Circulo");
		setSize(200, 230);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lb1 = new JLabel();
		lb1.setText("Area y perimetro del circulo");
		lb1.setBounds(10, 5, 180, 15);
		add(lb1);
		
		JLabel lb2 = new JLabel();
		lb2.setText("Area: ");
		lb2.setBounds(10, 25, 100, 15);
		add(lb2);
		
		JLabel lb3 = new JLabel();
		lb3.setText("Ingrese el radio: ");
		lb3.setBounds(10, 45, 100, 15);
		add(lb3);
		
		JTextField susc = new JTextField(10);
		
		
		susc.setBounds(10, 65, 100, 20);
		add(susc);
		
		JButton b1 = new JButton("Calcular");
		b1.setBounds(10, 90, 100, 15);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(susc.getText());
				calcularArea(Double.parseDouble(susc.getText()));
				calcularPerimetro(Double.parseDouble(susc.getText()));
			}
		});
		add(b1);
		
		lb4 = new JLabel();
		lb4.setText("Area: ");
		lb4.setBounds(10, 110, 100, 20);
		add(lb4);
		
		JLabel lb5 = new JLabel();
		lb5.setText("Perimetro");
		lb5.setBounds(10, 135, 100, 15);
		add(lb5);
		
		lb6 = new JLabel();
		lb6.setText("Perimetro: ");
		lb6.setBounds(10, 155, 100, 15);
		add(lb6);
		
	}
	
	
	protected void calcularArea(double a) {
		
		lb4.setText("Area: " + Math.PI * a*a);
		
	}
	
	protected void calcularPerimetro(double a) {
		lb6.setText("Perimetro: " + Math.PI * Math.PI * a);
	}
}
