package LearnCoding;

import java.util.Scanner;

public class Nested_if_program {

	public Nested_if_program() {
		
	}

	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Enter First Number =");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter Second Number =");
		num2 = sc.nextInt();
		System.out.println("Enter third Number =");
		num3 = sc.nextInt();
		
		if(num1>num2) 
		{
			if(num1>num3) 
			{
				System.out.println("The Greater number is = "+num1);
			}
			else
			{
				System.out.println("The Greater number is = "+num3);
			}
		}
		else 
		{
			if(num2>num3) 
			{
				System.out.println("The Greater number is = "+num2);
			}
			else
			{
				System.out.println("The Greater number is = "+num3);
			}
		}

	}

}
