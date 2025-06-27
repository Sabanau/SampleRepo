package finalkeyword;

public class FinalKeyword {
	 int a =10; // through out we cannot change the value
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		obj.display();

	}
	
	public void display() {
		//a = 40; here we cannot change the value since given instance variable as final
		
		System.out.println(a);
	}
}
