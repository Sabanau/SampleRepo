package assignment6;

public class AreaProgram {
	
	double areaCal(double r) {
		 return Math.PI*r*r;		
	}
	
	int areaCal(int l ,int b) {
		 return l*b;		
	}
	
	int areaCal(int s) {
		 return s*s;		
	}	

	public static void main(String[] args) {
		AreaProgram obj = new AreaProgram();
		System.out.println("Area of Circle "+obj.areaCal(5));
		System.out.println("Area of Rectangle "+obj.areaCal(15, 5));
		System.out.println("Area of Square "+obj.areaCal(10));
	}

}
