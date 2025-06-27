package abstractpkg;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.sum();
		obj.display();
	}
	public void sum(){ // overriding method
		System.out.println("in child sum");
	}
	public void diff(int a) {
		System.out.println("in child diff");
	}
	
	public void display() {
		System.out.println("in child display");
	}

}
