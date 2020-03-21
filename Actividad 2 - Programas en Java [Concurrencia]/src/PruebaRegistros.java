import java.util.ArrayList;

import javax.swing.*;

class VentanaNullLayout extends JFrame {

	JProgressBar pb = new JProgressBar();
	JProgressBar pb2 = new JProgressBar();
	JTextArea tA1 = new JTextArea();
	JLabel lb1 = new JLabel();
	JLabel lb2 = new JLabel();
	JTextArea tA2 = new JTextArea();

	public VentanaNullLayout() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Twitter");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		pb = new JProgressBar();
		pb.setBounds(10, 140, 100, 15);
		add(pb);
		

		tA1 = new JTextArea();
		tA1.setBounds(10, 10, 80, 100);
		add(tA1);

		tA2 = new JTextArea();
		tA2.setBounds(100, 10, 80, 100);
		add(tA2);
		
		pb2 = new JProgressBar();
		pb2.setBounds(10, 180, 100, 15);
		add(pb2);
		
		lb1 = new JLabel();
		lb1.setBounds(10, 120, 100, 15);
		add(lb1);
		
		lb2 = new JLabel();
		lb2.setBounds(10, 160, 100, 15);
		add(lb2);
	}

	public void setPb(int a) {
		this.pb.setValue(a);
	}
	
	public void setPb2(int a) {
		this.pb2.setValue(a);
	}

	public void settA1(String a) {
		
		this.tA1.append("\n" + a);
	}

	public void settA2(String a) {
		
		this.tA2.append("\n" + a);
	}
	
	public void setlb1(String a) {
		this.lb1.setText(a);
	}
	public void setlb2(String a) {
		this.lb2.setText(a);
	}

}

class obtenerRegistros {
	
	
	public ArrayList<Boolean> generarRegistros(int cant) {
		ArrayList<Boolean> lista = new ArrayList<Boolean>();
		for (int i = 0; i < cant; i++) {
			if (Math.random() * 2 > 1) {
				lista.add(true);

			} else {
				lista.add(false);
			}

		}

		return lista;
	}
}

class mostrarRegistros implements Runnable {

	private ArrayList<Boolean> a;
	private VentanaNullLayout va;

	public mostrarRegistros(ArrayList<Boolean> a, VentanaNullLayout va) {
		this.a = a;
		this.va = va;
	}

	@Override
	public void run() {
		synchronized (va) {
			for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == true) {
				va.settA1("Si");
				
			} else {
				va.settA2("No");
			}
		}
		}

		

	}

}

class mostrarHistograma implements Runnable {
	
	private ArrayList<Boolean> arr;
	private VentanaNullLayout va;

	public mostrarHistograma(ArrayList<Boolean> a, VentanaNullLayout va) {
		this.arr = a;
		this.va = va;
	}

	@Override
	public void run() {
		

		double a = 0;
		double b = 0;
		for (int i = 0; i < arr.size(); i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			if (arr.get(i)== true) {
				a+=1;
				va.setPb((int) (a/(arr.size()/100)));
				
				
				
				
				va.setlb1(String.valueOf(a));
			}else {
				b+=1;
				va.setPb2((int) (b/(arr.size()/100)));
				va.setlb2(String.valueOf(b));
			}
			
			
		}

	}

}

public class PruebaRegistros {

	public static void main(String[] args) {

		VentanaNullLayout vn = new VentanaNullLayout();
		;
		obtenerRegistros reg = new obtenerRegistros();

		ArrayList<Boolean> arr = reg.generarRegistros(100000);

		mostrarRegistros mr = new mostrarRegistros(arr, vn);
		
		
		
		mostrarHistograma mh = new mostrarHistograma(arr, vn);

		Thread t1 = new Thread(mr);
		t1.start();
		Thread t2 = new Thread(mh);
		t2.start();
	}

}
