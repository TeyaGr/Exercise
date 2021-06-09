package Factory;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ComputerFactoryMain {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton("Submit");
		JTextField tf = new JTextField("Enter text here...");
		JTextField result = new JTextField("Result");

		f.add(tf, BorderLayout.NORTH);
		f.add(b1, BorderLayout.CENTER);
		f.add(result, BorderLayout.SOUTH);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String type = tf.getText();
				Computer c = ComputerFactory.getComputer(type);
				if (c != null) {
					result.setText(c.toString());
				} else {
					result.setText("Object is null");
				}
			}
		});

		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


}
