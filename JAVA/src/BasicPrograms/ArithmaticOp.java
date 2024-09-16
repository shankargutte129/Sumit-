package BasicPrograms;

import java.util.Scanner;

public class ArithmaticOp {

	public static void main(String[] args) {
		float a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number = ");
		a = sc.nextInt();
		
		System.out.print("Enter Second Number = ");
		b = sc.nextInt();
		
		System.out.println("Addition of given numbers is = " +(a+b));
		System.out.println("Addition of given numbers is = " +(a-b));
		System.out.println("Addition of given numbers is = " +(a*b));
		System.out.println("Addition of given numbers is = " +(a/b));
		

	}

}
