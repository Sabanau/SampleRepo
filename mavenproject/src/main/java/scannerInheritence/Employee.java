package scannerInheritence;

import java.util.Scanner;

public class Employee {
	double basicPay, deduction,bonus;
	String name;
	
	void getInput(){
		Scanner sc = new Scanner(System.in); // 
		System.out.print("Enter basic pay");
		basicPay = sc.nextDouble();
		System.out.print("Enter deduction");
		deduction = sc.nextDouble();
		System.out.print("Enter bonus");
		bonus = sc.nextDouble();
		System.out.print("Name");
		name = sc.next();
		
	}

}
