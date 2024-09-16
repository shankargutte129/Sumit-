package IfElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Password");
		
		password = sc.nextInt();
		
		if(password==15935725) 
		{
			System.out.println("Name : Shankar Yadav Gutte");
			System.out.println("Age : 25");
			System.out.println("Address : Raje shivaji nagar, Latur");
			System.out.println("Name : Shankar Yadav Gutte");
			System.out.println("Roll no : 1");
		}
		else 
		{
			System.out.println("Opps.... Wrong Password");
		}
	}

}
