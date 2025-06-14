package assignment7;

public class ThisFactorial {
	int fact= 1;
	public void cal(int num) {
		
		for(int i=1; i<= num;i++) {
		fact = fact*i;	
		}
	}
	
	public void cal() {
		this.cal(5);
		System.out.println(fact);	
		
	}
	public static void main(String[] args) {
		ThisFactorial obj1 = new ThisFactorial();
		obj1.cal();

	}

}
