package Core_java;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		System.out.println("Enter the student name");
		
		Scanner sc =new Scanner(System.in);
		char name = ' ';
		System.out.println("enter marks of a");
		int a = sc.nextInt();
		System.out.println("enter marks of b");
		int b= sc.nextInt();
		System.out.println("enter marks of c");
		int c= sc.nextInt();
		
		int average=(a+b+c)/3;
		
		System.out.println("Name of Student is: "+ name+ "\nAverage of three subjects :" +average);
		
	}
}
