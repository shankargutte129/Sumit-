package BasicPrograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your choice of operation 1-add, 2-sub, 3-mul, 4-div, 5-mod. ");
		int i = s.nextInt();
		System.out.println("Enter the 1st Number");
		int a = s.nextInt();
		System.out.println("Enter the 2nd Number");
		int b = s.nextInt();
		int res=0;
		if(i==1) {
		 res = add(a, b);
		//System.out.println("Sum is" + res);
		}
		else if(i==2) {
			 res = sub(a, b);
			//System.out.println("Sub is" +  res);
		}
		else if(i==3) {
			 res = mul(a, b);
			//System.out.println("Mul is" +  res);
		}
		else if (i==4) {
			if(b==0) {
				System.out.println("Division of/by Zero not possible");
				return;
			}
			 res = div(a, b);
			//System.out.println("Div is " +  res);
		}
		else if (i==5) {
			 res = mod(a, b);
			//System.out.println("Mod is " +  res);
		}
		else {
			System.out.println("Invalid Input");
		}
		System.out.println(res);
	}

	private static int add(int a, int b) {
		return a+b;

	}
	
	private static int sub(int a, int b) {
		return a-b;
	}
	
	private static int mul(int a, int b) {
		return a*b;
	}
	private static int div(int a, int b) {
		return a/b;
		
	}
	private static int mod(int a, int b) {
		return a%b;
		
	}
	
}

