package god;

import java.io.FileOutputStream;
import java.io.PrintWriter;


class MyQueue {
	
	//private Person [] store;
    private int length;
    private static Node front;
	private Node back;
    public static String[] toSort;
    
//    public void toStore(){
//    	int i = 0;
//    	
//    	for (Iterator iterator = new Iterator(front); !(iterator.getCurrent().getNext() == null); iterator.plusPlus()){
//    		toSort.
//    		iterator.getCurrent().getPerson().getName();
//    		i++;
//    	}
//    }
    
    public String[] getArray() {
    	return toSort;
    }

	//private MyQueue ordered = new MyQueue();
 
    
    public MyQueue(){
    	length = 0;
    	front = null;
    	back = null;
    }
    
    public int getLength(){
    	
    	
    	
    	return this.length;
    }
    
    public boolean isEmpty(){
        return this.length == 0;
    }
    
//    static void add(String a, String b, int c){
//    
//    	
//    	for (Iterator i = new Iterator(front); i.getCurrent().getNext() != null; i.plusPlus()) {
//
//    		Person person = new Person(a, b, c);
//    		Node nodea = new Node(person);
//    		
//           if (i.getCurrent().getNext().getNext() == null) {
//        	   i.getCurrent().getNext().setNext(nodea);
//        	   return;
//           }
//
//    	}
    	
    	
    	//length++;
   // }
    
    public void checkInfo(String j){
    	
    	boolean thereis = false;
    	
    	 for (Iterator i = new Iterator(front); i.getCurrent().getNext() != null; i.plusPlus()) {

             if (i.getCurrent().getPerson().getInfo().equals(j)) {
                   System.out.println(i.getCurrent().getPerson().getName() + " is a " + j);
                   thereis = true;
             }

       }
    	 
    	 if (thereis == false){
    		 System.out.println("No people of info " + j + " can be found.");
    	 }
    }
    
    public void writeFile(String file){
    	
    	try {
    	
	    	FileOutputStream output = new FileOutputStream(file);
			PrintWriter pw = new PrintWriter(output, true);
			
			for (Iterator i = new Iterator(front); i.getCurrent().getNext() != null; i.plusPlus()) {
	
	            pw.println(i.getCurrent().getPerson().getName() + " " + i.getCurrent().getPerson().getInfo());
	
			}
			
			pw.close();
		
    	} catch (Exception e) {
    		System.out.println("Error: " + e.getMessage());
    	}
		
		
    }
    
    public void find(String n) {

        // For displaying where in the queue the person is
        int j = 1;

        for (Iterator i = new Iterator(front); i.getCurrent().getNext() != null; i.plusPlus()) {

              if (i.getCurrent().getPerson().getName().equals(n)) {
                    System.out.println(n + " is number " + j + " in the list");
                    return;
              }

              j++;

        }

        
        System.out.println("Can't be found!");
        

  }
    
    
    //add p to Queue
    public void joinQueue(Person p) {
    	
    	//System.out.println("Back is " + back.getPrevious().getPerson().getName());
    	//inSystem.out.println("back: "+ back.toString());
    	
    	//create a new node to join
        Node n = new Node(p);
        
        // if there are nothing in the queue, front = back
        if (length == 0) {
        	front = n;
            back = front; 

            length++;
            //front.setNext(back);
            //back.setPrevious(front);
//        } else if (length == 1){
        } else {
        	Node bb = back;
        	back.setNext(n);
        	back = back.getNext();
        	back.setPrevious(bb);
        	
            length++;
        }
        
        return;
    }
    //displays order in which 
    
//    public void OrderedQueue(){
//    	//int i = 0;
////    	String a;
////    	String b;
//    	
//    	Iterator i = new Iterator(front);
//    	
//    	Node smallest;
//    	
//    	while (i.getCurrent().getNext() != null) {
//    		
//    		smallest = i.getCurrent();
//    		
//    		Iterator j = new Iterator(front);
//    		
//    		while (j.getCurrent().getNext() != null) {
//    			
//    			System.out.println("i is " + i.getCurrent().getPerson().getName() + "; j is " + j.getCurrent().getPerson().getName());
//    			
//    			if (smallest.getPerson().getName().compareTo(j.getCurrent().getPerson().getName()) > 0) {
//    				
//    				smallest = j.getCurrent();
//    	
//    				
//    			}
//    			//next j
//    			j.plusPlus();
//    		
//    		}
//    		
//    		System.out.println(smallest.getPerson().getName() + " is smaller than " + i.getCurrent().getPerson().getName() + " so there is a swap");
//    		
//    		//swap i with smallest
//			//next i
//			Node temp = smallest;
//			smallest.setNext(i.getCurrent());
//    		i.getCurrent().setNext(temp.getNext());;
//    		i.plusPlus();
//    		
//    		
//    	}
//    	
    	
//    	for (Iterator i = new Iterator(front); !(i.getCurrent().getNext() == null); i.plusPlus()){
//    		
//    		a = i.getCurrent().getPerson().getName();
//    		
//    		System.out.println("We're comparing " + a);
//    		
//    		int k = 0;
//    		
//        	for (Iterator iterator = new Iterator(front); !(iterator.getCurrent().getNext() == i.getCurrent()); iterator.plusPlus()){
//        		
//        		k++;        		
//        		b = iterator.getCurrent().getPerson().getName();
//        		System.out.println(" with " + b);
//        		
//        		
//        		 if ((a.compareTo(b) < 0) || a.compareTo(b) == 0) { //a is smaller than b, need to switch nodes a and b
//        			 
//        			 
//        			 
//        			 Node nodeA = i.getCurrent();
//        			 Node nodeB = iterator.getCurrent();
//        			 Node temp = nodeA;
//        			 
//        			 System.out.println(nodeA.getPerson().getName() + " and " + nodeB.getPerson().getName() + " switched" );
//        			
//        			 temp = nodeB;
//        			 nodeB = nodeA;
//        			 nodeA = temp;
//        			 
//
//        			 System.out.println(" to become " + nodeA.getPerson().getName() + " and " + nodeB.getPerson().getName());
//        			 
//        			 break; 
//        		 }
//        	}
//    	}
    
    //
    
    public void showQueue(){
	    	int i = 0;
	    	
	    	for (Iterator iterator = new Iterator(front); !(iterator.getCurrent() == null); iterator.plusPlus()){
	    		i++;
	    		Node cur = iterator.getCurrent();
	    		System.out.println(i + ". Person: " + cur.getPerson().getName() + ", Info: " + cur.getPerson().getInfo());
	    	}
    }
    
    //p leaves from Q
    public void remove(String pname){    	
    	//String pname = p.getName();
    	// from front to the last element
    	for (Iterator i = new Iterator(front); !(i.getCurrent().getNext() == null); i.plusPlus()){
    		
    		//System.out.println(pname + " " + i.getCurrent().getPerson().getName());
    		
    		if (pname.equals(i.getCurrent().getPerson().getName())) {
    			
    			System.out.println(pname + " is found!");
    			System.out.println("");
    			
    			//if we found the person to delete
    			//cur is a placeholder to swap pointers
    			Node cur = i.getCurrent();
    			
    			if (cur.getPrevious() == null) {
    				//first
    				front = front.getNext();
    				front.setPrevious(null);

    				length--;
    				return;
    			} else if (cur.getNext() == null) {
    				//last element
    				back = back.getPrevious();
    				back.setNext(null);

    				length--;
    				return;
    			} else {
    			
	    			cur.getPrevious().setNext(cur.getNext());
	    			cur.getNext().setPrevious(cur.getPrevious());

    				length--;
	    			return;
    			}
    					
    		}
    		
    	}
    	
    	System.out.println("Can't find person to remove");
    }
    
    
    
    //never used, I think
    public boolean isFull(){
        return front == back && !isEmpty();
    }
    
}