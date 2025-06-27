package polymorphysm;

public class PolyChild extends PolyParent {

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.calc(100, 50);
		
		PolyParent obj1 = new PolyParent(); // use super
		obj1.calc(100, 50);

	}
	
	public void calc(int a, int b) {
		int diff = a-b;
		System.out.println("Diff is " +diff);		
	}

}
