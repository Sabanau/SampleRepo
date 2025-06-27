package scannerInheritence;

public class HRPF extends Employee {
	
	double hra,pf;	
	public void getHRA() {
		super.getInput();
		hra = (basicPay*5)/100; 
		pf = (basicPay*20)/100; 
	}

}
