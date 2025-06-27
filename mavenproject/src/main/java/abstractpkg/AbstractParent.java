package abstractpkg;

public abstract class AbstractParent {
	public abstract void sum();
	public abstract void diff(int a); // abstract method
	
	public void display() { // instance method
		System.out.println("Hi Instance method");
	}

}
