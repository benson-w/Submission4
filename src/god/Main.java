package god;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main implements ActionListener {
	
	//private static int k;
	static Cashier cashier1;
	static Cashier cashier2;
	static Cashier cashier3;
	
	JButton create= new JButton("Create");
	JButton writeFile = new JButton("WriteFile");
	JButton execute = new JButton("Execute");
	
	Main() {
		// TODO Auto-generated method stub
		//private static int k;
		cashier1 = new Cashier(1);
		cashier2 = new Cashier(2);
		cashier3 = new Cashier(3);
	
		JFrame frame = new JFrame("Homework 4");
		frame.setLayout(new FlowLayout());
		JLabel label = new JLabel("Cashier Simulation");
		
	    create.addActionListener(this);
	    writeFile.addActionListener(this);
	    execute.addActionListener(this);
		
		frame.add(label);
		frame.add(create);
		frame.add(writeFile);
		frame.add(execute);
		
		writeFile.setLocation(100, 100);
		create.setLocation(300,300);
		execute.setLocation(500,100);
		execute.setBackground(Color.red);
		
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
	public void actionPerformed(ActionEvent ae) {
		String ac = ae.getActionCommand();
		
		if (ac.equals("Execute")) {
		
			System.out.println("Run is pressed!");
			//Thread t = new Thread(new Cashier.run());
			cashier1.createCashierRunner();
	        cashier2.createCashierRunner();
	        cashier3.createCashierRunner();
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		
		new Main();

	}
}
