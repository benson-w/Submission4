package god;

//asdfjasodfjak;lf

public class Iterator {

    private Node current;

    //constructor
    public Iterator(Node n){
        current = n;
    }

    public void setCurrent(Node n){
    	current = n;
    }

    public Node getCurrent() {
    	return current;
    }

    public void plusPlus() {
    	if (current == null) {
    		return;
    	} else {
    		current = current.getNext();
    	}
    }


    //returns to the first node with value
    public void minusMinus(){
    	if (current.getPrevious() == null) {
    		return;
    	} else {
    		current = current.getPrevious();
    	}
    }


    public Iterator (){
        current = null;
    }

    public Iterator(Iterator i) {
        current = i.getCurrent();
    }


}
