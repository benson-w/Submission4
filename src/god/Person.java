package god;

public class Person {
	
	// 
	// 
	
	private String name;
	private String info;
	private int position;	
	
	public Person(String n, String i, int p) {
		name = n;
		info = i;
		position = p;
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