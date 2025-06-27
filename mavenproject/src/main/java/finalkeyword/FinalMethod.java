package finalkeyword;

public class FinalMethod {

	public static void main(String[] args) {
		FinalMethod obj = new FinalMethod();
		obj.display(10);

	}
	
	final void display(int a){
		
		System.out.println("final");
	}
	
	//void display(int a) {
		
	//}

}
