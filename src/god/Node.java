package god;

class Node {
	
	private Person person;
	private Node next;
	private Node previous;
	
	public Node (Person newPerson) {
		person = newPerson;
		next = null;
		previous = null;	
	}	
	
	public Person getPerson(){
		return person;
	}
//	
	public Node getNext(){
		return next;
	}
	
	public Node getPrevious(){
		return previous;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public void setPrevious(Node n){
		previous = n;
	}

	public void setPerson(Person c) {
		person = c;
	}
	
}
