package geometria.figuras.dosDimensiones.conicos.elipse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elipse extends JFrame {

	private double radMayor;
	private double radMenor;
	private JLabel lb4;


	public Elipse() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Elipse");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel lb1 = new JLabel();
		lb1.setText("Area de una Elipse");
		lb1.setBounds(10, 5, 180, 15);
		add(lb1);

		JLabel lb2 = new JLabel();
		lb2.setText("Area: ");
		lb2.setBounds(10, 25, 100, 15);
		add(lb2);

		JLabel lb3 = new JLabel();
		lb3.setText("Ingrese el radio mayor: ");
		lb3.setBounds(10, 45, 140, 15);
		add(lb3);

		JTextField susc = new JTextField(10);
		susc.setBounds(10, 65, 140, 20);
		add(susc);

		JLabel lb7 = new JLabel();
		lb7.setText("Ingrese el radio menor: ");
		lb7.setBounds(160, 45, 140, 15);
		add(lb7);

		JTextField susc2 = new JTextField(10);
		susc2.setBounds(160, 65, 140, 20);
		add(susc2);

		JButton b1 = new JButton("Calcular");
		b1.setBounds(10, 90, 100, 15);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcularArea(Double.parseDouble(susc.getText()), Double.parseDouble(susc2.getText()));
				
			}
		});
		add(b1);

		lb4 = new JLabel();
		lb4.setText("Area: ");
		lb4.setBounds(10, 110, 100, 20);
		add(lb4);

	}

	protected void calcularArea(double a, double b) {
		lb4.setText("Area: " + Math.PI * a*b);
	}


}
