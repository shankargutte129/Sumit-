package LearnCoding;

import java.util.Scanner;
public class calculator_withSwitch {

	public static void main(String[] args) {
		int a,b,c,opration;
		
		System.out.println("Enter first number = ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter Second number");
		b = sc.nextInt();
		
		System.out.println("Which opration you want to perform 1 for addition");
		System.out.println("Which opration you want to perform 2 for substration");
		System.out.println("Which opration you want to perform 3 for multiplication");
		System.out.println("Which opration you want to perform 4 for division");
		System.out.println("Which opration you want to perform 5 for reminder");
		opration = sc.nextInt();
		
		switch(opration)
		{
			case 1 : c = a+b;
			System.out.println("Sum of given numbers is = "+c);
			break;
			case 2 : c = a-b;
			System.out.println("Subtraction of given numbers is ="+c);
			break;
			case 3 : c = a*b;
			System.out.println("multiplication of given numbers is = "+c);
			break;
			case 4 : c = a/b;
			System.out.println("Division of given numbers is ="+c);
			break;
			case 5 : c = a%b;
			System.out.println("Reminder of given numbers is ="+c);
			break;
			default:
				System.out.println("Invalid input");
		}
		
	}

}