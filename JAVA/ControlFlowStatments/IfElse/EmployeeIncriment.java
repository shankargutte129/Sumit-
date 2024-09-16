package IfElse;

import java.util.Scanner;

public class EmployeeIncriment {

	public static void main(String[] args) {
		int experience,oldpayment;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Experience of employee = ");
		experience = sc.nextInt();
		System.out.println("Please Enter the current payment of Employee =");
		oldpayment = sc.nextInt();
		if(experience>=5) 
		{
			System.out.println("The updated payment of the employee is = " + (oldpayment += oldpayment*0.15));
		}
		else
			
		{
			System.out.println("You are not Eligeble for Increment");
		}

	}

}
