package god;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String s[]) {

		JFrame frame = new JFrame("Homework 4");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("Cashier Simulation");

		JButton create= new JButton();
		create.setText("Create Cashier");
		JButton writeFile = new JButton();
		writeFile.setText("Write to file!");

		panel.add(label);
		panel.add(create);
		panel.add(writeFile);
		
		writeFile.setLocation(100, 100);
		create.setLocation(300,300);

		frame.add(panel);
		frame.setSize(500, 200);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
