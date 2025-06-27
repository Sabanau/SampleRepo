package scannerInheritence;

public class Totalsalary extends HRPF {
	double totalSalary;
	public static void main(String[] args) {
		
		Totalsalary obj = new Totalsalary();
		obj.getHRA();
		obj.totalSalary();
		obj.salslip();
	}
	
	public void totalSalary (){
		//super.getHRA();
		totalSalary = (basicPay+hra-pf-deduction+bonus);
	}
	public void salslip() {
		System.out.println("SalarySlip :"+ basicPay);
		System.out.println("Deduction :"+ deduction);
		System.out.println("Bonus :"+ bonus);
		System.out.println("HRA :"+ hra);
		System.out.println("PF :"+ pf);
		System.out.println("TotalSalary :"+ totalSalary);
	}

}
