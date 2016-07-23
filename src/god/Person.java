package god;

public class Person {
	
	// 
	// 
	
	private String name;
	private String info;
	private int position;	
	private int numItems;
	
	public Person(String n, String i, int p) {
		name = n;
		info = i;
		position = p;
		numItems = (int)(29*Math.random() + 1);
	}
	
	public void decrementItems(){
		numItems--;
	}
	
	public int getNumItems(){
		return numItems;
	}

	public void setInfo(String setinfo){
		info = setinfo;
	}
	
	public String getInfo(){
		return info;
	}
	
	public void setName(String setname){
		name = setname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPosition(int pos){
		position = pos;
	}
	
	public int getPosition(){
		return position;
	}
	
	
	
}