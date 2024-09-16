package Deepak;

import java.util.Scanner;
public class CalculatorWithInput {

	public CalculatorWithInput() {
		
	}

	public static void main(String[] args) {
		
		int a,b,add,sub,mul,div;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st Number = ");
		a = sc.nextInt();
		System.out.println(" Enter 2nd Number = ");
		b = sc.nextInt();
		
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		System.out.println(" Addition = "+ add);
	    System.out.println(" Substraction = "+sub);
	    System.out.println(" Multiplication = "+mul);
	    System.out.println(" Division = "+div );
	}

}
