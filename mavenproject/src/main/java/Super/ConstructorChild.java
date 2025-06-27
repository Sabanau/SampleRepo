package Super;

import Inheritance.SingleChild;

public class ConstructorChild extends ConstructorParent {
	public static void main(String[] args) {
		ConstructorChild obj = new ConstructorChild(1001);
	}
	public ConstructorChild(String a) {
		super(20,10);
		System.out.println("Am in Child"+a);
	}
	public ConstructorChild(int a) {
		this("sabana");
		System.out.println("Am in Child"+a);
	}

}
