//Calculate Pay Program
//Travis Henagan
//CPT307: Data Structures & Algorithms
//Dr. Nelson Stewart
//April 20th 2020


package PayC;

import java.util.*;

public class PayCalculator {

	
	public static void main(String[] args )
	{
		Scanner keyboard = new Scanner(System.in);  // Scanner accepts input from user
		String EmployeeName; 
		int HoursWorked, OtWorked = 0;
		double PayRate;
		double FedTax, Gpay = 0, StateTax, Medicare, SocSec, UnemIns, TotDeduct, NetPay;
		
		System.out.println( "Enter Employee Name ");
		System.out.println( "Enter Hours Worked ");
		System.out.println( "Enter Rate of Pay ");
		EmployeeName = keyboard.nextLine();
		HoursWorked = keyboard.nextInt();
		PayRate = keyboard.nextDouble();
		
		if (HoursWorked <= 40) 
		{
			Gpay = HoursWorked * PayRate; 
		}
		else if (HoursWorked > 40) 
		{
			Gpay = ((HoursWorked - 40) * (PayRate * 1.5)) + (40 * PayRate); 
		}
		if (HoursWorked > 40) {
			OtWorked = HoursWorked - 40;
		}
		// Deductions percentages converted to decimal
		FedTax = .15 * Gpay;
		StateTax = .0307 * Gpay;
		Medicare = .0145 * Gpay;
		SocSec = .062 * Gpay;
		UnemIns = .0007 * Gpay;
		TotDeduct = FedTax + StateTax + Medicare + SocSec + UnemIns;
		NetPay = Gpay - TotDeduct;
		// Output 
		System.out.println(EmployeeName);
		String pr = String.format("%.2f", PayRate); // format too get 2 decimal float number for Pay Rate
		System.out.println("Pay Rate: " + pr);
		System.out.println("Hours Worked: " + HoursWorked);
		System.out.println("Overtime Hours Worked: " + OtWorked);
		String gp = String.format("%.2f", Gpay); // format to get 2 decimal float number for Gross Pay
		System.out.println("Gross Pay: " + gp);
		String td = String.format("%.2f", TotDeduct); // format to get a 2 decimal float number for Total Deductions
		System.out.println("Total Deductions: " + td);
		String np = String.format("%.2f", NetPay); // format to get 2 decimal float number for Net Pay
		System.out.println("Net Pay: " + np);
		

	}

}

