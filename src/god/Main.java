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
	
    public void createMakePeople(){
    	new makePeople();
    }
    
    public class makePeople implements Runnable {

        public Thread th;
    	
    	makePeople(){
    		System.out.println("will start making people");
    		th = new Thread(this, "makePeople");
    		th.start();
    	}
    	
   
		@Override
		public void run() {
			while(true){
				
				try {
					Thread.sleep(500);
					//generate number to decide which line a random person should go
					int randomNum = 1 + (int)(Math.random() * 3); 
					
					//create a random 6 letter name
					String a = new randomString(6).nextString();
					Person person = new Person(a.toString(), "hi", 1);
					
					switch (randomNum) {
		            case 1:  System.out.println(person.getName() + " is added to cashier 1");
		            		 cashier1.joinQueue(person);
		                     break;
		            case 2:  System.out.println(person.getName() + " is added to cashier 2");
		            		 cashier2.joinQueue(person);
		                     break;
		            case 3:  System.out.println(person.getName() +  " is added to cashier 3");
		            		 cashier3.joinQueue(person);
		                     break;
		            default: System.out.println("Something is going on in makePeople");
		                     break;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    }		
    	
    
	
	//create a thread to insert people
	public void createPeople() {
		
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
	        createMakePeople();
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		
		new Main();

	}
}
