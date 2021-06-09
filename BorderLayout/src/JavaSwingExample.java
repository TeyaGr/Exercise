import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwingExample {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Code Academy");
		JPanel p = new JPanel();
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		p.setBounds(200,200,200,200);
		p.setBackground(Color.BLUE);
		f.add(p);
		JButton b1 = new JButton("Tei4ka");
		b1.setBounds(10,10,20,20);
		b1.setBackground(Color.CYAN);
		p.add(b1);
	}
}
