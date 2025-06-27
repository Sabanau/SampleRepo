package aggregation;

public class StudentChild {
	String name;
	int age;
	AddressParent address; //aggregation
	public static void main(String[] args) {
		AddressParent obj = new AddressParent("Allpy","Kerala");
		StudentChild obj1 = new StudentChild("Ravi",30,obj);
		obj1.display();
	}
	public StudentChild(String name, int age, AddressParent address) {
		this.name= name;
		this.age= age;
		this.address=address;
	}
	public void display() {
		System.out.println(name+"  " +age+ "  " +address.city+ "  " +address.state);
}

}
