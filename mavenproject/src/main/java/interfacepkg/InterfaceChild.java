package interfacepkg;

public class InterfaceChild implements InterfaceParent {

	public static void main(String[] args) {
		InterfaceParent obj = new InterfaceChild();
		obj.display();

	}
	public void sum() {
		System.out.println(" Sum");
	}
	public void name() {
		System.out.println("name");
	}
	public void display() {
		System.out.println(" display");
	}

}
