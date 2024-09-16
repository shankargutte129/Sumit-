package conditional_Statment;

import java.util.Scanner;

public class Greator_number_between_three {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter Second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();
		if(a>b)
		{
			if(b>c)
			{
				System.out.println("The greator number is = "+a);
			}
			else
			{
				System.out.println("The greator number is = "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println();
			}
			else
			{
				
			}
			
		}

	}

}
