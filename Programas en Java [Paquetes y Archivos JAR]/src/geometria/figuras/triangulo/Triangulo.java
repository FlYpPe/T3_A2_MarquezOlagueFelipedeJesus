package geometria.figuras.triangulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Triangulo extends JFrame{
	
	 private double perimnetro;
	 private double a;
	 private double b;
	 private double c;
	 private JLabel lb4;
	 private JLabel lb9;
	 
	 public Triangulo() {
		 getContentPane().setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("Elipse");
			setSize(350, 280);
			setLocationRelativeTo(null);
			setVisible(true);

			JLabel lb1 = new JLabel();
			lb1.setText("Area de un triangulo");
			lb1.setBounds(10, 5, 180, 15);
			add(lb1);

			JLabel lb2 = new JLabel();
			lb2.setText("Area: ");
			lb2.setBounds(10, 25, 100, 15);
			add(lb2);

			JLabel lb3 = new JLabel();
			lb3.setText("Ingrese lado a ");
			lb3.setBounds(10, 45, 140, 15);
			add(lb3);

			JTextField susc = new JTextField(10);
			susc.setBounds(10, 65, 140, 20);
			add(susc);

			JLabel lb7 = new JLabel();
			lb7.setText("Ingrese lado b");
			lb7.setBounds(160, 45, 140, 15);
			add(lb7);

			JTextField susc2 = new JTextField(10);
			susc2.setBounds(160, 65, 140, 20);
			add(susc2);
			
			JLabel lb8 = new JLabel();
			lb8.setText("Ingrese lado c");
			lb8.setBounds(10, 90, 140, 15);
			add(lb8);

			JTextField susc3 = new JTextField(10);
			susc3.setBounds(10, 115, 140, 20);
			add(susc3);

			JButton b1 = new JButton("Calcular");
			b1.setBounds(10, 145, 100, 15);
			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					calcularArea(Double.parseDouble(susc.getText()), Double.parseDouble(susc2.getText()), Double.parseDouble(susc3.getText()));
					calcularPerimetro(Double.parseDouble(susc.getText()), Double.parseDouble(susc2.getText()), Double.parseDouble(susc3.getText()));
				}
			});
			add(b1);

			lb4 = new JLabel("Area");
			lb4.setBounds(10, 170, 10000, 20);
			add(lb4);
			lb9 = new JLabel("Perimetro");

			lb9.setBounds(10, 200, 100, 20);
			add(lb9);
	 }
	 
	 protected void calcularPerimetro(double a, double b, double c) {
		 lb9.setText("Perimetro: " + (a+b+c));	
	}
	 
	 protected void calcularArea(double a, double b, double c) {
		 double p = (a+b+c)/2;
		 lb4.setText("Area: " + Math.sqrt(p*((p-a)*(p-b)*(p-c))));		
		 System.out.println("Area: " + Math.sqrt(p*((p-a)*(p-b)*(p-c))));
	}
}
