package assignment7;

public class ThisReverse {
	int number;
	int reversed;
	
	ThisReverse(int num){
		this.number = num;
		System.out.println("Before Reverse : "+num);
		while(num != 0){	
		int rem = num%10;
		reversed = reversed*10+ rem;
		num = num/10;
		}
		System.out.println("After Reverse : "+reversed);
		
	}
	ThisReverse( ){
		this(12345);
	}
	

	public static void main(String[] args) {
		ThisReverse obj = new ThisReverse();

	}

}
