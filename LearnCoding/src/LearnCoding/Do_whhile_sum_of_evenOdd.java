package LearnCoding;

import java.util.Scanner;

public class Do_whhile_sum_of_evenOdd {

	public static void main(String[] args) {
		int num,evenSum = 0,oddSum=0;
		char choice;
		
		do 
		{
			System.out.println("Enter any number");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if(num%2==0)
			{
				evenSum = evenSum+num;
			}
			else
			{
				oddSum = oddSum+num;
			}
			System.out.println("do you want to continuoue y/n");
			choice = sc.next().charAt(0);
		}
		while(choice == 'y' || choice == 'Y');
		System.out.println("the sum of even numbers is = "+evenSum);
		System.out.println("the sum of even numbers is = "+oddSum);
	}

}
