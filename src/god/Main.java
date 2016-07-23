package god;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	
	//private static int k;
	static Cashier cashier1;
	static Cashier cashier2;
	static Cashier cashier3;

	public static void main(String s[]) {
		
		//private static int k;
		cashier1 = new Cashier(1);
		cashier2 = new Cashier(2);
		cashier3 = new Cashier(3);
		
		//k = 0;

		JFrame frame = new JFrame("Homework 4");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("Cashier Simulation");

		JButton create= new JButton();
		create.setText("Create Cashier");
		JButton writeFile = new JButton();
		writeFile.setText("Write to file");
		JButton execute = new JButton();
		execute.setText("Run!");

		panel.add(label);
		panel.add(create);
		panel.add(writeFile);
		panel.add(execute);
		
		writeFile.setLocation(100, 100);
		create.setLocation(300,300);
		execute.setLocation(500,100);
		execute.setBackground(Color.red);
		
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	public Cashier chooseCashier(Cashier[] cashiers)
	{
		//boolean length = Math.random() < 0.5? true: false;
		Cashier bestCashier = cashiers[0];
		double bestSoFar = 999999;
		for(Cashier c : cashiers)
		{
			double temp = c.getLength() * c.getSpeed() + .5;
			if(temp < bestSoFar)
			{
				bestCashier = c;
				bestSoFar = temp;
			}
		}
		return bestCashier;
	}
	
	 @Override
	 public void actionPerformed(ActionEvent e) {
	        String command = e.getActionCommand();

	        if (command.equals("execute")) {
	            myMethod();
	        }
	    }

	    public void myMethod() {
	        cashier1.run();
	        cashier2.run();
	        cashier3.run();
	    }
}
