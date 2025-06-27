package encapsulation;

public class EncapParent {
	
	private String name;
	private int age;
	
	// to access private varaibles
	public void set(int a, String n) {
		this.age= a;
		this.name = n;
	}
	
	public void get() {
		System.out.println("Name " +name+ " Age :" +age);
	}

}
